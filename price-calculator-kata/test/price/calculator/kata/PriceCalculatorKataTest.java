/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package price.calculator.kata;

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class PriceCalculatorKataTest {
    Product product;
    public PriceCalculatorKataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
  
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       product = new Product("The Little Prince", 12345, 20.25);   
    }
   //Book = “The Little Prince”, UPC=12345, price=$20.25. }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class PriceCalculatorKata.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String actual = PriceCalculatorKata.print_calculated_price(product, 20.0);
        assertThat(actual, is("Product price reported as $20.25 before tax and $24.30 after 20% tax."));
       actual = PriceCalculatorKata.print_calculated_price(product, 21.0);
        assertThat(actual, is("Product price reported as $20.25 before tax and $24.50 after 21% tax."));
       }
    
}
