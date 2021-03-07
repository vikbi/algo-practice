class Solution
{
    void merge(int arr[], int l, int mid, int r)
    {
        // System.out.println(Arrays.toString(arr));
        // System.out.println(l+" "+mid+" "+r);
        int n1 = mid-l+1;
        int n2 = r-mid;
        // System.out.println(n1+" "+n2);
        int[] t1 = new int[n1];
        int[] t2 = new int[n2];
        for(int i=0; i<t1.length; i++){
            t1[i] = arr[l+i];
            // l++;
        }
        for(int i=0; i<t2.length; i++){
            t2[i] = arr[mid+1+i];
        }
        // System.out.println(Arrays.toString(t1));
        // System.out.println("---");
        // System.out.println(Arrays.toString(t2));
        int n=0; 
        int m=0;
        while(n<n1 && m<n2){
            if(t1[n] < t2[m]){
                arr[l] = t1[n];
                n++;
                l++;
            }else{
                arr[l] = t2[m];
                m++;
                l++;
            }
        }
        
        while(n<t1.length){
            arr[l] = t1[n];
            l++;
            n++;
        }
        
        while(m<t2.length){
            arr[l] = t2[m];
            m++;
            l++;
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if (r>l){
            
        int mid = l+(r-l)/2;
        
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
        }
    }
}
//merge sort