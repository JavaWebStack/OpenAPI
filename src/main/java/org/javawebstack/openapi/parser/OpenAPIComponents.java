package org.javawebstack.openapi.parser;

import com.google.gson.annotations.JsonAdapter;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.openapi.parser.util.ResponseMapAdapter;
import org.javawebstack.openapi.parser.util.SchemaMapAdapter;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class OpenAPIComponents {

    @JsonAdapter(SchemaMapAdapter.class)
    Map<String, OpenAPISchema> schemas = new HashMap<>();
    @JsonAdapter(ResponseMapAdapter.class)
    Map<String, OpenAPIResponse> responses = new HashMap<>();

}
