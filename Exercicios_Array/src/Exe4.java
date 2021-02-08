
public class Exe4 {

	public static void main(String[] args) {
		
		int array[][] = new int[50][100];
		int i;
		int j;
		
		for (i=49;i>=0;--i) {
			for(j=99;j>=0;--j) {
				array[i][j] = i+j;
			}
		}
		
		for(i=0;i<array.length;++i) {
			for(j=0;j<array[i].length;++j) {
				System.out.println(i+"|"+j+ " = " + array[i][j] + "\t");
			}   System.out.println("\n");
		}
		
	}

}
