;; file with all custom keybindings

;; doxyref
(global-set-key (kbd "C-c d d") (lambda ()(interactive)(doxyRef-lookup-docs)))
(global-set-key (kbd "C-c d s") (lambda ()(interactive)(doxyRef-setup-project)))

;; ;; HELM
;; ;; Changed to "C-c h". Note: We must set "C-c h" globally, because we
;; ;; cannot change `helm-command-prefix-key' once `helm-config' is loaded.
;; (global-set-key (kbd "C-c h") 'helm-command-prefix)
;; (global-set-key (kbd "C-x C-f") 'helm-find-files)
;; (global-set-key (kbd "M-x") 'helm-M-x)
;; (global-set-key (kbd "M-y") 'helm-show-kill-ring)
;; (global-set-key (kbd "C-x b") 'helm-mini)
;; (setq helm-buffers-fuzzy-matching t
;;       helm-recentf-fuzzy-match    t)
;; (define-key helm-map (kbd "<tab>") 'helm-execute-persistent-action) ; rebind tab to run persistent action
;; (define-key helm-map (kbd "C-i") 'helm-execute-persistent-action) ; make TAB works in terminal
;; (define-key helm-map (kbd "C-z")  'helm-select-action) ; list actions using C-z

(with-eval-after-load 'company
   (define-key company-active-map (kbd "M-d") #'company-show-doc-buffer))

;; query replace
(global-set-key (kbd "M-r") 'query-replace)

;; recent files
(global-set-key (kbd "C-c r") 'recentf-open-more-files)
;; Save without asking
(global-set-key "\C-xs" 'save-buffer)
(global-set-key "\C-xc" 'compile)
(global-set-key "\C-xn" 'next-error)

;;CUSTOM KEY BINDINGS

(global-set-key "\C-x\C-b" 'buffer-menu) ;; change buffer same window




(global-set-key (kbd "C-c e") 'eval-and-replace)
;; avy jump 

(define-key global-map (kbd "M-j") 'avy-goto-word-or-subword-1)


(define-key global-map (kbd "C-x p") 'ace-window)



;; Turn on window switching
(when (fboundp 'windmove-default-keybindings)
    (windmove-default-keybindings))

(global-set-key (kbd "C-c <left>")  'windmove-left)
(global-set-key (kbd "C-c <right>") 'windmove-right)
(global-set-key (kbd "C-c <up>")    'windmove-up)
(global-set-key (kbd "C-c <down>")  'windmove-down)


;; window resize
(global-set-key (kbd "S-C-<left>") 'shrink-window-horizontally)
(global-set-key (kbd "S-C-<right>") 'enlarge-window-horizontally)
(global-set-key (kbd "S-C-<down>") 'shrink-window)
(global-set-key (kbd "S-C-<up>") 'enlarge-window)


;; neo tree neotree
(global-set-key [f8] 'neotree-toggle)
