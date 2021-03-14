package com.example.calculatorss.controller;


import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class ComputerController {

    public static final Logger logger = LogManager.getLogger(ComputerController.class);

    @GetMapping("/sqroot")
    public double getRoot(@RequestParam double num) {
        logger.info("Calcualting sq root of number"+num);
        return Math.sqrt(num);
    }

    @GetMapping("/factorial")
    public int getFact(@RequestParam int num) {
        int result = 1;
        logger.info("Calcualting factorial of number"+num);
        for (int factor = 2; factor <= num; factor++) {
            result *= factor;
        }
        return result;
    }

    @GetMapping("/ln")
    public double getLn(@RequestParam double num) {
        logger.info("Calcualting ln of number"+num);
        return Math.log(num);
    }

    @GetMapping("/pow")
    public double getPow(@RequestParam int base, @RequestParam int power) {
        logger.info("Calcualting power of number"+base + "which power is"+ power);
        return Math.pow(base, power);
    }


}
