package org.javawebstack.openapi.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.util.GsonEnumAdapter;
import org.javawebstack.openapi.parser.util.SchemaMapAdapter;
import org.javawebstack.openapi.parser.util.StringListAdapter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class OpenAPISchema {

    @JsonAdapter(GsonEnumAdapter.class)
    OpenAPIDataType type;
    @JsonAdapter(SchemaMapAdapter.class)
    Map<String, OpenAPISchema> properties;
    OpenAPISchema items;
    @JsonAdapter(StringListAdapter.class)
    List<String> required;
    @SerializedName("$ref")
    String reference;
    OpenAPIFormat format;
    Number minimum;
    Number maximum;
    Boolean exclusiveMinimum;
    Boolean exclusiveMaximum;
    Integer minItems;
    Integer maxItems;
    String pattern;
    @SerializedName("default")
    JsonElement defaultValue;
    @SerializedName("enum")
    JsonArray enumValues;
    Boolean nullable;

}
