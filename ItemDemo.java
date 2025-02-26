class Item {
    static int objectCount = 0;
    // Add a Static Variable to track object count
    String itemName;
    // Add an Instance Variable for item name

    // Create a Constructor
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    // Increment the static object Count when a new item is created
    }

    // Add a static method to display total objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // Add an Instance Method to display item name
    public void displayItem() {
        System.out.println("Item: " + itemName); 
    }
}

    public class ItemDemo {
    public static void main(String[] args) {
        // Create Item Objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // displaying item details
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // display the total objects creayed using the static method
        Item.displayObjectCount();
    }
}
