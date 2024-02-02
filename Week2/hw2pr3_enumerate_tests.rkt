#lang racket



(require rackunit)

(require "hw2pr3_enumerate.rkt")

;Student tests

(check-equal? (enumerate '(1 2 3 4)) 
 '((0 1) (1 2) (2 3) (3 4)))
(check-equal? (enumerate '(a b c)) 
                        '((0 a) (1 b) (2 c)))
(check-equal? (enumerate '(hello world))  '((0 hello) (1 world)))


;Provided Tests

(check-equal? (enumerate '(jan feb mar apr)) 
 '((0 jan) (1 feb) (2 mar) (3 apr)))

(check-equal? (enumerate '(0 I II III IV V VI)) 
                         '((0 0) (1 I) (2 II) (3 III) (4 IV) (5 V) (6 VI)))

(check-equal? (enumerate '())  '())