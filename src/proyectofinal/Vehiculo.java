package proyectofinal;

import java.util.Scanner;
import java.util.Random;

public class Vehiculo {

    Scanner Datos = new Scanner(System.in);

    double valorGasolina = 16000;

    int pasajerosTaxi = 4;
    double valorPasajeTaxi = 25000;
    double valorPeajeTaxi = 31000;
    double totalPasajeTaxi;
    double totalGastosTaxi;
    double acomuladorIngresosTaxi = 0;
    double acomuladorGastosTaxi = 0;

    double consumoAutopistaTaxi;
    double consumoSantaElenaTaxi;
    double consumoPalmasTaxi;

    public void Taxi() {
        Cambios();

        for (int i = 1; i <= 6; i++) {

            totalPasajeTaxi = valorPasajeTaxi * pasajerosTaxi;
            acomuladorIngresosTaxi += totalPasajeTaxi;

            consumoAutopistaTaxi = (consumoCambioAutopista + valorPeajeTaxi + (pasajerosTaxi * valorGasolina / 50) * 1.05);
            consumoSantaElenaTaxi = (consumoCambioSantaElena + valorPeajeTaxi + (pasajerosTaxi * valorGasolina / 50) * 1.07);
            consumoPalmasTaxi = (consumoCambioPalmas + valorPeajeTaxi + (pasajerosTaxi * valorGasolina / 50) * 1.07);

            acomuladorGastosTaxi += consumoAutopistaTaxi + consumoSantaElenaTaxi + consumoPalmasTaxi;

            System.out.println("=== Día " + i + " ===");
            System.out.println("Pasajeros Taxi: " + pasajerosTaxi);
            System.out.println("Gasto Autopista Taxi: " + consumoAutopistaTaxi + " pesos");
            System.out.println("Gasto Santa Elena Taxi: " + consumoSantaElenaTaxi + " pesos");
            System.out.println("Gasto Palmas Taxi: " + consumoPalmasTaxi + " pesos");
            System.out.println("");

            System.out.println("Acumulador Ingresos Taxi (Día " + i + "): " + acomuladorIngresosTaxi);
            System.out.println("Acumulador Gastos Taxi (Día " + i + "): " + acomuladorGastosTaxi);
            System.out.println("");
        }

    } // END VOID TAXI

    Random randomVans = new Random();

    double valorPeajeVans = 41000;
    double valorPasajeVans = 15000;
    double totalPasajeVans;
    double totalPeajeVans = valorPeajeVans * 6;
    double totalGastosVans;
    double acomuladorIngresosVans = 0;
    double acomuladorGastosVans = 0;

    double consumoAutopistaVans;
    double consumoSantaElenaVans;
    double consumoPalmasVans;

    public void Vans() {
        Cambios();

        for (int i = 1; i <= 6; i++) {
            int pasajerosVans = randomVans.nextInt(10) + 1;

            totalPasajeVans = valorPasajeVans * pasajerosVans;
            acomuladorIngresosVans += totalPasajeVans;

            consumoAutopistaVans = (consumoCambioAutopista + valorPeajeVans + (pasajerosVans * valorGasolina / 40) * 1.08);
            consumoSantaElenaVans = (consumoCambioSantaElena + valorPeajeVans + (pasajerosVans * valorGasolina / 40) * 1.11);
            consumoPalmasVans = (consumoCambioPalmas + valorPeajeVans + (pasajerosVans * valorGasolina / 40) * 1.11);

            acomuladorGastosVans += consumoAutopistaVans + consumoSantaElenaVans + consumoPalmasVans;

            System.out.println("=== Día " + i + " ===");
            System.out.println("Pasajeros Vans: " + pasajerosVans);
            System.out.println("Gasto Autopista Vans: " + consumoAutopistaVans + " pesos");
            System.out.println("Gasto Santa Elena Vans: " + consumoSantaElenaVans + " pesos");
            System.out.println("Gasto Palmas Vans: " + consumoPalmasVans + " pesos");
            System.out.println("");

            System.out.println("Acumulador Ingresos Vans (Día " + i + "): " + acomuladorIngresosVans);
            System.out.println("Acumulador Gastos Vans (Día " + i + "): " + acomuladorGastosVans);
            System.out.println("");
            
        }

    } // END VOID VANS

    Random randomBuseta = new Random();

    double valorPasajeBuseta = 12000;
    double valorPeajeBuseta = 50000;
    double totalPasajeBuseta;
    double totalPeajeBuseta = valorPeajeBuseta * 6;
    double totalGastosBuseta;
    double acomuladorIngresosBuseta = 0;
    double acomuladorGastosBuseta = 0;

    double consumoAutopistaBuseta;
    double consumoSantaElenaBuseta;
    double consumoPalmasBuseta;

