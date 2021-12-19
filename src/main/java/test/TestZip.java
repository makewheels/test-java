package test;

import cn.hutool.core.util.ZipUtil;

import java.io.File;

public class TestZip {
    public static void main(String[] args) {
        File zip = ZipUtil.zip(new File("D:\\TESETTTTT"));
        System.out.println(zip);
    }
}
