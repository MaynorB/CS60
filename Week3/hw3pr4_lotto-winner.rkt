#lang racket

(provide matches)
(provide lotto-winner)


;; matches: finds the number of matches between ticket and winning numbers
;;   inputs: tickets - lotto ticket, list of numbers
;;             expected format:  '(name # # ... #)
;;           winning-numbers - winning numbers, list of numbers
;;             expected format:  '(# # .. #)
;;   output: the number elements that match between tickets and winning-numbers
(define (matches ticket winning-numbers)
  (length 
   (filter (lambda (potential-match) 
             (member potential-match winning-numbers))
           ticket)))

;matches gets the length of a filtered list
;the filter function outputs the numbers on a ticket that match that of the winning numbers.


;; lotto-winner: finds the name and number of the winning ticket
;;   inputs: list-of-tickets - list of lotto tickets, list of lists of numbers
;;             expected format:  '((name1 # # ... #) ... (nameN # # ... #)) 
;;           winning-numbers - winning numbers, list of numbers
;;             expected format:  '(# # .. #)
;;   output: the name and number of matching tickets from the ticket 
;;           with the most matches in winning-numbers

(define (lotto-winner list-of-tickets winning-numbers)
  (define (matches ticket winning-numbers)
  (length 
   (filter (lambda (potential-match) 
             (member potential-match winning-numbers))
           ticket)))
  (first (sort (map (lambda (x) (append (list (matches (rest x) winning-numbers)) (list (first x)))) list-of-tickets) #:key car >)))  ;the lambda function takes in the sublist from L. The matches function runs on everything but the firt item in the sublist.

;(sort '(("aardvark") ("dingo") ("cow") ("bear"))
        ;#:key car string<?)

(sort '(("aardvark") ("dingo") ("cow") ("bear")) #:key car string<?)
;(sort entries   
;(lambda(entry) (entry) (sort (last entry)
(define (sublists L)
  (if (null? L)
      '(()) ;(below) ;defines it to be the first of the list L
      (let* ([it (first L)] ;let star allows the first definition to be used on later in other let definitions.
            [lose-it (sublists (rest L))] ;lose it is whatever the sublists returns if it is called with the rest of the list
            [use-it (map (lambda (E) (cons it E)) lose-it)]) ;use-it, i want to add the first of my list/ add "it" to everything returned by lose-it. "cons it E" is a function call, not a function. map must take in a function, so therefore we have to use lambda. lambda of e: (lambda (E) (which is a single element)//cons it to E, and that is the function we'll map over loseitl.  
        (append lose-it use-it))))
;(define (lotto-winner list-of-tickets winning-numbers)
  ;(define (matches ticket winning-numbers)
  ;(length 
   ;(filter (lambda (potential-match) 
  ;           (member potential-match winning-numbers))
 ;          ticket)))
;  (map (lambda (x) (matches (rest x) winning-numbers)) list-of-tickets))

;(lotto-winner '( (aarya 2 4 16 33 42) (bao 3 4 5 6 7) (cruz 3 15 16 41 42) ) '(2 3 15 32 42))

;first, I need to find a way to get to the first item in each of the sublists. This can be done just like in the use it or lose it functions, in which we grab all the sublists that begin with a
;after that, I need to count the number of matches. I can do this by performing matches on the rest of L
;After somehow producing a list with only the numbers of matches, I need to get the maximum value of said list,
; I can use the built in max function to get the winner.

;probbaly gonna have to use map.
