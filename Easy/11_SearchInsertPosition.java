class Solution {
    public int searchInsert(int[] arr, int target) {
                if(arr[0] > target ){

                        return 0;
                }else if(arr[arr.length - 1] < target) {

                        return arr.length;
                
                }else if(arr[0] == target){
                    
                    return 0;
                }else if(arr[arr.length - 1] == target){

                    return arr.length - 1;
                }else if(arr.length == 2){

                    int store = 0;                    
                    if(arr[0] < target && arr[1] > target){
                        
                        store = 1;
                    }
                    return store;
                }else{

                        int start = 1;
                        int end = arr.length;
                        int store = 0;
                        while(start <= end){

                                int mid = (start + end) /2;

                                if(arr[mid] == target) {

                                        store = mid;
                                        break;
                                }else if(arr[mid - 1] < target && arr[mid] > target) {
                                        
                                        store = mid;                                        
                                       break;
                                }
                                if(arr[mid] > target){

                                        end = mid - 1;
                                }
                                if(arr[mid] < target){

                                        start = mid + 1;
                                }

                        }
                        return store;
                }

    }
}
