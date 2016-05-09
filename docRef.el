;; saahil claypool
;; "Wed May  4 12:13:26 2016"
;; package to create a reference window for mainly java
;; How it works: take javadoc code and store in .emacs
;; hot key top open up reference code --> pops open reference window
;; any key pressed in reference window will act as fuzzy search, filtering for the function
;; functions will dispay like this:
;; returnType Function (int a , int b , int c);
;; hitting return over that function will expand the function to give an overview of the use of that function
;; hitting return again will insert that function and the paramters at the point of the cursor


;; test code:
;;(docref-setup-project)
;;(docref-lookup-docs)



(setq max-lisp-eval-depth 500000)
(setq max-specpdl-size 500000)
(setq funcSymbol "_func_") ;; any unique symbol works
;;(setq referenceDir "c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/reference") ;; where should the documentation be stored? 
(if (not (file-exists-p referenceDir)) ;; setup directory if it is not setup 
    (make-directory referenceDir))


;; Switch to other window
(defun get-string-from-file (filePath)
  "Return filePath's file content."
  (with-temp-buffer
    (insert-file-contents filePath)
    (buffer-string)))
(defun read-functions-from-file (filePath)
  "Return a list of lines of a file at filePath."
  (with-temp-buffer
    (insert-file-contents filePath)
    (split-string (buffer-string) funcSymbol t)))

(defun read-lines (filePath)
  (with-temp-buffer
    (insert-file-contents filePath)
    (split-string (buffer-string) "\n")))

;;(setq lines (read-functions-from-file "test.txt"))

;; returns a list of strings that contain this matching string. 
(defun filter-strings (q strs)
  (if strs
      (if

          (string-match q (car strs))
          (cons (car strs);; if true, append this line to the rest
             (filter-strings q (cdr strs)))
        (filter-strings q (cdr strs));; else just return the rest
       
       )
    nil)
  )
;; like fileter strings but only looks at the first line of each function
;; old
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; (car ;; check if the first line contains the string          ;;
;;                          (cdr(split-string (car strs) "\n")) ;;
;;                          )                                   ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defun filter-class (q strs)
    (if strs
      (if
          (string-match q
                        (nth 2 (split-string (car strs) "\n"))
                        )
          (cons (car strs);; if true, append this line to the rest
                (filter-class q (cdr strs)))
        (filter-class q (cdr strs));; else just return the rest
       
       )
      nil)
  )

(defun filter-function (q strs)
    (if strs
      (if
          (string-match q
                        (nth 3 (split-string (car strs) "\n"))
                        )
          (cons (car strs);; if true, append this line to the rest
                (filter-function q (cdr strs)))
        (filter-function q (cdr strs));; else just return the rest
       
       )
      nil)
    )
(defun filter-project (q strs)
    (if strs
      (if
          (string-match q
                        (nth 1 (split-string (car strs) "\n"))
                        )
          (cons (car strs);; if true, append this line to the rest
                (filter-project q (cdr strs)))
        (filter-project q (cdr strs));; else just return the rest
       
       )
      nil)
    )

(defun join-list-string (los)
  (if los
      (concat (car los) "\n"
              (join-list-string (cdr los)))
    nil
    )
  )

;; first line class
;; second line function
;; rest description
(defun pretty-print (aList)
  (if aList
      (progn
        (if (not (= 0 (length (car aList))))
            (let* (
                   (width (window-body-width))
                   (line (split-string (car aList) "\n"))
                   )
              (pop line)
              (insert-char 45 width )
              (insert "Project:         ")
              (insert (pop line))
              (insert "\nFile:            ")              
              (insert (pop line))
              (insert "\n\nFunction:        ")
              (insert (pop line))
              (insert "\n\n")
              (insert (join-list-string line))

                         )
          nil
          )
        (pretty-print (cdr aList)))
        )
    nil
  )
;; takes a list of strings, puts them in the other window
(defun new-window-print (aLos)
  (progn
    (let* (
           (project (read-string "Project (default ALL):  "))
           (class (read-string "Class (default ALL): "))
           (function (read-string "Function (default ALL): "))

           (filterProj (if (not (= (length project) 0))
                            (filter-project project aLos)
                          aLos))
           (filterClass (if (not (= (length class) 0))
                            (filter-class class filterProj)
                          filterProj))
           (filterFunction (if (not (= (length function) 0))
                            (filter-function function filterClass)
                            filterClass))

           )
      (switch-to-buffer-other-window "docBuffer")
      (erase-buffer)
      (pretty-print filterFunction)
      (insert-char 45 (window-body-width) )
      (beginning-of-buffer)
      (docRef-mode 1)
      (hi-lock-line-face "Function:" "hi-yellow")
      )
    )
  )

;; (new-window-print lines)
;; (window-full-width-p)
;; takes string file name
(defun docref-lookup-docs ()
  (let* (
         (functions (docref-lookup-all-files))
         )
    (new-window-print functions)
    
      )
  )

