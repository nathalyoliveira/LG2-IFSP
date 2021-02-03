
public class Exe1 {

	public static void main(String[] args) {
		
		int array[] = new int[9];
		int i;
		
		for (i = 0; i < array.length; i++) {
  			array[i] = i; 
		}
		
		for( i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
		
		for (i = 0; i < array.length; i++) {
  			array[i] = i*3; 
		}
		
		for( i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
		
	}

}
