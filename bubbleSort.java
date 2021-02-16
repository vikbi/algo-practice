import java.util.Arrays;

public class bubbleSort{

      public static void main(String[] args){
	bubbleSort obj = new bubbleSort();
	obj.sort();
      }

	public void sort(){
	   
	   int[] data = {1,2,3,7,8,9,3,34,54,65,32,45};
  	   System.out.println("before sort : ");
	   System.out.println(Arrays.toString(data));
		int size = data.length;
		boolean sorted = false;
		boolean status = false;
		while(!sorted){
		  int[] temp = data;
		  status = false;
		for(int i=0; i < size-1; i++){
		   
		   if(temp[i] > temp[i+1]){
			 int swap = temp[i];
			 temp[i] = temp[i+1];
			 temp[i+1] = swap;
			 status = true;
			}
			
		}
//status = false;
			data = temp;
			if(status == false){
				sorted = true;
			}
		}
		System.out.println(Arrays.toString(data));
	}		
    
}