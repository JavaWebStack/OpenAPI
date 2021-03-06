package org.javawebstack.openapi.parser.util;

import org.javawebstack.abstractdata.util.GsonListDeserializer;
import org.javawebstack.openapi.parser.OpenAPITag;

public class TagListAdapter extends GsonListDeserializer<OpenAPITag> {
    protected Class<OpenAPITag> getType() {
        return OpenAPITag.class;
    }
}
