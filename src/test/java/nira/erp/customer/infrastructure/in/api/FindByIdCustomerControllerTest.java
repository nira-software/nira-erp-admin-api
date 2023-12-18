package nira.erp.customer.infrastructure.in.api;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import nira.erp.customer.application.command.CustomerCreateCommand;
import org.junit.jupiter.api.*;

import java.util.UUID;

import static io.restassured.RestAssured.given;


@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FindByIdCustomerControllerTest {

    CustomerCreateCommand command;

    @BeforeEach
    void setUp() {
        UUID customerId = UUID.randomUUID();
        command = new CustomerCreateCommand();
        command.setCustomerId(customerId.toString());
        command.setName("Cliente Test");
        command.setEmail("test@domain.test");
        command.setPhoneNumber("70135454");
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
                .when().post("/api/v1/customer/create")
                .then()
                .statusCode(200);
    }

    @Test
    @Order(2)
    void findId() {
        command.setCompanyId(UUID.randomUUID().toString());
        given()
                .contentType(ContentType.JSON)
                .when().get("/api/v1/customer/7be5d4c5-a0e7-47d7-be12-24580ab6456f")
                .then()
                .statusCode(200);
    }

    @Test
    @Order(3)
    void findIdNotFound() {
        given()
                .contentType(ContentType.JSON)
                .when().get("/api/v1/customer/7be5d4c5-a0e7-47d7-be12-24580ab6456a")
                .then()
                .statusCode(404);
    }
}