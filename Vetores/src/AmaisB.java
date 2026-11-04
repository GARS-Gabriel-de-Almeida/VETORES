import java.util.Scanner;
public class AmaisB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);
		
		int i, a[], b[], c[];

		final int LIMI = 10; 
		
		a = new int [LIMI];
		b = new int [LIMI];
		c = new int [LIMI];
		
		for(i=0;i<LIMI;i++) {
			
			System.out.println("Insira o "+(i+1)+"º valor de A.");
			a[i]= leia.nextInt();
		}
		for(i=0;i<LIMI;i++) {
			System.out.println("Insira o "+(i+1)+"º valor de B.");
			b[i]= leia.nextInt();
			c[i] = (a[i]+b[i]);
		}
		
		for(i=0;i<LIMI;i++) {
		System.out.print(c[i] + " ");
		}
	}		
}
