package com.platzi.javatests.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void zero_when_price_is_zero(){

        PriceCalculator c = new PriceCalculator();

        c.addPrices(0);
        c.setDiscount(0.00);

        assertThat( c.getTotal() , is(0.0) );
        assertThat( c.getDiscount() , is(0.0) );

    }
    @Test
    public void total_is_sum_of_prices(){
        PriceCalculator c = new PriceCalculator();

        c.addPrices(50.0);
        c.addPrices(50.0);
        c.setDiscount(0.00);

        assertThat( c.getTotal() , is(100.0) );
        assertThat( c.getDiscount() , is(0.0) );
    }@Test
    public void total_is_sum_of_prices_whith_discount(){
        PriceCalculator c = new PriceCalculator();

        c.addPrices(50.0);
        c.addPrices(50.0);
        c.setDiscount(0.10);

        assertThat( c.getTotal() , is(90.0) );
        assertThat( c.getDiscount() , is(0.10) );
    }

}