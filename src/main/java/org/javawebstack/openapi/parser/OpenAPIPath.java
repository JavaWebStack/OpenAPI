package org.javawebstack.openapi.parser;

import com.google.gson.annotations.JsonAdapter;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.openapi.parser.util.ParameterListAdapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class OpenAPIPath {

    String summary;
    String description;
    @JsonAdapter(ParameterListAdapter.class)
    List<OpenAPIParameter> parameters;
    OpenAPIOperation get;
    OpenAPIOperation post;
    OpenAPIOperation put;
    OpenAPIOperation patch;
    OpenAPIOperation delete;
    OpenAPIOperation head;

    public Map<String, OpenAPIOperation> getMethods(){
        Map<String, OpenAPIOperation> methods = new HashMap<>();
        if(get != null)
            methods.put("get", get);
        if(post != null)
            methods.put("post", post);
        if(put != null)
            methods.put("put", put);
        if(patch != null)
            methods.put("patch", patch);
        if(delete != null)
            methods.put("delete", delete);
        if(head != null)
            methods.put("head", head);
        return methods;
    }

}
