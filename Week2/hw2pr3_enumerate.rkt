#lang racket

(provide enumerate)


;; enumerate: Creates an association List
;;  inputs: list L
;;  output: an A-list
(define (enumerate L)
  (build_aList L 0))


;; build_aList: Creates an association List utilizing indexes of the element
;;  inputs: list L
;;          current index of the list, N
;;  output: an A-list with each element with their associated index
(define (build_aList L N)
  (cond
    [(equal? L '()) '()]
    [(> N (+ N (length L))) '()]
    [else
     (cons (cons N (list(first L))) (build_aList (rest L) (+ N 1)))]))
        
      