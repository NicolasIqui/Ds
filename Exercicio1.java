import java.util.Scanner;

public class Exerciicioteste {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
			int b,h,a,p;
			System.out.println("digite a base do seu retangulo " );
			b=ler.nextInt();
			System.out.println("digite a  altura do seu retangulo ");
			h=ler.nextInt();
			a=b*h;
			p=(b+h)*2;
			
			System.out.println(" o base do seu retangulo e      "+b );
			System.out.println(" a altura do seu retangulo e    "+h );
			System.out.println(" a area do seu retangulo e      "+a );
			System.out.println(" o perimetro do seu retangulo e "+p );

	}

}


