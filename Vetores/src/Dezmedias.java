import java.util.Scanner;

public class Dezmedias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner leia = new Scanner(System.in);
		
		int i, resul, a[];

		final int LIMI = 10; 
		
		a = new int [LIMI];
		
		for(i=0;i<LIMI;i++) {
			
			System.out.println("Insira o "+(i+1)+"º valor de A.");
			a[i]= leia.nextInt();
		}
			resul= (a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9])/10;
			
			System.out.println(resul);
	}		
}


