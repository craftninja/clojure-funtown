(defn total-with-tip
  "Given a subtotal and tip percentage, calculate total with tax and tip"
  [subtotal tip-pct]
  ( * 1.08 subtotal ( + 1 tip-pct ) )
)
