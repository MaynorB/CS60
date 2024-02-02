#lang racket

(require rackunit)

(require "hw2pr2_prefix_sublist.rkt")

;; Student Tests
(check-false  (prefix? '(s p a n)    '(e)))

(check-true (sublist? '(s) '(a d f e w q t g h f y m k p s)))

(check-false (sublist? '(s) '(q w e r t y u i o p)))










;; Provided Tests
(check-true  (prefix? '()    '(s p a m)))
(check-true  (prefix? '(s p) '(s p a m)))
(check-false (prefix? '(s m) '(s p a m)))
(check-false (prefix? '(p a) '(s p a m)))


(check-true  (sublist? '()    '(s p a m)))
(check-true  (sublist? '(s p) '(s p a m)))
(check-false (sublist? '(s m) '(s p a m)))
(check-true  (sublist? '(p a) '(s p a m)))