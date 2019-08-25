/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.number8interview.demo.controllers;

import coding.number8interview.demo.business.OddNumber;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marcos
 */
@RestController
public class ControllerTest {

    @RequestMapping("/hello")
    public String base() {
        return "hello";
    }

    @RequestMapping("/check")
    public String check(@RequestParam(defaultValue = "2") String number) {
        int val;
        try {
            val = Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            return "You must sent an integer as parameter";
        }
        OddNumber od = new OddNumber();
        return "Result of checking if the   number [" + val + "] is prime? {" + od.chekPrime(val) + "}";
    }
}
