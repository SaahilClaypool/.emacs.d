;; gui changes
(tool-bar-mode -1)
(scroll-bar-mode -1)
(setq inhibit-startup-message t) 
(set-face-attribute 'default nil :height 100)


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



;; Turn colors on default
(global-font-lock-mode 1)

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
 '(custom-safe-themes
   (quote
    ("70b9e0d0b857d6497c6623bb360a3a7f915251c4a6233c30b65f9005eb9f4256" "8e997c790c6b22c091edb8a866f545857eaae227a0c41df402711f6ebc70326c" "fd7ef8af44dd5f240e4e65b8a4eecbc37a07c7896d729a75ba036a59f82cfa58" "ef36e983fa01515298c017d0902524862ec7d9b00c28922d6da093485821e1ba" "98e5e942303b4f356d6573009c96087f9b872f2fa258c673188d913f6faf17ea" "4974f680cd265a7049d7bfbb9be82e78ae97c12dd5eac0205756acc3f424f882" "3fe4861111710e42230627f38ebb8f966391eadefb8b809f4bfb8340a4e85529" "0ff3aeed353697992d100ddf8a94d065a58ffbde5a40afefa605f211757c8ab0" "2cc9ecf74dd307cdf856a2f47f6149583d6cca9616a0f4ecc058bafa57e4ffa3" "dd3eb539595bd7643baaff3a3be67b735a82052c37c2d59192ef51a0983dbfca" "f211f8db2328fb031908c9496582e7de2ae8abd5f59a27b4c1218720a7d11803" "ab91ad83f4c9e12a8d01458e83954fd244541eb9412c87d1ab831629c47ad504" "f07583bdbcca020adecb151868c33820dfe3ad5076ca96f6d51b1da3f0db7105" "a3821772b5051fa49cf567af79cc4dabfcfd37a1b9236492ae4724a77f42d70d" "89127a6e23df1b1120aa61bd7984f1d5f2747cad1e700614a68bdb7df77189ba" "9dc64d345811d74b5cd0dac92e5717e1016573417b23811b2c37bb985da41da2" "9a3c51c59edfefd53e5de64c9da248c24b628d4e78cc808611abd15b3e58858f" default)))
 '(send-mail-function (quote sendmail-send-it))
 '(tool-bar-mode nil)
 '(uniquify-buffer-name-style (quote forward) nil (uniquify)))
(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(default ((t (:family "DejaVu Sans Mono" :foundry "outline" :slant normal :weight normal :height 120 :width normal)))))
