package by.htp.ahremenko.task01;

import java.util.ArrayList;
import java.util.List;

/*
1.2 Клерк
Выходит премьера фильма “Мстители”. Множество людей стоят в очереди в кассу для покупки билетов. Каждый из покупателей может иметь в кармане следующие купюры: 100$, 50$ или 25$. Сам же билет стоит ровно 25$.
Вася работает клерком в кинотеатре и продает каждому покупателю по очереди ровно один билет на фильм “Мстители”.
Может ли Вася продать билет каждому покупателю и дать ему сдачу, если изначально у него нет денег в кассе? Принимать во внимание, что билеты продаются строго по очереди.
Задача - написать функцию, которая принимает список покупателей, у которых есть в кармане ровно одна из трех возможных купюр, клерка и возвращает true - если клерк Вася может всем выдать сдачу и продать билет, false - иначе.
Пример:
25$, 25$, 50$ - true
25$, 100$ - false
 */
public class Clerk {

    /**
     * 1.2 Клерк -
     * @param list - list of banknotes of client in line
     * @return check if cashier can sell ticket
     */
    public static boolean canBeChanged(List<Integer> list) {
        List<Integer> moneyInCash = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0)
                moneyInCash.add(list.get(i-1));
            if (!isEnough(moneyInCash,list.get(i)))
                return false;
        }
        return true;
    }

    /**
     * check if enough banknotes in cash
     * @param moneyInCash - all current banknotes in cash
     * @param banknote - money from client
     * @return
     */
    public static boolean isEnough(List<Integer> moneyInCash, Integer banknote) {
        if ( banknote == 25 )
            return true;
        else if ( banknote == 50 && moneyInCash.contains(25)) {
            moneyInCash.remove(moneyInCash.indexOf(25));
            return true;
        }
        else if ( banknote == 100 && moneyInCash.contains(25) && moneyInCash.contains(50)) {
            moneyInCash.remove(moneyInCash.indexOf(25));
            moneyInCash.remove(moneyInCash.indexOf(50));
            return true;
        }
        return false;
    }
}
