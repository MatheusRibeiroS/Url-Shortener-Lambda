package com.createUrlShortner;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class Main implements RequestHandler<Map<String, Object>, Map<String, String>> {
    public String handleRequest() {
        return "Hello World";
    }

    @Override
    public Map<String, String> handleRequest(Map<String, Object> stringObjectMap, Context context) {
        return Map.of();
    }
}