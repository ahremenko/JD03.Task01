package by.htp.ahremenko.task01;

import java.util.LinkedList;
import java.util.List;

/*
  класс, хранящий в себе "очередь" из покупателей с указанным числом покупок
 */
public class Line {
    private LinkedList<Integer> line = new LinkedList<Integer>();

    public Line(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            this.line.add(l.get(i));
        }
    }

    public synchronized Integer getNextClient() {
        return this.line.pollFirst();
    }
}
