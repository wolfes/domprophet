(ns dom-prophet.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defn root []
  "Root says: Hello World!")

(defroutes app-routes
  (GET "/" [] (root))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
