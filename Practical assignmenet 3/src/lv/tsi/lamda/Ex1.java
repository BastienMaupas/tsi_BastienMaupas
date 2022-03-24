package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
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

        System.out.println(elements.get(0));
    }

}
