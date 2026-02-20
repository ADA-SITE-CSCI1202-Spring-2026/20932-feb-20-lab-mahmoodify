package week03.invoice;

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    public Invoice (String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    } //constructor, helps  assign the parameter value to the instance variable.
    public String getPartNumber() {
    return partNumber;
    } //getter, allows controlled access to private variables
    public String getPartDescription() {
        return partDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    } //setter, allows controlled modification of private variables

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        if (quantity < 0) {
            quantity = 0; 
        }
        if (pricePerItem < 0) {
            pricePerItem = 0.0;
        }
        return quantity * pricePerItem;
    } //calculates the total amount for the invoice, ensuring that negative values are handled appropriately.
}
public class TestInvoice {
    public static void main(String[] args) {
        Invoice inv = new Invoice("1234", "Hammer", 10, 15.50);

        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price per item: " + inv.getPricePerItem());
        System.out.println("Total Invoice Amount: " + inv.getInvoiceAmount());
    }
}
