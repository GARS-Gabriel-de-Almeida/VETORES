import java.util.Scanner;

public class DiferencaAeB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leia = new Scanner(System.in);

		final int LIMI = 10;
		
		int i, a[],b[],c[], j,total=0;
		
		 a = new int [LIMI];
		 b = new int [LIMI];
		 c = new int [LIMI];
		 
		 for (i = 0; i < LIMI; i++) {
			 System.out.println("Entre com o " +(i+1)+"º valor de A.");
			 a[i] = leia.nextInt();	
		 }
		 
		 System.out.println("-------------------------------------------");
		 
		 for (i = 0; i < LIMI; i++) {
			 System.out.println("Entre com o " +(i+1)+"º valor de B.");
				b[i] = leia.nextInt();
		 }
		 for (i = 0; i < LIMI; i++) {
			 for(j = 0; j < LIMI; j++)
				
				if(a[i]!= b[j]) {
					
					c[total] = a[i];
					total= total+1;
					
				}
		}
		System.out.println("Valor(es)Diferentes: ");
		for (i = 0; i < total; i++) {
				System.out.println("-> "+c[i]+" ");
			
		}
		
	}

}
