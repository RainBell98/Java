import java.util.Arrays;

public class javaPrac2 {
    public static int[] res2(int[] arr,int target){
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums2 = {3,2,9,3,6,8,5};
        int target2 = 17;
        int[] result2 = res2(nums2,target2);
        System.out.println("["+result2[0]+", "+result2[1]+"]");
    }
}
