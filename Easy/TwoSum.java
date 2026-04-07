class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {

        int len = nums.length;
        // iterate i 
        for(int i=0;i<len;i++)
        {
            // iterate j + 1 
            for(int j=i+1; j<len;j++)
            {

                // check for the number on those particular indexes
                // check if they add up to match the target

                if(nums[i]+nums[j]==target)
                {
                    // Return the indices when a pair is found with a new array
                    return new int[]{i,j};
                }
            }
        }

        // if target not matched 
        return new int[]{};
    }

    // main method
    public static void main(String[] args){

        // array
        int[] nums = {2,7,11,15};

        // target
        int target=9;

        // obj create
        TwoSum obj = new TwoSum();

        // calling and storing
        int[] res = obj.twoSum(nums,target);

        // printing the output
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }

}