public class greatestAndSmallestInt {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int[] findMinMax(int[] arr) {
                int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    }
public static void main(String[] args) {
    if (args.length > 0) {
        int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        System.out.println("command line input: ");
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));
        int[] minMax = findMinMax(arr);
        System.out.println("Minimum and Maximum together. Min: " + minMax[0] + ", Max = " + minMax[1]);
    }
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter the size of the array: ");
    int n = sc.nextInt();
    int[] arr2 = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
        arr2[i] = sc.nextInt();
    }
    System.out.println("user input: ");
    System.out.println("Minimum: " + findMin(arr2));
    System.out.println("Maximum: " + findMax(arr2));
    int[] minMax2 = findMinMax(arr2);
    System.out.println("Minimum and Maximum together. Min: " + minMax2[0] + ", Max = " + minMax2[1]);
    sc.close();
}
}