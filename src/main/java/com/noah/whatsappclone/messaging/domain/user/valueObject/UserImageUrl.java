package com.noah.whatsappclone.messaging.domain.user.valueObject;

import com.noah.whatsappclone.shared.error.domain.Assert;

public record UserImageUrl(String value) {

    public UserImageUrl {
        Assert.field("value", value).maxLength(255);
    }
}
