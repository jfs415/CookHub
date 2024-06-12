package com.jfs415.cookhub.core.model.user;

import com.jfs415.cookhub.core.model.EntityUpdateParameters;
import java.io.Serializable;
import java.time.LocalDate;

public record UserUpdateParameters(
        String username,
        String firstName,
        String lastName,
        String email,
        String password,
        String phoneNumber,
        LocalDate dateOfBirth,
        UserType userType)
        implements EntityUpdateParameters, Serializable {}
