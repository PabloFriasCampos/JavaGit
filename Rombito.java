
public class Rombito {
	
	public static void main (String[] args) {
		int tam = 10;
		System.out.println();
		for(int i=1;i<=tam;i++){
			for(int j=0;j<tam-i;j++){
				System.out.print("  ");
				
			}
			for(int k=0;k<i;k++){
				System.out.print("  * ");
				
			}
			
		System.out.println();
		}
		for(int i=tam-1;i>0;i--){
			for(int j=0;j<tam-i;j++){
				System.out.print("  ");
				
			}
			for(int k=0;k<i;k++){
				System.out.print("  * ");
				
			}
			
		System.out.println();
		}
	}
}
