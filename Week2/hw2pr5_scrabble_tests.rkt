#lang racket

(require rackunit)

(require "hw2pr5_scrabble.rkt")

; Student tests
(check-true  (subbag? '()      '()) )
(check-false  (subbag? '(s s)   '()) )



;Provided Tests
(check-true  (subbag? '()      '(s p a m s)) )
(check-true  (subbag? '(s s)   '(s p a m s)) )
(check-true  (subbag? '(s m)   '(s p a m s)) )
(check-true  (subbag? '(a p)   '(s p a m s)) )
(check-false (subbag? '(a m a) '(s p a m s)) )
(check-true  (subbag? '(a s)   '(s a))       )





;Provided Tests for Scrabble
(check-equal? (best-word "academy" '("ace" "ade" "cad" "cay" "day")) 
 '("cay" 8))
(check-equal? (best-word "appler"  '("peal" "peel" "ape" "paper")) 
 '("paper" 9))
(check-equal? (best-word "paler"   '("peal" "peel" "ape" "paper"))
 '("peal" 6))
(check-equal? (best-word "kwyjibo" '("ace" "ade" "cad" "cay" "day"))
 '("" 0))