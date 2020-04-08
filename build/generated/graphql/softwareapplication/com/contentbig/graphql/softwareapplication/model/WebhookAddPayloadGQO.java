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
public class WebhookAddPayloadGQO {


    private WebhookGQO item;
    @lombok.NonNull
    private Collection<WebhookAddErrorGQO> errors;

    public WebhookAddPayloadGQO() {
    }

    public WebhookAddPayloadGQO( WebhookGQO item,  Collection<WebhookAddErrorGQO> errors) {
        this.item = item;
        this.errors = errors;
    }

}