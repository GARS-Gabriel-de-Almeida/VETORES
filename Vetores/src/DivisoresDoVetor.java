import java.util.Scanner;
public class DivisoresDoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
	
		final int LIMI = 10;
		
		int i,j, a[];
		
		 a = new int [LIMI];
		
		for (i = 0; i < LIMI; i++) {
			System.out.println("Entre com o " +(i+1)+"º número.");
			a[i] = leia.nextInt();
			
		}
		for (i = 0; i < LIMI; i++) {
			for (j = a[i] - a[i]*2; j <= a[i]; j++) {
				
				if(j==0) {
					j = j+1;
				}
				
				if (a[i] % j == 0)
				System.out.print("-> " + j  + " ");
				
			}
			if(j >= a[i]) {
				System.out.println("| esses são os divisores de " + a[i]);
			}
		}
	}

}
