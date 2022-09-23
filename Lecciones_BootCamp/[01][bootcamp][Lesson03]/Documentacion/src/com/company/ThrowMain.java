package com.company;

public class ThrowMain {
    public static void main(String[] args) {
        try {
            LanzarException("ok");
        } catch (NameFormatException expected )
        {
            expected.printStackTrace();
        }
    }


    private static void LanzarException(String message) throws NameFormatException {
        throw new NameFormatException("El nombre debe contener minimo 8 caracteres");
    }
}
