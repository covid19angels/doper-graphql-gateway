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

public interface Mutation {
// KK
    @lombok.NonNull
    CartPayloadGQO cartAddItem(AddToCartInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    CartPayloadGQO cartSetItems(SetCartItemsInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    CartPayloadGQO cartUpdateItem(UpdateCartItemInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    CartPayloadGQO cartIncrementItemQuantity(UpdateItemQuantityInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    CartPayloadGQO cartDecrementItemQuantity(UpdateItemQuantityInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    CartPayloadGQO cartRemoveItem(RemoveCartItemInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    CartPayloadGQO cartEmpty(EmptyCartInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutCreate(CheckoutCreateInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutCreatePlusPoder(CheckoutCreatePlusPoderInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutDiscountCodeApply(String discountCode, String checkoutId, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutDiscountCodeRemove(String checkoutId, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutShippingAddressUpdate(PostalAddressInputGQO shippingAddress, String checkoutId, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutEmailUpdate(String checkoutId, String email, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutPhoneUpdate(String checkoutId, String email, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutAttributesUpdate(String checkoutId, CheckoutAttributesUpdateInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutCustomerAssociate(String checkoutId, String customerAccessToken, DataFetchingEnvironment env) throws Exception;
    CheckoutPayloadGQO checkoutCustomerDisassociate(String checkoutId, DataFetchingEnvironment env) throws Exception;
    CheckoutCompletePayloadGQO checkoutCompleteRequest(CheckoutCompleteRequestInputGQO input, DataFetchingEnvironment env) throws Exception;
    CheckoutCompletePayloadGQO checkoutCompleteApprove(CheckoutCompleteApproveInputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithCreditCard(CreditCardPaymentInputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep1(WeixinPaymentStep1InputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithWeixinPaymentStep2(WeixinPaymentStep2InputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep1(AlipayPaymentStep1InputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithAlipayPaymentStep2(AlipayPaymentStep2InputGQO input, DataFetchingEnvironment env) throws Exception;
    PaymentCompletePayloadGQO paymentCompleteCheckoutWithTokenizedPayment(TokenizedPaymentInputGQO input, DataFetchingEnvironment env) throws Exception;
}