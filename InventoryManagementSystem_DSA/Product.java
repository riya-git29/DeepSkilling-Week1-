class Main {
    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(
                new Product(101, "Laptop", 20, 55000));

        manager.addProduct(
                new Product(102, "Mouse", 50, 500));

        System.out.println("Inventory:");
        manager.displayProducts();

        manager.updateProduct(
                101,
                "Gaming Laptop",
                15,
                65000);

        System.out.println("\nAfter Update:");
        manager.displayProducts();

        manager.deleteProduct(102);

        System.out.println("\nAfter Delete:");
        manager.displayProducts();
    }
}