import java.util.Scanner;
public class Exercicio {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		int i,j,i2,e=0;
		char a[][];
		a=new char[3][3];
		char escolha1='X';
		char escolha2='O';
		char nulo=0;
		
		
		for(i=0;i<3;i++) {
			
		
			for(j=0;j<3;j++) {
				a[i][j]=nulo;
	}
			
		}
		for(i=0;i<3;i++ ) {
			
			for(j=0;j<3;j++) {
			System.out.print (a[i][j]+ " _| ");
			}	
			System.out.println();
		}
		for(i2=0;i2<9;i2++) {	
		if(i2%2==0) {
			System.out.println("jogador 1 (X) ");
			System.out.println("digite a linha que vc quer ");
		i=ler.nextInt();
		i=i-1;
		System.out.println("digite a coluna que vc quer");
		j=ler.nextInt();
		j=j-1;
		if(a[i][j]!=escolha1 && a[i][j]!=escolha2  ) {
		a[i][j]=escolha1;
			}else {
				while(a[i][j]!=escolha1 || a[i][j]!=escolha2) {
					System.out.println("jogada invalida  jogue novamente ");
				i=ler.nextInt() -1;
				j=ler.nextInt() -1;
				if (a[i][j]!=escolha1 && a[i][j]!=escolha2) {
				a[i][j]=escolha1;
				break;
			}
			}
		}
		
		}else {
			System.out.println("jogador 2  (O) ");
			System.out.println("digite a linha que vc quer ");
		i=ler.nextInt();
		i=i-1;
		System.out.println("digite a coluna que vc quer");
		j=ler.nextInt();
		j=j-1;
		if(a[i][j]!=escolha1 && a[i][j]!=escolha2  ) {
		a[i][j]=escolha2;		
			
		}else {

			while(a[i][j]!=escolha1 || a[i][j]!=escolha2) {
				System.out.println("jogada invalida  jogue novamente ");
			i=ler.nextInt() -1;
			j=ler.nextInt() -1;
			if (a[i][j]!=escolha1 && a[i][j]!=escolha2) {
			a[i][j]=escolha2;
			break;
			}
			}
			
		}
		}
		
		
		for(i=0;i<3;i++ ) {
		for(j=0;j<3;j++)  {
		System.out.print (a[i][j]+   " | ");
			
		}			
		System.out.println();
	}
		if(a[0][0]=='X' && a[0][1]=='X' && a[0][2]=='X'	
		|| a[1][0]=='X' && a[1][1]=='X' && a[1][2]=='X'
		|| a[2][0]=='X' && a[2][1]=='X' && a[2][2]=='X'
		|| a[0][0]=='X' && a[1][0]=='X' && a[2][0]=='X'
		|| a[0][1]=='X' && a[1][1]=='X' && a[2][1]=='X'
		|| a[0][2]=='X' && a[1][2]=='X' && a[2][2]=='X'
		|| a[0][0]=='X' && a[1][1]=='X' && a[2][2]=='X'
		|| a[0][2]=='X' && a[1][1]=='X' && a[2][0]=='X')
		{
			System.out.println(" jogador 1 (X) venceu");
			e=1;
			break;
		}else if  (a[0][0]=='O' && a[0][1]=='O' && a[0][2]=='O'	
				|| a[1][0]=='O' && a[1][1]=='O' && a[1][2]=='O'
				|| a[2][0]=='O' && a[2][1]=='O' && a[2][2]=='O'
				|| a[0][0]=='O' && a[1][0]=='O' && a[2][0]=='O'
				|| a[0][1]=='O' && a[1][1]=='O' && a[2][1]=='O'
				|| a[0][2]=='O' && a[1][2]=='O' && a[2][2]=='O'
				|| a[0][0]=='O' && a[1][1]=='O' && a[2][2]=='O'
				|| a[0][2]=='O' && a[1][1]=='O' && a[2][0]=='O'
				
				) {
			System.out.println("o jogador 2 (O) venceu");
			e=1;
			break;
			
		} else {
			
		}	
		}
		if(e==0) {
			System.out.println("Empate");
		}
		System.out.println("Obrigado por jogar ");
			
	}
}