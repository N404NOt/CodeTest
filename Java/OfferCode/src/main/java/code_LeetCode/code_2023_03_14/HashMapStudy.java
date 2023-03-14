package code_LeetCode.code_2023_03_14;

import java.util.HashMap;
import java.util.Map;


public class HashMapStudy {
    public static void main(String[] args) {
        //一般来说,最好初始化一下, 小于12的就不要初始化了
        // 默认的就是16,因为加载因子是0.75,也就是到16*0.75=12的时候会扩容
        Map<String, String> map = new HashMap<>(3);

        map.put("welcome","to");
        map.put("java","study");
        map.put("wechat","best396975802");

        //遍历方法1: 先遍历key , 再取出value
        System.out.println("遍历方法1: 先遍历key , 再取出value");
        for (String key : map.keySet()) {
            System.out.println("key is "+key);
            System.out.println("value is "+ map.get(key));
        }
        //遍历方法2: 直接遍历value
        System.out.println("遍历方法2: 直接遍历value");
        for (String value : map.values()) {
            System.out.println("value is "+value);
        }

        //遍历方法3: 通过遍历entry来取Key和value,推荐的方法!!!
        System.out.println("遍历方法3: 通过遍历entry来取Key和value,推荐的方法!!!");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key is "+entry.getKey());
            System.out.println("value is "+ entry.getValue());
        }

        //遍历方法4: 通过forEach方法直接遍历key和value
        System.out.println("遍历方法4: 通过forEach方法直接遍历");
        map.forEach((key,value)->{
            System.out.println("key is "+ key);
            System.out.println("value is "+ value);
        });
    }
}