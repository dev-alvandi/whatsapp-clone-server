package com.noah.whatsappclone.messaging.domain.user.valueObject;

import com.noah.whatsappclone.shared.error.domain.Assert;

public record UserEmail(String value) {

    public UserEmail {
        Assert.field("value", value).maxLength(255);
    }
}
