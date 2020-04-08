package com.contentbig.graphql.shoppingdoor.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.shoppingdoor.api.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;

public interface ProductGQO {

    Boolean getIsShoppingable();
    String getName();
    String getAlternateName();
    String getDescription();
    String getProductID();
    Collection<ProductGQO> getIsRelatedTo();
    Collection<ProductGQO> getIsSimilarTo();
    OrganizationGQO getManufacturer();
    Collection<ItemCategoryGQO> getItemCategory();
    Collection<ProductModelGQO> getModels();
    AggregateOfferGQO getOffers();
    Collection<DemandGQO> getDemands();
    AggregateReviewGQO getAggregateReview();
}