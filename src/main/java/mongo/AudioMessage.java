package mongo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AudioMessage extends Message{
    private File file;
    private Long duration;
}
