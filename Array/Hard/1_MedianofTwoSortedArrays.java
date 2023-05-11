class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int size = nums1.length + nums2.length;
            int[] arr = new int[size];

            int i = 0;
            while(nums1.length != i){
                arr[i] = nums1[i];
                i++;
            }
            int n = 0;
            while(nums2.length != n){
                arr[i] = nums2[n];
                n++;
                i++;
            }

            for(int k = 0 ; k < size - 1; k++){

                    for(int j = 0 ; j < size - k - 1;j++){

                            if(arr[j] > arr[j + 1]){

                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                    }
            }

            for(int l = 0 ; l < size; l++){
                    System.out.println(arr[l]);
            }
            if(size % 2 == 1){
                int p = size/2;
                double q = arr[p];
                return q;
            }else{

                int x = size/ 2;
                double  y = (double)(arr[x] + arr[x - 1]) / 2;
                return y;
            }
    }
}
