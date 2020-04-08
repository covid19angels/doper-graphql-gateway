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
public class MessagePayloadGQO {


    private MessageGQO message;

    private ActionGQO action;
    @lombok.NonNull
    private Collection<MessageErrorGQO> messageErrors;

    public MessagePayloadGQO() {
    }

    public MessagePayloadGQO( MessageGQO message,  ActionGQO action,  Collection<MessageErrorGQO> messageErrors) {
        this.message = message;
        this.action = action;
        this.messageErrors = messageErrors;
    }

}