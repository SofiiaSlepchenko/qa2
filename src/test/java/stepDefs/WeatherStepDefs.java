package stepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

public class WeatherStepDefs {
    private int cityId;
    private WeatherResponse responce;

    @Given("city id: {int}")
    public void set_city_id(int cityId) {
        this.cityId = cityId;
    }

    @When("we are requesting weather data")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        responce = requester.getWeather(cityId);
    }

    @Then("lon is {double}")
    public void check_lon(double lon) {
        Assertions.assertEquals(lon, responce.getCoord().getLon());
    }

    @Then("lat is {double}")
    public void check_lat(double lat) {
    }

    @Then("weather id is {int}")
    public void check_weather_id(int id) {
    }

    @Then("weather main is {string}")
    public void check_weather_main(String main) {
    }

    @Then("weather description is {string}")
    public void check_weather_description(String description) {
    }

    @Then("icon is {string}")
    public void check_icon(String icon) {
    }

    @Then("base is {string}")
    public void check_base(String base) {
    }

    @Then("main is {}")
    public void check_main(String main) {
    }

    @Then("temp is {double}")
    public void check_temp(double temp) {
    }

    @Then("pressure is {int}")
    public void check_pressure(int pressure) {
    }

    @Then("humidity is {int}")
    public void check_humidity(int humidity) {
    }

    @Then("temp_min is {double}")
    public void check_temp_min(double temp_min) {
    }

    @Then("temp_max is {double}")
    public void check_temp_max(double temp_max) {
    }

    @Then("visibility is {int}")
    public void check_visibility(int visibility) {
    }

    @Then("wind speed is {double}")
    public void check_wind_speed(double speed) {
    }

    @Then("wind deg is {int}")
    public void check_wind_deg(int deg) {
    }

    @Then("clouds all is {int}")
    public void check_clouds_all(int clouds_all) {
    }

    @Then("dt is {long}")
    public void check_dt(long dt) {
    }

    @Then("sys type is {int}")
    public void check_sys_type(int sys_type) {
    }

    @Then("sys id is {int}")
    public void check_sys_id(int sys_id) {
    }

    @Then("sys message is {double}")
    public void check_sys_message(double sys_message) {
    }

    @Then("sys country is {string}")
    public void check_sys_country(String sys_country) {
    }

    @Then("sys sunrise is {long}")
    public void check_sys_sunrise(long sys_sunrise) {
    }

    @Then("sys sunset is {long}")
    public void check_sys_sunset(long sys_sunset) {
    }

    @Then("id is {long}")
    public void check_id(long id) {
    }

    @Then("name is {string}")
    public void check_name(String name) {
    }

    @Then("cod is {int}")
    public void check_cod(int cod) {
    }
}

