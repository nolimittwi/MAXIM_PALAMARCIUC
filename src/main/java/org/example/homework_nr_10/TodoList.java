package org.example.homework_nr_10;

import java.util.*;

public class TodoList {
    public static void main(String[] args) {
        List<String> todayTask =getTodayTasks();
        displayTasks(todayTask);

        System.out.println("----------------------------");

        List<String> values = new ArrayList<>();
        values.add("11");
        values.add("12");
        values.add("13");
        Set<String> uniqueValues = getUniqueValues(values);
        displayValues(uniqueValues);

        System.out.println("----------------------------");

        Map<String, String> EngToRom = createEngRom();
        displayDictionary(EngToRom);

        System.out.println("----------------------------");

        Deque<String> LIFOCollection = new ArrayDeque<>();
        LIFOCollection.push("Element 1");
        LIFOCollection.push("Element 2");
        LIFOCollection.push("Element 3");
        LIFOCollection.push("Element 4");
        LIFOCollection.push("Element 5");
        for (int i=0; i<3; i++){
            String element = LIFOCollection.pop();
            System.out.println("Извлечен элемент" + element);
        }
        String nextElement = LIFOCollection.peek();
        System.out.println("Следующий элемент: " + nextElement);
    }
    public static List<String> getTodayTasks(){
        List<String> tasks = new ArrayList<>();
        tasks.add("1st element");
        tasks.add("2nd element");
        tasks.add("3rd element");
        return tasks;
    }
    public static Set<String> getUniqueValues(List<String> values){
        Set<String> uniqueValues = new HashSet<>(values);
        for (String value : values){
            uniqueValues.add(value);
        }
        return uniqueValues;
    }
    public static void displayValues(Set<String> values){
        System.out.println("Уникальные значения");
        for (String value : values){
            System.out.println(values);
        }
    }
    public static void displayTasks(List<String> task){
        System.out.println("Список дел на сегодня: ");
        for (int i=0; i < task.size(); i++){
            System.out.println((i + 1) + ". " + task.get(i));
        }
    }
    public static Map<String, String> createEngRom(){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello" , "Salut");
        dictionary.put("Goodbye" , "La Revedere");
        dictionary.put("House" , "Casa");
        dictionary.put("Car" , "Masina");
        dictionary.put("Apple" , "Mar");
        dictionary.put("Dog" , "Caine");
        dictionary.put("Cat" , "Pisica");
        dictionary.put("Orange" , "Portocale");
        dictionary.put("Book" , "Carte");
        dictionary.put("Pen" , "Pix");
        return dictionary;
    }
    public static void displayDictionary (Map<String, String> dict){
        System.out.println("English -> Romanian");
        for (Map.Entry<String, String> entry : createEngRom().entrySet()) {
            String englishWord = entry.getKey();
            String romanianTranslation = entry.getValue();
            System.out.println(englishWord + " -> " + romanianTranslation);
        }
    }
}