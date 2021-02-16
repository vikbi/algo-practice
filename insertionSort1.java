import java.util.Arrays;

public class insertionSort1{
/*
static void sort(){
	int[] data = {3,1,6,5,4}
	boolean sorted = false;	
	while(!sorted){
		
	   int[] temp = data;
	   for(i=1; i< data.length; i++){
		int addValue = data[i];
		int insert = i;
	   	if(temp[i] < temp[i-1]){
		   for(j=i; j>0; j--)
		     {
			temp[j] = temp[i-1]
			
			}
		}
  	   }
	}
}
*/
public int[] sort(int[] data){

	for(int i=1; i<=data.length-1; i++){
	  int temp = data[i];
	  int insert = i;
	  while(insert>0 && data[insert-1]>temp){
	    data[insert] = data[insert-1];
	    insert--; 
	  }
	  data[insert] = temp;
	}
	return data;	
}

public static void main(String[] args){

	insertionSort1 obj = new insertionSort1();
	int[] data = {12,4,6,9,8,5,10};
	obj.sort(data);
	System.out.println(Arrays.toString(data));
}




}