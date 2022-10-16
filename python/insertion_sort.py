# Sort in increasing order
def insertion_sort_asc(arr):
    for i in range(1, len(arr)):
        value = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > value:
            arr[j + 1] = arr[j]
            j = j - 1
        arr[j + 1] = value
    return arr

# Sort in decreasing order
def insertion_sort_dec(arr):
    for i in range(1, len(arr)):
        value = arr[i]
        j = i - 1
        while j >= 0 and arr[j] < value:
            arr[j+ 1] = arr[j]
            j = j - 1
        arr[j + 1] = value
    return arr


# combining the two function into one
def insertion_sort(arr, direction='asc'):
    for i in range(1, len(arr)):
        value = arr[i]
        j = i - 1
        while j >= 0 and ((arr[j] > value) == (direction == 'asc')):
            arr[j + 1] = arr[j]
            j = j - 1
        arr[j + 1] = value
    return arr

if __name__ == '__main__':
# Tests
    print('Array sorted in ascending order: ', insertion_sort_asc([5,2,4,6,1,3]))
    print('Array sorted in descending order: ', insertion_sort_dec([5,2,4,6,1,3]))

    print('Array sorted in ascending order: ', insertion_sort([5,2,4,6,1,3]))
    print('Array sorted in ascending order: ', insertion_sort([5,2,4,6,1,3], 'desc'))