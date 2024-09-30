package com.noah.whatsappclone.messaging.domain.user.valueObject;

import com.noah.whatsappclone.shared.error.domain.Assert;

public record UserFirstname(String value) {

    public UserFirstname {
        Assert.field("value", value).maxLength(255);
    }
}
