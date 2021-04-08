package org.javawebstack.openapi.parser;

import org.javawebstack.abstractdata.util.GsonEnum;

import java.util.Locale;

public enum OpenAPIDataType implements GsonEnum {

    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    ARRAY,
    OBJECT;

    public String gsonValue() {
        return name().toLowerCase(Locale.ROOT);
    }

}