(defun docref-get-all-functions (lof)
  (if lof
      (let*
          (
           (cur (car lof))
           )
        (if (not (or (string= "." cur)
                     (string= ".." cur)))
            (append (read-functions-from-file (concat referenceDir "/" cur))
                    (docref-get-all-functions (cdr lof)))
           (docref-get-all-functions (cdr lof))
        )
        )
    nil)
  )
(defun docref-lookup-all-files()
  (let*
      (
       (allFiles (directory-files referenceDir))
       (allFunctions (docref-get-all-functions allFiles))
       )
    allFunctions
    )
  )
(directory-files referenceDir)


(defun next-function ()
  ;;(concat (concat "\C-s return " (make-string (window-body-width) ?-) "\C-s\C-a") )
  [?\C-n ?\C-s return ?- ?- ?- ?- return ?\C-a]
      )

   

(defun prev-function ()
  ;;(concat (concat "\C-r return " (make-string (window-body-width)  ?-) "\C-a") )
   [?\C-p ?\C-r return ?- ?- ?- ?- return ?\C-a]
  )
(defun quit-function ()
   "\C-x1\C-xk\C-m")

(defun paste-function ()
  "\C-s\C-mFunction:\C-m\C-s\C-m)\C-m\C-@\C-[\C-b\C-[\C-b\C-[w\C-xo\C-x1\C-y")



  


;; old

(define-minor-mode docRef-mode
  "navigate the doc buffer"
  :lighter " docRef"
  :keymap (let (
                (map (make-sparse-keymap))
                )
            (define-key map (kbd "n") (next-function))
            (define-key map (kbd "p") (prev-function))
            (define-key map (kbd "i") (paste-function))
            (define-key map (kbd "q") (quit-function))
            map
            )
    
  )
   

;;(filter-strings "flag 1" lines)
;;(filter-strings "test" (list "this is a test" "this is another test"))
;;(filter-class "test" (list "this is a test" "this is another test"))
;;(pretty-print lines)

;; PARSING SECTION

;; Function: // change? 
;; file
;; function
;; description
(defun parse-single-file (fileName outputFile projName)
  
  "given file name and output file puts the reference information in that file"
  (progn
    (with-temp-buffer
      (insert "parse-SINGLE-files\n")
      (insert fileName)
      (append-to-buffer "output" nil nil)
      )

  (let*
      (
       (lines (read-lines fileName))
       (functions  (parse-strings lines nil))
       )
    ;; for each pair, write :_func_ ret fileName ret function ret description

    (with-temp-buffer
      (output-functions fileName functions projName)
      (write-region nil nil outputFile t)
      
      )
    ;;    functions
    nil
    )
  ))
;; takes in list of (function . desc)
(defun output-functions (fileName functions projName)
  "takes in file name and list of functions. Outputs them as symbol separated list"
  (if functions
      (progn
        (insert funcSymbol)
        (insert "\n")
        (insert projName)
        (insert "\n")
        (insert fileName)
        (insert "\n")
        (insert (nth 0 (car functions)))
        (insert "\n")
        (insert (join-list-string (nth 1 (car functions))))
        (output-functions fileName (cdr functions) projName)
        )
    )
  nil
  )


;; return list of all function desc combos (function . desc)
(defun parse-strings (los listPair)
  ;; if doxy comment, return list of (function description))
  (if los
      (if (string-match "///"
                        (car los))
          (let* (
                 (pair (parse-comment los nil 0))
                 (count (nth 2 pair))
                 (function (nth 0 pair))
                 (desc (nth 1 pair))
                 )
            (parse-strings (nthcdr count los)
                           (cons (list function desc) listPair))
            )
        (if (string-match "/\\*\\*"
                          (car los))
            (let* (
                   (pair (parse-block-comment los nil 0))
                   (count (nth 2 pair))
                   (function (nth 0 pair))
                   (desc (nth 1 pair))
                   )
              (progn
                (with-temp-buffer
                  (insert (format "after the entire parse %s\n"
                                  desc))
                  (append-to-buffer "output" nil nil))
                (parse-strings (nthcdr count los)
                               (cons (list function desc) listPair)))

              )
          (parse-strings (cdr los) listPair)
          )
        )
    listPair

    )
  )
;; parse block comment
(defun parse-block-comment (los listDesc lineCount)
  "parse block doxy comment and get the next function it refers to"
  (progn
    (with-temp-buffer
      (insert "parse block comment\n")
      (insert (format"desciption: %s\n" listDesc))
      (insert (format"current: %s\n" (if los (append   listDesc (list (car los))) "nil")))

      (append-to-buffer "output" nil nil)
      )
  (if los
      (let* (
             (curLine (car los))
             )
        (if (not (string-match "\\*/"
                               curLine))
            (progn
              (with-temp-buffer
                (insert (format "NOT THE END current line: %s current description: %s\n\n\n" curLine listDesc ))
                (append-to-buffer "output" nil nil))
              (parse-block-comment (cdr los)
                           (append  listDesc (list curLine))
                           (+ 1 lineCount)))
          ;; else, return the next nonEmpty line as a list with the description
          (let*(
                (non-empt-ret (next-non-empty (cdr los) 0))
                (empty-count (nth 1 non-empt-ret))
                (non-empty-str (nth 0 non-empt-ret))
                )
            (progn
              (with-temp-buffer
                (insert (format "THE END \n non empt %s count %d \n\n\n\n" non-empty-str empty-count ))
                (append-to-buffer "output" nil nil))
              (list non-empty-str (append listDesc (list curLine)) (+ 2 empty-count lineCount)))

            )
          
          
          )
        )
    nil
    )
  ))

