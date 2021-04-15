package test;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.util.Arrays;

public class TestEnv {
    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(System.getenv()));
        System.out.println(JSON.toJSONString(System.getProperties()));
        System.out.println(Arrays.toString(File.listRoots()));
        System.out.println("System.getProperty(\"user.home\") = " + System.getProperty("user.home"));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(1 << 30);
    }
}
