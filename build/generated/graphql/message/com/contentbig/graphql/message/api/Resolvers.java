package com.contentbig.graphql.message.api;

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
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public class Resolvers{
    public interface DataCatalog {
    // KK
    }
    public interface Conversation {
    // KK
    }
    public interface Message {
    // KK
    }
    public interface Review {
    // KK
    }
    public interface AggregateReview {
    // KK
    }
    public interface AddConversationPayload {
    // KK
        public Connection<ConversationGQO> conversationSearch(AddConversationPayloadGQO parent,ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface ConversationAddError {
    // KK
    }
    public interface ConversationPayload {
    // KK
    }
    public interface ConversationError {
    // KK
    }
    public interface MessagePayload {
    // KK
    }
    public interface MessageError {
    // KK
    }
    public interface MessageSendAction {
    // KK
    }
    public interface MessageReviewAction {
    // KK
    }
    public interface ConversationAddAction {
    // KK
    }
    public interface ConversationJoinRequestAction {
    // KK
    }
    public interface ConversationJoinApproveAction {
    // KK
    }
    public interface ConversationInvitationRequestAction {
    // KK
    }
    public interface ConversationInvitationAcceptAction {
    // KK
    }
    public interface ConversationMemberRemoveAction {
    // KK
    }
    public interface ConversationWebhookCreateAction {
    // KK
    }
    public interface UpdateConversationPayload {
    // KK
        public Connection<ConversationGQO> conversationSearch(UpdateConversationPayloadGQO parent,ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface ConversationUpdateError {
    // KK
    }
    public interface DeleteConversationPayload {
    // KK
        public Connection<ConversationGQO> conversationSearch(DeleteConversationPayloadGQO parent,ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface ConversationWebhookCreatePayload {
    // KK
    }
    public interface ConversationMemberAddPayload {
    // KK
    }
    public interface ConversationMemberRemovePayload {
    // KK
    }
    public interface ConversationInvitationAcceptPayload {
    // KK
    }
    public interface ConversationInvitationRequestPayload {
    // KK
    }
    public interface ConversationJoinApprovePayload {
    // KK
    }
    public interface ConversationJoinRequestPayload {
    // KK
    }
}