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

    int cuposTaxi;
    double consumoAutopistaTaxi;
    double consumoSantaELenaYPalmasTaxi;

    public void Taxi() {

        cuposTaxi = 4;

        System.out.println("Pasajeros del Taxi: " + cuposTaxi);

        consumoAutopistaTaxi = cuposTaxi * 1.20;
        consumoSantaELenaYPalmasTaxi = cuposTaxi * 1.28;

        System.out.println("Consumo en la ruta Autopista del Taxi: " + consumoAutopistaTaxi + " Galones");
        System.out.println("Consumo en la ruta Santa Elena y Palmas del Taxi: " + consumoSantaELenaYPalmasTaxi + " Galones");

    } // END VOID TAXI

    double consumoAutopistaVans;
    double consumoSantaELenaYPalmasVans;

    public void Vans() {

        System.out.println("");

        Random randomNumbers = new Random();

        int pasajero = randomNumbers.nextInt(10) + 1;

        System.out.println("Pasajeros de la Vans: " + pasajero);

        consumoAutopistaVans = pasajero * 1.08;
        consumoSantaELenaYPalmasVans = pasajero * 1.11;

        System.out.println("Consumo en la ruta Autopista en la Vans: " + consumoAutopistaVans + " Galones");
        System.out.println("Consumo en la ruta Santa Elena y Palmas en la Vans: " + consumoSantaELenaYPalmasVans + " Galones");

    } // END VOID VANS

    double consumoAutopistaBuseta;
    double consumoSantaELenaYPalmasBuseta;

    public void Buseta() {

        System.out.println("");

        Random randomNumbers = new Random();

        int pasajero = randomNumbers.nextInt(15) + 1;

        System.out.println("Pasajeros de la Buseta: " + pasajero);

        consumoAutopistaBuseta = pasajero * 1.12;
        consumoSantaELenaYPalmasBuseta = pasajero * 1.15;

        System.out.println("Consumo en la ruta Autopista en la Buseta: " + consumoAutopistaBuseta + " Galones");
        System.out.println("Consumo en la ruta Santa Elena y Palmas en la Buseta: " + consumoSantaELenaYPalmasBuseta + " Galones");

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

        consumoCambioAutopista = (distanciaSubidaAutopistaCambioUno * cambioUno)+(distanciaSubidaAutopistaCambioDos * cambioDos)+(distanciaSubidaAutopistaCambioTres * cambioTres);
        consumoCambioSantaElena = (distanciaSubidaSantaElenaCambioUno * cambioUno)+(distanciaSubidaSantaElenaCambioDos * cambioDos)+(distanciaSubidaSantaElenaCambioTres * cambioTres);
        consumoCambioPalmas = (distanciaSubidaPalmasCambioUno * cambioUno)+(distanciaSubidaPalmasCambioDos * cambioDos)+(distanciaSubidaPalmasCambioTres * cambioTres);
        
        System.out.println("En la subida via Autopista el consumo adicional fue de: " + consumoCambioAutopista + " galones");
        System.out.println("En la subida via Santa Elena el consumo adicional fue de: " + consumoCambioSantaElena + " galones");
        System.out.println("En la subida via Palmas el consumo adicional fue de: " + consumoCambioSantaElena + " galones");
    }//END VOID CAMBIOS

    public static void main(String[] args) {
        Vehiculo Prueba = new Vehiculo();
        Prueba.Taxi();
        Prueba.Vans();
        Prueba.Buseta();
        Prueba.Cambios();
    }
}
