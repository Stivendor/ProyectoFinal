package proyectofinal;

import java.util.Scanner;
import java.util.Random;

public class Vehiculo {

    double valorGasolina = 16000;

    int pasajerosTaxi = 4;
    double valorPasajeTaxi = 25000;
    double valorPeajeTaxi = 15500;
    double ingresoDiarioTaxi;
    double gastoDiarioTaxi;
    double acomuladorIngresosTaxi = 0;
    double acomuladorGastosTaxi = 0;

    double consumoAutopistaTaxi;
    double consumoSantaElenaTaxi;
    double consumoPalmasTaxi;

    public void Taxi() {
        Cambios();

        for (int i = 0; i < 6; i++) {

            ingresoDiarioTaxi = valorPasajeTaxi * pasajerosTaxi;
            acomuladorIngresosTaxi += ingresoDiarioTaxi;

            consumoAutopistaTaxi = (consumoCambioAutopista + valorPeajeTaxi + (pasajerosTaxi * valorGasolina / 50) * 1.05);
            consumoSantaElenaTaxi = (consumoCambioSantaElena + valorPeajeTaxi + (pasajerosTaxi * valorGasolina / 50) * 1.07);
            consumoPalmasTaxi = (consumoCambioPalmas + valorPeajeTaxi + (pasajerosTaxi * valorGasolina / 50) * 1.07);

            gastoDiarioTaxi = consumoAutopistaTaxi + consumoSantaElenaTaxi + consumoPalmasTaxi;
            acomuladorGastosTaxi += gastoDiarioTaxi;

            ingresosMatriz[i][0] = ingresoDiarioTaxi;
            gastosMatriz[i][0] = gastoDiarioTaxi;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Taxi: " + pasajerosTaxi);
            System.out.println("Gasto Autopista Taxi: " + consumoAutopistaTaxi + " pesos");
            System.out.println("Gasto Santa Elena Taxi: " + consumoSantaElenaTaxi + " pesos");
            System.out.println("Gasto Palmas Taxi: " + consumoPalmasTaxi + " pesos");
            System.out.println("");

            System.out.println("Ingresos de Taxi (Día " + (i + 1) + "): " + ingresoDiarioTaxi);
            System.out.println("Gastos de Taxi (Día " + (i + 1) + "): " + gastoDiarioTaxi);
            System.out.println("");
        }

    } // END VOID TAXI

    Random randomVans = new Random();

    double valorPeajeVans = 20500;
    double valorPasajeVans = 15000;
    double ingresoDiarioVans;
    double gastoDiarioVans;
    double acomuladorIngresosVans = 0;
    double acomuladorGastosVans = 0;

    double consumoAutopistaVans;
    double consumoSantaElenaVans;
    double consumoPalmasVans;

    public void Vans() {
        Cambios();

        for (int i = 0; i < 6; i++) {
            int pasajerosVans = randomVans.nextInt(10) + 1;

            ingresoDiarioVans = valorPasajeVans * pasajerosVans;
            acomuladorIngresosVans += ingresoDiarioVans;

            consumoAutopistaVans = (consumoCambioAutopista + valorPeajeVans + (pasajerosVans * valorGasolina / 40) * 1.08);
            consumoSantaElenaVans = (consumoCambioSantaElena + valorPeajeVans + (pasajerosVans * valorGasolina / 40) * 1.11);
            consumoPalmasVans = (consumoCambioPalmas + valorPeajeVans + (pasajerosVans * valorGasolina / 40) * 1.11);

            gastoDiarioVans = consumoAutopistaVans + consumoSantaElenaVans + consumoPalmasVans;
            acomuladorGastosVans += gastoDiarioVans;

            ingresosMatriz[i][1] = ingresoDiarioVans;
            gastosMatriz[i][1] = gastoDiarioVans;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Vans: " + pasajerosVans);
            System.out.println("Gasto Autopista Vans: " + consumoAutopistaVans + " pesos");
            System.out.println("Gasto Santa Elena Vans: " + consumoSantaElenaVans + " pesos");
            System.out.println("Gasto Palmas Vans: " + consumoPalmasVans + " pesos");
            System.out.println("");

            System.out.println("Ingreso de Vans (Día " + (i + 1) + "): " + ingresoDiarioVans);
            System.out.println("Gastos de Vans (Día " + (i + 1) + "): " + gastoDiarioVans);
            System.out.println("");

        }

    } // END VOID VANS

    Random randomBuseta = new Random();

    double valorPasajeBuseta = 12000;
    double valorPeajeBuseta = 25000;
    double ingresoDiarioBuseta;
    double gastoDiarioBuseta;
    double acomuladorIngresosBuseta = 0;
    double acomuladorGastosBuseta = 0;

    double consumoAutopistaBuseta;
    double consumoSantaElenaBuseta;
    double consumoPalmasBuseta;

