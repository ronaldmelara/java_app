package Facade;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing mode....");
        return new File("tmp");
    }
}
