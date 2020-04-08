package com.contentbig.graphql.shoppingcart.api;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public class Resolvers{
    public interface PostalAddress {
    // KK
    }
    public interface Cart {
    // KK
    }
    public interface CartItem {
    // KK
    }
    public interface Currency {
    // KK
    }
    public interface CartPayload {
    // KK
    }
    public interface CartError {
    // KK
    }
    public interface AppliedGiftCard {
    // KK
    }
    public interface AvailableShippingRates {
    // KK
    }
    public interface Checkout {
    // KK
        public Connection<DiscountApplicationGQO> discountApplications(CheckoutGQO parent,Integer first, String after, Integer last, String before, Boolean reverse, DataFetchingEnvironment env);
        public Connection<CheckoutItemGQO> lineItems(CheckoutGQO parent,Integer first, String after, Integer last, String before, Boolean reverse, DataFetchingEnvironment env);
    }
    public interface CheckoutItem {
    // KK
    }
    public interface DiscountAllocation {
    // KK
    }
    public interface DiscountApplication {
    // KK
    }
    public interface CheckoutPayload {
    // KK
    }
    public interface CheckoutCompletePayload {
    // KK
    }
    public interface PaymentCompletePayload {
    // KK
    }
    public interface CheckoutError {
    // KK
    }
    public interface PaymentError {
    // KK
    }
    public interface Money {
    // KK
    }
    public interface Poder {
    // KK
    }
    public interface PoderItem {
    // KK
    }
    public interface ShippingRate {
    // KK
    }
}