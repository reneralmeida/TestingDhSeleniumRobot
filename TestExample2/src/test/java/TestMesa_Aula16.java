import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestMesa_Aula16 {

    @Test
    public void givenRequestWithNoAcceptHeader_whenRequestIsExecuted_thenDefaultResponseContentTypeisJson() throws ClientProtocolException, IOException {

        //Given
        String URL = "https://api.openweathermap.org/data/2.5/weather?q=Curitiba&appid=f548280284dd2a302a401bb70d0f272a&units=metric";

        //When
        Response response = RestAssured.get(URL);

        //Then
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        assertEquals(200, statusCode);
        assertTrue(statusLine.contains("HTTP/1.1 200 OK"));
    }

}
