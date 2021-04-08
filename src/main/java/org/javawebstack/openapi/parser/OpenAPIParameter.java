package org.javawebstack.openapi.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.util.GsonEnum;
import org.javawebstack.abstractdata.util.GsonEnumAdapter;

import java.util.Locale;

@Getter @Setter
public class OpenAPIParameter {

    String name;
    String description;
    @JsonAdapter(GsonEnumAdapter.class)
    Location in;
    OpenAPISchema schema;
    Boolean required;
    Boolean allowEmptyValue;
    JsonElement example;
    JsonArray examples;
    Boolean deprecated;

    public enum Location implements GsonEnum {
        PATH,
        QUERY,
        HEADER,
        COOKIE;
        public String gsonValue() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

}
