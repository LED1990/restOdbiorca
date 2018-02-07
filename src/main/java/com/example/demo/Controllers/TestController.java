package com.example.demo.Controllers;

import com.example.demo.Model.TestModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by artur on 2018-01-06.
 */
@RestController
public class TestController {
    private static final Logger LOGGER = Logger.getLogger(TestController.class.getName());

    @GetMapping("/response")
    public TestModel sendResponse() {
        LOGGER.info("ktos o cos pyta!!!!!!!!!!!!!!!!!!!!!");
        return new TestModel("działa :)", 1);
    }
}
