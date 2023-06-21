package com.virgingamesapi.steps;

import com.virgingamesapi.constants.EndPoints;
import com.virgingamesapi.constants.Path;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class VirginGamesApiSteps {

    @Step("Getting All Data for Query parameter Currency = GPB")
    public Response getALlDataForGBP() {
        return SerenityRest.given().log().all()
                .headers("Content-Type", "application/json")
                .queryParams("currency", "GBP")
                .when()
                .get(Path.resource + EndPoints.BINGO);
    }

    @Step("Getting All Data for Query parameter Currency = EUR")
    public Response getALlDataForEUR() {
        return SerenityRest.given().log().all()
                .headers("Content-Type", "application/json")
                .queryParams("currency", "EUR")
                .when()
                .get(Path.resource + EndPoints.BINGO);
    }

    @Step("Getting All Data for Query parameter Currency = SEK")
    public Response getALlDataForSEK() {
        return SerenityRest.given().log().all()
                .headers("Content-Type", "application/json")
                .queryParams("currency", "SEK")
                .when()
                .get(Path.resource + EndPoints.BINGO);
    }
}
