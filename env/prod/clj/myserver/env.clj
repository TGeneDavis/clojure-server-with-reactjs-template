(ns myserver.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[myserver started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[myserver has shut down successfully]=-"))
   :middleware identity})
