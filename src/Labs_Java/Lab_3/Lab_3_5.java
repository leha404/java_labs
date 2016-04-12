package Labs_Java.Lab_3;

/**
 * Created by Алексей on 03.02.2016.
 * Двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5];
 * Вывод массива; Вывод на экран индекса строки с наибольшим по модулю произведением элементов;
 * Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class Lab_3_5 {
    public static void main(String[] args) {
        int[][] nums = new int[7][4];

        int mod = 0;    //Модуль произведения
        int n = 1;  //Индекс

        for (int i = 0; i < 7; i++) {
            //Модуль произведения, который будет обновлятся на каждой строке и сравниваться с mod
            int mod_i = 1;
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 11) - 5;    //Случайное число [-5;5]
                mod_i *= nums[i][j];    //Обновляем модуль строки
                //Выводим массив с выравнивание по левому краю и учетом знака элемента
                System.out.format("%+-3d ", nums[i][j]);
            }
            //Если модуль текущей строки больше ранее найденой,
            //то обновляем "глобальный" модуль mod
            if (Math.abs(mod_i) > mod) {
                mod = mod_i;
                n = i + 1;  //Самое главное - сохраняем индекс текущей строки
            }
            System.out.println();   //Перевод строки
        }
        System.out.println();   //Перевод строки после массива
        System.out.println("Индекс строки с наибольшим по модулю произведению элементов - " + n);
    }
}