package bubblesort;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int[] array;
		 array= new int[20];
		Random rand = new Random();
		
		for(int i = 0; i<20;i++){
			array[i]= rand.nextInt(100) + 1;
		}
		
		System.out.println(Arrays.toString(array));
		int val = 0;
		for(int i = 0;i < array.length;i++){
			for(int j = 0; j< array.length-i-1;j++){
				if(array[j]>array[j+1]){
					val = array[j];
					array[j] = array[j+1];
					array[j+1] = val;
				}
			}
			
			
		}
		System.out.println(Arrays.toString(array));

	}

}
