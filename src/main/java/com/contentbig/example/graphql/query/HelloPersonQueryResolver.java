package com.contentbig.example.graphql.query;

import com.contentbig.example.graphql.model.HelloPerson;
import com.contentbig.example.graphql.service.HelloPersonService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class HelloPersonQueryResolver implements GraphQLQueryResolver {

    private final HelloPersonService personService;

    public HelloPersonQueryResolver(final HelloPersonService personService) {
        this.personService = personService;
    }

    public Collection<HelloPerson> people() {
        return personService.getPeople();
    }
}