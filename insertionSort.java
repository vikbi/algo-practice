import java.util.Arrays;

public class insertionSort{

static void sort1(){
	int[] data = {3,11,6,50,4};
	boolean sorted = false;	
System.out.println(Arrays.toString(data));

	   int[] temp = data;
	   for(int i=1; i< data.length; i++){
		int addValue = data[i];
		System.out.println(i);
	   	if(temp[i] < temp[i-1]){
		   for(int j=i; j > 0 && temp[j-1]>addValue; j--)
		     {
			temp[j] = temp[j-1];
			temp[j-1] = addValue;
			}
			System.out.println("--");
			System.out.println(Arrays.toString(temp));
		}
  	   }

	System.out.println(Arrays.toString(data));
}

public void sort(int[] data){

	for(int i=1; i<=data.length-1; i++){
	  int temp = data[i];
	  int insert = i;
	  while(insert>0 && data[insert-1]>temp){
	    data[insert] = data[insert-1];
	    insert--; 
	  }
	  data[insert] = temp;
	}	
}



public static void main(String[] args){

	insertionSort obj = new insertionSort();
	int[] data = {2,3,60,9,4,5};
	obj.sort(data);
	obj.sort1();
	System.out.println(Arrays.toString(data));
}



}