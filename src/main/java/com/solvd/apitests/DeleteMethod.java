package com.solvd.apitests;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteMethod extends AbstractApiMethodV2 {

    public DeleteMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("url"));
    }

}
