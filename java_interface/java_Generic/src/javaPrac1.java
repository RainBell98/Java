

public class javaPrac1 {
    public static int res(int[] arr, int num) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<num) {
                ans += arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,8,3,7};
        System.out.println(res(nums,5));
    }



}
