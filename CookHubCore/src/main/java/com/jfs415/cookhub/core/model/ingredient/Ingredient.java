package com.jfs415.cookhub.core.model.ingredient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ingredient {

    private final String name;
    private final String amount;
    private final String specification;
    private final IngredientMetadata metaData;

    public Ingredient(String name, String amount) {
        this.name = name;
        this.amount = amount;
        this.specification = "";
        this.metaData = null;
    }

    @Override
    public String toString() {
        return name + " " + amount + ", " + specification;
    }
}
