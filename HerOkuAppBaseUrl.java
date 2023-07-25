package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static utils.AuthenticationHerOkuApp.generateToken;

public class HerOkuAppBaseUrl {
    //This class is created for preventing repetitions such as base url, content type, header, authorization etc...
    protected RequestSpecification spec;

    @Before //@Before annotation will run this method before each @Test methods. So, spec object will not be Null.
    public void setUp(){
        spec = new RequestSpecBuilder().addHeader("Cookie","token="+generateToken()).setContentType(ContentType.JSON).setBaseUri("https://restful-booker.herokuapp.com").build();
    }
}