;; keep adding to list of Desc, when last line is not ///, go until non empty line
;; return cons (function description lineCount) 
(defun parse-comment (los listDesc lineCount)
  (if los
      (let* (
             (curLine (car los))
             )
        (if (string-match "///"
                          curLine)
            (parse-comment (cdr los)
                           (append   listDesc (list curLine))
                           (+ 1 lineCount))
          ;; else, return the next nonEmpty line as a list with the description
          (let*(
                (non-empt-ret (next-non-empty los 0))
                (empty-count (nth 1 non-empt-ret))
                (non-empty-str (nth 0 non-empt-ret))
              )
            (list non-empty-str listDesc (+ 1 empty-count lineCount))
            )
          
          
          )
        )
    nil
    )
  )

;; return string . count
(defun next-non-empty (los count)
    (if los
        (if (= (length (car los)) 0);; if str len is 0
            (next-non-empty (cdr los) (+ 1 count)) ;; return the next non empty
          (list (car los) count);; else reutrn this
          )
      nil
      )
    )



(defun docref-setup-project()
  (let*(
        (root (read-string "Enter Path of Project Root (default current directory): "))
        (name (read-string "Enter Project Name: "))
        )
    (if (= 0 (length name))
        (message "Must Enter Project Name")
      (if (not (= (length root) 0 ))
          (setup-helper root (concat referenceDir "/" name) name)
        (setup-helper default-directory (concat referenceDir "/" name) name)
        )
      )
    )
  )


;; need to go and make a for every file in directory function
;; for each .h file

(defun setup-helper (dir outputFile projName)
  (with-temp-buffer
    (write-region "" nil outputFile)) ;; clear file
  (let* (
         (fileNames (directory-files  dir))
         )
    (parse-list-file fileNames outputFile dir projName)
    (parse-dirs fileNames outputFile dir projName)
    )
  )
(defun my-filter (condp lst)
  (delq nil
        (mapcar (lambda (x) (and (funcall condp x) x)) lst)))
(my-filter (lambda (x) (string= x "a"))(list "a" "b" "c"))


(defun parse-dirs (lof outputFile dir projName)
  (progn
    (with-temp-buffer
      (insert "parse-directory-files\n")
      (if lof
          (insert (car lof)))
      (append-to-buffer "output" nil nil)
      )

  (if lof
      (let* (
             (firstName (car lof))
             )
        (if (and
             (not(string= (substring firstName 0 1) "."))
             (not (or (string= firstName ".") (string= firstName "..")))
             (nth 0 (file-attributes (concat dir "/" firstName))))
            (let* (
                   (subDir (concat dir "/" firstName))
                   (subLof (my-filter
                            (lambda (x) (not (string= "." (substring x 0 1))))
                            (directory-files subDir)))
                   )
              
                
              (parse-list-file subLof outputFile subDir projName)
              (parse-dirs subLof outputFile subDir projName)
              (parse-dirs  (cdr lof) outputFile dir projName)
              )
          (parse-dirs (cdr lof) outputFile dir projName)
          )
        )
    nil
    )
  )
  )


(defun parse-list-file (lof outputFile dir projName)
  (progn
    (with-temp-buffer
      (insert "parse-list-files\n")
      (if lof
          (insert (car lof)))
      (append-to-buffer "output" nil nil)
      )

    
  (if lof
      (let* (
             (curFile (concat dir "/" (car lof)))
             )
        (if (and
             (not
              (nth 0 (file-attributes curFile)))
             (or (string-match ".cpp" curFile )
                 (string-match ".c" curFile )
                 (string-match ".hpp" curFile )
                 (string-match ".h" curFile )
                 )
             )
            
            (progn
              (parse-single-file curFile outputFile projName)
              (parse-list-file (cdr lof) outputFile dir projName)
              )
          (parse-list-file (cdr lof) outputFile dir projName)
          )
        )
    nil
    )
  )
  )
;; TEST CODE
;;(docref-lookup-docs "test.txt")
;;(parse-strings (list "///com" "/// com2" "/// com3" "" "function (a b c)"
;;                     "///com" "/// com2" "/// com3" "" "function (a b c)" "" "") nil)
;;(parse-comment (list "///com" "/// com2" "/// com3" "" "function (a b c)") (list) 0)
;;(parse-single-file "testHeader.h" "output.txt")
;;(read-lines "testHeader.h")
;;(output-functions "testHeader.h"(parse-single-file "testHeader.h"))
;;(docref-setup-project)
;;(setup-helper "." "output.txt")
;;(docref-lookup-docs)



;;(parse-single-file "testHeader.h" "./testRef")


