package com.virgingamesapi.teststeps;

import com.virgingamesapi.steps.VirginGamesApiSteps;
import com.virgingamesapi.testbase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@Concurrent(threads = "4x")
@RunWith(SerenityRunner.class)
public class CurrencyIsGBP extends TestBase {
    public static ValidatableResponse validatableResponse;
    public static Response response;
    @Steps
    VirginGamesApiSteps virginGamesApiSteps;

    @Title("Get All data for Quarry Parameter Currency =  GBP")
    @Test
    public void test01() {
        response = virginGamesApiSteps.getALlDataForGBP();
        validatableResponse = response.then().log().all().statusCode(200);

        Assert.assertEquals("Bingo", validatableResponse.extract().path("data.jackpotId"));
        Assert.assertEquals("GBP", validatableResponse.extract().path("data.pots[0].currency"));
    }

}
