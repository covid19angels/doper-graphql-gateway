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
public class DateTimeFilterGQO {


    private java.util.Date eq;

    private java.util.Date le;

    private java.util.Date lt;

    private java.util.Date ge;

    private java.util.Date gt;

    public DateTimeFilterGQO() {
    }

    public DateTimeFilterGQO( java.util.Date eq,  java.util.Date le,  java.util.Date lt,  java.util.Date ge,  java.util.Date gt) {
        this.eq = eq;
        this.le = le;
        this.lt = lt;
        this.ge = ge;
        this.gt = gt;
    }

}