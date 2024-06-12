package com.jfs415.cookhub.core.model.recipe;

import com.jfs415.cookhub.core.model.Entity;
import com.jfs415.cookhub.core.model.estimate.TimeEstimate;
import com.jfs415.cookhub.core.model.ingredient.Ingredient;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Setter
@Document("Recipe")
public class Recipe implements Entity {

    @Id
    private UUID recipeId;

    private String title;
    private String author;
    private Date dateAdded;
    private Date lastUpdated;
    private List<Category> category;
    private List<Preference> preferences;
    private List<Allergen> allergens;
    private List<Ingredient> ingredients;
    private List<TimeEstimate> timeEstimates;

    public Recipe(RecipeUpdateParameters parameters) {
        Date currentDate = new Date();
        this.recipeId = UUID.randomUUID();
        this.title = parameters.title();
        this.author = parameters.author();
        this.dateAdded = currentDate;
        this.lastUpdated = currentDate;
        this.category = parameters.category();
        this.preferences = parameters.preferences();
        this.allergens = parameters.allergens();
        this.ingredients = parameters.ingredients();
        this.timeEstimates = parameters.timeEstimates();
    }

    public Recipe update(RecipeUpdateParameters parameters) {
        Date currentDate = new Date();

        this.title = parameters.title();
        this.author = parameters.author();
        this.dateAdded = currentDate;
        this.lastUpdated = currentDate;
        this.category = parameters.category();
        this.preferences = parameters.preferences();
        this.allergens = parameters.allergens();
        this.ingredients = parameters.ingredients();
        this.timeEstimates = parameters.timeEstimates();

        return this;
    }
}
