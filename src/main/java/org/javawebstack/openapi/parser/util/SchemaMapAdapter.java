package org.javawebstack.openapi.parser.util;

import org.javawebstack.abstractdata.util.GsonMapDeserializer;
import org.javawebstack.openapi.parser.OpenAPISchema;

public class SchemaMapAdapter extends GsonMapDeserializer<OpenAPISchema> {
    protected Class<OpenAPISchema> getType() {
        return OpenAPISchema.class;
    }
}
