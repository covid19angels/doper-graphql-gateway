package com.contentbig.graphql.message.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.softwareapplication.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.message.api.*;
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
public class ConversationOrderGQO {


    private ConversationOrderableGQO asc;

    private ConversationOrderableGQO desc;

    private ConversationOrderGQO then;

    public ConversationOrderGQO() {
    }

    public ConversationOrderGQO( ConversationOrderableGQO asc,  ConversationOrderableGQO desc,  ConversationOrderGQO then) {
        this.asc = asc;
        this.desc = desc;
        this.then = then;
    }

}