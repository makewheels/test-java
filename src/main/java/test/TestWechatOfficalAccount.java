package test;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;

public class TestWechatOfficalAccount {
    public static void main(String[] args) {
        String response = HttpUtil.get("https://mp.weixin.qq.com/mp/profile_ext?" +
                "action=getmsg" +
                "&__biz=MjM5MjAwODM4MA==&" +
                "f=json&" +
                "offset=0" +
                "&count=10" +
                "&uin=MTkxMDY3MDExMA%3D%3D" +
                "&key=2a2066ee7128965bdfcf7dd33749a46204c7452370e463f7b025c76ddfc" +
                "4196ecbb8ed3aeea5f46ffb88cb189a152107fd2f4028ecc2a9e9913c99ee62e" +
                "61fd0f75bd0b85c21622e2ba9f9afccb5e15c2fc147833fdb40b93eec2d4901b" +
                "33a198c04bfdba4a86db49c470ca3017a49d6102cc61632eca6756cd5f61b406df823");
        System.out.println(response);
        JSONObject jsonObject = JSONObject.parseObject(response);
        String general_msg_list = jsonObject.getString("general_msg_list");
        System.out.println(general_msg_list);
    }
}
