package Facade;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if(type.equals("mp4")){
            System.out.println("CodecFactory: extracting mpge audio....");
            return new MPGE4CompressionCodec();
        }
        else{
            System.out.println("CodecFactory: extracting ogg audio....");
            return new OggCompressionCodec();
        }
    }
}
