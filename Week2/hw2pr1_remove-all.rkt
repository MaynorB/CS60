#lang racket

(provide remove-all)

;; remove-all: removes all top-level instances of element from list
;;  inputs: element to remove, elem
;;          list to remove from, L
;;  output: list identical to L with all top-level instances of elem removed

;;simple reminders: conds adds an item to a list
;;remove removes the first instance of an item

(define (remove-all elem L)
        (if (empty? L)
            L
            (if (equal? elem (first L))
                (remove-all elem (rest L))
                (cons (first L) (remove-all elem (rest L))))))


