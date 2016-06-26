;; config changes

;; load files
(load-file "~/.emacs.d/packages.el")
(load-file  "~/.emacs.d/keybindings.el")






;; gui changes
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
(setq-default line-spacing 4)
;;(add-to-list 'default-frame-alist '(font . "Lucida Console"))
;;(set-face-attribute 'default t :font "Lucida Console" )
;;(add-to-list 'default-frame-alist '(font . "Driod Sans Mono Regular"))
;;(set-face-attribute 'default t :font  "Driod Sans Mono Regular")
(set-face-attribute 'default (selected-frame) :height 105)

;; theme
;;(load-theme 'monokai t)

(load-theme 'solarized-light t)



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


;; premade stuff
(custom-set-variables
 ;; custom-set-variables was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(blink-cursor-mode nil)
 '(custom-safe-themes
   (quote
    ("d737a2131d5ac01c0b2b944e0d2cb0be1c76496bb4ed61be51ff0e5457468974" "2c73700ef9c2c3aacaf4b65a7751b8627b95a1fd8cebed8aa199f2afb089a85f" "b571f92c9bfaf4a28cb64ae4b4cdbda95241cd62cf07d942be44dc8f46c491f4" default)))
 '(show-paren-mode t)
 '(tool-bar-mode nil))
(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(default ((t (:family "Droid Sans Mono" :foundry "outline" :slant normal :weight normal :height 110 :width normal)))))
