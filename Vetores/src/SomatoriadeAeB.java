import java.util.Scanner;
public class SomatoriadeAeB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		final int LIMI = 10;
		
		int i, a[],b[], j;
		
		 a = new int [LIMI];
		 b = new int [LIMI];
	
		for (i = 0; i < LIMI; i++) {
			System.out.println("Entre com o " +(i+1)+"º número.");
			a[i] = leia.nextInt();
			
		}
		
		for (i = 0; i < LIMI ; i++) {
			for (j = i; j<LIMI ; j++) {
				
				b[i] = b[i] + a[j]; 
				
				if(j == i ) {
					System.out.print(a[j]);
				}else {
					System.out.print(" + " + a[j]);
				}
			}	
			System.out.println(" = " + b[i]);
				
			
			
		}
		
	}

}
