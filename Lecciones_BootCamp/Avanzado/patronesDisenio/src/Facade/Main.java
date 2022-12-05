package Facade;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        VideoConversionFacade facade = new VideoConversionFacade();
        facade.convertVideo("fichero.ogg", "mp4");
    }
}
