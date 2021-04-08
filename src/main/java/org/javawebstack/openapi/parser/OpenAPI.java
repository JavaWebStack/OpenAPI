package org.javawebstack.openapi.parser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.JsonAdapter;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractElement;
import org.javawebstack.abstractdata.AbstractMapper;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.NamingPolicy;
import org.javawebstack.openapi.parser.util.PathMapAdapter;
import org.javawebstack.openapi.parser.util.ServerListAdapter;
import org.javawebstack.openapi.parser.util.TagListAdapter;

@Getter
@Setter
public class OpenAPI {

    private static final AbstractMapper mapper = new AbstractMapper().setNamingPolicy(NamingPolicy.CAMEL_CASE);

    String openapi = "3.0.0";
    OpenAPIInfo info;
    @JsonAdapter(ServerListAdapter.class)
    List<OpenAPIServer> servers = new ArrayList<>();
    @JsonAdapter(TagListAdapter.class)
    List<OpenAPITag> tags = new ArrayList<>();
    @JsonAdapter(PathMapAdapter.class)
    Map<String, OpenAPIPath> paths = new HashMap<>();
    OpenAPIComponents components = new OpenAPIComponents();

    public AbstractObject toGraph(){
        return mapper.toAbstract(this).object();
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

    public static OpenAPI fromGraph(AbstractObject object){
        if(object == null)
            return null;
        return mapper.fromAbstract(object, OpenAPI.class);
    }

    public static OpenAPI fromYaml(String yaml){
        return fromGraph(AbstractElement.fromYaml(yaml, true).object());
    }

    public static OpenAPI fromJson(String json){
        return fromGraph(AbstractElement.fromJson(json).object());
    }

    public static OpenAPI fromFile(File file){
        if(!file.exists())
            return null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int r;
            while ((r = fis.read(buffer)) != -1)
                baos.write(buffer, 0, r);
            fis.close();
            if(file.getName().endsWith(".json"))
                return OpenAPI.fromJson(new String(baos.toByteArray(), StandardCharsets.UTF_8));
            return OpenAPI.fromYaml(new String(baos.toByteArray(), StandardCharsets.UTF_8));
        } catch (IOException e) {
            return null;
        }
    }

}
