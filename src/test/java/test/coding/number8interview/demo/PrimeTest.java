package test.coding.number8interview.demo;

import org.junit.jupiter.api.Test;
import coding.number8interview.demo.business.OddNumber;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;


@SpringBootConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
class PrimeTest {

    OddNumber od = new OddNumber();

    @Test
    void noPrimeTest() {
        Assert.isTrue(!od.chekPrime(15), "15 Its Not A Prime");
    }
    
    @Test
    void primeTest() {
        Assert.isTrue(od.chekPrime(17), "17 Its A Prime");
    }
    
    

}
