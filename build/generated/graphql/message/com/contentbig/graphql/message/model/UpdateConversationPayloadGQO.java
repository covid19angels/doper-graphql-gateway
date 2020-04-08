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
public class UpdateConversationPayloadGQO {


    private ConversationGQO item;
    @lombok.NonNull
    private Collection<ConversationUpdateErrorGQO> errors;

    public UpdateConversationPayloadGQO() {
    }

    public UpdateConversationPayloadGQO( ConversationGQO item,  Collection<ConversationUpdateErrorGQO> errors) {
        this.item = item;
        this.errors = errors;
    }

}