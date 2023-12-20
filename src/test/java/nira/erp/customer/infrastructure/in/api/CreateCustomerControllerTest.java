package nira.erp.customer.infrastructure.in.api;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import nira.erp.customer.application.command.CustomerCreateCommand;
import org.junit.jupiter.api.*;

import java.util.UUID;

import static io.restassured.RestAssured.given;


@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CreateCustomerControllerTest {

    CustomerCreateCommand command;

    @BeforeEach
    void setUp() {
        UUID customerId = UUID.randomUUID();
        command = new CustomerCreateCommand();
        command.setCustomerId(customerId.toString());
        command.setName("Test CreateCustomerControllerTest");
        command.setEmail("test@domain.test");
        command.setPhoneNumber("70135454");
        command.setAddress("Test Address");
        command.setTradeName("Company Test");
        command.setCompanyId("97b33f1f-9874-43d4-893f-2a7f34e7eb41");
        command.setCountryId("f64f2d7f-f871-4e8b-8cb1-223655d277bf");
    }

    @Test
    @Order(1)
    void create() {
        given()
                .contentType(ContentType.JSON)
                .body(command)
                .when().post("/api/v1/customer")
                .then()
                .statusCode(200);
    }

    @Test
    @Order(2)
    void createWithInvalidCompany() {
        command.setCompanyId(UUID.randomUUID().toString());
        given()
                .contentType(ContentType.JSON)
                .body(command)
                .when().post("/api/v1/customer")
                .then()
                .statusCode(400);
    }

    @Test
    @Order(3)
    void createWithInvalidCountry() {
        command.setCountryId(UUID.randomUUID().toString());
        given()
                .contentType(ContentType.JSON)
                .body(command)
                .when().post("/api/v1/customer")
                .then()
                .statusCode(400);
    }
}