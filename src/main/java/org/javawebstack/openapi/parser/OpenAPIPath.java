package org.javawebstack.openapi.parser;

import com.google.gson.annotations.JsonAdapter;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.openapi.parser.util.ParameterListAdapter;

import java.util.List;

@Getter
@Setter
public class OpenAPIPath {

    String summary;
    String description;
    @JsonAdapter(ParameterListAdapter.class)
    List<OpenAPIParameter> parameters;
    OpenAPIOperation get;
    OpenAPIOperation post;
    OpenAPIOperation put;
    OpenAPIOperation patch;
    OpenAPIOperation delete;
    OpenAPIOperation head;

}
