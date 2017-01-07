package com.whichrestaurant.controller.response;

import lombok.Value;

@Value
public class ErrorResponse {
    int code;
    String message;
}
