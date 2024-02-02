#lang racket

;; Two functions will be treated as publicly accessible
;;   (so that we can test them)
(provide erdos erdos-count)


;; erdos: the "erdos" function
;;   input: a positive integer, N
;;   output: 3N+1, if N is odd
;;           N/2, if N is even
(define (erdos N)
  (if (= (modulo N 2) 0)
      (quotient N 2)
      (+ (* 3 N) 1)))
      

;; erdos-count: tracks how many times erdos is counted
;;     input: a positive integer, N
;;     Output: Number of times Erdos was called to convert N into 1
(define (erdos-count N)
  (if (= N 1)
      0
      (+ (erdos-count(erdos N)) 1)))

