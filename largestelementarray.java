public class LargestArrayElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 35};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        System.out.println("Largest element is: " + max);
    }
}
