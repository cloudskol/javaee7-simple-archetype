package ${groupId};

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures the REST endpoint for our Helloworld application
 *
 * @author tham
 */
@ApplicationPath("api/v1")
public class HelloworldApplication extends Application {
}
