package org.javawebstack.openapi.parser.util;

import org.javawebstack.graph.util.GsonListDeserializer;
import org.javawebstack.openapi.parser.OpenAPIParameter;

public class ParameterListAdapter extends GsonListDeserializer<OpenAPIParameter> {
    protected Class<OpenAPIParameter> getType() {
        return OpenAPIParameter.class;
    }
}
