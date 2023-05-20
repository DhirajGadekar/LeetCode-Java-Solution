class Solution {
    public int[] leftRigthDifference(int[] nums) {
         int sum1 = 0,sum2 = 0;
                int size = nums.length;

                int[] arrLeft = new int[size];
                int[] arrRight = new int[size];
                int[] arr1 = new int[size];

                arrLeft[0] = sum1;
                arrRight[0] = sum2;

                int point = nums.length;
                for(int i = 1; i < nums.length;i++){

                        sum1 = sum1 + nums[i - 1];
                        arrLeft[i] = sum1;

                        sum2 = sum2 + nums[point - i];
                        arrRight[i] = sum2;
                }

               for(int i = 0 ; i < nums.length;i++){

                       int num = arrLeft[i] - arrRight[nums.length - i - 1];
                       if(num < 0){

                               int mult = num * (-2);
                               num = mult + num;
                               arr1[i] = num;
                       }else{
                                arr1[i] = num;
                       }
               }
               return arr1;
    }
}
