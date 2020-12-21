package org.javawebstack.openapi.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OpenAPIParameter {

    String name;
    String description;
    Location in;
    OpenAPISchema schema;
    Boolean required;
    Boolean allowEmptyValue;
    JsonElement example;
    JsonArray examples;
    Boolean deprecated;

    public enum Location {
        PATH,
        QUERY,
        HEADER,
        COOKIE
    }

}
