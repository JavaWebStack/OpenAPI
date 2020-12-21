package org.javawebstack.openapi.parser.util;

import org.javawebstack.graph.util.GsonListDeserializer;
import org.javawebstack.openapi.parser.OpenAPIServer;

public class ServerListAdapter extends GsonListDeserializer<OpenAPIServer> {
    protected Class<OpenAPIServer> getType() {
        return OpenAPIServer.class;
    }
}
