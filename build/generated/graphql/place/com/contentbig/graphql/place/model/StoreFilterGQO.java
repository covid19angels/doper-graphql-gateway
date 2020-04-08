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
public class StoreFilterGQO {

    @lombok.NonNull
    private Collection<String> id;

    private StringHashFilter_StringRegExpFilterGQO name;

    private StoreFilterGQO and;

    private StoreFilterGQO or;

    private StoreFilterGQO not;

    public StoreFilterGQO() {
    }

    public StoreFilterGQO( Collection<String> id,  StringHashFilter_StringRegExpFilterGQO name,  StoreFilterGQO and,  StoreFilterGQO or,  StoreFilterGQO not) {
        this.id = id;
        this.name = name;
        this.and = and;
        this.or = or;
        this.not = not;
    }

}