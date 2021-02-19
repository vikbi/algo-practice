
import java.util.Arrays;

public class binarySearch{

	public static void main(String[] args){
	  binarySearch obj = new binarySearch();
	  int n = 76;
	  int[] data = {2,4,5,12,13,25,28,44,55,76};
	  int found = obj.search(data, 0 , data.length - 1, n);
	  System.out.println("found"+found);
	}

	public int search(int[] data, int l, int r, int search){
	  if(r>=l){
          int searchIndex = l + (r - l)/2;
	  
	  if(data[searchIndex] == search){
	     return searchIndex;	
	  }
	System.out.println("--"+data[searchIndex]);
	  System.out.println(l+"--"+r);	
	  System.out.println("----");
	  //search on left side
	  if(data[searchIndex] > search){
		return search(data, l, searchIndex - 1, search);
	  }
	  //search on right side
	  if(data[searchIndex] < search){
		return search(data, searchIndex + 1, r, search);
	  }
	 
	  
	  }
	  return -1;
	}	
}