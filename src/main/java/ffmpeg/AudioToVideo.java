package ffmpeg;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class AudioToVideo {
    public static void main(String[] args) {
        File folder = new File("D:\\BaiduNetdiskDownload\\面试录屏\\audio");
        List<File> files = FileUtil.loopFiles(folder);
        List<String> commandList = new ArrayList<>(files.size());
        for (File file : files) {
            String filename = file.getName();
            String baseFilename = FilenameUtils.getBaseName(filename);
            String command = "ffmpeg -f lavfi -i color=c=black:s=1920x1080:r=5 -i \""
                    + filename + "\" -crf 0 -c:a copy -shortest \"target/" + baseFilename + ".mp4\"";
            commandList.add(command);
        }
        for (String command : commandList) {
            System.out.println(command);
        }
    }
}
