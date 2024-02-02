#lang racket


(provide superreverse duperreverse)


(define (superreverse L)
  (cond [(null? L) '()] ;if nothing is in the list, end the recursion
        [(list? (first L)) (append (list(reverse(first L))) (superreverse(rest L)))] ;if the first object in L is a list, append the reversed version of the first item to the recursion (and add depth)
        [else (cons (superreverse(rest L)) (first L))])) ;if the first object in L is a value, add the first item in L to the recursion


