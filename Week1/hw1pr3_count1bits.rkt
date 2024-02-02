#lang racket

(provide count1bits)


;; count1bits: recursive count bit fuction
;;   input: an integer N 
;;   output: number of times 1 appears in N when it is represented
;; as a binary number


(define (count1bits N)
  (if (= N 0)
      0
      (if (odd? N)
          (+ 1 (count1bits(quotient N 2)))
          (+ 0 (count1bits(quotient N 2))))))
