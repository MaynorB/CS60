#lang racket

(provide subbag? best-word)


;subbag? Function that checks if all elements of list S is in List B, including amount of the same elements
;Input: List of elements, S
;       List of elements, B
;Output: #t or #f based on if every element of S is in B, regardless of order
(define (subbag? S B)
  (cond [(empty? S) #t]
        [(member (first S) B)
         (subbag?(rest S) (remove (first S) B))]
        [else #f]))

;
;
;
;
(define (best-word rack WL)
  (if (= (length WL) 0)
      0
      (if (= (length WL) 1)
          (append (list(first WL)) (list(score-word (first WL))))
          (if(<= (score-word(first WL)) (score-word(second WL)))
             (best-word rack (rest WL))
             (best-word rack (remove (second WL) WL))))))


;Score-word determines the score for the letter
;Input: word to be scored
;Output: added up score of each indivdual letter in word
(define (score-word word)
  (cond [(> (string-length word) 0)
         (+ (score-letter(first(string->list (substring word 0 1))))(score-word (substring word 1 (string-length word))))]
        [else 0]))
        




;Score-letter determines the score for the letter inputed
;Input: a letter to be scored
;output: the score associated with the letter according to scrabble-tile-bag
  
(define (score-letter letter)
  (second(assoc letter scrabble-tile-bag)))

;; scrabble-tile-bag  
;;   letter tile scores and counts from the game of Scrabble
;;   the counts are not needed
;;   obtained from http://en.wikipedia.org/wiki/Image:Scrabble_tiles_en.jpg
(define scrabble-tile-bag
  '((#\a 1 9) (#\b 3 2) (#\c 3 2) (#\d 2 4) (#\e 1 12)
   (#\f 4 2) (#\g 2 3) (#\h 4 2) (#\i 1 9) (#\j 8 1)
   (#\k 5 1) (#\l 1 4) (#\m 3 2) (#\n 1 6) (#\o 1 8)
   (#\p 3 2) (#\q 10 1)(#\r 1 6) (#\s 1 4) (#\t 1 6)
   (#\u 1 4) (#\v 4 2) (#\w 4 2) (#\x 8 1) (#\y 4 2)
   (#\z 10 1) (#\_ 0 2)) ) 
;; end define scrabble-tile-bag
;; The underscore is used to represent a blank tile, which is a wild-card