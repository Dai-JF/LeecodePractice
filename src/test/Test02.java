package test;

/**
 * description:将数字变成0的操作次数
 *
 * @author DaiJF
 * @date 2023/4/8 - 14:15
 */
public class Test02 {
    public int numberOfSteps(int num) {
        int step = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num--;
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        System.out.println(test02.numberOfSteps(14));

    }
}
