package org.javawebstack.openapi.parser;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OpenAPIResponse {

    String description;
    @SerializedName("$ref")
    String reference;
    OpenAPIContent content = new OpenAPIContent();

}
