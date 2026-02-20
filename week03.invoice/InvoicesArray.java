package week03.invoice;

import week03.invoice.TestInvoice;
import java.util.Scanner;
import java.util.ArrayList;

public class InvoicesArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Invoice> invoices = new ArrayList<>();

        System.out.println("=== Invoice Calculator ===");

        char choice;
        do {
            System.out.println("\n--- New Invoice ---");

            System.out.print("Enter part number: ");
            String partNumber = scanner.nextLine();

            System.out.print("Enter part description: ");
            String partDescription = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter price per item: $");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            // Create and add Invoice object
            Invoice invoice = new Invoice(partNumber, partDescription, quantity, price);
            invoices.add(invoice);

            System.out.print("\nDo you want to add another invoice? (y/n): ");
            choice = scanner.nextLine().toLowerCase().charAt(0);

        } while (choice == 'y');

        // Display all invoices
        displayInvoices(invoices);

        scanner.close();
    }

    public static void displayInvoices(ArrayList<Invoice> invoices) {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("INVOICE DETAILS");
        System.out.println("=".repeat(80));

        System.out.printf("%-5s %-15s %-30s %-10s %-12s %-12s%n",
                "No.", "Part Number", "Description", "Quantity", "Price", "Amount");
        System.out.println("-".repeat(80));

        double totalAmount = 0;

        for (int i = 0; i < invoices.size(); i++) {
            Invoice inv = invoices.get(i);
            double amount = inv.getInvoiceAmount();
            totalAmount += amount;

            System.out.printf("%-5d %-15s %-30s %-10d $%-11.2f $%-11.2f%n",
                    (i + 1),
                    inv.getPartNumber(),
                    truncateString(inv.getPartDescription(), 30),
                    inv.getQuantity(),
                    inv.getPricePerItem(),
                    amount);
        }

        System.out.println("-".repeat(80));
        System.out.printf("%-62s $%-11.2f%n", "TOTAL AMOUNT:", totalAmount);
        System.out.println("=".repeat(80));
    }

    private static String truncateString(String str, int maxLength) {
        if (str == null) {
            return "";
        }
        if (str.length() <= maxLength) {
            return str;
        }
        return str.substring(0, maxLength - 3) + "...";
    }
}