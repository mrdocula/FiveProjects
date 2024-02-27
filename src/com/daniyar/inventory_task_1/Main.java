package com.daniyar.inventory_task_1;

public class Main {

    public static void main(String[] args) {

        InventoryItem item = new InventoryItem();

        item.addItem("Shampoo", 25);
        item.addItem("Cucumber", 34);
        item.addItem("Ice cream", 67);
        item.addItem("Bread", 45);
        item.addItem("Cookie", 8);
        item.addItem("Jam", 2);
        item.printItems(); // {Cookie=8, Jam=2, Shampoo=25, Cucumber=34, Ice cream=67, Bread=45}

        item.addItem("Jam", 23);
        item.printItems();// {Cookie=8, Jam=25, Shampoo=25, Cucumber=34, Ice cream=67, Bread=45}

        item.removeItem("Jam", 5);
        item.printItems(); // {Cookie=8, Jam=20, Shampoo=25, Cucumber=34, Ice cream=67, Bread=45}

        item.availableItem("Kola"); // The Kola is NOT available.
        item.availableItem("Bread"); // The Bread is available.


    }
}
