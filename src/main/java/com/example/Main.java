package com.example;

public class Main {
    public static void main(String[] args) {

        Parqueadero parqueadero1 = new Parqueadero(150, true, "Centro Comercial Aventura", true, true, true);
        System.out.println("Parqueadero 1: " + parqueadero1);
        System.out.println("-----------------------------------");
        Parqueadero parqueadero2 = new Parqueadero(50, false, "Barrio El Poblado", false, true, false);
        System.out.println("Parqueadero 2: " + parqueadero2);
        System.out.println("-----------------------------------");

        Estudiante estudiante1 = new Estudiante("Laura", "Zapata", 21, "1001234567", "Desarrollo de software", 2);
        System.out.println("Estudiante 1: " + estudiante1);
        System.out.println("-----------------------------------");
        Estudiante estudiante2 = new Estudiante("Carlos", "Rojas", 19, "1002987654", "Diseño Gráfico", 3);
        System.out.println("Estudiante 2: " + estudiante2);
        System.out.println("-----------------------------------");

        Computador computador1 = new Computador(1500, "Dell", "Windows 11", 512, 16, "Portátil");
        System.out.println("Computador 1: " + computador1);
        System.out.println("-----------------------------------");
        Computador computador2 = new Computador(1200, "Apple", "macOS", 256, 8, "Desktop");
        System.out.println("Computador 2: " + computador2);
        System.out.println("-----------------------------------");

    }
}