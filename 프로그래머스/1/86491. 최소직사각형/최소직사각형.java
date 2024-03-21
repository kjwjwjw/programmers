class Solution {
    public int solution(int[][] sizes) {
       for(int i = 0; i < sizes.length; i++) {
            int temp = 0;
            if(sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
           
        }
    }
        int width_max = 0;
        int height_max = 0;

        for(int i = 0; i < sizes.length; i++) {
            if(width_max < sizes[i][0]) 
                width_max = sizes[i][0];

            if(height_max < sizes[i][1]) 
                height_max = sizes[i][1];
        }
            
            return height_max * width_max;
    
}
}