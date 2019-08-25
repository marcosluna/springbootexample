/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.number8interview.demo.business;

/**
 *
 * @author marcos
 */
public class OddNumber {

    public boolean chekPrime(int number) {

        int mult = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                mult++;
            }
        }
        return mult == 2;

    }
}
