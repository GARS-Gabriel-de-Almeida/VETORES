import java.util.Scanner;
public class Separando20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int a[], b[] ,i, j=0;
		
		final int LIMI = 20;
		
		a = new int [LIMI] ;
		b = new int [LIMI] ;
	
		
		for(i = 0; i < LIMI; i++) {
			System.out.println("Entre com o "+(i+1)+"º Número");
			a[i]= leia.nextInt();	
		}
		for(i = 0; i < LIMI; i++) {
			if(a[i] % 2 == 0)  {
				b[j] = a[i];
				j++;
			}
		}
		for(i = 0; i < LIMI; i++) {
			if(a[i] % 2 != 0)  {
				b[j] = a[i];
				j++;
			}
		}
		
		System.out.println("Vetor A:");
		for(i = 0; i < LIMI; i++) {
		
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\n\nVetor B:");
		
		for(i = 0; i < LIMI; i++) {
		System.out.print(b[i] + " ");
		}
	}

}
	