import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if(payment<=Math.pow(10,9))
            {
            NumberFormat formatter = NumberFormat.getInstance(Locale.US);
formatter.setMaximumFractionDigits(2);
formatter.setMinimumFractionDigits(2);
        NumberFormat formatter1 = NumberFormat.getInstance(Locale.FRANCE);
formatter1.setMaximumFractionDigits(0);
formatter1.setMinimumFractionDigits(2);          

            //formatter.format(payment);
            
                
        System.out.println("US: "+"$"+ formatter.format(payment));
        System.out.println("India: "+"Rs." + formatter.format(payment));
        System.out.println("China: " +"?" + formatter.format(payment));
        System.out.println("France: " + formatter1.format(payment)+" " +"€");
        }}
}