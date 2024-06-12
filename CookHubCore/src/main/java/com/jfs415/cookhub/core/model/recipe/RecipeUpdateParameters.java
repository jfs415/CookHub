package com.jfs415.cookhub.core.model.recipe;

import com.jfs415.cookhub.core.model.EntityUpdateParameters;
import com.jfs415.cookhub.core.model.estimate.TimeEstimate;
import com.jfs415.cookhub.core.model.ingredient.Ingredient;
import java.io.Serializable;
import java.util.List;

public record RecipeUpdateParameters(
        String author,
        String title,
        List<Category> category,
        List<Preference> preferences,
        List<Allergen> allergens,
        List<Ingredient> ingredients,
        List<TimeEstimate> timeEstimates)
        implements EntityUpdateParameters, Serializable {}
