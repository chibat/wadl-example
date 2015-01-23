package server;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

@Path("add")
public class Add {

    @Path("json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Result json(@QueryParam("arg1") int arg1,
            @QueryParam("arg2") int arg2) {
        Result r = new Result();
        r.value = arg1 + arg2;
        return r;
    }

    @Path("xml")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Result xml(@QueryParam("arg1") int arg1, @QueryParam("arg2") int arg2) {
        Result r = new Result();
        r.value = arg1 + arg2;
        return r;
    }

    @XmlRootElement
    public static class Result {
        public Integer value;
    }

    public static void main(String[] args) {
        URI uri = URI.create("http://localhost:8080/");
        ResourceConfig config = new ResourceConfig();
        config.packages(true, "server");
        JdkHttpServerFactory.createHttpServer(uri, config);
    }
}