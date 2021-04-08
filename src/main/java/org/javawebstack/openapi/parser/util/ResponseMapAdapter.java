package org.javawebstack.openapi.parser.util;

import org.javawebstack.abstractdata.util.GsonMapDeserializer;
import org.javawebstack.openapi.parser.OpenAPIResponse;

public class ResponseMapAdapter extends GsonMapDeserializer<OpenAPIResponse> {
    protected Class<OpenAPIResponse> getType() {
        return OpenAPIResponse.class;
    }
}
