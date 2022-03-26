(ns myserver.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [myserver.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[myserver started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[myserver has shut down successfully]=-"))
   :middleware wrap-dev})
