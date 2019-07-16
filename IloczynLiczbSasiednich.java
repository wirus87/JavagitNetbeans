
public class IloczynLiczbSasiednich {
	public static void main(String[] args) {
		System.out.println("Hello");
		IloczynLiczbSasiednich Iloczyn= new IloczynLiczbSasiednich();
		int[] tablica= {-2,1,-11,5};
		System.out.println(Iloczyn.adjacentElementsProduct(tablica));
	}
	
	int adjacentElementsProduct(int[] tab) {
		int product, max= tab[0]*tab[1];
		
		if (tab.length>=2) {
			for (int n=1; n<tab.length-1; n++) {
				product= tab[n]*tab[n+1];
				if (max < product) {
					max= product;
				}
			}
		}
		return max;
	}
}
