//        ДЗ 9. Угадай число
//
//        Сделать игру, в которой нужно отгадать целое число, которое "загадал" компьютер в диапазоне от 0 до 10
//        У пользователя должна быть возможность угадывать в несколько попыток (минимум 3).

import java.util.Scanner;

public class Number {
    public  static void main (String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.print("Привет, начинаем игру! Я загадал число от 1 до 10, попробуй угадай: ");
        int number = game.nextInt();
        int random_number = (int) (Math.random() * 10);
        for (int i = 1; i < 6; i++) {
            if (number < 1 || number > 10) {
                System.out.println("Вниматеьно прочитай правила игры и попробуй еще раз!");
                break;
            } else if (random_number > number) {
                System.out.println("Я загадал число больше твоего, какое число я загадал?: ");
                number = game.nextInt();
            } else if (random_number < number) {
                System.out.println("Я загадал число меньше твоего, какое число я загадал?: ");
                number = game.nextInt();
            } else {
                System.out.println("Отлично, ты угадал это число!: " + random_number);
                break;
            }
        }
    }
}
