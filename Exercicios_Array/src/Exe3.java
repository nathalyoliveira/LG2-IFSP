
public class Exe3 {

	public static void main(String[] args) {
		
		int array[][] = new int[100][100];
		int i;
		int j;
		
		for (i=0;i<array.length;++i) {
			for(j=0;j<array.length;++j) {
				array[i][j] = i-j;
			}
		}
		
		for(i=0;i<array.length;++i) {
			for(j=0;j<array[i].length;++j) {
				System.out.println(i+"|"+j+ " = " + array[i][j] + "\t");
			}   System.out.println("\n");
		}
		
		for (i=0;i<array.length;++i) {
			for(j=0;j<array.length;++j) {
				array[i][j] = array[i][j]*7;
			}
		}
		
		for(i=0;i<array.length;++i) {
			for(j=0;j<array[i].length;++j) {
				System.out.println(i+"|"+j+ " = " + array[i][j] + "\t");
			}   System.out.println("\n");
		}
		
	}

}
