package mongo;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private String messageId;
    private String messageType;
    private Date createTime;
}
