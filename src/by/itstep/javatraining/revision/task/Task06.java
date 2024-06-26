
package by.itstep.javatraining.revision.task;

/*	Task 06. Rectangular World 3 [прямоугольный мир]
 *
 *	В прямоугольном мире есть свинья, которая раскормлена до размеров ПАРАЛЛЕЛЕПИПЕДА
 *  с габаритами X, Y, Z.
 *	Определите, можно ли ПОХИТИТЬ данную свинью, разместив её в прямоугольном багажнике фургона
 *  c размерами A, B, C.
 *
 *	Предварительные условия:
 *	1)	размеры габаритов свиньи и багажника фургона - числа натуральные и могут вводится в любом порядке;
 *	2)	стенки багажника фургона имеют нулевую толщину;
 *	3)	свинья не может "выглядывать" из фургона, она должна помещаться в нём полностью - это же ПОХИЩЕНИЕ!
 *	4)	чтобы попытаться вместить свинью в багажник, её можно поворачивать на 90 градусов во все стороны;
 *	5)	объёмы свиньи и багажника фургона не могут служить надёжным критерием для их сравнения!
 *  6)  не забудьте про "защиту от дурака": если данные некорректны, то нужно возвратить false.
 *
 *	Формат входных данных [input]
 *	На вход метод получает шесть целых чисел типа int: X, Y, Z (габариты свиньи)
 *  и A, B, C (габариты багажника фургона).
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить результат в виде булевского типа данных согласно условию задачи.
 *
 *	[ input 1]: 4 6 5 6 5 6
 *	[output 1]: true
 *
 *	[ input 2]: 3 5 5 2 3 4
 *	[output 2]: false
 *
 *	[ input 3]: 0 5 5 2 3 4
 *	[output 3]: false
 *
 *	[ input 4]: 3 -5 5 2 3 4
 *	[output 4]: false
 */

public class Task06 {
    public static boolean start(int x, int y, int z, int a, int b, int c) {
        if (x < 1 || y < 1 || z < 1 || a < 1 || b < 1 || c < 1) {
            return false;
        }

        int pigMaxSize = x > y ? x : y;
        pigMaxSize = pigMaxSize > z ? pigMaxSize : z;
        int pigMinSize = x < y ? x : y;
        pigMinSize = pigMinSize < z ? pigMinSize : z;
        int pigMidSize = x + y + z - pigMaxSize - pigMinSize;

        int carMaxSize = a > b ? a : b;
        carMaxSize = carMaxSize > c ? carMaxSize : c;
        int carMinSize = a < b ? a : b;
        carMinSize = carMinSize < c ? carMinSize : c;
        int carMidSize = a + b + c - carMaxSize - carMinSize;

        return pigMinSize <= carMinSize && pigMidSize <= carMidSize && pigMaxSize <= carMaxSize;
    }
}