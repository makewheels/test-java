package ffmpeg;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class To1080p {
    public static void main(String[] args) {
        File folder = new File("D:\\Etc\\无人机\\transcode\\2021.12.02 曾伟婚礼\\卡2");
        List<File> files = FileUtil.loopFiles(folder
//                ,
//                file -> file.getName().endsWith(".ts")
        );
        List<String> commands = new ArrayList<>(files.size());
        for (File file : files) {
            String from = file.getPath();
            String oldName = file.getName();
            String newName = FilenameUtils.getBaseName(oldName) + "_1080p.mp4";
            String to = new File(file.getParent(), newName).getPath();
            String command = String.format("ffmpeg -y -i \"%s\" -vf scale=1920:1080 \"%s\"", from, to);
            commands.add(command);
        }
        for (String command : commands) {
            System.out.println(command);
        }
    }
}
