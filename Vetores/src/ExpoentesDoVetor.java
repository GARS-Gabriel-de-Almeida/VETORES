import java.util.Scanner;
public class ExpoentesDoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		final int LIMI = 11;
		
		int i, a[], resul=0;
		
		 a = new int [LIMI];
		
	
		for (i = 0; i < LIMI; i++) {	
				resul = resul*2;
				
				if(resul == 0) {
					resul = 1;
				}
				
				a[i] = resul;
		}		
				
		for (i = 0; i < LIMI; i++) {			
			
			System.out.println("2^"+ i + " = " + a[i]);
				
			
		}
	}

}
