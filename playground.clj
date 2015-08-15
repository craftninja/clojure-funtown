(defn total-with-tip
  "Given a subtotal and tip percentage, calculate total with tax and tip"
  [subtotal tip-pct]
  ( * 1.08 subtotal ( + 1 tip-pct ) )
)

(defn share-per-person
  "Given a subtotal, tip percentage, and number of people, use total-with-tip to return amount per person"
  [subtotal tip-pct number-guests]
  ( / ( total-with-tip subtotal tip-pct ) number-guests )
)

(defn average
  "Given a vector of bill amounts, return the average (mean)"
  [bill-amounts]
  ( / ( reduce + bill-amounts) (count bill-amounts ) )
)
