import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		final int LIMI = 10;
		
		int a[], i, j, iguais=0;
		
		a = new int [LIMI];
		
		for(i=0;i<LIMI;i++) {
			System.out.println("Insira o " + (i+1) + "º valor.");
			a[i] = leia.nextInt();
		}
		
		for(i=0;i<LIMI;i++) {
			for(j=(LIMI/2)-1;j>=0;j--) {
				
				if (a[j]==a[j+(LIMI/2)]) {
					iguais= iguais+1;
				}
				
			}
			
		}
		
		for(i=0;i<LIMI;i++) {
			
				System.out.print(a[i]+" ");
			
		}
		
		if (iguais>=LIMI){
			
			System.out.println(" -> Palíndrome.");
			
		}else {
			
			System.out.println(" -> Não Palíndrome.");
		}
		
		
	}

}
