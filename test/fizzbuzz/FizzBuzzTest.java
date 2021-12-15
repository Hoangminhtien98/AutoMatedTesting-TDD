package fizzbuzz;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    @Test
    @DisplayName("TestCase1")
    public void testFizzBuzz1(){
        String number = "123";
        String expected = "Sai!!!";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("TestCase2")
    public void testFizzBuzz2(){
        String number = "253";
        String expected = "Sai!!!";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("TestCase3")
    public void testFizzBuzz3(){
        String number = "35";
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("TestCase4")
    public void testFizzBuzz4(){
        String number = "75";
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("TestCase5")
    public void testFizzBuzz5(){
        String number = "734255";
        String expected = "Sai!!!";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}
