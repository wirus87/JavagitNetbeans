/*
 * Ten program nalezy do Lukasza Krupy.
 * Mozna kopiowac kod zrodlowy ale nie odpowiadam za jego stan.
 * Jesli macie propozycje co do zmian albo propozycja pracy to prosze pisac :)
 * lukasz.krupa87@gmail.com
 */
package sheepcounting;

/**
 *
 * @author lkrupa
 */
public class SheepCounting {

    /**
     * @return sheeps
     */
    public int liczenieOwieczek(){
        boolean[] tab = {true, false, true, true, false, true, false, true, false, true}; //5 owieczek
        int rozmiar= tab.length;
        int sheeps= 0;
        
        for (int i = 0; i < rozmiar; i++) {
            if(tab[i]==true){
                sheeps++;
            }
        }
        return sheeps;
    }
    
    public int liczenieOwieczek(boolean[] tab){
        //boolean[] tab = {true, false, true, true, false, true, false, true, false, true}; //5 owieczek
        int rozmiar= tab.length;
        int sheeps= 0;
        
        for (int i = 0; i < rozmiar; i++) {
            if(tab[i]==true){
                sheeps++;
            }
        }
        return sheeps;
    }
    
    public static void main(String[] args) {
        SheepCounting liczenie = new SheepCounting();
        System.out.println(liczenie.liczenieOwieczek());
        boolean[] tablica= {true,true,true,false,false};
        System.out.println(liczenie.liczenieOwieczek(tablica));
    }
    
}
