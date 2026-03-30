class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>= high)
        return;
        
        int p = partition(arr, low, high);
        quickSort(arr, low , p-1);
        quickSort(arr, p+1 , high);
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot = arr[low];
        int count = 0;
        
        for(int i = low + 1; i<=high ; i++){
            if(arr[i]<= pivot){
                count++;
            }
        }
        
        int pivotIndex = low + count;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[low];
        arr[low] =temp;
        
        int i = low;
        int j = high;
        
        while(i < pivotIndex && j> pivotIndex){
            while(i < pivotIndex && arr[i]<=pivot )
            i++;
            
            while(j> pivotIndex && arr[j]> pivot)
            j--;
            
            if(i < pivotIndex && j> pivotIndex){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        }
        
        return pivotIndex;
    }
}
