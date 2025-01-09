import java.util.Vector;

/**
 * Q1389_CreateTargetArrayInTheGivenOrder
 */
public class Q1389_CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Vector<Integer> nums  = new Vector<>();
        Vector<Integer> index = new Vector<>();
        // 0,1,2,3,4
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        index.add(0);
        index.add(1);
        index.add(2);
        index.add(2);
        index.add(1);
//  check(nums);
 createtargetArray(nums, index);
    }

    public static void createtargetArray(Vector<Integer>nums , Vector<Integer>index){
        Vector<Integer> temp = new Vector<>();
        for(int i=0;i<nums.size();i++){
            temp.insertElementAt(nums.get(i), index.get(i));
            System.out.println(temp);
        }
        System.out.println("final : "+temp);
    }

    public static void check(Vector<Integer>nums){
        nums.insertElementAt(5,2);
        System.out.println(nums);
    }

    
}