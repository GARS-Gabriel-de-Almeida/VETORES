import java.util.Scanner;
public class DezAeBAo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int i, a[], b[];

		final int LIMI = 10; 
		
		a = new int [LIMI];
		b = new int [LIMI];
		
		for(i=0;i<LIMI;i++) {
			
			System.out.println("Insira o "+(i+1)+"º valor.");
			a[i]= leia.nextInt();
			b[i] = (a[i]*a[i]);
		}
		
		for(i=0;i<LIMI;i++) {
		System.out.print(b[i] + " ");
		}
	}

}
