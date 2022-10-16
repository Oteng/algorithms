package javasort;

import java.util.Arrays;

class InsertionSort{
    public static void main(String[] args){

        int arr[] = {5,2,4,6,1,3};

        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }

        System.out.println(Arrays.toString(arr));
    }
}
