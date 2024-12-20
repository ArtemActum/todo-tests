package com.todo.requests;

import io.restassured.specification.RequestSpecification;

public class TodoRequester {
    private TodoRequest request;
    private ValidatedTodoRequest validatedTodoRequest;

    public TodoRequest getRequest() {
        return request;
    }

    public ValidatedTodoRequest getValidatedTodoRequest() {
        return validatedTodoRequest;
    }

    public TodoRequester(RequestSpecification requestSpecification){
        this.request = new TodoRequest(requestSpecification);
        this.validatedTodoRequest = new ValidatedTodoRequest(requestSpecification);
    }
}
