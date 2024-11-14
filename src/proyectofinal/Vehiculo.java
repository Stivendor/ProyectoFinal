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

    public void distanciaRutas() {

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

    int valorGasolina;

    public void Gasolina() {

        valorGasolina = 16000;

    } // END VOID GASOLINA

    int pasajerosTaxi = 4;
    double consumoAutopistaTaxi;
    double consumoSantaELenaYPalmasTaxi;

    public void Taxi() {

        consumoAutopistaTaxi = pasajerosTaxi * 1.20;
        consumoSantaELenaYPalmasTaxi = pasajerosTaxi * 1.28;

    } // END VOID TAXI

    Random randomVans = new Random();

    int pasajerosVans = randomVans.nextInt(10) + 1;
    double consumoAutopistaVans;
    double consumoSantaELenaYPalmasVans;

    public void Vans() {

        consumoAutopistaVans = pasajerosVans * 1.08;
        consumoSantaELenaYPalmasVans = pasajerosVans * 1.11;

    } // END VOID VANS

    Random randomBuseta = new Random();

    int pasajerosBuseta = randomBuseta.nextInt(15) + 1;
    double consumoAutopistaBuseta;
    double consumoSantaELenaYPalmasBuseta;

    public void Buseta() {

        System.out.println("");

        consumoAutopistaBuseta = pasajerosBuseta * 1.12;
        consumoSantaELenaYPalmasBuseta = pasajerosBuseta * 1.15;

    } // END VOID BUSETA

    double cambioUno;
    double cambioDos;
    double cambioTres;

    double consumoCambioAutopista;
    double consumoCambioSantaElena;
    double consumoCambioPalmas;

    public void Cambios() {
        distanciaRutas();

        System.out.println("");

        cambioUno = .03;
        cambioDos = .02;
        cambioTres = .01;

        consumoCambioAutopista = (distanciaSubidaAutopistaCambioUno * cambioUno) + (distanciaSubidaAutopistaCambioDos * cambioDos) + (distanciaSubidaAutopistaCambioTres * cambioTres);
        consumoCambioSantaElena = (distanciaSubidaSantaElenaCambioUno * cambioUno) + (distanciaSubidaSantaElenaCambioDos * cambioDos) + (distanciaSubidaSantaElenaCambioTres * cambioTres);
        consumoCambioPalmas = (distanciaSubidaPalmasCambioUno * cambioUno) + (distanciaSubidaPalmasCambioDos * cambioDos) + (distanciaSubidaPalmasCambioTres * cambioTres);

        System.out.println("En la subida via Autopista el consumo adicional fue de: " + consumoCambioAutopista + " galones");
        System.out.println("En la subida via Santa Elena el consumo adicional fue de: " + consumoCambioSantaElena + " galones");
        System.out.println("En la subida via Palmas el consumo adicional fue de: " + consumoCambioSantaElena + " galones");
    }//END VOID CAMBIOS

    int distanciaAutopista = 45;
    int distanciaSantaElena = 50;
    int distanciaPalmas = 55;
    int ruta;

    public void Rutas() {

        System.out.println("POR FAVOR ELIJA LA RUTA QUE QUIERA TOMAR:");
        System.out.println("1. Autopista \n"
                + //
                "2. Santa Elena \n"
                + //
                "3. Las Palmas ");
        ruta = Datos.nextInt();

        if (ruta == 1) {
            System.out.println("");
            System.out.println("Usted eligio la ruta: Autopista");
        }
        if (ruta == 2) {
            System.out.println("");
            System.out.println("Usted eligio la ruta: Santa Elena");
        }
        if (ruta == 3) {
            System.out.println("");
            System.out.println("Usted eligio la ruta: Las Palmas");
        }
        if (ruta != 1 && ruta != 2 && ruta != 3) {
            System.out.println("");
            System.out.println("POR FAVOR ELIJA ALGUNA DE LAS TRES RUTA");
        }
    } // END VOID RUTAS

    public void Impresion() {

        System.out.println("=============RESULTADOS=============");

        // IMPRESION DE LA TAXI
        System.out.println("Pasajeros del Taxi: " + pasajerosTaxi);
        System.out.println("Consumo en la ruta Autopista del Taxi: " + consumoAutopistaTaxi + " Galones");
        System.out.println(
                "Consumo en la ruta Santa Elena y Palmas del Taxi: " + consumoSantaELenaYPalmasTaxi + " Galones");

        // IMPRESION DE LA VANS
        System.out.println("");
        System.out.println("Pasajeros de la Vans: " + pasajerosVans);
        System.out.println("Consumo en la ruta Autopista en la Vans: " + consumoAutopistaVans + " Galones");
        System.out.println(
                "Consumo en la ruta Santa Elena y Palmas en la Vans: " + consumoSantaELenaYPalmasVans + " Galones");

        // IMPRESION DE LA BUSETA
        System.out.println("");
        System.out.println("Pasajeros de la Buseta: " + pasajerosBuseta);
        System.out.println("Consumo en la ruta Autopista en la Buseta: " + consumoAutopistaBuseta + " Galones");
        System.out.println(
                "Consumo en la ruta Santa Elena y Palmas en la Buseta: " + consumoSantaELenaYPalmasBuseta + " Galones");
    } // END VOID IMPRESION

    public static void main(String[] args) {
        Vehiculo Prueba = new Vehiculo();
        Prueba.Rutas();
        Prueba.Taxi();
        Prueba.Vans();
        Prueba.Buseta();
        Prueba.Cambios();
        System.out.println("");
        Prueba.Impresion();
    }
}
