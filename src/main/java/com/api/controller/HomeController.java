package com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class HomeController {
    @GetMapping(value = "")
    public String GetHomePage() {
        String strOutput = "-------------- POST --------------------<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/app/films<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/app/actors<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/app/budgets<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/app/cashCollections<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/app/countries<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/app/nominations<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/app/raitings<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/app/reviewers<br>";
        strOutput = strOutput + "-------------- GET --------------------<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/api/films/1/actors<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/api/actors/1/films<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/api/budgets/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/api/cashCollections/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/api/countries/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/api/nominations/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/api/raitings/1<br>";
        strOutput = strOutput + "https://films-ratings-yulia.azurewebsites.net/api/reviewers/1<br>";
        return strOutput;
    }
}
