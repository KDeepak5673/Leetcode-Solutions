class Solution {
    public int findDuplicate(int[] arr) {

        int i = 0;

        while(i < arr.length){

            int correct = arr[i] -1 ;
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                return arr[j];
            }
        }
        return arr.length;
        
    }

    void swap(int[] arr, int first , int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}