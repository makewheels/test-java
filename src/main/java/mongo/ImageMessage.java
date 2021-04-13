package mongo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ImageMessage extends Message{
    private File file;
    private Integer width;
    private Integer height;
    private String previewUrl;
}
