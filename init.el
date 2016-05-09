;; gui changes
(tool-bar-mode -1)
(scroll-bar-mode -1)
(setq inhibit-startup-message t) 
(blink-cursor-mode -1)

(setq referenceDir "~/.emacs.d/reference")
(load "~/.emacs.d/docRef.el")
(global-set-key (kbd "C-c d d") (lambda ()(interactive)(docref-lookup-docs)))
(global-set-key (kbd "C-c d s") (lambda ()(interactive)(docref-setup-project)))

;; turn off those stupid emacs droppings
(setq make-backup-files nil)

;; add recent files list
(recentf-mode 1)

;; query replace
(global-set-key (kbd "M-r") 'query-replace)

;; Melpa
;;add melpa
(require 'package) ;; You might already have this line
(add-to-list 'package-archives
	     '("melpa" . "http://melpa.org/packages/"))
(when (< emacs-major-version 24)
  ;; For important compatibility libraries like cl-lib
  (add-to-list 'package-archives '("gnu" . "http://elpa.gnu.org/packages/")))
(package-initialize) ;; You might already have this line

;; HELM
(require 'helm)
(require 'helm-config)


;; Changed to "C-c h". Note: We must set "C-c h" globally, because we
;; cannot change `helm-command-prefix-key' once `helm-config' is loaded.
(global-set-key (kbd "C-c h") 'helm-command-prefix)
(global-set-key (kbd "C-x C-f") 'helm-find-files)
(global-set-key (kbd "M-x") 'helm-M-x)
(global-set-key (kbd "M-y") 'helm-show-kill-ring)
(global-set-key (kbd "C-x b") 'helm-mini)
(setq helm-buffers-fuzzy-matching t
      helm-recentf-fuzzy-match    t)
(define-key helm-map (kbd "<tab>") 'helm-execute-persistent-action) ; rebind tab to run persistent action
(define-key helm-map (kbd "C-i") 'helm-execute-persistent-action) ; make TAB works in terminal
(define-key helm-map (kbd "C-z")  'helm-select-action) ; list actions using C-z

(when (executable-find "curl")
  (setq helm-google-suggest-use-curl-p t))

(setq helm-split-window-in-side-p           t ; open helm buffer inside current window, not occupy whole other window
      helm-move-to-line-cycle-in-source     t ; move to end or beginning of source when reaching top or bottom of source.
      helm-ff-search-library-in-sexp        t ; search for library in `require' and `declare-function' sexp.
      helm-scroll-amount                    8 ; scroll 8 lines other window using M-<next>/M-<prior>
      helm-ff-file-name-history-use-recentf t)

(helm-mode 1)
;; auto complete
(require 'auto-complete) ;; auto complete mode
(require 'auto-complete-config);config file






(add-to-list 'ac-dictionary-directories
	     (expand-file-name
	     "~/.emacs.d/elpa/auto-complete-20160107.8/dict"))
(setq ac-comphist-file
      (expand-file-name
       "~/.emacs.d/ac-comphist.dat")) ;; setup for ac cedet
(ac-config-default);; default
;; autocomplete
(global-auto-complete-mode t)

;; highligh parens 
(setq show-paren-delay 0)
(show-paren-mode 1)
(autopair-global-mode 1)

;;Smooth scrolling 
(setq scroll-conservatively 10000)



;;WEB MODE
(require 'web-mode)
(add-to-list 'auto-mode-alist '("\\.phtml\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.tpl\\.php\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.[agj]sp\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.as[cp]x\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.erb\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.mustache\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.djhtml\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.html?\\'" . web-mode))
(add-to-list 'auto-mode-alist '("\\.js?\\'" . web-mode))


;; ESS MODE STATS
 (setq ess-eval-visibly nil) ; ESS will not print the evaluated commands, also speeds up the evaluation 
 (setq ess-ask-for-ess-directory nil) ;if you don't want to be prompted each time you start an interactive R session


;;ispell aspell auto correct
;;aspell better work
(setenv "DICTIONARY" "en_GB")
;;(add-to-list 'exec-path "~/.emacs.d/Aspell/bin/")
;;(add-to-list 'exec-path "C:\\Program Files (x86)\\Aspell\\bin")
;;(add-to-list 'exec-path "C:\\Users\\saahil claypool\\AppData\\Roaming\\.emacs.d\\Aspell\\bin")
(add-to-list 'exec-path "~\\.emacs.d\\Aspell\\bin")
(setq ispell-program-name "aspell")
(require 'ispell) ;; turn on 
(setq ispell-personal-dictionary "~\\.emacs.d\\Aspell\\dict")








;; Save without asking
(global-set-key "\C-xs" 'save-buffer)
(global-set-key "\C-xc" 'compile)
(global-set-key "\C-xn" 'next-error)

;;CUSTOM KEY BINDINGS

(global-set-key "\C-x\C-b" 'buffer-menu) ;; change buffer same window

;; window resize
(global-set-key (kbd "S-C-<left>") 'shrink-window-horizontally)
(global-set-key (kbd "S-C-<right>") 'enlarge-window-horizontally)
(global-set-key (kbd "S-C-<down>") 'shrink-window)
    (global-set-key (kbd "S-C-<up>") 'enlarge-window)



;; Turn on window switching
(when (fboundp 'windmove-default-keybindings)
    (windmove-default-keybindings))

(global-set-key (kbd "C-c <left>")  'windmove-left)
(global-set-key (kbd "C-c <right>") 'windmove-right)
(global-set-key (kbd "C-c <up>")    'windmove-up)
(global-set-key (kbd "C-c <down>")  'windmove-down)


;; lisp eval
;; Lisp specific defuns TODO

(defun eval-and-replace ()
  "Replace the preceding sexp with its value."
  (interactive)
  (backward-kill-sexp)
  (condition-case nil
      (prin1 (eval (read (current-kill 0)))
             (current-buffer))
    (error (message "Invalid expression")
           (insert (current-kill 0)))))

(global-set-key (kbd "C-c e") 'eval-and-replace)
;; avy jump 
(require 'avy)
(define-key global-map (kbd "M-j") 'avy-goto-word-or-subword-1)

(require 'ace-window)
(define-key global-map (kbd "C-x p") 'ace-window)

;; 2 ^ n
(defun pwr2 (n)
  (if (<= 1 n)
      (* 2 (pwr2 (- n 1)))
    1))

;; factorial n 
(defun factorial (n)
  (if(> n 1)
      (* n (factorial (- n 1)))
    1))
;; a ^ n
(defun pwr (a n)
  (if (<= 1 n)
      (* a (pwr a (- n 1)))
    1)
  )
;; print current date

(defun date()
  (current-time-string))
(defun npr (n r)
  (/ (fantorial n) (fantorial (- n r))))
(defun ncr (n r)
  (/ (factorial n) (factorial r) (factorial (- n r))))







;; file explorer
;;(add-to-list 'load-path "~/src/neotree")
(require 'neotree)
(global-set-key [f8] 'neotree-toggle)


;; font changes
;; Turn colors on default
(setq tab-width 4)
(setq-default indent-tabs-mode nil)
(global-font-lock-mode 1)
(setq-default line-spacing 4)
(add-to-list 'default-frame-alist '(font . "Lucida Console"))
(set-face-attribute 'default t :font "Lucida Console" )
(set-face-attribute 'default (selected-frame) :height 115)

;; theme
(load-theme 'molokai t)

(custom-set-variables
 ;; custom-set-variables was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(custom-safe-themes
   (quote
    ("2c73700ef9c2c3aacaf4b65a7751b8627b95a1fd8cebed8aa199f2afb089a85f" "b571f92c9bfaf4a28cb64ae4b4cdbda95241cd62cf07d942be44dc8f46c491f4" default))))
(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 )
