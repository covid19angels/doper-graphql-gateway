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
public class StringExactFilterGQO {


    private String eq;

    private String le;

    private String lt;

    private String ge;

    private String gt;

    public StringExactFilterGQO() {
    }

    public StringExactFilterGQO( String eq,  String le,  String lt,  String ge,  String gt) {
        this.eq = eq;
        this.le = le;
        this.lt = lt;
        this.ge = ge;
        this.gt = gt;
    }

}