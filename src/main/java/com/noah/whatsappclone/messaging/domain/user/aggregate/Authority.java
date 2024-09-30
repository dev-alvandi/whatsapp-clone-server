package com.noah.whatsappclone.messaging.domain.user.aggregate;

import com.noah.whatsappclone.messaging.domain.user.valueObject.AuthorityName;
import com.noah.whatsappclone.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

    private AuthorityName name;

    public Authority(AuthorityName name) {
        Assert.notNull("name", name);
        this.name = name;
    }

    public AuthorityName getName() {
        return name;
    }
}
