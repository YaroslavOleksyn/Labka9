/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labka9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Головний клас для виконання програми.
 * @author Admin
 */
public class Labka9 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordsList = new ArrayList<>(); // Створюємо новий масив з словами.

        System.out.println("Введіть слова, для завершення stop:");
        String word;
        while (true) // Робимо безкінечний цикл для вводу слів.
        {
            word = scanner.nextLine(); 
            if (word.equals("stop")) // Перевіряємо умови для коректної роботи програми
            {
                if (!wordsList.isEmpty()) 
                {
                    break;
                } 
                else 
                {
                    System.out.println("Список порожній. Введіть слова.");
                }
            } 
            else
            {
                wordsList.add(word);
            }
        }
        Collections.sort(wordsList); // Сортуємо всі слова які маємо.
        System.out.println("Відсортовані слова:");
        for (int i = 0; i < wordsList.size(); i++) 
        {
            System.out.print(wordsList.get(i) + " "); // Виводимо всі слова.
        }
    }
}
