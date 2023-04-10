package Facade;

import java.io.File;

public class VideoConversionFacade {

    public File convertVideo(String filename, String format){
        System.out.println("Comienzo la conversion de video...");

        VideoFile  file = new VideoFile("fichero.mp4");
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if(format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        }else {
            destinationCodec =  new MPGE4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("Ya he terminado");

        return result;
    }
}
