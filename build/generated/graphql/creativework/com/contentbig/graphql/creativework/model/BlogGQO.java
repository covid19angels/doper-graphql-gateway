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
public class BlogGQO implements CreativeWorkGQO, NodeGQO{


    private java.lang.String issn;

    private Collection<BlogPostingGQO> blogPost;

    private ThingGQO about;

    private PersonGQO editor;

    private java.lang.String headline;

    private java.lang.String alternativeHeadline;

    private CreativeWorkGQO isPartOf;

    private Collection<CreativeWorkGQO> hasPart;
    @lombok.NonNull
    private String id;

    public BlogGQO() {
    }

    public BlogGQO( java.lang.String issn,  Collection<BlogPostingGQO> blogPost,  ThingGQO about,  PersonGQO editor,  java.lang.String headline,  java.lang.String alternativeHeadline,  CreativeWorkGQO isPartOf,  Collection<CreativeWorkGQO> hasPart,  String id) {
        this.issn = issn;
        this.blogPost = blogPost;
        this.about = about;
        this.editor = editor;
        this.headline = headline;
        this.alternativeHeadline = alternativeHeadline;
        this.isPartOf = isPartOf;
        this.hasPart = hasPart;
        this.id = id;
    }

}