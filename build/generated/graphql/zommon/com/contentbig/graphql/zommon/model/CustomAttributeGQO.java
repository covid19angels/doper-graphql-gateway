package com.contentbig.graphql.zommon.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.softwareapplication.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.api.*;
import com.contentbig.graphql.zommon.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class CustomAttributeGQO {

    @lombok.NonNull
    private String key;

    private String value;

    public CustomAttributeGQO() {
    }

    public CustomAttributeGQO( String key,  String value) {
        this.key = key;
        this.value = value;
    }

}