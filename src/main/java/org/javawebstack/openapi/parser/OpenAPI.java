package org.javawebstack.openapi.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.JsonAdapter;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.graph.GraphElement;
import org.javawebstack.graph.GraphMapper;
import org.javawebstack.graph.GraphObject;
import org.javawebstack.graph.NamingPolicy;
import org.javawebstack.openapi.parser.util.PathMapAdapter;
import org.javawebstack.openapi.parser.util.ServerListAdapter;
import org.javawebstack.openapi.parser.util.TagListAdapter;

@Getter
@Setter
public class OpenAPI {

    private static final GraphMapper mapper = new GraphMapper().setNamingPolicy(NamingPolicy.CAMEL_CASE);

    String openapi = "3.0.0";
    OpenAPIInfo info;
    @JsonAdapter(ServerListAdapter.class)
    List<OpenAPIServer> servers = new ArrayList<>();
    @JsonAdapter(TagListAdapter.class)
    List<OpenAPITag> tags = new ArrayList<>();
    @JsonAdapter(PathMapAdapter.class)
    Map<String, OpenAPIPath> paths = new HashMap<>();
    OpenAPIComponents components = new OpenAPIComponents();

    public GraphObject toGraph(){
        return mapper.toGraph(this).object();
    }

    public String toJson(){
        return toJson(false);
    }

    public String toJson(boolean pretty){
        return toGraph().toJsonString(pretty);
    }

    public String toYaml(){
        return toYaml(true);
    }

    public String toYaml(boolean pretty){
        return toGraph().toYaml(pretty);
    }

    public static OpenAPI fromGraph(GraphObject object){
        if(object == null)
            return null;
        return mapper.fromGraph(object, OpenAPI.class);
    }

    public static OpenAPI fromYaml(String yaml){
        return fromGraph(GraphElement.fromYaml(yaml, true).object());
    }

    public static OpenAPI fromJson(String json){
        return fromGraph(GraphElement.fromJson(json).object());
    }

}