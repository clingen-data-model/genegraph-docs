(ns genegraph.user
  (:require [nextjournal.clerk :as clerk]
            [portal.api :as portal]
            [genegraph.docs :as docs]))



(comment
  (clerk/serve! {:watch-paths ["notebooks"]})
  (clerk/show! "notebooks/gene_validity.md")
  (clerk/build! {:paths ["notebooks/gene_validity.clj"]})

  (def p (portal/open))
  (add-tap #'portal/submit)
  (portal/clear)

  (tap> docs/zeb2)
  )
