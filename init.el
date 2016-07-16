;; config changes

;; load files

;; Added by Package.el.  This must come before configurations of
;; installed packages.  Don't delete this line.  If you don't want it,
;; just comment it out by adding a semicolon to the start of the line.
;; You may delete these explanatory comments.
(package-initialize)
(setq-default cursor-type 'bar) 
(load-file "~/.emacs.d/packages.el")
(load-file  "~/.emacs.d/keybindings.el")

;;(global-flycheck-mode)

(require 'evil)
(evil-mode 1)
(require 'expand-region)
(global-set-key (kbd "C-q") 'er/expand-region)
(global-set-key (kbd "M-q") 'er/contract-region)
(require 'magit)
(require 'projectile)
(projectile-global-mode 1)

;; (require 'flymake)
;; (add-hook 'java-mode-hook 'flymake-mode-on)

;; (defun my-java-flymake-init ()
;;   (list "javac" (list (flymake-init-create-temp-buffer-copy
;;                        'flymake-create-temp-with-folder-structure))))

;; (add-to-list 'flymake-allowed-file-name-masks '("\\.java$" my-java-flymake-init flymake-simple-cleanup))



;; gui changes
(powerline-default-theme)


;; visible-bell
 (defun my-terminal-visible-bell ()
   "A friendlier visual bell effect."
   (invert-face 'mode-line)
   (run-with-timer 0.1 nil 'invert-face 'mode-line))
 
 (setq visible-bell       nil
       ring-bell-function #'my-terminal-visible-bell)

;; no bars
(tool-bar-mode -1)
(scroll-bar-mode -1)
(setq inhibit-startup-message t) 
(blink-cursor-mode -1)
(menu-bar-mode -1)

;; turn on line higlihgting 
(global-hl-line-mode +1)
(volatile-highlights-mode)
;; turn off those stupid emacs droppings
(setq make-backup-files nil)

;; turn on recent mode
(recentf-mode 1)

;; turn on helm mode
;; (helm-mode 1)

;; Company Mode
(add-hook 'after-init-hook 'global-company-mode)
(setq company-idle-delay .2);; small delay feels better

;; highligh parens 
(setq show-paren-delay 0)
(show-paren-mode 1)
;;(autopair-global-mode 1)

;;Smooth scrolling 
(setq scroll-conservatively 1000)

;; load fonts

;; font changes
;; Turn colors on default
(setq tab-width 4)
(setq-default indent-tabs-mode nil)
(global-font-lock-mode 1)
(setq-default line-spacing 0)
;;(add-to-list 'default-frame-alist '(font . "Lucida Console"))
;;(set-face-attribute 'default t :font "Lucida Console" )

(set-face-attribute 'default (selected-frame) :height 105)

;; theme
(load-theme 'monokai t)

;;(load-theme 'solarized-light t)



;; misc functions

(defun eval-and-replace ()
  "Replace the preceding sexp with its value."
  (interactive)
  (backward-kill-sexp)
  (condition-case nil
      (prin1 (eval (read (current-kill 0)))
             (current-buffer))
    (error (message "Invalid expression")
           (insert (current-kill 0)))))

; print current date

(defun date()
  (current-time-string))

;; premade stuff
(custom-set-variables
 ;; custom-set-variables was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(blink-cursor-mode nil)
 '(custom-safe-themes
   (quote
    ("5301f8ef618313dffce63c69657e58180e985958f6635c859f2c036094fd1919" "d737a2131d5ac01c0b2b944e0d2cb0be1c76496bb4ed61be51ff0e5457468974" "2c73700ef9c2c3aacaf4b65a7751b8627b95a1fd8cebed8aa199f2afb089a85f" "b571f92c9bfaf4a28cb64ae4b4cdbda95241cd62cf07d942be44dc8f46c491f4" default)))
 '(show-paren-mode t)
 '(tool-bar-mode nil))
(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(default ((t (:family "Droid Sans Mono" :foundry "outline" :slant normal :weight normal :height 110 :width normal)))))
