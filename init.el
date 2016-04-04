;; gui changes
(tool-bar-mode -1)
(scroll-bar-mode -1)
(setq inhibit-startup-message t) 
(blink-cursor-mode -1)


;; turn off those stupid emacs droppings
(setq make-backup-files nil)

;; Melpa
;;add melpa
(require 'package) ;; You might already have this line
(add-to-list 'package-archives
	     '("melpa" . "http://melpa.org/packages/"))
(when (< emacs-major-version 24)
  ;; For important compatibility libraries like cl-lib
  (add-to-list 'package-archives '("gnu" . "http://elpa.gnu.org/packages/")))
(package-initialize) ;; You might already have this line


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







;;CEDET
(add-to-list 'semantic-default-submodes 'global-semantic-decoration-mode)
(add-to-list 'semantic-default-submodes 'global-semantic-idle-local-symbol-highlight-mode)
(add-to-list 'semantic-default-submodes 'global-semantic-idle-scheduler-mode)
(add-to-list 'semantic-default-submodes 'global-semantic-idle-completions-mode)

(require 'semantic/ia)
(require 'semantic/bovine/gcc) ; or depending on you compiler
; (require 'semantic/bovine/clang)
;; hooks
;; customisation of modes
(defun smclaypool/cedet-hook ()
  (add-to-list 'ac-sources 'ac-source-semantic)
  ) ; defun smclaypool/cedet-hook ()

;; working with langauge tags
;; if you want to enable support for gnu global
(when (= 1 1)
  (semanticdb-enable-gnu-global-databases 'c-mode)
  (semanticdb-enable-gnu-global-databases 'c++-mode))




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




;; ace jump mode
;;(add-to-list 'load-path "~/.emacs.d/")
(require 'ace-jump-mode)
(define-key global-map (kbd "C-c SPC") 'ace-jump-mode)

(require 'ace-window)
(define-key global-map (kbd "M-p") 'ace-window)




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
