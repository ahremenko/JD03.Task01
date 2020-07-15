package by.htp.ahremenko.task01;

import java.util.List;

/*
1.4 Объединение списков
Задача - написать функцию, которая принимает два отсортированных от меньшего к большему списка целочисленных
значений (ArrayList). Списки могут быть разных размеров. В результате выполнения функции в первом списке
должны содержаться элементы обоих списков, также отсортированных от меньшего к большему.
Второй же список должен остаться неизменным.

Пример:
Первый список: [1, 3, 5], второй список: [2, 6, 8].
Результат:
Первый список: [1, 2, 3, 5, 6, 8], второй список: [2, 6, 8]
Сложность алгоритма должна быть O(n).
Также желательно реализовать второй вариант задачи, если количество списков может быть любым, а не только два.
 */

public class UnitedList {

    public static void perform( List<List<Integer>> allLists) {
        for (int i = 1; i < allLists.size(); i++) {
            uniteTwoSortedLists(allLists.get(0),allLists.get(i));
        }
    }

    public static void uniteTwoSortedLists(List<Integer> l1, List<Integer> l2) {
        int indexL1 = 0;  // указатель на индекс в первом массиве, куда будем вставлять элементы второго массива
        for (int i = 0; i < l2.size(); i++) {
            while (indexL1 < l1.size() && l1.get(indexL1) < l2.get(i))
                indexL1++;
            if (indexL1 >= l1.size())
                l1.add(l2.get(i));
            else
                l1.add(indexL1, l2.get(i));
        }
    }
}
