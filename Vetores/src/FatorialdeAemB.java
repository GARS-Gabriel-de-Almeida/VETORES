import java.util.Scanner;

public class FatorialdeAemB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		final int LIMI = 15;
		
		int i, a[],b[], j;
		
		 a = new int [LIMI];
		 b = new int [LIMI];
	
		for (i = 0; i < LIMI; i++) {
			System.out.println("Entre com o " +(i+1)+"º número.");
			a[i] = leia.nextInt();
			b[i] = a[i];
		}
	 
		for (i = 0; i < LIMI; i++) {	
			for (j = a[i]-1; j > 0; j--) {
				
				b[i] = b[i]*j;
				
				if(j==a[i]-1) {
					System.out.print(a[i]+ "! = " + a[i]);
				}
				System.out.print(" X "+ j);
				
				if(j<=1) {
					System.out.println(" = " + b[i] + " -> Fatorial do número: " + a[i]);
					System.out.println(" ");
				}
			}
		}		
		
	}

}
