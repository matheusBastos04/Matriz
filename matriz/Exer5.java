package matriz;
import java.util.*;
public class Exer5 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		int a[][] = new int [3][4];
		int i,j,aux=0,aux1=0,aux2=0;
		int v[] = new int [4];
		
		
			for(i=0; i<3;i++){
				
				for(j=0;j<4;j++) {
					System.out.println("insira os numeros ");
					a[i][j] = in.nextInt();
					aux = aux + a[i][j];
				}
				
				v[i] = aux;
				for(j=0;j<4;j++) {
					a[i][j]=v[i];
					}
				aux = 0;
				
			}
					for(i=0;i<3;i++) {
						for(j=0;j<1;j++) {
						System.out.print(a[i][j]+" ");
					}
						System.out.println("\n");
					}
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
