import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int i;
		
		for (i=9; i>=0; --i) {
			System.out.println("Digite um n�mero na " + (i+1)+ "� posi��o");
			array[i] = sc.nextInt();	
		}
		
		for( i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

	}

}
