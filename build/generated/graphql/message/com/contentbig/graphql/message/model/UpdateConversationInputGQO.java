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
public class UpdateConversationInputGQO {

    @lombok.NonNull
    private ConversationFilterGQO filter;

    private ConversationPatchGQO set;

    private ConversationPatchGQO remove;

    public UpdateConversationInputGQO() {
    }

    public UpdateConversationInputGQO( ConversationFilterGQO filter,  ConversationPatchGQO set,  ConversationPatchGQO remove) {
        this.filter = filter;
        this.set = set;
        this.remove = remove;
    }

}