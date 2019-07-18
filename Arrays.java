
public class Arrays {
	public static void main(String[] args) {
		/*
		 * int val= 7; int val2= 10;
		 */ 
		
		int[] values;
		
		values= new int[3]; // inicjalizacja ze wskazaniem wielkosci tablicy
		
		values[0]= 23;
		values[0]= 2;  // mozna nadpisywac wartosci
		values[1]= 24;
		values[2]= 5;
		//values[3]= 20; wyprodukuje nam wyjatek bo zadeklarowalismy mniejszy rozmiar tablicy
		 
		System.out.println(values[0]); //wskazujemy index z tablicy
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for(int i=0; i<values.length; i++) { //values.length = 3
			System.out.println(values[i]);
		}
		
		
		int[] numbers= {8,68,164,29};
		
		for(int i=0; i<numbers.length; i++) { //values.length = 3
			System.out.println(numbers[i]);
		}
		
		
		System.out.print("\n");
		
		//petla for-each
		for(int x: numbers) {
			System.out.println(x);
		}
		
	}
}
