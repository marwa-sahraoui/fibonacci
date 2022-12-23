package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {
    @Test
    public void should_return_13_when_given_7(){
        //arrange
        Fibonacci fibonacci = new Fibonacci();
        //act
        int result = fibonacci.result(7);
        //assert
        assertThat(result).isEqualTo(13);
    }
    @Test
    public void should_return_55_when_given_10(){
        //arrange
        Fibonacci fibonacci = new Fibonacci();
        //act
        int result = fibonacci.result(10);
        //assert
        assertThat(result).isEqualTo(55);
    }
    @Test
    public void should_return_11_when_given_89(){
        //arrange
        Fibonacci fibonacci = new Fibonacci();
        //act
        int result = fibonacci.result(11);
        //assert
        assertThat(result).isEqualTo(89);
    }
}