    public void Buseta() {
        Cambios();

        for (int i = 0; i < 6; i++) {
            int pasajerosBuseta = randomBuseta.nextInt(15) + 1;

            ingresoDiarioBuseta = valorPasajeBuseta * pasajerosBuseta;
            acomuladorIngresosBuseta += ingresoDiarioBuseta;

            consumoAutopistaBuseta = (consumoCambioAutopista + valorPeajeBuseta + (pasajerosBuseta * valorGasolina / 30) * 1.12);
            consumoSantaElenaBuseta = (consumoCambioSantaElena + valorPeajeBuseta + (pasajerosBuseta * valorGasolina / 30) * 1.15);
            consumoPalmasBuseta = (consumoCambioPalmas + valorPeajeBuseta + (pasajerosBuseta * valorGasolina / 30) * 1.15);

            gastoDiarioBuseta = consumoAutopistaBuseta + consumoSantaElenaBuseta + consumoPalmasBuseta;
            acomuladorGastosBuseta += gastoDiarioBuseta;

            ingresosMatriz[i][2] = ingresoDiarioBuseta;
            gastosMatriz[i][2] = gastoDiarioBuseta;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Buseta: " + pasajerosBuseta);
            System.out.println("Gasto Autopista Buseta: " + consumoAutopistaBuseta + " pesos");
            System.out.println("Gasto Santa Elena Buseta: " + consumoSantaElenaBuseta + " pesos");
            System.out.println("Gasto Palmas Buseta: " + consumoPalmasBuseta + " pesos");
            System.out.println("");

            System.out.println("Ingresos de Buseta (Día " + (i + 1) + "): " + ingresoDiarioBuseta);
            System.out.println("Gastos de Buseta (Día " + (i + 1) + "): " + gastoDiarioBuseta);
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

        consumoCambioAutopista = ((distanciaSubidaAutopistaCambioUno * cambioUno) + (distanciaSubidaAutopistaCambioDos * cambioDos) + (distanciaSubidaAutopistaCambioTres * cambioTres));
        consumoCambioSantaElena = ((distanciaSubidaSantaElenaCambioUno * cambioUno) + (distanciaSubidaSantaElenaCambioDos * cambioDos) + (distanciaSubidaSantaElenaCambioTres * cambioTres));
        consumoCambioPalmas = ((distanciaSubidaPalmasCambioUno * cambioUno) + (distanciaSubidaPalmasCambioDos * cambioDos) + (distanciaSubidaPalmasCambioTres * cambioTres));

    }//END VOID CAMBIOS

    double[][] ingresosMatriz = new double[6][3]; // Columna 0: Taxi, Columna 1: Vans, Columna 2: Busetas
    double[][] gastosMatriz = new double[6][3];

    double promedioIngresoDiarioTaxi;
    double promedioIngresoDiarioVans;
    double promedioIngresoDiarioBuseta;

    double gastosGlobales;
    double ingresosGlobales;
    double rentabilidad;

    public void Matriz() {
        System.out.println("\n=== Matriz de Ingresos y Gastos por Día ===");
        System.out.println("Día\tIngresos Taxi\t\tGastos Taxi\t\tIngresos Vans\t\tGastos Vans\tIngresos Buseta\t\tGastos Buseta");
        for (int i = 0; i < ingresosMatriz.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < ingresosMatriz[i].length; j++) {
                System.out.print(ingresosMatriz[i][j] + "\t\t" + gastosMatriz[i][j] + "\t\t");
            }
            System.out.println();
        }

        promedioIngresoDiarioTaxi = acomuladorIngresosTaxi / ingresosMatriz.length;
        promedioIngresoDiarioVans = acomuladorIngresosVans / ingresosMatriz.length;
        promedioIngresoDiarioBuseta = acomuladorIngresosBuseta / ingresosMatriz.length;
        ingresosGlobales = acomuladorIngresosBuseta + acomuladorIngresosVans + acomuladorIngresosTaxi;
        gastosGlobales = acomuladorGastosBuseta + acomuladorGastosVans + acomuladorGastosTaxi;
        rentabilidad = ingresosGlobales - gastosGlobales;

        System.out.println("");
        System.out.println("======INGRESOS DE LOS VEHICULOS=====");
        System.out.println("Los ingresos totales del Taxi: " + acomuladorIngresosTaxi);
        System.out.println("Los ingresos totales de la Vans " + acomuladorIngresosVans);
        System.out.println("Los ingresos totales de la Buseta " + acomuladorIngresosBuseta);

        System.out.println("");

        System.out.println("=====GASTOS DE LOS VEHICULOS======");
        System.out.println("Los gastos totales del Taxi: " + acomuladorGastosTaxi);
        System.out.println("Los gastos totales de la Vans " + acomuladorGastosVans);
        System.out.println("Los gastos totales de la Buseta " + acomuladorGastosBuseta);

        System.out.println("");

        System.out.println("=====INGRESOS Y GASTOS GLOBALES=====");
        System.out.println("Los ingresos globales: " + ingresosGlobales + " pesos");
        System.out.println("Los gastos globales: " + gastosGlobales + " pesos");

        System.out.println("");

        System.out.println("=====PROMEDIO DE INGRESOS=====");
        System.out.println("El promedio de ingresos del Taxi en la semana fue de: " + promedioIngresoDiarioTaxi);
        System.out.println("El promedio de ingresos de la Vans en la semana fue de: " + promedioIngresoDiarioVans);
        System.out.println("El promedio de ingresos de la Vans en la semana fue de: " + promedioIngresoDiarioBuseta);

        System.out.println("");

        System.out.println("=====RENTABILIDAD DE LA SEMANA=====");
        System.out.println("La rentabilidad de la semana fue de: " + rentabilidad + " pesos");

    } // END VOID MATRIZ

    public void Menu() {
        Scanner Dato = new Scanner(System.in);

        System.out.println("1. Ver la semana del Taxi");
        System.out.println("2. Ver la semana de la Vans");
        System.out.println("3. Ver la semana de la Buseta");
        System.out.println("4. Ver el arreglo matricial con los totales y la rentabilidad");
        System.out.print("Ingrese el numero de la opcion que desea ver: ");
        int opcion = Dato.nextInt();
        System.out.println("");

        switch (opcion) {
            case 1:
                Taxi();
                break;

            case 2:
                Vans();
                break;

            case 3:
                Buseta();
                break;

            case 4:
                Taxi();
                Vans();
                Buseta();
                break;

            default:
                System.out.println("Opcion incorrecta");
        }
    }

    public static void main(String[] args) {
        Vehiculo Prueba = new Vehiculo();
        Prueba.Menu();
        Prueba.Matriz();
    }
}
