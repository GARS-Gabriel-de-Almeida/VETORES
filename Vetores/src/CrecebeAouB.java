import java.util.Scanner;

public class CrecebeAouB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		final int LIMI = 10;
		
		int a[], b[],c[],i;
		
		a = new int [LIMI];
		b = new int [LIMI];
		c = new int [LIMI];
		
		for(i=0;i<LIMI;i++) {
			System.out.println("Insira o "+(i+1)+"º valor de A.");
			a[i]=leia.nextInt();
		}
		
		for(i=0;i<LIMI;i++) {
			System.out.println(" ");
			System.out.println("Insira o "+(i+1)+"º valor de B.");
			b[i]=leia.nextInt();
		}
		
		for(i=0;i<LIMI;i++) {
			
				if(a[i] > b[i]) {
					c[i] = 1;
				}else if (a[i] == b[i]) {
					c[i] = 0;
				}else {
					c[i] = -1;
				}
			
		}
		
		for(i=0;i<LIMI;i++) {
			System.out.print(c[i]+" ");
		}
		
	}

}
