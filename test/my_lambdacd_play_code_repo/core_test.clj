(ns my-lambdacd-play-code-repo.core-test
  (:require [my-lambdacd-play-code-repo.core :as sut]
            [midje.sweet :refer :all]))

(fact "My silly test"
  (+ 10 32)
  => 42)

(fact "My silly test 2"
  (+ 100 22)
  => 42)
