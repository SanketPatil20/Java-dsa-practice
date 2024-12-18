package Arrays;

public class SearchElement {
    private static void check(int[] arr, int toCheckValue)
    {
        // Linear Search
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }

        System.out.println("Is " + toCheckValue
                + " present in the array: " + test);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int ele = 5;

        check(a,ele);
    }
}
