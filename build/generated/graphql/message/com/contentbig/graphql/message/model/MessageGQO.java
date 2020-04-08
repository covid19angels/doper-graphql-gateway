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
public class MessageGQO implements NodeGQO{


    private ConversationGQO isMessageOf;
    @lombok.NonNull
    private PersonGQO sender;

    private java.util.Date dateSent;

    private PersonGQO toRecipient;

    private java.util.Date dateRead;

    private java.util.Date dateReceived;

    private Collection<PersonGQO> recipient;
    @lombok.NonNull
    private String text;

    private AggregateReviewGQO aggregateReview;

    private Collection<ActionGQO> potentialActions;
    @lombok.NonNull
    private String id;

    public MessageGQO() {
    }

    public MessageGQO( ConversationGQO isMessageOf,  PersonGQO sender,  java.util.Date dateSent,  PersonGQO toRecipient,  java.util.Date dateRead,  java.util.Date dateReceived,  Collection<PersonGQO> recipient,  String text,  AggregateReviewGQO aggregateReview,  Collection<ActionGQO> potentialActions,  String id) {
        this.isMessageOf = isMessageOf;
        this.sender = sender;
        this.dateSent = dateSent;
        this.toRecipient = toRecipient;
        this.dateRead = dateRead;
        this.dateReceived = dateReceived;
        this.recipient = recipient;
        this.text = text;
        this.aggregateReview = aggregateReview;
        this.potentialActions = potentialActions;
        this.id = id;
    }

}