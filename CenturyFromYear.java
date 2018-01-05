/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centuryfromyear;

/**
 *
 * @author lkrupa
 */
public class CenturyFromYear {

    /**
     * @param args the command line arguments
     */
    
   int centuryFromYear(int year) {
    if (year % 100 == 0) {
        year = year / 100;
    } else {
        year = (year / 100) + 1;
    }
    return year;
}
    
    public static void main(String[] args) {
        CenturyFromYear wiek= new CenturyFromYear();
        System.out.println(wiek.centuryFromYear(1870));
        System.out.println(wiek.centuryFromYear(1900));
        System.out.println(wiek.centuryFromYear(1902));
        System.out.println(wiek.centuryFromYear(2000));
        System.out.println(wiek.centuryFromYear(2014));
    }
    
}
