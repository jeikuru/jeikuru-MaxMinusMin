
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int max = nums.get(0);
        int min = nums.get(0);

        for (int i = 0; i < nums.size() - 1; i ++){
            if (max < nums.get(i+1) ) {
                max = nums.get(i+1);
            }
            if (min > nums.get(i+1) ) {
                min = nums.get(i+1);
            }
        
            
        }
        
        return max - min;
    }
}
