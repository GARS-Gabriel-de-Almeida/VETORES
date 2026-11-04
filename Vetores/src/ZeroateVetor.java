import java.util.Scanner;
public class ZeroateVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner	leia = new Scanner(System.in);
		
		final int LIMI = 10;
		
		int i,j, a[];
		
		 a = new int [LIMI];
		
		for (i = 0; i < LIMI; i++) {
			System.out.println("Entre com o " +(i+1)+"º número.");
			a[i] = leia.nextInt();
			
		}
		for (i = 0; i < LIMI; i++) {
			for (j = 0; j <= a[i]; j=j+2) {
				System.out.print("-> " + j  + " ");
				
			}
			if(j >= a[i]) {
				System.out.println("| esses são os pares de 0 até " + a[i]);
			}
		}
	}

}
