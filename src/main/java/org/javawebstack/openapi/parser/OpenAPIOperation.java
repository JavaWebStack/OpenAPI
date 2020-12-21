package org.javawebstack.openapi.parser;

import com.google.gson.annotations.JsonAdapter;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.openapi.parser.util.ParameterListAdapter;
import org.javawebstack.openapi.parser.util.ResponseMapAdapter;
import org.javawebstack.openapi.parser.util.StringListAdapter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class OpenAPIOperation {

    String operationId;
    @JsonAdapter(StringListAdapter.class)
    List<String> tags;
    String summary;
    String description;
    @JsonAdapter(ParameterListAdapter.class)
    List<OpenAPIParameter> parameters;
    @JsonAdapter(ResponseMapAdapter.class)
    Map<String, OpenAPIResponse> responses;
    OpenAPIRequestBody requestBody;
    OpenAPIExternalDocs externalDocs;

}
