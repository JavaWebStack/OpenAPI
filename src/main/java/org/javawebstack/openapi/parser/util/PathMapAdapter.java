package org.javawebstack.openapi.parser.util;

import org.javawebstack.abstractdata.util.GsonMapDeserializer;
import org.javawebstack.openapi.parser.OpenAPIPath;

public class PathMapAdapter extends GsonMapDeserializer<OpenAPIPath> {
    protected Class<OpenAPIPath> getType() {
        return OpenAPIPath.class;
    }
}
