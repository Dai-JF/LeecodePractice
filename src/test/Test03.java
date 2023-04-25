package test;

/**
 * description:最富有客户的资产总量
 *
 * @author DaiJF
 * @date 2023/4/8 - 14:15
 */
public class Test03 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        //先遍历每位客户【i看成每一位顾客，j看成每一位顾客所有的资产】
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            //再遍历客户拥有的资产
            for (int j = 0; j < accounts[i].length; j++) {
                //将该客户在各个银行下资产求和
                sum += accounts[i][j];
            }
            //求得的单个客户资产总量与 目前为止发现的最大值max进行比较，总是将其中的较大值赋给max，遍历完后返回出最大值max即可.
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(test03.maximumWealth(a));
    }
}
