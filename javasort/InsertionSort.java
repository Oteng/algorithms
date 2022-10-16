package javasort;

import java.util.Arrays;

class InsertionSort{
    public static void main(String[] args){

        int arr[] = {5,2,10,4,6,1,3};

        System.out.println("Sort array in asscending order: " + Arrays.toString(insertionSortASC(arr)));
        System.out.println("Sort array in descending order: " +Arrays.toString(insertionSortDESC(arr)));
        System.out.println("Sort array in asscending order: " +Arrays.toString(insertionSort(arr, true)));
        System.out.println("Sort array in descending order: " +Arrays.toString(insertionSort(arr, false)));
    }

    /* Sort array in ascending order */
    public static int[] insertionSortASC(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
        return arr;
    }

    /* Sort array in descending order */
    public static int[] insertionSortDESC(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] < value){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
        return arr;
    }

    /* On function to rull them all */
    public static int[] insertionSort(int[] arr, boolean direction){
        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && ((arr[j] > value) == direction)){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
        return arr;
    }
}
