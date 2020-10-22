package Lesson3HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class GueesWorld {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        int randomWord = (int) (Math.random() * words.length + 1) -1 ;
        System.out.println("Игра угадай слово");


        String hiddenWord = words[randomWord];



            while (true){

                System.out.println("Введите загаданное слово");
                System.out.println();
                String answer = reader.readLine();
                if (hiddenWord.equals(answer)){
                    System.out.println("Поздравляю Вы угадали слово");
                    break;
                }
                String curtain = "###############";
                char [] curtainArray = curtain.toCharArray();
                char [] hiddenWordArray = hiddenWord.toCharArray();
                char [] answerArray = answer.toCharArray();
                System.out.println(Arrays.toString(hiddenWordArray)); // выводит загаданное слово для
                for (int i = 0; i < answerArray.length && i < hiddenWordArray.length; i++) {
                    if (hiddenWordArray[i] == answerArray[i]){
                        curtainArray[i] = answerArray[i];

                    }
                }
                System.out.println("Вы не угадали слово целиком");
                for (char element : curtainArray){
                    System.out.print(element);
                }
                System.out.println();

            }
    }


}


