import java.util.Scanner;
public class InvertendoPosicoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia = new Scanner(System.in);
		
		int i,j, resul, a[],b[];

		final int LIMI = 10; 
		
		a = new int [LIMI];
		b = new int [LIMI];
		
		for(i=0;i<LIMI;i++) {
			
			System.out.println("Insira o "+(i+1)+"º valor de A.");
			a[i]= leia.nextInt();
		}
		
		for(i=9;i>0;i--) {
			b[i]=a[i-1];
			System.out.print(b[i] + " ");
		}
			 
			
	}		

	

}
