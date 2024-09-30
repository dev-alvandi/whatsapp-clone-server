package com.noah.whatsappclone.messaging.domain.user.valueObject;

import com.noah.whatsappclone.shared.error.domain.Assert;

public record UserLastname(String value) {

    public UserLastname {
        Assert.field("value", value).maxLength(255);
    }
}
