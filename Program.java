import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		System.out.println("Hello");
	}
	
	int makeArrayConsecutive2(int[] statues) {
		int dodatkowa= 0, pomocnicza= 0;
		Arrays.sort(statues);
		
		for (int i=0; i < statues.length -1; i++) {
			pomocnicza= statues[i] + 1;
			while (statues[i]+1 != statues[i+1]) {
				dodatkowa++;
				if (pomocnicza+1 == statues[i+1]) {
					break;
				}
				else {
					pomocnicza++;
				}
			}
		}
		return dodatkowa;
	}
}
