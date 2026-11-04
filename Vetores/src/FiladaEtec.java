import java.util.Scanner;

public class FiladaEtec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in);
		
		final int LIMI = 10;
		
		int a[], i, j,usuario, novo=0;
		
		a = new int [LIMI];
				
		for(i=0;i<LIMI/2;i++) {
			System.out.println(" ");
			System.out.println("CADASTRO: ");
			System.out.println(" ");
			
			System.out.println("Crie o Código de usuário: ");
			a[i] = leia.nextInt();
			
		}
		for(i=0;i<LIMI;i++) {
			usuario = 0;
			novo = 0;
			System.out.println(" ");
			System.out.println("LOGIN: ");
			System.out.println(" ");
			
			System.out.println("Insira o Código de usuário: ");
			usuario = leia.nextInt();
			
			
			for(j=0;j<LIMI;j++) {
				if(usuario==a[j]) {
					System.out.println("Este estudante já merendou.");
				}else if(usuario!=a[j])  {
					novo = novo + 1;
				}
				if(novo>=LIMI) {
					System.out.println("Boa merenda!");
					a[i] = usuario;
				}
				
			}
	
		}
	}
}
