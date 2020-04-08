package com.contentbig.graphql.person.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.person.api.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
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
public class UserRegisterPayloadGQO {


    private UserSigninPayloadGQO signinPayload;
    @lombok.NonNull
    private Collection<UserRegisterErrorGQO> registerErrors;

    public UserRegisterPayloadGQO() {
    }

    public UserRegisterPayloadGQO( UserSigninPayloadGQO signinPayload,  Collection<UserRegisterErrorGQO> registerErrors) {
        this.signinPayload = signinPayload;
        this.registerErrors = registerErrors;
    }

}