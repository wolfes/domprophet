(ns dom-prophet.test.handler
  (:use clojure.test
        ring.mock.request  
        dom-prophet.handler))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Root says: Hello World!"))))
  
  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))
