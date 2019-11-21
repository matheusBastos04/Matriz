package matriz;
import java.util.*;
public class exerD {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Random g = new Random();
		
		int i,j, jogador = 0,n=4,acertos=0,rodada=0,numeros=75;
		int b[][] = new int[n][n];
		int p [] = new int[4];
		
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				b[i][j] = g.nextInt(numeros);
			
			}	
		}
		
			for(i=0; i<4;i++) {
				System.out.println("Insira os numeros");
				jogador = in.nextInt();
			}
			
				for(i=0;i<n;i++) {
					for(j=0;j<n;j++) {
					if(jogador == b[i][j]) {
						rodada++;
						acertos++;
						if(acertos == 4) {
							break;
							}
						}	
					}	
				}
			
				
			if(acertos == 4) {
				System.out.println("\nParabens você fez BINGO\n Você demorou: "+rodada+" Rodadas para acertar");
				
			}else {
				System.out.println("Que pena você não conseguiu acertar todos os numeros");
				
					System.out.println("Os numeros eram: ");
					
					for(i=0;i<n;i++) {
						for(j=0;j<n;j++) {
						System.out.print(b[i][j]+" ");	
						}	
						System.out.println("\n");
					}
					
				}
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
