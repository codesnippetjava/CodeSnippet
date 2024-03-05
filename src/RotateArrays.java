public class RotateArrays {
    static void rotateUsingTemp(int arr[], int d, int n)
    {
        // Storing rotated version of array
        int temp[] = new int[n];

        // Keeping track of the current index
        // of temp[]
        int k = 0;

        // Storing the n - d elements of
        // array arr[] to the front of temp[]
        //1, 2, [3, 4, 5, 6, 7]
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        // Storing the first d elements of array arr[]
        // into temp
        // 3, 4, 5, 6, 7, [1, 2]
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }


        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
    public static void rotateOneByOne(int arr[], int d, int n)
    {
        int p = 1;
        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }
        // 1, 2, 3, 4, 5, 6, 7
        // last = 1
        //2, 3, 4, 5, 6, 7, 1
        //last = 2
        //3, 4, 5, 6, 7, 1, 2
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        // Rotate 2 times
        int d = 2;
        // 3, 4, 5, 6, 7, 1, 2
        // Function call
        //rotateUsingTemp(arr, d, N);
        rotateOneByOne(arr, d, N);
    }
}
