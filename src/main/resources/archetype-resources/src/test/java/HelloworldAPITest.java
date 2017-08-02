package ${groupId};

import org.junit.Ignore;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 * Test class for HelloworldAPI
 *
 * @author tham
 */
public class HelloworldAPITest {
    private static final String PATH = "http://localhost:8080/${artifactId}/api/v1/helloworld";

    @Ignore
    @Test
    public void testPing() {
        Client client = ClientBuilder.newClient();
        Response response = client.target(PATH)
                .request()
                .get();

        System.out.println("Status: " + response.getStatus());
        System.out.println("Status: " + response.readEntity(String.class));
    }
}
