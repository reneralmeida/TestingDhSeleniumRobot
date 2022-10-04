import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteAula16 {

    @Test
    public void test_01() {

        Response response = RestAssured.get("https://reqres.in/api/users");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.statusLine());

        int statusCode = response.getStatusCode();
        assertEquals(statusCode, 200);
    }
}
