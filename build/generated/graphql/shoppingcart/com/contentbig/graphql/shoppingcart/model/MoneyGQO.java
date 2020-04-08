package com.contentbig.graphql.shoppingcart.model;

import com.contentbig.graphql.shoppingcart.api.*;
import com.contentbig.graphql.shoppingcart.model.*;
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

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class MoneyGQO {

    @lombok.NonNull
    private java.math.BigDecimal amount;
    @lombok.NonNull
    private CurrencyCodeGQO currencyCode;
    @lombok.NonNull
    private String formatted;

    public MoneyGQO() {
    }

    public MoneyGQO( java.math.BigDecimal amount,  CurrencyCodeGQO currencyCode,  String formatted) {
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.formatted = formatted;
    }

}