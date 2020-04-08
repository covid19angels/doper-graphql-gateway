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

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class BlogPostingGQO implements CreativeWorkGQO, ArticleGQO, NodeGQO{


    private ThingGQO about;

    private PersonGQO editor;

    private java.lang.String headline;

    private java.lang.String alternativeHeadline;

    private CreativeWorkGQO isPartOf;

    private Collection<CreativeWorkGQO> hasPart;

    private java.lang.String articleBody;

    private java.lang.String articleSection;

    private Integer pageEnd;

    private Integer pageStart;

    private java.lang.String pagination;

    private Integer wordCount;
    @lombok.NonNull
    private String id;

    public BlogPostingGQO() {
    }

    public BlogPostingGQO( ThingGQO about,  PersonGQO editor,  java.lang.String headline,  java.lang.String alternativeHeadline,  CreativeWorkGQO isPartOf,  Collection<CreativeWorkGQO> hasPart,  java.lang.String articleBody,  java.lang.String articleSection,  Integer pageEnd,  Integer pageStart,  java.lang.String pagination,  Integer wordCount,  String id) {
        this.about = about;
        this.editor = editor;
        this.headline = headline;
        this.alternativeHeadline = alternativeHeadline;
        this.isPartOf = isPartOf;
        this.hasPart = hasPart;
        this.articleBody = articleBody;
        this.articleSection = articleSection;
        this.pageEnd = pageEnd;
        this.pageStart = pageStart;
        this.pagination = pagination;
        this.wordCount = wordCount;
        this.id = id;
    }

}