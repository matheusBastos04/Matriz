package matriz;
import java.util.*;
public class Exer3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a[][] = new int[4][4];
		int i ,j, m;
		
	
		m=1;
		for(i=0; i<4;i++) {	
			
			for(j=0;j<4;j++) {
				a[i][j] = m;
				a[i][j] = a[i][j]*2; 
				m=a[i][j];
			}
				
		}
		
		for(i=0; i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.println(" [ "+a[i][j]+"]");
				if(j==2) {
					System.out.println("\n");
				}
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
