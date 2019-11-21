package matriz;
import java.util.*;
public class Exer1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int v[][] = new int[3][3];
		int i,j;
		
		for(i=0; i<3; i++) {
			for(j=0; j<3;j++) {
			System.out.println("\n Entrada de valor ["+(i+1)+"] ["+(j+1)+"] :: ");
			v[i][j] = 	in.nextInt();
			
			}
		}
		System.out.println("\n:: Valores da matriz :: \n\n");
		for(i=0; i<3;i++) {
			for(j=0; j<3; j++) {
				System.out.println(" ["+v[i][j]+"] ");
				if(j==2) {
					System.out.println("\n");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
