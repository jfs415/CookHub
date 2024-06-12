package com.jfs415.cookhub.core.model.user;

import com.jfs415.cookhub.core.model.Status;
import com.jfs415.cookhub.core.model.UpdateStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserUpdateStatus implements UpdateStatus {
    private final Status status;
    private final UserUpdateParameters userUpdateParameters;
    private final String reason;

    public UserUpdateStatus(Status status, UserUpdateParameters userUpdateParameters) {
        this.status = status;
        this.userUpdateParameters = userUpdateParameters;
        this.reason = "";
    }
}
