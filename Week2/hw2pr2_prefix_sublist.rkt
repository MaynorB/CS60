#lang racket

(provide prefix? sublist?)


;; prefix?: Checks if list P is identical to the intital elements of list L
;;  inputs: prefix list, P
;;          list to check if P is a prefix in, L
;;  output: true or false based if P is a prefix of L

(define (prefix? P L)
  (cond [(empty? P) #t ] 
        [(equal? (first P) (first L))
         (prefix? (rest P) (rest L))]
        [else #f]))


;sublist?: Checks if list S is in list L
;  inputs: list S
;          list the function is searching in, L
;
; output: true or false based is S is a sublist of L
(define (sublist? S L)
  (cond [(empty? L) #f]
        [(prefix? S L) #t]
        [else (sublist? S (rest L))]
        ))