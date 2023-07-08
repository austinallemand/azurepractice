package com.azure.azurepractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/azure")
    public String azureController() {
        return "Hello World";
    }
}
