import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAula17_3 {

    @Test
    public void givenThatIPerformADeleteRequest_whenIGetTheResponseBodyContent_thenTheResponseBodyContentIsOk () {

        Response response = RestAssured.delete("https://restool-sample-app.herokuapp.com/api/character/TAb78x70V4ir");

        String responseBody = response.getBody().asString();
        System.out.println(response.getBody());

        assertEquals("ok", responseBody);
    }
}
