package test;

import com.github.makewheels.HttpUtil;

/**
 * @Author makewheels
 * @Time 2021.03.18 09:04:03
 */
public class TestHttpUtil {
    public static void main(String[] args) {
        String s = HttpUtil.get("http://baidu.com");
        System.out.println(s);
    }
}
