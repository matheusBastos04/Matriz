package matriz;
import java.util.*;
public class Exer2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int v[][] = new int[3][3];
		int i, j;
		Random x = new Random();
		
		for(i=0; i<=2;i++) {
			for(j=0; j<=2;j++) {
				v[i][j] = x.nextInt()%10;				
			}
		}
		for (i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.println(" [ "+v[i][j]+"]");
				if(j==2) {
					System.out.println("\n");
				}
			}
		}
		
		
		
		
		
		
		
		

	}

}
