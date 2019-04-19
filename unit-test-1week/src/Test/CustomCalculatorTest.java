import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    @Test
    public  void add(){

        CustomCalculator cal = new CustomCalculator();
        int result = cal.add(3,4);
        assertTrue(result == 7);
        System.out.println("result :: " + result);
    }

    @Test
    public void substract(){

        CustomCalculator cal = new CustomCalculator();
        int result = cal.subtract(10,2);
        assertTrue(result == 8);
        System.out.println("result :: " + result);
    }

    @Test
    public void multiply(){
        CustomCalculator cal = new CustomCalculator();
        int result = cal.multiply(45,2);
        assertTrue(result == 90);
        assertFalse(result == 50);
        System.out.println("result :: " + result);
    }

    @Test
    public void divide(){
        CustomCalculator cal = new CustomCalculator();
        int result = cal.divide(100,5);
        assertTrue(result == 20);
        System.out.println("result :: " + result);
    }
}