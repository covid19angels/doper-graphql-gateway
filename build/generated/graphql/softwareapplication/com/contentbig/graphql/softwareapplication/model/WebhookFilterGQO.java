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
public class WebhookFilterGQO {


    private StringHashFilterGQO name;
    @lombok.NonNull
    private Collection<String> id;

    private WebhookFilterGQO and;

    private WebhookFilterGQO or;

    private WebhookFilterGQO not;

    public WebhookFilterGQO() {
    }

    public WebhookFilterGQO( StringHashFilterGQO name,  Collection<String> id,  WebhookFilterGQO and,  WebhookFilterGQO or,  WebhookFilterGQO not) {
        this.name = name;
        this.id = id;
        this.and = and;
        this.or = or;
        this.not = not;
    }

}