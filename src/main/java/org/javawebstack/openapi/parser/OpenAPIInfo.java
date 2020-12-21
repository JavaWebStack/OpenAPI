package org.javawebstack.openapi.parser;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpenAPIInfo {

    String title;
    String version;
    OpenAPIContact contact;
    String description;

}
