import java.util.Scanner;

public class Pesquisax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		final int LIMI = 10;
		
		int a[], i, j, pesq[], encont=0;
		
		a = new int [LIMI];
		pesq = new int [LIMI];
		
		for(i=0;i<LIMI;i++) {
			System.out.println("Insira o " + (i+1) + "º valor.");
			a[i] = leia.nextInt();
	
			if(i==LIMI-1) {
			System.out.println("Digite o valor que gostaria de buscar: ");
			pesq[i] = leia.nextInt();
			}
		}
		
		
		
		for(i=0;i<LIMI;i++) {
			for(j=0;j<LIMI;j++) {
				
				if (pesq[i]==a[j]) {
					System.out.println(a[j] + " -> encontrado.");
					encont= encont+1;
				}
			}
		}
		if(encont==1) {
			System.out.println("1 item encontrado.");
		}
		else if (encont>1){
			System.out.println(encont + " itens encontrados.");
			
		}else {
			System.out.println("Nenhum valor encontrado.");
		}
		
	}

}
