package graphql;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.internal.http.HTTPBuilder;
import org.testng.annotations.Test;
import pojo.GraphQLQuery;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CountriesTest {

    @Test
    public void getCompanyDataCheckCEOShouldBeElonMusk() {
        GraphQLQuery query = GraphQLQuery.builder().query("{\n" +
                "  country(code: \"EG\") {\n" +
                "    name\n" +
                "    native\n" +
                "    capital\n" +
                "    emoji\n" +
                "    currency\n" +
                "    languages {\n" +
                "      code\n" +
                "      name\n" +
                "    }\n" +
                "  }\n" +
                "}").build();

        given().
                pathParam("x","graphql").
                auth().none().
                contentType(ContentType.JSON).
                body(query).
                log().body().
        when().
                post("https://countries.trevorblades.com/{x}").
        then().
                log().body().
                assertThat().
                statusCode(200).
        and().
                body("data.country.name", equalTo("Egypt"));
    }
}
