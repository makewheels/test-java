package mongo;

import lombok.Data;

@Data
public class File {
    private String fileId;
    private String originalName;
    private String extension;
    private Long fileSize;
    private String md5;
    private String ossUrl;
    private String cdnUrl;
    private String bucketName;
    private String objectName;
}
