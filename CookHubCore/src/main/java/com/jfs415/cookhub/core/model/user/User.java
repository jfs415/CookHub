package com.jfs415.cookhub.core.model.user;

import com.jfs415.cookhub.core.model.Entity;
import com.jfs415.cookhub.core.model.recipe.Recipe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Users")
public class User implements Entity {

    @Id
    private UUID id;

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private UserType userType;
    private List<Recipe> recipes;

    public User(UserUpdateParameters userUpdateParameters) {
        this.id = UUID.randomUUID();
        this.username = userUpdateParameters.username();
        this.firstName = userUpdateParameters.firstName();
        this.lastName = userUpdateParameters.lastName();
        this.email = userUpdateParameters.email();
        this.password = userUpdateParameters.password();
        this.phoneNumber = userUpdateParameters.phoneNumber();
        this.dateOfBirth = userUpdateParameters.dateOfBirth();
        this.recipes = new ArrayList<>();
    }

    public User update(UserUpdateParameters userUpdateParameters) {
        this.username = userUpdateParameters.username();
        this.lastName = userUpdateParameters.lastName();
        this.firstName = userUpdateParameters.firstName();

        return this;
    }
}
