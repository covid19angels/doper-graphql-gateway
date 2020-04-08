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
public class WebhookUpdatePayloadGQO {


    private WebhookGQO item;
    @lombok.NonNull
    private Collection<WebhookUpdateErrorGQO> errors;

    public WebhookUpdatePayloadGQO() {
    }

    public WebhookUpdatePayloadGQO( WebhookGQO item,  Collection<WebhookUpdateErrorGQO> errors) {
        this.item = item;
        this.errors = errors;
    }

}