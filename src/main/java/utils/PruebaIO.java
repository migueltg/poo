package utils;

import upm.jbb.IO;
public class PruebaIO {
    public static void main(String[] args) {
        String msg = IO.in.readString("Escribe un mensaje");
        IO.out.println("Valor del mensaje: " + msg);
        int entero = IO.in.readInt("Dame un número entero");
        IO.out.println("Valor del entero: " + entero);
        double decimal = IO.in.readDouble("Dame un numero decimal");
        IO.out.println("Valor del decimal: " + decimal);
        short corto = (short) IO.in.read("short", "Corto");
        IO.out.println("Valor del corto: " + corto);
        Integer entero2 = (Integer) IO.in.read(8, "Valor por defecto (Integer)");
        IO.out.println("Valor del entero: " + entero2);
        Byte b = (Byte) IO.in.read(new Byte("3"), "Valor por defecto (Byte)");
        IO.out.println("Valor del byte: " + b);
        Integer[] intArray = (Integer[]) IO.in.read("Integer[]", "Array de enteros");
        IO.out.print("Array de enteros: ");
        IO.out.println(intArray);
        IO.out.setStatusBar("Barra de estado");
        System.out.println("Este mensaje sale por la consola...");
    }
}
