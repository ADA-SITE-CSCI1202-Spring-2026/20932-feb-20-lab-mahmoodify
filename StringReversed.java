public class StringReversed {
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        if (args.length > 0) {
            String input = args[0];
            System.out.println("Command Line Input:");
            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reverseString(input));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String userInput = sc.nextLine();
        System.out.println("User Input:");
        System.out.println("Original: " + userInput);
        System.out.println("Reversed: " + reverseString(userInput));
        sc.close();
    }

}
