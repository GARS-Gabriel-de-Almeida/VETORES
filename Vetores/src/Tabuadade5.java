import java.util.Scanner;
public class Tabuadade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		final int LIMI = 5;
		final int TABU = 10;
		
		int a[], i, j;
		
		a = new int [LIMI];
		
		for(i=0;i<LIMI;i++) {
			
			System.out.println("Insira o " + (i+1) +"º número ");
			a[i] = leia.nextInt();
			
			for(j=1;j<=TABU;j++) {
				System.out.println(a[i] + "X" + j + " = " + a[i]*(j));
			}
			System.out.println(" ");
		}
		
		
			
	}

}
