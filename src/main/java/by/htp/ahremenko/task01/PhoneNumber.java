package by.htp.ahremenko.task01;

import java.util.Formatter;

public class PhoneNumber {

    /**
     * 1.1 Телефонный номер -
     * @param n1, n2, n3, n4, n5, n6, n7, n8, n9, n10 - phone numbers
     * @return String like (123) 456-7890
     */
    public static String getPhoneNumber1(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        Formatter f = new Formatter();
        f.format("(%s%s%s) %s%s%s-%s%s%s%s",n1,n2,n3,n4,n5,n6,n7,n8,n9,n10);
        return f.toString();
    }

    /**
     * 1.1 Телефонный номер - с использованием рег. выражений
     * @param n1, n2, n3, n4, n5, n6, n7, n8, n9, n10 - phone numbers
     * @return String like (123) 456-7890
     */
    public static String getPhoneNumber2(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        String s = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
        s = s.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
        return s;
    }
}
