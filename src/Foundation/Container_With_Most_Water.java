package Foundation;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
//        int n = height.length;
//        int h1 = height[0];
//        int h2 = height[n-1];
//
//        for(int i = 0 ; i <= n ; i++){
//            if(height[i] < height[i+1]){
//                h1 = height[i+1];
//            }
//        }
//
//        for(int j = n-1 ; j <= 0; j-- ){
//            if(height[j] < height [j-1]){
//                h2 = height[j-1];
//            }
//        }
//

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right){
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width ;
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Container_With_Most_Water C1 = new Container_With_Most_Water();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(C1.maxArea(height));
    }
}
