package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Error Cod.789554794mvn");
        } catch (RuntimeException e) {
            System.out.println("Excepción controlada: " + e.getMessage());

        System.out.println("El programa ha terminado correctamente.");
    }
    }
}
