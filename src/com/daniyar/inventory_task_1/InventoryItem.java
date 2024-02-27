package com.daniyar.inventory_task_1;

import java.util.HashMap;
import java.util.Map;

//1. Реализуй программу для учета инвентаря в магазине. Создай класс InventoryItem
// с полями name и quantity. Используй HashMap, чтобы хранить объекты InventoryItem,
// где ключом будет являться название предмета, а значением - количество на складе.
// Напиши методы для добавления предметов, увеличения/уменьшения количества предметов
// и проверки доступности определенного предмета.
public class InventoryItem {
    private String name; // ???
    private int quantity; // ???
    private Map<String, Integer> map;


    public InventoryItem() {
        map = new HashMap<>();
    }

    public void availableItem(String name){
        boolean bool = isItemAvailable(name);
        System.out.println(bool ? "The " + name + " is available." : "The " + name + " is NOT available.");
    }
    public boolean isItemAvailable(String name){
        if (map.containsKey(name)){
            return map.containsKey(name);
        }
        return false;
    }
    public void addItem(String name, int quantity){
        if (!map.containsKey(name)) {
            map.put(name, quantity);
        }else{
            map.put(name, map.get(name) + quantity);
        }
    }

    public void removeItem(String name, int quantity){
        if (map.containsKey(name)){
             map.put(name, map.get(name) - quantity);
        }else{
            System.out.println("The " + name + " is NOT.");
        }
    }
    public void printItems(){
        System.out.println(map);
    }
}
