
public class Main {

	public static void main(String[] args) {
		//working with 2d arrays
		int[][] data = {
				{8,9,4,2,1,0,10,3,25,50,74,95},
				{12,14,15,78,13,45},
				{74,10,23,36,58,45,96,54}
		};
		//itarate throw the array
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}

}
