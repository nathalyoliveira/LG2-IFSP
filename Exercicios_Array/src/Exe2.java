import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int i;
		
		for (i=9; i>=0; --i) {
			System.out.println("Digite um número na " + (i+1)+ "° posição");
			array[i] = sc.nextInt();	
		}
		
		for( i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

	}

}