    public void Buseta() {
        Cambios();

        for (int i = 1; i <= 6; i++) {
            int pasajerosBuseta = randomBuseta.nextInt(15) + 1;

            totalPasajeBuseta = valorPasajeBuseta * pasajerosBuseta;
            acomuladorIngresosBuseta += totalPasajeBuseta;

            consumoAutopistaBuseta = (consumoCambioAutopista + valorPeajeBuseta + (pasajerosBuseta * valorGasolina / 30) * 1.12);
            consumoSantaElenaBuseta = (consumoCambioSantaElena + valorPeajeBuseta + (pasajerosBuseta * valorGasolina / 30) * 1.15);
            consumoPalmasBuseta = (consumoCambioPalmas + valorPeajeBuseta + (pasajerosBuseta * valorGasolina / 30) * 1.15);

            acomuladorGastosBuseta += consumoAutopistaBuseta + consumoSantaElenaBuseta + consumoPalmasBuseta;

            System.out.println("=== Día " + i + " ===");
            System.out.println("Pasajeros Buseta: " + pasajerosBuseta);
            System.out.println("Gasto Autopista Buseta: " + consumoAutopistaBuseta + " pesos");
            System.out.println("Gasto Santa Elena Buseta: " + consumoSantaElenaBuseta + " pesos");
            System.out.println("Gasto Palmas Buseta: " + consumoPalmasBuseta + " pesos");
            System.out.println("");

            System.out.println("Acumulador Ingresos Buseta (Día " + i + "): " + acomuladorIngresosBuseta);
            System.out.println("Acumulador Gastos Buseta (Día " + i + "): " + acomuladorGastosBuseta);
            System.out.println("");
            
        }


    } // END VOID BUSETA

    int distanciaSubidaAutopistaCambioUno;
    int distanciaSubidaAutopistaCambioDos;
    int distanciaSubidaAutopistaCambioTres;

    int distanciaSubidaSantaElenaCambioUno;
    int distanciaSubidaSantaElenaCambioDos;
    int distanciaSubidaSantaElenaCambioTres;

    int distanciaSubidaPalmasCambioUno;
    int distanciaSubidaPalmasCambioDos;
    int distanciaSubidaPalmasCambioTres;

    public void DistanciaRutas() {

        //el total de subida Autopista es de: 45 
        distanciaSubidaAutopistaCambioUno = 20;
        distanciaSubidaAutopistaCambioDos = 15;
        distanciaSubidaAutopistaCambioTres = 10;

        //el total de subida Santa Elena es de: 50
        distanciaSubidaSantaElenaCambioUno = 20;
        distanciaSubidaSantaElenaCambioDos = 20;
        distanciaSubidaSantaElenaCambioTres = 10;

        //el total de subida Palmas es de: 55
        distanciaSubidaPalmasCambioUno = 15;
        distanciaSubidaPalmasCambioDos = 15;
        distanciaSubidaPalmasCambioTres = 25;

    }// END VOID DISTANCIARUTAS

    double cambioUno;
    double cambioDos;
    double cambioTres;

    double consumoCambioAutopista;
    double consumoCambioSantaElena;
    double consumoCambioPalmas;

    public void Cambios() {
        DistanciaRutas();

        cambioUno = .03;
        cambioDos = .02;
        cambioTres = .01;

        consumoCambioAutopista = ((distanciaSubidaAutopistaCambioUno * cambioUno) + (distanciaSubidaAutopistaCambioDos * cambioDos) + (distanciaSubidaAutopistaCambioTres * cambioTres)) ;
        consumoCambioSantaElena = ((distanciaSubidaSantaElenaCambioUno * cambioUno) + (distanciaSubidaSantaElenaCambioDos * cambioDos) + (distanciaSubidaSantaElenaCambioTres * cambioTres)) ;
        consumoCambioPalmas = ((distanciaSubidaPalmasCambioUno * cambioUno) + (distanciaSubidaPalmasCambioDos * cambioDos) + (distanciaSubidaPalmasCambioTres * cambioTres));

    }//END VOID CAMBIOS

    double gastosGlobales;
    double ingresosGlobales;

    public void Totales() {
        ingresosGlobales = acomuladorIngresosBuseta + acomuladorIngresosVans + acomuladorIngresosTaxi;
        gastosGlobales = acomuladorGastosBuseta + acomuladorGastosVans + acomuladorGastosTaxi;

        System.out.println("Los ingresos globales: " + ingresosGlobales + " pesos");
        System.out.println("Los gastos globales: " + gastosGlobales + " pesos");
    }
//END VOID TOTALES

    int ruta;

    public void Menu() {

    } // END VOID RUTAS

    public static void main(String[] args) {
        Vehiculo Prueba = new Vehiculo();
        Prueba.Taxi();
        Prueba.Vans();
        Prueba.Buseta();
        Prueba.Totales();
    }
}
