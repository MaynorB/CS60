#lang racket

(require rackunit)
(require "hw2pr1_remove-all.rkt")


; student tests
(check-equal? (remove-all "i" '()) 
              '())
(check-equal? (remove-all " " '( ("a" "l" "i") "i" "i" "e" "n")) 
              '( ("a" "l" "i") "i" "i" "e" "n"))
(check-equal? (remove-all 1 '((1 0) (1 0) (1 0)))  
              '((1 0) (1 0) (1 0)))

; provided tests
(check-equal? (remove-all "i" '("a" "l" "i" "i" "i" "e" "n")) 
              '("a" "l" "e" "n"))
(check-equal? (remove-all "i" '( ("a" "l" "i") "i" "i" "e" "n")) 
              '(("a" "l" "i") "e" "n"))
(check-equal? (remove-all 0 '(1 0 1 0 1 0))  
              '(1 1 1))

