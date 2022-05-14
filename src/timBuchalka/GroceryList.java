package timBuchalka;

import java.util.ArrayList;

public class GroceryList {

    public static void main(String[] args) {
        addItems("eggs");
        printGroceryList();
    }
    private static ArrayList <String> groceryList = new ArrayList<String>();

    public static void addItems(String item){
        groceryList.add(item);
    }

    public static void printGroceryList(){
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("The item in " +(i+1)+ " is " +groceryList.get(i));
        }
    }
}
