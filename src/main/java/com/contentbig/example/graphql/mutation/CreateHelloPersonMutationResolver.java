package com.contentbig.example.graphql.mutation;

import com.contentbig.example.graphql.model.HelloPerson;
import graphql.kickstart.tools.GraphQLMutationResolver;
import com.contentbig.example.graphql.service.HelloPersonService;
import org.springframework.stereotype.Service;

@Service
public class CreateHelloPersonMutationResolver implements GraphQLMutationResolver {

    private final HelloPersonService personService;

    public CreateHelloPersonMutationResolver(final HelloPersonService personService) {
        this.personService = personService;
    }

    public HelloPerson createHelloPerson(final String firstName, final String lastName) {
        return personService.createPerson(firstName, lastName);
    }
}