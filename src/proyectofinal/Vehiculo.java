package proyectofinal;

import java.util.Scanner;
import java.util.Random;

public class Vehiculo {

    Scanner Datos = new Scanner(System.in);

    double valorGasolina;

    public void Gasolina() {

        valorGasolina = 16000;

    } // END VOID GASOLINA

    int pasajerosTaxi = 4;
    double valorPasajeTaxi = 25000;
    double valorPeajeTaxi = 31000;
    double totalPeajeTaxi = valorPeajeTaxi * 6;
    double totalPasajeTaxi;
    double totalGastosTaxi;
    double acomuladorIngresosTaxi = 0;
    double acomuladorGastosTaxi = 0;

    double consumoAutopistaTaxi;
    double consumoSantaElenaTaxi;
    double consumoPalmasTaxi;

    public void Taxi() {
        Gasolina();
        Cambios();

        for (int i = 1; i <= 6; i++) {

            totalPasajeTaxi = valorPasajeTaxi * pasajerosTaxi;
            acomuladorIngresosTaxi += totalPasajeTaxi;

            consumoAutopistaTaxi = totalPeajeTaxi + consumoCambioAutopista + (pasajerosTaxi * 1.12) * valorGasolina;
            consumoSantaElenaTaxi = totalPeajeTaxi + consumoCambioSantaElena + (pasajerosTaxi * 1.15) * valorGasolina;
            consumoPalmasTaxi = totalPeajeTaxi + consumoCambioPalmas + (pasajerosTaxi * 1.15) * valorGasolina;

            acomuladorGastosTaxi += consumoAutopistaTaxi + consumoSantaElenaTaxi + consumoPalmasTaxi;

            System.out.println("=== Día " + i + " ===");
            System.out.println("Pasajeros Taxi: " + pasajerosTaxi);
            System.out.println("Gasto Autopista Taxi: " + consumoAutopistaTaxi + " pesos");
            System.out.println("Gasto Santa Elena Taxi: " + consumoSantaElenaTaxi + " pesos");
            System.out.println("Gasto Palmas Taxi: " + consumoPalmasTaxi + " pesos");
            System.out.println("");
        }

        System.out.println("Gastos totales del Taxi: " + acomuladorGastosTaxi);
        System.out.println(consumoAutopistaTaxi);
        System.out.println(consumoSantaElenaTaxi);
        System.out.println(consumoPalmasTaxi);
        System.out.println("");

    } // END VOID TAXI

    Random randomVans = new Random();

    double valorPeajeVans = 41000;
    double valorPasajeVans = 15000;
    double totalPasajeVans;
    double totalPeajeVans = valorPeajeVans * 6;
    double totalGastosVans;
    double acomuladorIngresosVans = 0;

    double consumoAutopistaVans;
    double consumoSantaElenaVans;
    double consumoPalmasVans;

    public void Vans() {
        Gasolina();
        Cambios();

        for (int i = 1; i <= 6; i++) {
            int pasajerosVans = randomVans.nextInt(10) + 1;

            totalPasajeVans = valorPasajeVans * pasajerosVans;
            acomuladorIngresosVans += totalPasajeVans;

            consumoAutopistaVans = totalPeajeVans + consumoCambioAutopista + (pasajerosVans * 1.12) * valorGasolina;
            consumoSantaElenaVans = totalPeajeVans + consumoCambioSantaElena + (pasajerosVans * 1.15) * valorGasolina;
            consumoPalmasVans = totalPeajeVans + consumoCambioPalmas + (pasajerosVans * 1.15) * valorGasolina;

            totalGastosVans = consumoAutopistaVans + consumoSantaElenaVans + consumoPalmasVans + totalPeajeVans;

            System.out.println("=== Día " + i + " ===");
            System.out.println("Pasajeros Vans: " + pasajerosVans);
            System.out.println("Gasto Autopista Vans: " + consumoAutopistaVans + " pesos");
            System.out.println("Gasto Santa Elena Vans: " + consumoSantaElenaVans + " pesos");
            System.out.println("Gasto Palmas Vans: " + consumoPalmasVans + " pesos");
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

    double consumoAutopistaBuseta;
    double consumoSantaElenaBuseta;
    double consumoPalmasBuseta;

    public void Buseta() {
        Gasolina();
        Cambios();

        for (int i = 1; i <= 6; i++) {
            int pasajerosBuseta = randomBuseta.nextInt(15) + 1;

            totalPasajeBuseta = valorPasajeBuseta * pasajerosBuseta;
            acomuladorIngresosBuseta += totalPasajeBuseta;

            consumoAutopistaBuseta = totalPeajeBuseta + consumoCambioAutopista + (pasajerosBuseta * 1.12) * valorGasolina;
            consumoSantaElenaBuseta = totalPeajeBuseta + consumoCambioSantaElena + (pasajerosBuseta * 1.15) * valorGasolina;
            consumoPalmasBuseta = totalPeajeBuseta + consumoCambioPalmas + (pasajerosBuseta * 1.15) * valorGasolina;

            totalGastosBuseta = consumoAutopistaBuseta + consumoSantaElenaBuseta + consumoPalmasBuseta + totalPeajeBuseta;

            System.out.println("=== Día " + i + " ===");
            System.out.println("Pasajeros Buseta: " + pasajerosBuseta);
            System.out.println("Gasto Autopista Buseta: " + consumoAutopistaBuseta + " pesos");
            System.out.println("Gasto Santa Elena Buseta: " + consumoSantaElenaBuseta + " pesos");
            System.out.println("Gasto Palmas Buseta: " + consumoPalmasBuseta + " pesos");
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
        Gasolina();
        DistanciaRutas();

        cambioUno = .03;
        cambioDos = .02;
        cambioTres = .01;

        consumoCambioAutopista = ((distanciaSubidaAutopistaCambioUno * cambioUno) + (distanciaSubidaAutopistaCambioDos * cambioDos) + (distanciaSubidaAutopistaCambioTres * cambioTres)) * valorGasolina;
        consumoCambioSantaElena = ((distanciaSubidaSantaElenaCambioUno * cambioUno) + (distanciaSubidaSantaElenaCambioDos * cambioDos) + (distanciaSubidaSantaElenaCambioTres * cambioTres)) * valorGasolina;
        consumoCambioPalmas = ((distanciaSubidaPalmasCambioUno * cambioUno) + (distanciaSubidaPalmasCambioDos * cambioDos) + (distanciaSubidaPalmasCambioTres * cambioTres)) * valorGasolina;

    }//END VOID CAMBIOS

    double totalGastos;
    double totalIngresos;

    public void Totales() {
        Taxi();
        Vans();
        Buseta();

        totalIngresos = acomuladorIngresosBuseta + acomuladorIngresosVans + acomuladorIngresosTaxi;
        totalGastos = totalGastosBuseta + totalGastosVans + totalGastosTaxi;

    }//END VOID TOTALES

    int ruta;

    public void Menu() {

    } // END VOID RUTAS

    public static void main(String[] args) {
        Vehiculo Prueba = new Vehiculo();
        Prueba.Menu();
        Prueba.Taxi();
        Prueba.Vans();
        Prueba.Buseta();
        Prueba.Cambios();
    }
}
