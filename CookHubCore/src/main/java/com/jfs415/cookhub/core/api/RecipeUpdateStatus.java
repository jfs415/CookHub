package com.jfs415.cookhub.core.api;

import com.jfs415.cookhub.core.model.Status;
import com.jfs415.cookhub.core.model.UpdateStatus;
import com.jfs415.cookhub.core.model.recipe.RecipeUpdateParameters;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RecipeUpdateStatus implements UpdateStatus {

    private final Status status;
    private final RecipeUpdateParameters recipe;
    private final String reason;

    public RecipeUpdateStatus(Status status, RecipeUpdateParameters recipe) {
        this.status = status;
        this.recipe = recipe;
        this.reason = "";
    }
}
