package com.alura.conversordemonedas.principal;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MenuConversor {

    public static void eleccionUserMenu() {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {

            System.out.println("************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("");
            System.out.println("1) Dólar ==> Peso argentino");
            System.out.println("2) Peso argentino ==> Dólar");
            System.out.println("3) Dólar ==> Real brasileño");
            System.out.println("4) Real brasileño ==> Dólar");
            System.out.println("5) Dólar ==> Peso colombiano");
            System.out.println("6) Peso colombiano ==> Dólar");
            System.out.println("7) Salir");
            System.out.println("");
            System.out.print("Elija una opción válida: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> convertir("USD", "ARS", scanner);
                case 2 -> convertir("ARS", "USD", scanner);
                case 3 -> convertir("USD", "BRL", scanner);
                case 4 -> convertir("BRL", "USD", scanner);
                case 5 -> convertir("USD", "COP", scanner);
                case 6 -> convertir("COP", "USD", scanner);
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }

            System.out.println();
        }
    }

    private static void convertir(String base, String destino, Scanner scanner) {

        System.out.print("Ingrese el valor que desea convertir: ");
        double cantidad = scanner.nextDouble();

        double tasa = ApiService.obtenerTasa(base, destino);
        double resultado = cantidad * tasa;

        Locale localeDestino = obtenerLocale(destino);
        NumberFormat formato = NumberFormat.getCurrencyInstance(localeDestino);

        System.out.println("Resultado: " + formato.format(resultado));
    }

    private static Locale obtenerLocale(String codigoMoneda) {

        return switch (codigoMoneda) {
            case "ARS" -> new Locale("es", "AR");
            case "BOB" -> new Locale("es", "BO");
            case "BRL" -> new Locale("pt", "BR");
            case "CLP" -> new Locale("es", "CL");
            case "COP" -> new Locale("es", "CO");
            case "USD" -> Locale.US;
            default -> Locale.US;
        };
    }
}