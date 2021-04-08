package org.javawebstack.openapi.parser.util;

import org.javawebstack.abstractdata.util.GsonListDeserializer;

public class StringListAdapter extends GsonListDeserializer<String> {
    protected Class<String> getType() {
        return String.class;
    }
}
