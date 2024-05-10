package com.group.acciojob.mmt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class HolidaysApi {

    @GetMapping("getPackageIternary")
    public String getPackageItinery() {

        //We can call this API

        RestTemplate restTemplate = new RestTemplate();

        URI url = URI.create("http://localhost:8092/weather/getWeatherInfo");

        String result = restTemplate.getForObject(url,String.class);

        String finalResult = "The weather info is as follows "+result+
                " \n The total cost for a goa trip for 2 people is 30k including train tickets." +
                "Your accomodation will be taken care in a 3 star hotel for 4 dya.s";

        return finalResult;
    }


    @GetMapping("understandLogs")
    public void understandLogs(){



    }


}
