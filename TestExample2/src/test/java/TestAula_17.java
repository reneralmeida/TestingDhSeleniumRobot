import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAula_17 {

    @Test
    public void givenThatIPerformAGetRequest_whenIGetTheResponseStatuCode_thenTheResponseStatusCodeIs200() {

        //Given
        Response response = RestAssured.get("https://restool-sample-app.herokuapp.com/api/character");

        //When
        int statusCode = response.getStatusCode();
        System.out.println(response.getStatusCode());

        //Then
        assertEquals(200, statusCode);

    }
}
