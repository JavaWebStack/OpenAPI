package org.javawebstack.openapi.parser;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OpenAPIResponse {

    String description;
    OpenAPIContent content = new OpenAPIContent();

}
