package com.contentbig.graphql.place.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.place.api.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class StoreUpdatePayloadGQO {


    private StoreGQO store;

    private ActionGQO action;
    @lombok.NonNull
    private Collection<StoreUpdateErrorGQO> storeUpdateErrors;

    public StoreUpdatePayloadGQO() {
    }

    public StoreUpdatePayloadGQO( StoreGQO store,  ActionGQO action,  Collection<StoreUpdateErrorGQO> storeUpdateErrors) {
        this.store = store;
        this.action = action;
        this.storeUpdateErrors = storeUpdateErrors;
    }

}