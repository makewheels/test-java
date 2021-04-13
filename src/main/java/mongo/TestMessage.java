package mongo;

import com.alibaba.fastjson.JSON;

import java.util.Date;
import java.util.UUID;

public class TestMessage {
    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage();
        textMessage.setMessageId(UUID.randomUUID().toString());
        textMessage.setMessageType("text");
        textMessage.setContent("文字内容哦啦啦");
        textMessage.setCreateTime(new Date());
        System.out.println(JSON.toJSONString(textMessage));

        File file = new File();
        file.setFileId(UUID.randomUUID().toString());
        file.setFileSize(156615156L);
        file.setBucketName("chat-bucket");
        file.setObjectName("fjeaffawwgjjuf/fgw4egwg4324f.xxx");
        file.setExtension("jpg");
        file.setOssUrl("http:aliyunososlosdf.faewoifewaiofewaj");
        file.setCdnUrl("http://fawefwfewfew.co,m");
        file.setOriginalName("IMG_201551020.jpg");

        AudioMessage audioMessage = new AudioMessage();
        audioMessage.setMessageId(UUID.randomUUID().toString());
        audioMessage.setMessageType("audio");
        audioMessage.setCreateTime(new Date());
        audioMessage.setDuration(1256L);
        audioMessage.setFile(file);
        System.out.println(JSON.toJSONString(audioMessage));

        ImageMessage imageMessage = new ImageMessage();
        imageMessage.setMessageId(UUID.randomUUID().toString());
        imageMessage.setMessageId("image");
        imageMessage.setCreateTime(new Date());
        imageMessage.setFile(file);
        imageMessage.setWidth(1280);
        imageMessage.setHeight(720);
        imageMessage.setPreviewUrl("http://aliyunoxcs.comc/fawef34f32/fwajifoawfeaw.jpg?x-process-walsa/x-500");
        System.out.println(JSON.toJSONString(imageMessage));

    }
}
