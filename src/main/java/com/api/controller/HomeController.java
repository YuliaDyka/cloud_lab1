package com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class HomeController {
    @GetMapping(value = "")
    public String GetHomePage() {
        String strOutput = "-------------- GET ALL --------------------<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/films<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/actors<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/budgets<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/cashCollections<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/countries<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/nominations<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/raitings<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/reviewers<br>";
        strOutput = strOutput + "-------------- GET BY ID --------------------<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/films/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/actors/2<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/budgets/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/cashCollections/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/countries/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/nominations/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/raitings/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/reviewers/1<br>";
        strOutput = strOutput + "-------------- SWAGGER --------------------<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/swagger-ui/<br>";
        strOutput = strOutput + "-------------- GET FILM BY NAME --------------------<br>";
        strOutput = strOutput + "https://films-ratings-yulia-container.azurewebsites.net/api/films/name?filmName=Rokky";
        return strOutput;

    }
}
