SELECT animals.name, foods.name, daily_amount_per_kg_l, food_price_per_unit_in_huf
FROM animals
INNER JOIN foods ON animals.food_id = foods.id;
