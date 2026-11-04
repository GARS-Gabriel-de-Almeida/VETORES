import java.util.Scanner;

public class BRecebe0ou1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		final int LIMI = 10;
		
		int a[], b[],i;
		
		a = new int [LIMI];
		b = new int [LIMI];
		
		
		for(i=0;i<LIMI;i++) {
			System.out.println("Insira o "+(i+1)+"º valor.");
			a[i]=leia.nextInt();
		}
		for(i=0;i<LIMI;i++) {
		 
			if(a[i] % 2 == 0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
			
		}
		
		for(i=0;i<LIMI;i++) {
			System.out.print(b[i]+" ");
		}
		
	}

}
