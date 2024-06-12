package com.jfs415.cookhub.core.model.ingredient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class IngredientMetadata {

    private int calories;
    private int cost;
    private Ingredient substitution;

    public IngredientMetadata(int calories, int cost) {
        this.calories = calories;
        this.cost = cost;
    }
}
