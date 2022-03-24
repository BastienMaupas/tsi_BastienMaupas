package lv.tsi.lamda;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Ex4 {
    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();
        elements.add("a1");
        elements.add("c3");
        elements.add("a2");
        elements.add("a3");
        elements.add("b3");
        elements.add("b2");
        elements.add("c1");
        elements.add("c2");
        elements.add("b1");


        for (int i = 0; i < elements.size(); i++) {
            String newValue = elements.get(i).toUpperCase(Locale.ROOT);
            elements.set(i, newValue);
        }
        Collections.sort(elements);
        for (String element : elements) {
            if (element.startsWith("C")) {

                System.out.println(element);
            }
        }


            }

}