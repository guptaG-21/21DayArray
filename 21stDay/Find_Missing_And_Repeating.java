link->https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions




int[] findTwoElement(int arr[], int n) {
        // code here
       int repeating = 0, missing = 0;

    for (int i = 0; i < n; i++) {
        int index = Math.abs(arr[i]) - 1;
        if (arr[index] > 0) {
            arr[index] = -arr[index];
        } else {
            repeating = Math.abs(arr[i]);
        }
    }

    for (int i = 0; i < n; i++) {
        if (arr[i] > 0) {
            missing = i + 1;
            break;
        }
    }

    return new int[]{repeating, missing};
    }