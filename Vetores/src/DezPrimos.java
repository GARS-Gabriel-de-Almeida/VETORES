import java.util.Scanner;
public class DezPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia = new Scanner(System.in);
		
		final int LIMI = 3;
		
		int a[], i, j, pri=0;
		
		a = new int [LIMI];
		

			for(i = 0; i < LIMI; i++) {
				
				System.out.println("Insira o " + (i+1)+ "º número: ");
				a[i] = leia.nextInt();
			}
			for(i = 0; i < LIMI; i++) {
				pri=0;
				for(j=1; j <= a[i];j++) {
					if (a[i] % j == 0) {
						pri = pri+1	;	
					}
				}
				
				if(pri!=2) {
					System.out.println(a[i] + " Não é primo.");	
					
				}else {
					System.out.println(a[i] +  " É primo!");
					
				}
			}
			
		
			
			
	}
}

