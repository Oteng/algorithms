function insertionSort(arr) {
    for (var i = 1; i < arr.length; i++) {
        var value = arr[i];
        var j = i - 1;
        while (j >= 0 && arr[j] > value) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = value;
    }
    return arr;
}
//test
console.log(insertionSort([5, 2, 4, 6, 1, 3]));
