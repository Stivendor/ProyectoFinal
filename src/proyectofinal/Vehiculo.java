package proyectofinal;

import java.util.Scanner;
import java.util.Random;

public class Vehiculo {

    Scanner Datos = new Scanner(System.in);

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

    double valorGasolina;

    public void Gasolina() {

        valorGasolina = 16000;

    } // END VOID GASOLINA

    int pasajerosTaxi = 4;
    double valorPasajeTaxi = 25000;
    double valorPeajeTaxi = 31000;
    double totalPasajeTaxi;

    double consumoAutopistaTaxi;
    double consumoSantaElenaTaxi;
    double consumoPalmasTaxi;

    public void Taxi() {
        Gasolina();
        totalPasajeTaxi = valorPasajeTaxi * pasajerosTaxi;

        consumoAutopistaTaxi = (pasajerosTaxi * 1.20) * valorGasolina;
        consumoSantaElenaTaxi = (pasajerosTaxi * 1.28) * valorGasolina;
        consumoPalmasTaxi = (pasajerosTaxi * 1.28) * valorGasolina;

    } // END VOID TAXI

    Random randomVans = new Random();
    int pasajerosVans = randomVans.nextInt(10) + 1;
    double valorPeajeVans = 41000;
    double valorPasajeVans = 15000;
    double totalPasajeVans;

    double consumoAutopistaVans;
    double consumoSantaElenaVans;
    double consumoPalmasVans;

    public void Vans() {
        Gasolina();
        totalPasajeVans = valorPasajeVans * pasajerosVans;

        consumoAutopistaVans = (pasajerosVans * 1.08) * valorGasolina;
        consumoSantaElenaVans = (pasajerosVans * 1.11) * valorGasolina;
        consumoPalmasVans = (pasajerosVans * 1.11) * valorGasolina;

    } // END VOID VANS

    Random randomBuseta = new Random();

    int pasajerosBuseta = randomBuseta.nextInt(15) + 1;
    double valorPasajeBuseta = 12000;
    double valorPeajeBuseta = 50000;
    double totalPasajeBuseta;

    double consumoAutopistaBuseta;
    double consumoSantaElenaBuseta;
    double consumoPalmasBuseta;

    public void Buseta() {
        Gasolina();
        totalPasajeBuseta = valorPasajeBuseta * pasajerosBuseta;

        consumoAutopistaBuseta = (pasajerosBuseta * 1.12) * valorGasolina;
        consumoSantaElenaBuseta = (pasajerosBuseta * 1.15) * valorGasolina;
        consumoPalmasBuseta = (pasajerosBuseta * 1.15) * valorGasolina;

    } // END VOID BUSETA

    double cambioUno;
    double cambioDos;
    double cambioTres;

    double consumoCambioAutopista;
    double consumoCambioSantaElena;
    double consumoCambioPalmas;

    public void Cambios() {
        Gasolina();
        DistanciaRutas();
        System.out.println("");

        cambioUno = .03;
        cambioDos = .02;
        cambioTres = .01;

        consumoCambioAutopista = ((distanciaSubidaAutopistaCambioUno * cambioUno) + (distanciaSubidaAutopistaCambioDos * cambioDos) + (distanciaSubidaAutopistaCambioTres * cambioTres)) * valorGasolina;
        consumoCambioSantaElena = ((distanciaSubidaSantaElenaCambioUno * cambioUno) + (distanciaSubidaSantaElenaCambioDos * cambioDos) + (distanciaSubidaSantaElenaCambioTres * cambioTres)) * valorGasolina;
        consumoCambioPalmas = ((distanciaSubidaPalmasCambioUno * cambioUno) + (distanciaSubidaPalmasCambioDos * cambioDos) + (distanciaSubidaPalmasCambioTres * cambioTres)) * valorGasolina;

        System.out.println("En la subida via Autopista el gasto adicional fue de: " + consumoCambioAutopista );
        System.out.println("En la subida via Santa Elena el gasto adicional fue de: " + consumoCambioSantaElena  );
        System.out.println("En la subida via Palmas el gasto adicional fue de: " + consumoCambioPalmas );
    }//END VOID CAMBIOS

    double totalGastos;
    double totalIngresos;

    public void Totales() {
        totalGastos = (valorPeajeTaxi + valorPeajeVans + valorPeajeBuseta + consumoCambioAutopista + consumoCambioSantaElena + consumoCambioPalmas) * 6;
        totalIngresos = (totalPasajeTaxi + totalPasajeVans + totalPasajeBuseta) * 6;
    }//END VOID TOTALES

    int ruta;

    public void Menu() {

//        System.out.println("POR FAVOR ELIJA LA RUTA QUE QUIERA TOMAR:");
//        System.out.println("1. Autopista");
//        System.out.println("2. Santa Elena");
//        System.out.println("3. Las Palmas");
//
//        ruta = Datos.nextInt();
//
//        switch (ruta) {
//            case 1:
//                System.out.println("");
//                System.out.println("Usted eligio la ruta: Autopista");
//                System.out.println("El gasto en la Autopista con el taxi fue de : ");
//
//                break;
//
//            case 2:
//                System.out.println("");
//                System.out.println("Usted eligio la ruta: Santa Elena");
//
//                break;
//
//            case 3:
//                System.out.println("");
//                System.out.println("Usted eligio la ruta: Las Palmas");
//                break;
//
//            default:
//                System.out.println("");
//                System.out.println("Elija una opción correcta por favor");
//
//        }
    } // END VOID RUTAS

    public void Impresion() {
        Taxi();
        Vans();
        Buseta();
        Totales();

        System.out.println("=============RESULTADOS=============");

        // IMPRESION DE LA TAXI
        System.out.println("Pasajeros del Taxi: " + pasajerosTaxi);
        System.out.println("Gasto en la Autopista del Taxi: " + consumoAutopistaTaxi + " Galones");
        System.out.println("Gasto en la ruta Santa Elena del Taxi: " + consumoSantaElenaTaxi + " Galones");
        System.out.println("Gasto en la ruta Palmas del Taxi: " + consumoPalmasTaxi + " Galones");

        // IMPRESION DE LA VANS
        System.out.println("");
        System.out.println("Pasajeros de la Vans: " + pasajerosVans);
        System.out.println("Gasto en la ruta Autopista en la Vans: " + consumoAutopistaVans + " Galones");
        System.out.println("Gasto en la ruta Santa Elena y Palmas en la Vans: " + consumoSantaElenaVans + " Galones");
        System.out.println("Gasto en la ruta Santa Elena y Palmas en la Vans: " + consumoPalmasVans + " Galones");

        // IMPRESION DE LA BUSETA
        System.out.println("");
        System.out.println("Pasajeros de la Buseta: " + pasajerosBuseta);
        System.out.println("Gasto en la ruta Autopista en la Buseta: " + consumoAutopistaBuseta + " Galones");
        System.out.println("Gasto en la ruta Santa Elena en la Buseta: " + consumoSantaElenaBuseta + " Galones");
        System.out.println("Gasto en la ruta Palmas en la Buseta: " + consumoPalmasBuseta + " Galones");

        // IMPRESION TOTALES
        System.out.println("");
        System.out.println("Gastos totales: " + totalGastos);
        System.out.println("Ingresos totales " + totalIngresos);

    } // END VOID IMPRESION

    public static void main(String[] args) {
        Vehiculo Prueba = new Vehiculo();
        Prueba.Menu();
        Prueba.Taxi();
        Prueba.Vans();
        Prueba.Buseta();
        Prueba.Cambios();
        Prueba.Impresion();
    }
}
