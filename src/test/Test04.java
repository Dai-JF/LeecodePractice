package test;

import java.util.ArrayList;
import java.util.List;

/**
 * description:Fizz Buzz
 *
 * @author DaiJF
 * @date 2023/4/8 - 17:00
 */
public class Test04 {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) list.add("FizzBuzz");
            else if (i % 3 == 0) list.add("Fizz");
            else if (i % 5 == 0) list.add("Buzz");
            else list.add(Integer.toString(i));
        }
        return list;
    }

    public static void main(String[] args) {
        Test04 test04 = new Test04();
        System.out.println(test04.fizzBuzz(15));
    }
}
