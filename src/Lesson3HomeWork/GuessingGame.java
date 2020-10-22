package Lesson3HomeWork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessingGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int randomNumber = (int) (Math.random() * 10);
        guessTheNumber(randomNumber);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»");
        int answer = Integer.parseInt(reader.readLine());

        if (answer == 1) {
            guessTheNumber(randomNumber);
        }


    }

    public static void guessTheNumber(int randomNumber) throws IOException {

        System.out.println("Угадайте число от 0 до 9");
        for (int counter = 1; counter < 4; counter++) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите число: ");
            int number = Integer.parseInt(reader.readLine());
            if (number == randomNumber) {
                System.out.println("Поздравляю Вы угадали число с " + counter + " попытки");
            } else if (number > randomNumber) {
                System.out.println("Загаданное число меньше");
                int remains = 3 - counter;
                if (remains == 2) {
                    System.out.println("Осталось две попытки");

                } else System.out.println("Осталась одна попытка");
            } else {
                System.out.println("Загаданное число больше");
                int remains = 3 - counter;
                if (remains == 2) {
                    System.out.println("Осталось две попытки");

                } else System.out.println("Осталась одна попытка");

            }



            }

        }
    }


