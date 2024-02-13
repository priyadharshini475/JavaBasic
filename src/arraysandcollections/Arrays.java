package arraysandcollections;

public class Arrays {

	public static void main(String[] args) {
		String str[]= {"ram","ravi","raj"};
		int[] arr1= {10,20,30};
		System.out.println("The elements of array is:");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		//Iterate through looping
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		//Using for-each loop
		for(String a:str) {
			System.out.println(a);
		}
		//Average
		int arr2[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr2.length;i++) {
			sum+=arr2[i];
		}
		double avg=(double)sum/(double)arr2.length;
		//create a 2-D array
		int arr3[][]= {{2,3,5},{5,6,7},{6,7,8,9}};
		System.out.println(arr3[0][1]);
		System.out.println(arr3[1][1]);
		System.out.println(arr3[2][3]);
		System.out.println("Length of row1:"+arr3[0].length);
		System.out.println("Length of row2:"+arr3[1].length);
		System.out.println("Length of row3:"+arr3[2].length);
	}

}
