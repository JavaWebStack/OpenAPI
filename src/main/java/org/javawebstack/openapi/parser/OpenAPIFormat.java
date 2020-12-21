package org.javawebstack.openapi.parser;

import org.javawebstack.graph.util.GsonEnum;

import java.util.Locale;

public enum OpenAPIFormat implements GsonEnum {

    DATE,
    DATE_TIME,
    PASSWORD,
    BYTE,
    BINARY,
    EMAIL,
    UUID,
    URI,
    HOSTNAME,
    IPV4,
    IPV6,
    INT32,
    INT64,
    FLOAT,
    DOUBLE;

    public String gsonValue() {
        return name().toLowerCase(Locale.ROOT).replace("_", "-");
    }
}
