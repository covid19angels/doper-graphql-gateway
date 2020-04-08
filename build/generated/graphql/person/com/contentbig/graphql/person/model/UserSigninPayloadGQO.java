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
public class UserSigninPayloadGQO {


    private String token;

    private UserGQO user;
    @lombok.NonNull
    private Collection<UserSigninErrorGQO> signinErrors;

    public UserSigninPayloadGQO() {
    }

    public UserSigninPayloadGQO( String token,  UserGQO user,  Collection<UserSigninErrorGQO> signinErrors) {
        this.token = token;
        this.user = user;
        this.signinErrors = signinErrors;
    }

}