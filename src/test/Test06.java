package test;

/**
 * description: 赎金信
 *
 * @author DaiJF
 * @date 2023/4/10 - 15:20
 */
public class Test06 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        // cnt 是一个长度为 26 的整数数组，表示 26 个小写字母出现的次数
        int[] cnt = new int[26];

        // 将字符串转换为字符数组后遍历
        for (char c : magazine.toCharArray()) {
            // 'a'的 ascii 码值:97
            // 将 magazine 字符串中每个字符 c 减去字符 'a' 转换成的 ascii 码值作为下标，在 cnt 数组中对应位置的元素加 1。
            // 用以统计 magazine 字符串中每个字符出现的次数，并将统计结果存储在 cnt 数组中。
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            //遍历 ransomNote 中的每个字符，并从 cnt 数组中减去相应字符的数量。
            cnt[c - 'a']--;
            if (cnt[c - 'a'] < 0) {
                return false;
            }
        }
        /*
        public static void main
         */
        return true;
    }
}
