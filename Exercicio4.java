import java.util.Scanner;
public class Exercicioteste3 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		String escolha;
		int p,ml,por,pv;
		do {
		System.out.println("digite o  preço do produto ");
		p=ler.nextInt();
		System.out.println("digite a margem de lucro");
		ml=ler.nextInt();	
		por=p*ml/100;
		pv=p+por;
		System.out.println(" O preco do produto e "+p );
		System.out.println(" A margem de lucro "+ml );
		System.out.println(" O preco da venda e "+pv );
		System.out.println("deseja continuar a execução s/n");
		escolha=ler.next();
			
		}while(escolha.equalsIgnoreCase("s"));

	}

}
