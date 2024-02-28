import java.util.Scanner;
public class Exercicio4678 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double vha,sb,inss,por,sl;
		int na;
		System.out.println("digite o valor da hora da aula");
		vha=ler.nextDouble();
		System.out.println("digite o numero de  aulas dadas");
		na=ler.nextInt();
		sb=vha*na;
		if(sb <= 1212.00) {
		inss=7.5;
		por=sb*inss/100;
		sl=sb-por;
		}else if(sb>=1212.01 && sb<=2427.35) {
			inss=9;
		
		}else if(sb>=2427.36 && sb<=3614.03) {
			inss=12;
			
		}else if(sb>=3614.04 && sb<=7087.22) {
			inss=14;
			
			
		}else if(sb>=7087.23 && sb<=12136.79) {
			inss=14.5;
			por=sb*inss/100;
			sl=sb-por;	
			
		}else if(sb>=12136.80 && sb<=24273.57) {
			inss=16.5;
			
		}else if(sb>=24273.58 && sb<=47333.46) {
			inss=19;
			
		}else {
			inss=22;
			
		}
		por=sb*inss/100;
		sl=sb-por;	
		System.out.println("o salario bruto e "+sb );
		System.out.println("o inss é  "+inss );
		System.out.println("o salario liquido e "+sl );
		
	}

}
