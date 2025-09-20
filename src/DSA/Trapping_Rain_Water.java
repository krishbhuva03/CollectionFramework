package DSA;
//
//public class Trapping_Rain_Water {
//    public int maxWaterTrapped (@org.jetbrains.annotations.NotNull int[] height) {
//        int maxWater = 0;
//        int left = 0;
//        int right = height.length - 1;
//        int water = 0;
//        for (int i = 0; i <= height.length; i++) {
//            for (int j = i + 1; j <= height.length; j++) {
//                if (height[i] > height[j]) {
//                    maxWater += (height[j] - height[i]);
//                }
//            }
//        }
//        return maxWater;
//    }
//
//    public static void main(String[] args) {
//        Trapping_Rain_Water T1 = new Trapping_Rain_Water();
//        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//        System.out.println(T1.maxWaterTrapped(height));
//    }
//}


public class Trapping_Rain_Water {
    public int maxWaterTrapped(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while (left < right) { // run till pointers doesnt intersect each other
            if (height[left] < height[right]) { // if the value of left index if lesser than right index
                if (height[left] >= leftMax) { // if the value of the left index is greater than the highest value seen so far
                    leftMax = height[left]; // updating the value of leftMax to the higher founded value
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }

        return trappedWater;
    }
        public static void main(String[] args) {
        Trapping_Rain_Water T1 = new Trapping_Rain_Water();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(T1.maxWaterTrapped(height));
    }
}

