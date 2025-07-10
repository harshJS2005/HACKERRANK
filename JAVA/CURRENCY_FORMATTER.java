import java.util.*;
import java.text.*;

public class Solution {
    
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();



    NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);


    DecimalFormatSymbols indiaSymbols = new DecimalFormatSymbols();
    indiaSymbols.setGroupingSeparator(',');
    indiaSymbols.setDecimalSeparator('.');
    DecimalFormat indiaFormat = new DecimalFormat("#,##,##0.00", indiaSymbols);

    String us = nfUS.format(payment);
    String china = nfChina.format(payment);
    String france = nfFrance.format(payment);
    String india = "Rs." + indiaFormat.format(payment);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
}
}

