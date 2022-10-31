package com.solvd.apitests;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetMethodForUser extends AbstractApiMethodV2 {

    public GetMethodForUser(String owner, String repo) {
        super(owner, repo);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
    }

}
