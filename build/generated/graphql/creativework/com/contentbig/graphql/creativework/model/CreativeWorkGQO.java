package com.contentbig.graphql.creativework.model;

import com.contentbig.graphql.shoppingcart.model.*;
import com.contentbig.graphql.creativework.api.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;

public interface CreativeWorkGQO {

    ThingGQO getAbout();
    PersonGQO getEditor();
    java.lang.String getHeadline();
    java.lang.String getAlternativeHeadline();
    CreativeWorkGQO getIsPartOf();
    Collection<CreativeWorkGQO> getHasPart();
}