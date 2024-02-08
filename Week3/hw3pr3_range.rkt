#lang racket

(provide make-range-predicate)


;; make-range-predicate: returns a function that checks if a value is in range
;;   inputs: low - the low (exclusive) lower bounds, number
;;           high - the high (exclusive) upper bounds, number
;;   output: a function that takes one input and returns true 
;;           if the input is between the values low and high
;;           (and returns false if the input is less than or 
;;           equal to low or is greater than or equal to high)
(define (make-range-predicate low high)
  (lambda (x) (and (> x low) (< x high))))

(define value1to3? (make-range-predicate 0 4))
(define value1to100? (make-range-predicate 0 101))

(check-equal? (value1to100? 100) true)
(check-equal? (value1to100? 101) false)

;(define (make-adder x) 
  ;(lambda (y) (+ x y)))

