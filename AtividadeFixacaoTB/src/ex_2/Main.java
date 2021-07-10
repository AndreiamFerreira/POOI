package ex_2;

public class Main {

	public static void main(String[] args) {
		
		int[] data1 = {3,7,8,9,2};
		int[] data2 = {9,1,6};
		int[] data3 = new int[data1.length + data2.length];
	
		for(int i = 0; i < data1.length; i++)
		{
			data3[i] = data1[i];
		}

		for(int j = 0; j < data2.length; j++)
		{
			data3[j + data1.length] = data2[j];
		}
		
		 for (int k = 0; k < data3.length; k++) {
			 System.out.println(data3[k]);
	        }
		}		
}




