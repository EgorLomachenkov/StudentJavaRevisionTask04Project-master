package by.itstep.javatraining.revision.task;

/*	Task 07. Boxes [коробки]
 *
 *	Есть две коробки, первая размером A1, B1, C1, вторая размером A2, B2, C2.
 *	Определите, можно ли разместить одну из этих коробок внутри другой, при условии,
 *	что поворачивать коробки можно только на 90 градусов вокруг рёбер.
 *
 *	Предварительные условия:
 *	1)	стенки коробок имеют нулевую толщину;
 *	2)	одна коробка не может "выглядывать" из другой, она должна помещаться в ней полностью,
 *		однако признак вложенности допускает равенство одного или двух соответствующих сторон
 *		коробок (но не всех трёх одновременно, потому что тогда коробки будут считаться
 *		одинаковыми);
 *	3)	объёмы коробок не могут служить надёжным критерием для их сравнения;
 *	4)	не забудьте про "защиту от дурака": все величины должны быть больше нуля.
 *
 *	Формат входных данных
 *	Метод получает на вход шесть целых чисел типа int.
 *
 *	Формат выходных данных
 *	Метод должен возвратить одну из следующих строк:
 *  1) "Error." - если размеры коробок некорректны.
 *  2) "Boxes are equal." - если коробки одинаковые,
 *	3) "The first box is smaller than the second one." - если первая коробка может быть положена во вторую,
 *	4) "The first box is larger than the second one." - если вторая коробка может быть положена в первую,
 *	5) "Boxes are incomparable." - во всех остальных случаях.
 *
 *	[ input 1]: 1 2 3 3 2 1
 *	[output 1]: Boxes are equal.
 *
 *	[ input 2]: 2 2 3 3 2 1
 *	[output 2]: The first box is larger than the second one.
 *
 *	[ input 3]: 3 2 1 2 2 3
 *	[output 3]: The first box is smaller than the second one.
 *
 *	[ input 4]: 3 11 5 4 7 9
 *	[output 4]: Boxes are incomparable.
 *
 *	[ input 5]: 0 11 5 4 7 9
 *	[output 5]: Error.
 *
 *	[ input 6]: 3 -11 5 4 7 9
 *	[output 6]: Error.
 */

public class Task07 {
    public static String start(int a1, int b1, int c1, int a2, int b2, int c2) {
        if (a1 < 1 || b1 < 1 || c1 < 1 || a2 < 1 || b2 < 1 || c2 < 1) {
            return "Error.";
        }

        int firstBoxMaxSize = a1 > b1 ? a1 : b1;
        firstBoxMaxSize = firstBoxMaxSize > c1 ? firstBoxMaxSize : c1;
        int firstBoxMinSize = a1 < b1 ? a1 : b1;
        firstBoxMinSize = firstBoxMinSize < c1 ? firstBoxMinSize : c1;
        int firstBoxMidSize = a1 + b1 + c1 - firstBoxMaxSize - firstBoxMinSize;

        int secondBoxMaxSize = a2 > b2 ? a2 : b2;
        secondBoxMaxSize = secondBoxMaxSize > c2 ? secondBoxMaxSize : c2;
        int secondBoxMinSize = a2 < b2 ? a2 : b2;
        secondBoxMinSize = secondBoxMinSize < c2 ? secondBoxMinSize : c2;
        int secondBoxMidSize = a2 + b2 + c2
                - secondBoxMaxSize - secondBoxMinSize;

        String result = "Boxes are incomparable.";

        if (firstBoxMinSize == secondBoxMinSize
                && firstBoxMidSize == secondBoxMidSize
                && firstBoxMaxSize == secondBoxMaxSize) {
            result = "Boxes are equal.";
        } else if (firstBoxMinSize <= secondBoxMinSize
                && firstBoxMidSize <= secondBoxMidSize
                && firstBoxMaxSize <= secondBoxMaxSize) {
            result = "The first box is smaller than the second one.";
        } else if (firstBoxMinSize >= secondBoxMinSize
                && firstBoxMidSize >= secondBoxMidSize
                && firstBoxMaxSize >= secondBoxMaxSize) {
            result = "The first box is larger than the second one.";
        }

        return result;
    }
}