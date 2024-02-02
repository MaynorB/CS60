#lang racket

(provide power)
(provide fast-power)


;; power: recursive function to mulitpy base to a certain power
;; input base: an integer
;; input pow: the power the integer is raised to
;; output: base raised to pow
;; 
(define (power base pow)
  (if (= 0 pow)
      1
      (* base (power base(- pow 1)))))

;fast-power: recursive function meant to be quicker than the power function
; input base: an integer
;input pow: integer that base is raised to
;output: base raised to pow
(define (fast-power base pow)
  (if (= 0 pow)
      1
      (if (odd? pow)
          (* base (fast-power base (- pow 1)))
          (* (fast-power base (quotient pow 2)) (fast-power base (quotient pow 2))))))