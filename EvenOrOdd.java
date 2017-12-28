/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenorodd;

import java.util.Scanner;

/**
 *
 * @author lkrupa
 */
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.println("Podaj liczbe");
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Ta liczba jest parzysta(even)");
        } else {
            System.out.println("Ta liczba jest nieparzysta(odd)");
        }
    }
    
}
