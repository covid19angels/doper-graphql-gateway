package com.contentbig.graphql.softwareapplication.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;
import com.contentbig.graphql.softwareapplication.api.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class WebhookUpdateInputGQO {

    @lombok.NonNull
    private WebhookFilterGQO filter;

    private WebhookPatchGQO set;

    private WebhookPatchGQO remove;

    public WebhookUpdateInputGQO() {
    }

    public WebhookUpdateInputGQO( WebhookFilterGQO filter,  WebhookPatchGQO set,  WebhookPatchGQO remove) {
        this.filter = filter;
        this.set = set;
        this.remove = remove;
    }

}