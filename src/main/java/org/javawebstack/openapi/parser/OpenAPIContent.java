package org.javawebstack.openapi.parser;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OpenAPIContent {

    @SerializedName("application/json")
    OpenAPIContentType json;
    @SerializedName("application/x-www-form-urlencoded")
    OpenAPIContentType form;
    @SerializedName("application/xml")
    OpenAPIContentType xml;

}
