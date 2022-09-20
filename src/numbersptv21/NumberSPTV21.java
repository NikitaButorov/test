/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersptv21;

import java.util.Scanner;

/**
 *
 * @author Nikita Butorov
 */
public class NumberSPTV21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 3-digit number: ");
        int number = scanner.nextInt();
        System.out.printf("Your number is %d%n",number);
        int units = (number%10);
        int dozens = (number/10%10);
        int hundreds = (number/100);
        System.out.printf(String.join("%n",
                "Units: %1$-5d",
                "Dozens: %2$-5d"), units,dozens);
        int summa = (units+dozens+hundreds);
        System.out.print(summa+"\nsumma numbers:");
                
                
        // TODO code application logic here
    }
    
}
