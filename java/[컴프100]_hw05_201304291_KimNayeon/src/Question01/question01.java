package Question01;

import java.util.Arrays;
import java.util.Random;

public class question01 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		Random random = new Random();
		
		for (int i = 0; i  < arr1.length; i++) 
			arr1[i] = random.nextInt(100);
		int max = arr1[0];
		int min = arr1[0];
		
		for(int i = 1; i< arr1.length; i++) {
			if(max < arr1[i])
				max = arr1[i];
			if (min > arr1[i])
				min = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("10개의 수중 가장 큰 수 : " + max);
		System.out.println("10개의 수중 가장 작은 수 : " + min);
		
		
	}

}
