#lang racket
;hw3pr2_indivisible.rkt

;indivisible takes in two inputs, a positive integer e, and a list L of positive integers.
;It returns a list consisting of all of the elements of L that are not divisible by e.
;Those elements should appear in the same order as they do in L.

(define (indivisible e L)
  (filter (lambda (pos_int) (not (= 0 (modulo pos_int e)))) L))

;(indivisible 3 '(2 3 4 5 6 7 8 9 10 ))