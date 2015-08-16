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

(defn format-name
  "Given a first and last name, return \"Last, First\""
  [first-name last-name]
  ( str last-name ", " first-name )
)

(def branwyn
  {
    :first-name "Branwyn"
    :last-name "Platzer"
  }
)

(def people
  [
    {:first-name "Emily"  :middle-name "Kristen"  :last-name "Platzer"}
    {:first-name "Luke"   :middle-name "Austin"   :last-name "Bartel"}
    {:first-name "Little" :middle-name "Kitten" :last-name "Platzer Bartel"}
  ]
)

(defn get-names
  [names]
  (map (fn [name]
    (str (get name :first-name) " " (get name :middle-name) " " (get name :last-name))
  ) names)
)
