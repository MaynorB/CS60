#lang racket

(require rackunit)
(require "hw1pr4_power.rkt")

; provided tests

(check-equal? (power 2 10) 1024)
(check-equal? (power 42 10) 17080198121677824)

(check-equal? (fast-power 2 10) 1024)
(check-equal? (fast-power 42 10) 17080198121677824)
; student tests
(check-equal? (power 4 3) 64)
(check-equal? (power 42 10) 17080198121677824)

(check-equal? (fast-power 5 3) 125)
(check-equal? (fast-power 10 4) 10000)