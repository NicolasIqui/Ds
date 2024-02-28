import java.util.Scanner;
public class Exercicio45 {
		public static void main (String[] args){
 
			int n,c,d,u;
			System.out.println("digite um numero de 3 algarismos");
			n=ler.nextInt();
			while(n>=1000) {
			System.out.println("digite um  numero valido");	
			n=ler.nextInt();	
			}
			c=n/100;
			d=n/10%10;
			u=n%10;		
			System.out.println(" o seu numero ao contrario e \n "+n+ "\n "+u+d+c );
			
			
		}
		}

