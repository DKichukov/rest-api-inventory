package com.edu.restapiproduct.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.CONFLICT)
public class ResourceAlreadyExistsException extends RuntimeException {

    @JsonProperty("message")
    private String message;

    public ResourceAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
