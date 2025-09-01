import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonTest {
    @Test
    public void test1() {
        long ts = 1751613402012L;
        System.out.println(new Timestamp(ts));
    }

    @Test
    public void test2() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        Integer i = map.get(3);
        System.out.println(i);
    }

    @Test
    public void test3() {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, new ArrayList<>());
        map.get(1).add(3);
        System.out.println(map);
    }

    static class Solution_LC3 {
        public int lengthOfLongestSubstring(String s) {
            int n=s.length(),left=0,right=0,ans=0;
            //使用cnt充当map
            int[] cnt=new int[128];
            while(right<n){
                //让右端点向右移动至恰好出现重复
                while(right<n&&cnt[s.charAt(right)]==0){
                    cnt[s.charAt(right)]++;
                    ans=Math.max(ans,right-left+1);
                    right++;
                }
                //退出内层while循环时，right出界或指向恰好重复的字符
                if(right>=n) return ans;
                //让左端点向右移动至恰好不重复
                while(s.charAt(left)!=s.charAt(right)){
                    cnt[s.charAt(left)]--;
                    left++;
                }
                //退出循环时，left指向左边的重复的字符
                cnt[s.charAt(left)]--;
                left++;
            }
            return ans;
        }
    }

    @Test
    public void test4() {
        Solution_LC3 solution = new Solution_LC3();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
    }
}
