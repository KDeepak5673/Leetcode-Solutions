class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int[] i : image){
            for(int j = 0 ; j < (image[0].length+1)/2 ; j++){

                int temp = i[j] ^ 1;
                i[j] = i[image[0].length -j -1] ^ 1;
                i[image[0].length -j -1] = temp; 
            }
        }

        return image;
        
    }
}