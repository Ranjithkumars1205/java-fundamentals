package String_immutable.Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTo {
    public static void main(String[] args) {
        List<String> marvelHeroes = new ArrayList<>();
        marvelHeroes.add("SpiderMan ");
        marvelHeroes.add("Wolverine ");
        marvelHeroes.add("Xavier ");
        marvelHeroes.add("Cyclops ");

        Collections.sort(marvelHeroes, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(marvelHeroes, (m1, m2) -> m1.compareTo(m2));

        Collections.sort(marvelHeroes, Comparator.naturalOrder());

        marvelHeroes.forEach((m) -> System.out.println(m));
    }

}
