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

public interface Mutation {
// KK
    AddConversationPayloadGQO conversationAdd(AddConversationInputGQO input, DataFetchingEnvironment env) throws Exception;
    UpdateConversationPayloadGQO conversationUpdate(String conversationId, UpdateConversationInputGQO input, DataFetchingEnvironment env) throws Exception;
    DeleteConversationPayloadGQO conversationDelete(String conversationId, ConversationFilterGQO filter, DataFetchingEnvironment env) throws Exception;
    ConversationJoinRequestPayloadGQO conversationJoinRequest(String conversationId, ConversationJoinRequestInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationJoinApprovePayloadGQO conversationJoinApprove(String conversationId, ConversationJoinApproveInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationInvitationRequestPayloadGQO conversationInvitationRequest(String conversationId, ConversationInvitationRequestInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationInvitationAcceptPayloadGQO conversationInvitationAccept(ConversationInvitationAcceptInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationMemberAddPayloadGQO conversationMemberAdd(String conversationId, ConversationMemberAddInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationMemberRemovePayloadGQO conversationMemberRemove(String conversationId, ConversationMemberRemoveInputGQO input, DataFetchingEnvironment env) throws Exception;
    ConversationWebhookCreatePayloadGQO conversationWebhookCreate(String conversationId, ConversationWebhookCreateInputGQO input, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageSend(String conversationId, MessageSendInputGQO input, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageWithdraw(String messageId, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageReviewAdd(String messageId, MessageReviewInputGQO input, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageReviewUpdate(String reviewId, MessageReviewInputGQO input, DataFetchingEnvironment env) throws Exception;
    MessagePayloadGQO messageReviewDelete(String reviewId, DataFetchingEnvironment env) throws Exception;
}