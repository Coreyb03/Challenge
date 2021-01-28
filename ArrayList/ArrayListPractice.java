import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListPractice {
    public static void main(String[] args) {
        System.out.println("Combined sorted list: " + FruitVegSort());
        System.out.println("Shared list: " + fruitVegSharedList());
        System.out.println("Fixed animal list: " + animalDuplicateRemoval());
        System.out.println("Sorted int list: " + addIntegerSort());  
        System.out.println("Reversed list: " + reverseIntegerList());      
        System.out.println("Points list: " + Points.createPoints());      
        System.out.println("Midpoint list: " + Points.midpoints());
        System.out.println("Sorted list by proximity to origin: " + Points.originSort());

    }

    public static ArrayList<String> FruitVegSort() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> fruitList = new ArrayList<String>();
        ArrayList<String> vegList = new ArrayList<String>();
        String[] fruits = {"Apple","Watermelon","Banana","Jackfruit","Tomato","Squash","Pear","Peach","Blueberry"};
        String[] vegs = {"Carrot","Squash","Cumcumber","Garlic","Beet","Tomato","Celery","Onion","Corn","Lettuce"};
        for(String fruit: fruits){
            fruitList.add(fruit);
        }
        for(String veg: vegs){
            vegList.add(veg);
        }

        list.addAll(fruitList);
        list.addAll(vegList);

        for(int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static ArrayList<String> fruitVegSharedList(){
        ArrayList<String> sharedList = new ArrayList<String>();
        ArrayList<String> fruitList = new ArrayList<String>();
        ArrayList<String> vegList = new ArrayList<String>();
        String[] fruits = {"Apple","Watermelon","Banana","Jackfruit","Tomato","Squash","Pear","Peach","Blueberry"};
        String[] vegs = {"Carrot","Squash","Cumcumber","Garlic","Beet","Tomato","Celery","Onion","Corn","Lettuce"};
        for (String fruit: fruits){
            fruitList.add(fruit);
        }
        for (String veg: vegs){
            vegList.add(veg);
        }

        for(String fruit: fruitList){
            if (vegList.contains(fruit)){
                sharedList.add(fruit);
            }
        }

        return sharedList;

    }

    public static ArrayList<String> animalDuplicateRemoval(){
        String[] animals = {"Bear","Dog","Cat","Dog","Lion","Rat","Duck","Fox","Duck","Snake","Bear"};
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.addAll(Arrays.asList(animals));
        for (int i = 0; i < animalList.size(); i++){
            if (animalList.indexOf(animalList.get(i)) != animalList.lastIndexOf(animalList.get(i))){
                animalList.remove(animalList.get(i));
            }
        }
        return animalList;
    }

    public static ArrayList<Integer> addIntegerSort(){
        Integer[] sortedArray = {0,1,2,3,4,5,7,8,9,10};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(sortedArray));
        
        list.add(6);
        for (int i = 1; i < list.size(); i++) { 
            int temp = list.get(i); 
            int j = i - 1; 
            while (j >= 0 && list.get(j) > temp) { 
                list.set(j + 1,list.get(j)); 
                j = j - 1; 
            } 
            list.set(j + 1,temp); 
        } 

        return list;
    }

    public static ArrayList<Integer> reverseIntegerList(){
        Integer[] sortedArray = {1,2,4,8,16,32,64,128,256,512,1024,2048};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(sortedArray));
    
        for (int i = 0; i < list.size()/2; i++) { 
            int temp = list.get(i);

            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-1-i, temp);
        } 

        return list;
    }
}