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
public class CurrencyGQO {


    private CurrencyCodeGQO code;

    private String symbol;

    private String thousandsSeparator;

    private String decimalSeparator;

    private Integer decimalDigits;

    public CurrencyGQO() {
    }

    public CurrencyGQO( CurrencyCodeGQO code,  String symbol,  String thousandsSeparator,  String decimalSeparator,  Integer decimalDigits) {
        this.code = code;
        this.symbol = symbol;
        this.thousandsSeparator = thousandsSeparator;
        this.decimalSeparator = decimalSeparator;
        this.decimalDigits = decimalDigits;
    }

}