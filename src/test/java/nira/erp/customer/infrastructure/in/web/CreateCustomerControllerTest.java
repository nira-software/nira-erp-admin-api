package nira.erp.customer.infrastructure.in.web;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import nira.erp.customer.application.port.in.CustomerCreateCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;


@QuarkusTest
class CreateCustomerControllerTest {

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
    void create() {
        given()
                .contentType(ContentType.JSON)
                .body(command)
                .when().post("/api/v1/customer/create")
                .then()
                .statusCode(200);
    }
}