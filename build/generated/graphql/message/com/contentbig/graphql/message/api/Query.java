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

public interface Query {
// KK
    public Connection<ConversationGQO> allConversations(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    public Connection<ConversationGQO> conversationSearch(ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    ConversationGQO conversation(String id, String csID, DataFetchingEnvironment env) throws Exception;
    MessageGQO message(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    MessageSendActionGQO messageSendAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    MessageReviewActionGQO messageReviewAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationAddActionGQO conversationAddAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationJoinRequestActionGQO conversationJoinRequestAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationJoinApproveActionGQO conversationJoinApproveAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationInvitationRequestActionGQO conversationInvitationRequestAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationInvitationAcceptActionGQO conversationInvitationAcceptAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationMemberRemoveActionGQO conversationMemberRemoveAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationWebhookCreateActionGQO conversationWebhookCreateAction(String id, String msgID, DataFetchingEnvironment env) throws Exception;
    ConversationErrorGQO conversationError(String id, String msgID, DataFetchingEnvironment env) throws Exception;
}