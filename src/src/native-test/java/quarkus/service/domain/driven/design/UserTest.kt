package quarkus.service.domain.driven.design

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.core.IsEqual.equalTo
import org.junit.jupiter.api.Test

@QuarkusTest
class UserTest {
    @Test
    fun testHelloEndpoint() {
        given()
                .`when`().get("/users")
                .then()
                .statusCode(200)
                .body("message", equalTo("hello"))
    }
}