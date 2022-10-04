import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAula_17_2 {

    @Test
    public void givenThatIPerformAGetRequest_whenIGetTheResponseTime_thenTheResponseTimeIsBelow900() {

        //Given
        Response response = RestAssured.get("https://restool-sample-app.herokuapp.com/api/character");

        //When
        long responseTime = response.getTime();
        System.out.println(response.getTime());

        //Then
        assertTrue(responseTime < 900);
    }

}
