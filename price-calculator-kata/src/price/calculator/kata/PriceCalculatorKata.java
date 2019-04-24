/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package price.calculator.kata;

import java.text.DecimalFormat;

/**
 *
 * @author thomas
 */
public class PriceCalculatorKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private static String formatNumberWithTwoDecimals(double number)
    {
        String pattern = "##.00";
        return FormatNumber(pattern,number);
    }

    private static String FormatNumber(String pattern, double number) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(number);
    }
    
    private static String formatNumberWithoutDecimals(double number){
        String pattern = "##";
        return FormatNumber(pattern, number);
    }

    public static String print_calculated_price(Product product, double tax) {
        double aftertax = product.price*(1+tax/100);
        return "Product price reported as $"+formatNumberWithTwoDecimals(product.price)+" before tax and $" + formatNumberWithTwoDecimals(aftertax) +" after "+ formatNumberWithoutDecimals(tax)+ "% tax."; //To change body of generated methods, choose Tools | Templates.
    }
    
}
