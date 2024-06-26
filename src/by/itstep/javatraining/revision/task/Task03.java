package by.itstep.javatraining.revision.task;

/*	Task 03. Digital Watch [электронные часы]
 *
 *	Электронные часы показывают время в формате h:mm:ss (от 0:00:00 до 23:59:59),
 *	т.е. сначала записывается количество часов, потом обязательно ДВУЗНАЧНОЕ количество минут,
 *	затем обязательно ДВУЗНАЧНОЕ количество секунд. Количество минут и секунд при необходимости
 *  дополняются до двузначного числа нулями.
 *	С начала суток прошло N секунд. Выведите в виде строки, что покажут электронные часы.
 *
 *  Примечание
 *  1) Не забудьте про "защиту от дурака": если данные некорректны, то нужно возвратить "error".
 *  2) Необходимо учесть, что с начало суток может пройти несколько дней.
 *  3) Данную задачу можно решить, используя только встроенные операции языка.
 *
 *	Формат входных данных [input]
 *	На вход метод получает целое число в диапазоне типа int.
 *
 *	Формат выходных данных
 *	Метод должен возвратить ответ на задачу в виде строки.
 *
 *	[ input 1]: 0
 *	[output 1]: 0:00:00
 *
 *	[ input 2]: 3602
 *	[output 2]: 1:00:02
 *
 *	[ input 3]: 86399
 *	[output 3]: 23:59:59
 *
 *	[ input 4]: 129700
 *	[output 4]: 12:01:40
 *
 *	[ input 5]: -1
 *	[output 5]: error
 */

public class Task03 {
    public static String start(int number) {
        if (number < 0) {
            return "error";
        }

        int dayAmount = number / 86400;
        number = number - dayAmount * 86400;
        int hours = number / 3600;
        number = (number - hours * 3600);
        int minutes = number / 60;
        int seconds = number - minutes * 60;

        return String.format("%d:%02d:%02d", hours, minutes, seconds);

    }
}