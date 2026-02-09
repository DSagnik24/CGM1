public class ProdOfElements {
    public static int[] product(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int rP = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= rP;
            rP *= nums[i];
        }

        return res;
    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        
        System.out.println("Input: ");
        printArray(input);
        
        int[] output2 = product(input);
        System.out.println("Output: ");
        printArray(output2);
    }
}
