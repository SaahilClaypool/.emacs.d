(setq referenceDir "~/.emacs.d/reference")
(load "~/.emacs.d/doxyref/doxyref.el")


;;packages..
(require 'package) ;; You might already have this line

(add-to-list 'package-archives
	     '("melpa" . "http://melpa.org/packages/"))
(when (< emacs-major-version 24)
  ;; For important compatibility libraries like cl-lib
  (add-to-list 'package-archives '("gnu" . "http://elpa.gnu.org/packages/")))
(package-initialize) ;; You might already have this line


;; jumping
(require 'avy)
;; windows
(require 'ace-window)
;; helm
(require 'helm)                         ;
(require 'helm-config)


;; neo tree
(require 'neotree)
(setq helm-split-window-in-side-p           t ; open helm buffer inside current window, not occupy whole other window
      helm-move-to-line-cycle-in-source     t ; move to end or beginning of source when reaching top or bottom of source.
      helm-ff-search-library-in-sexp        t ; search for library in `require' and `declare-function' sexp.
      helm-scroll-amount                    8 ; scroll 8 lines other window using M-<next>/M-<prior>
      helm-ff-file-name-history-use-recentf t)
;; google suggest 
(when (executable-find "curl")
  (setq helm-google-suggest-use-curl-p t))

;; end helm config


;; stats stuff

;; ESS MODE STATS
 (setq ess-eval-visibly nil) ; ESS will not print the evaluated commands, also speeds up the evaluation 
 (setq ess-ask-for-ess-directory nil) ;if you don't want to be prompted each time you start an interactive R session

;;


;; web mode config-changed-event;;WEB MODE
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
;; end web mode config

;; ispell config *for window
;; ispell stuff? 

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
;; end ispell config
