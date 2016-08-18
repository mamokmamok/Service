package improject.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by mamok on 8/18/2016.
 */
@Path("/app")
public class Service {
    @GET
    @Produces("text/plain")
    public String getMessage() {
        return "Please just work";
    }
}
