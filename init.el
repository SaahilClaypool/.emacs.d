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

;; window resize
(global-set-key (kbd "S-C-<left>") 'shrink-window-horizontally)
(global-set-key (kbd "S-C-<right>") 'enlarge-window-horizontally)
(global-set-key (kbd "S-C-<down>") 'shrink-window)
    (global-set-key (kbd "S-C-<up>") 'enlarge-window)


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





;; Turn colors on default
(global-font-lock-mode 1)

;; Save without asking
(global-set-key "\C-xs" 'save-buffer)
(global-set-key "\C-xc" 'compile)
(global-set-key "\C-xn" 'next-error)
;; Turn on window switching
(when (fboundp 'windmove-default-keybindings)
    (windmove-default-keybindings))

(global-set-key (kbd "C-c <left>")  'windmove-left)
(global-set-key (kbd "C-c <right>") 'windmove-right)
(global-set-key (kbd "C-c <up>")    'windmove-up)
(global-set-key (kbd "C-c <down>")  'windmove-down)

;; shrink window
(global-set-key (kbd "C-x <left>") 'shrink-window-horizontally)
(global-set-key (kbd "C-x <right>") 'enlarge-window-horizontally)
(global-set-key (kbd "C-x <down>") 'shrink-window)
    (global-set-key (kbd "C-x <up>") 'enlarge-window)




;; ace jump mode
;;(add-to-list 'load-path "~/.emacs.d/")
(require 'ace-jump-mode)
(define-key global-map (kbd "C-c SPC") 'ace-jump-mode)






;; file explorer
;;(add-to-list 'load-path "~/src/neotree")
(require 'neotree)
(global-set-key [f8] 'neotree-toggle)

(custom-set-variables
 ;; custom-set-variables was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(blink-cursor-mode nil)
 '(send-mail-function (quote sendmail-send-it)))
(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(default ((t (:family "Luxi Mono" :foundry "b&h" :slant normal :weight normal :height 120 :width normal)))))
