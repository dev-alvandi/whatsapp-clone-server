package com.noah.whatsappclone.messaging.domain.user.valueObject;

import com.noah.whatsappclone.shared.error.domain.Assert;

public record AuthorityName(String name) {
    public AuthorityName {
        Assert.field("name", name).notNull();
    }


}
