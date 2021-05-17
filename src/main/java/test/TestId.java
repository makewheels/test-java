package test;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

public class TestId {
    public static void main(String[] args) {
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        for (int i = 0; i < 10; i++) {
            Object id = snowflake.nextId();
            System.out.println(id);
        }
    }
}
