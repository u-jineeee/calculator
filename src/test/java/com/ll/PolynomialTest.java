package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PolynomialTest {
    @Test
    @DisplayName("3 + 3 => 6")
    public void t1() {
        assertThat(new Polynomial("3 + 3").calc()).isEqualTo(6);
    }

    @Test
    @DisplayName("13 + 2 => 15")
    public void t2(){
        assertThat(new Polynomial("13 + 2").calc()).isEqualTo(15);
    }

    @Test
    @DisplayName("1000 + 280 == 1280")
    public void t3(){
        assertThat(new Polynomial("1000 + 280").calc()).isEqualTo(1280);
    }

    @Test
    @DisplayName("50 - 30 == 20")
    public void t4(){
        assertThat(new Polynomial("50 - 30").calc()).isEqualTo(20);
    }

    @Test
    @DisplayName("100 - 20 == 80")
    public void t5(){
        assertThat(new Polynomial("100 - 20").calc()).isEqualTo(80);
    }

    @Test
    @DisplayName("10 + 20 + 30 = 60")
    public void t6(){
        assertThat(new Polynomial("10 + 20 + 30").calc()).isEqualTo(60);
    }
}
