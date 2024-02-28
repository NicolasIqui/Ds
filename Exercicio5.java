import  java.util.Scanner; 

public class Exerciciofesta {
	public static void main(String args[]) {
		Scanner ler=new Scanner(System.in);
		final int TAM=5;
		int i,b[],c[],a[];
		a=new int[TAM];
		b=new int[TAM];
		c=new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("digite o valor do vetor a");
			a[i]=ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.println("digite o valor do vetor b");
			b[i]=ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			c[i]=a[i]+b[i];
		}
		System.out.print("o valor do vetor A=[");
		for(i=0; i<TAM; i++) {
			System.out.print(" "+a[i] );			
		}
		System.out.println("]");
		
		System.out.print("o valor do vetor B=[");
		for(i=0; i<TAM; i++) {
			System.out.print(" "+b[i] );		
		}		
		System.out.println("]");
		System.out.print("o valor do vetor C=[");
		for(i=0; i<TAM; i++) {
			System.out.print(" "+c[i] );
			
		}
		
		
	}
}

		