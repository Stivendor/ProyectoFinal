package proyectofinal;

import java.util.Scanner;

public class Vehiculo {

    double valorGasolina = 16000;

    int pasajerosTaxi = 4;
    double valorPasajeTaxi = 25000;
    double valorPeajeTaxi = 15500;
    double ingresoDiarioTaxi;
    double gastoDiarioTaxi;

    double acomuladorIngresosTaxi = 0;
    double acomuladorGastosTaxi = 0;

    //VARIABLES PROMEDIO RUTAS (VANS)
    double promedioRentabilidadAutopistaTaxi;
    double promedioRentabilidadSantaElenaTaxi;
    double promedioRentabilidadPalmasTaxi;

    //VARIABLES CALCULO AUTOPISTA (TAXI)
    double consumoGasolinaAutopistaTaxi;
    double consumoAdicionalAutopistaTaxi;
    double consumoNormalAutopistaTaxi;
    double consumoExtraAutopistaTaxi;

    //VARIABLES CALCULO SANTA ELENA (TAXI)
    double consumoGasolinaSantaElenaTaxi;
    double consumoAdicionalSantaElenaTaxi;
    double consumoNormalSantaElenaTaxi;
    double consumoExtraSantaElenaTaxi;

    //VARIABLES CALCULO PALMAS (TAXI)
    double consumoGasolinaPalmasTaxi;
    double consumoAdicionalPalmasTaxi;
    double consumoNormalPalmasTaxi;
    double consumoExtraPalmasTaxi;

    //TOTALES DE CONSUMO
    double consumoAutopistaTaxi;
    double consumoSantaElenaTaxi;
    double consumoPalmasTaxi;

    public void Taxi() {
        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN AUTOPISTA (TAXI)
        consumoGasolinaAutopistaTaxi = valorGasolina / 50 * 45;
        consumoAdicionalAutopistaTaxi = consumoGasolinaAutopistaTaxi * 0.2;
        consumoAutopistaTaxi = consumoGasolinaAutopistaTaxi + consumoAdicionalAutopistaTaxi;

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN SANTA ELENA (TAXI)
        consumoGasolinaSantaElenaTaxi = valorGasolina / 50 * 50;
        consumoAdicionalSantaElenaTaxi = consumoGasolinaSantaElenaTaxi * 0.28;
        consumoSantaElenaTaxi = consumoGasolinaSantaElenaTaxi + consumoAdicionalSantaElenaTaxi;

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN PALMAS (TAXI)
        consumoGasolinaPalmasTaxi = valorGasolina / 50 * 55;
        consumoAdicionalPalmasTaxi = consumoGasolinaPalmasTaxi * 0.28;
        consumoPalmasTaxi = consumoGasolinaPalmasTaxi + consumoAdicionalPalmasTaxi;

        Cambios();

        for (int i = 0; i < 6; i++) {

            //CONSUMO DE GASOLINA AUTOPISTA (TAXI)
            consumoNormalAutopistaTaxi = ingresoDiarioTaxi - (consumoAutopistaTaxi + valorPeajeTaxi);
            consumoExtraAutopistaTaxi = consumoNormalAutopistaTaxi - totalConsumoCambiosAutopistaTaxi;

            //CONSUMO DE GASOLINA SANTA ELENA (TAXI)
            consumoNormalSantaElenaTaxi = ingresoDiarioTaxi - (consumoSantaElenaTaxi + valorPeajeTaxi);
            consumoExtraSantaElenaTaxi = consumoNormalSantaElenaTaxi - totalConsumoCambiosSantaElenaTaxi;

            //CONSUMO DE GASOLINA PALMAS
            consumoNormalPalmasTaxi = ingresoDiarioTaxi - (consumoPalmasTaxi + valorPeajeTaxi);
            consumoExtraPalmasTaxi = consumoNormalPalmasTaxi - totalConsumoCambiosPalmasTaxi;

            ingresoDiarioTaxi = valorPasajeTaxi * pasajerosTaxi;
            acomuladorIngresosTaxi += ingresoDiarioTaxi;

            gastoDiarioTaxi = consumoAutopistaTaxi + consumoSantaElenaTaxi + consumoPalmasTaxi; //aca va el consumoSantaElenaTaxi...
            acomuladorGastosTaxi += gastoDiarioTaxi;

            //CALCULAR EL PROMEDIO DE RENTABILIDAD AUTOPISTA (TAXI)
            promedioRentabilidadAutopistaTaxi = ((consumoNormalAutopistaTaxi + consumoExtraAutopistaTaxi) / 2);

            //CALCULAR EL PROMEDIO DE RENTABILIDAD SANTA ELENA (TAXI)
            promedioRentabilidadSantaElenaTaxi = ((consumoNormalSantaElenaTaxi + consumoExtraSantaElenaTaxi) / 2);

            //CALCULAR EL PROMEDIO DE RENTABILIDAD PALMAS (TAXI)
            promedioRentabilidadPalmasTaxi = ((consumoNormalPalmasTaxi + consumoExtraPalmasTaxi) / 2);

            ingresosMatriz[i][0] = ingresoDiarioTaxi;
            gastosMatriz[i][0] = gastoDiarioTaxi;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Totales: " + pasajerosTotales);
            System.out.println("Pasajeros Cambio Uno: " + pasajerosCambio1);
            System.out.println("Pasajeros Cambio Dos: " + pasajerosCambio2);
            System.out.println("Pasajeros Cambio Tres: " + pasajerosCambio3);
        }

    } // END VOID TAXI

    double valorPeajeVans = 20500;
    double valorPasajeVans = 15000;
    double ingresoDiarioVans;
    double gastoDiarioVans;
    double acomuladorIngresosVans = 0;
    double acomuladorGastosVans = 0;

    //VARIABLES PROMEDIO RUTAS (VANS)
    double promedioRentabilidadAutopistaVans;
    double promedioRentabilidadSantaElenaVans;
    double promedioRentabilidadPalmasVans;

    //VARIABLES CALCULO AUTOPISTA (VANS)
    double consumoGasolinaAutopistaVans;
    double consumoAdicionalAutopistaVans;
    double consumoNormalAutopistaVans;
    double consumoExtraAutopistaVans;

    //VARIABLES CALCULO SANTA ELENA (VANS)
    double consumoGasolinaSantaElenaVans;
    double consumoAdicionalSantaElenaVans;
    double consumoNormalSantaElenaVans;
    double consumoExtraSantaElenaVans;

    //VARIABLES CALCULO SANTA ELENA (VANS)
    double consumoGasolinaPalmasVans;
    double consumoAdicionalPalmasVans;
    double consumoNormalPalmasVans;
    double consumoExtraPalmasVans;

    //TOTALES DE CONSUMO
    double consumoAutopistaVans;
    double consumoSantaElenaVans;
    double consumoPalmasVans;

    public void Vans() {

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN AUTOPISTA (VANS)
        consumoGasolinaAutopistaVans = valorGasolina / 40 * 45;
        consumoAdicionalAutopistaVans = consumoGasolinaAutopistaVans * (0.08 * pasajerosTotales);
        consumoAutopistaVans = consumoGasolinaAutopistaVans + consumoAdicionalAutopistaVans;

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN SANTA ELENA (VANS)
        consumoGasolinaSantaElenaVans = valorGasolina / 40 * 50;
        consumoAdicionalSantaElenaVans = consumoGasolinaSantaElenaVans * (0.11 * pasajerosTotales);
        consumoSantaElenaVans = consumoGasolinaSantaElenaVans + consumoAdicionalSantaElenaVans;

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN PALMAS (VANS)
        consumoGasolinaPalmasVans = valorGasolina / 40 * 55;
        consumoAdicionalPalmasVans = consumoGasolinaPalmasVans * (0.11 * pasajerosTotales);
        consumoPalmasVans = consumoGasolinaPalmasVans + consumoAdicionalPalmasVans;

        Cambios();

        for (int i = 0; i < 6; i++) {

            //CONSUMO DE GASOLINA AUTOPISTA (VANS)
            consumoNormalAutopistaVans = ingresoDiarioVans - (consumoAutopistaVans + valorPeajeVans);
            consumoExtraAutopistaVans = consumoNormalAutopistaVans - totalConsumoCambiosAutopistaVans;

            //CONSUMO DE GASOLINA SANTA ELENA (VANS)
            consumoNormalSantaElenaVans = ingresoDiarioVans - (consumoSantaElenaVans + valorPeajeVans);
            consumoExtraSantaElenaVans = consumoNormalSantaElenaVans - totalConsumoCambiosSantaElenaVans;

            //CONSUMO DE GASOLINA PALMAS (VANS)
            consumoNormalPalmasVans = ingresoDiarioVans - (consumoPalmasVans + valorPeajeVans);
            consumoExtraPalmasVans = consumoNormalPalmasVans - totalConsumoCambiosPalmasVans;

            ingresoDiarioVans = valorPasajeVans * pasajerosTotales;
            acomuladorIngresosVans += ingresoDiarioVans;

            gastoDiarioVans = consumoAutopistaVans;
            acomuladorGastosVans += gastoDiarioVans;

            //CALCULAR EL PROMEDIO DE RENTABILIDAD AUTOPISTA (VANS)
            promedioRentabilidadAutopistaVans = ((consumoNormalAutopistaVans + consumoExtraAutopistaVans) / 2);

            //CALCULAR EL PROMEDIO DE RENTABILIDAD SANTA ELENA (VANS)
            promedioRentabilidadSantaElenaVans = ((consumoNormalSantaElenaVans + consumoExtraSantaElenaVans) / 2);

            //CALCULAR EL PROMEDIO DE RENTABILIDAD PALMAS (VANS)
            promedioRentabilidadPalmasVans = ((consumoNormalPalmasVans + consumoExtraPalmasVans) / 2);

            ingresosMatriz[i][1] = ingresoDiarioVans;
            gastosMatriz[i][1] = gastoDiarioVans;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Totales: " + pasajerosTotales);
            System.out.println("Pasajeros Cambio Uno: " + pasajerosCambio1);
            System.out.println("Pasajeros Cambio Dos: " + pasajerosCambio2);
            System.out.println("Pasajeros Cambio Tres: " + pasajerosCambio3);
        }

    } // END VOID VANS

    double valorPasajeBuseta = 12000;
    double valorPeajeBuseta = 25000;
    double ingresoDiarioBuseta;
    double gastoDiarioBuseta;
    double acomuladorIngresosBuseta = 0;
    double acomuladorGastosBuseta = 0;

    //VARIABLES PROMEDIO RUTAS (BUSETA)
    double promedioRentabilidadAutopistaBuseta;
    double promedioRentabilidadSantaElenaBuseta;
    double promedioRentabilidadPalmasBuseta;

    //VARIABLES CALCULO AUTOPISTA (BUSETA)
    double consumoGasolinaAutopistaBuseta;
    double consumoAdicionalAutopistaBuseta;
    double consumoNormalAutopistaBuseta;
    double consumoExtraAutopistaBuseta;

    //VARIABLES CALCULO SANTA ELENA (BUSETA)
    double consumoGasolinaSantaElenaBuseta;
    double consumoAdicionalSantaElenaBuseta;
    double consumoNormalSantaElenaBuseta;
    double consumoExtraSantaElenaBuseta;

    //VARIABLES CALCULO PALMAS (BUSETA)
    double consumoGasolinaPalmasBuseta;
    double consumoAdicionalPalmasBuseta;
    double consumoNormalPalmasBuseta;
    double consumoExtraPalmasBuseta;

    //TOTALES DE CONSUMO
    double consumoAutopistaBuseta;
    double consumoSantaElenaBuseta;
    double consumoPalmasBuseta;

    public void Buseta() {
        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN AUTOPISTA (BUSETA)    
        consumoGasolinaAutopistaBuseta = valorGasolina / 30 * 45;
        consumoAdicionalAutopistaBuseta = consumoGasolinaAutopistaBuseta * (0.12 * pasajerosTotales);
        consumoAutopistaBuseta = consumoGasolinaAutopistaBuseta + consumoAdicionalAutopistaBuseta;

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN SANTA ELENA (BUSETA)
        consumoGasolinaSantaElenaBuseta = valorGasolina / 30 * 50;
        consumoAdicionalSantaElenaBuseta = consumoGasolinaSantaElenaBuseta * (0.15 * pasajerosTotales);
        consumoSantaElenaBuseta = consumoGasolinaSantaElenaBuseta + consumoAdicionalSantaElenaBuseta;

        //CALCULAR EL CONSUMO TOTAL DE LA GASOLINA EN PALMAS (BUSETA)
        consumoGasolinaPalmasBuseta = valorGasolina / 30 * 55;
        consumoAdicionalPalmasBuseta = consumoGasolinaPalmasBuseta * (0.15 * pasajerosTotales);
        consumoPalmasBuseta = consumoGasolinaPalmasBuseta + consumoAdicionalPalmasBuseta;

        Cambios();

        for (int i = 0; i < 6; i++) {

            //CONSUMO DE GASOLINA AUTOPISTA (Buseta)
            consumoNormalAutopistaBuseta = ingresoDiarioBuseta - (consumoAutopistaBuseta + valorPeajeBuseta);
            consumoExtraAutopistaBuseta = consumoNormalAutopistaBuseta - totalConsumoCambiosAutopistaBuseta;

            //CONSUMO DE GASOLINA SANTA ELENA (Buseta)
            consumoNormalSantaElenaBuseta = ingresoDiarioBuseta - (consumoSantaElenaBuseta + valorPeajeBuseta);
            consumoExtraSantaElenaBuseta = consumoNormalSantaElenaBuseta - totalConsumoCambiosSantaElenaBuseta;

            //CONSUMO DE GASOLINA PALMAS (Buseta)
            consumoNormalPalmasBuseta = ingresoDiarioBuseta - (consumoPalmasBuseta + valorPeajeVans);
            consumoExtraPalmasBuseta = consumoNormalPalmasBuseta - totalConsumoCambiosPalmasBuseta;

            ingresoDiarioBuseta = valorPasajeBuseta * pasajerosTotales;
            acomuladorIngresosBuseta += ingresoDiarioBuseta;

            gastoDiarioBuseta = consumoAutopistaBuseta + consumoSantaElenaBuseta + consumoPalmasBuseta;
            acomuladorGastosBuseta += gastoDiarioBuseta;

            //CALCULAR EL PROMEDIO DE RENTABILIDAD AUTOPISTA (Buseta)
            promedioRentabilidadAutopistaBuseta = ((consumoNormalAutopistaBuseta + consumoExtraAutopistaBuseta) / 2);

            //CALCULAR EL PROMEDIO DE RENTABILIDAD SANTA ELENA (Buseta)
            promedioRentabilidadSantaElenaBuseta = ((consumoNormalSantaElenaVans + consumoExtraSantaElenaBuseta) / 2);

            //CALCULAR EL PROMEDIO DE RENTABILIDAD PALMAS (Buseta)
            promedioRentabilidadPalmasBuseta = ((consumoNormalPalmasBuseta + consumoExtraPalmasBuseta) / 2);

            ingresosMatriz[i][2] = ingresoDiarioBuseta;
            gastosMatriz[i][2] = gastoDiarioBuseta;

            System.out.println("============ Día " + (i + 1) + " ============");
            System.out.println("Pasajeros Totales: " + pasajerosTotales);
            System.out.println("Pasajeros Cambio Uno: " + pasajerosCambio1);
            System.out.println("Pasajeros Cambio Dos: " + pasajerosCambio2);
            System.out.println("Pasajeros Cambio Tres: " + pasajerosCambio3);

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

    int distanciaBajadaAutopista = 45;
    int distanciaBajadaSantaElena = 50;
    int distanciaBajadaPalmas = 55;

    public void DistanciaRutas() {

        //el total de subida Autopista es de: 45 
        distanciaSubidaAutopistaCambioUno = 10;
        distanciaSubidaAutopistaCambioDos = 25;
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

    double consumoCambioUnoAutopista;
    double consumoCambioDosAutopista;
    double consumoCambioTresAutopista;

    double consumoCambioUnoSantaElena;
    double consumoCambioDosSantaElena;
    double consumoCambioTresSantaElena;

    double consumoCambioUnoPalmas;
    double consumoCambioDosPalmas;
    double consumoCambioTresPalmas;

    double factorConsumoAutopistaTaxi;
    double factorConsumoSantaElenaTaxi;
    double factorConsumoPalmasTaxi;
    double totalConsumoCambiosAutopistaTaxi;
    double totalConsumoCambiosSantaElenaTaxi;
    double totalConsumoCambiosPalmasTaxi;

    double factorConsumoAutopistaVans;
    double factorConsumoSantaElenaVans;
    double factorConsumoPalmasVans;
    double totalConsumoCambiosAutopistaVans;
    double totalConsumoCambiosSantaElenaVans;
    double totalConsumoCambiosPalmasVans;

    double factorConsumoAutopistaBuseta;
    double factorConsumoSantaElenaBuseta;
    double factorConsumoPalmasBuseta;
    double totalConsumoCambiosAutopistaBuseta;
    double totalConsumoCambiosSantaElenaBuseta;
    double totalConsumoCambiosPalmasBuseta;

    public void Cambios() {
        DistanciaRutas();

        cambioUno = .03;
        cambioDos = .02;
        cambioTres = .01;

        //OPERACIONES PARA HALLAR EL TOTAL DE CONSUMO DE LOS CAMBIOS TAXI
        //AUTOPISTA
        factorConsumoAutopistaTaxi = consumoAutopistaTaxi / distanciaBajadaAutopista;
        consumoCambioUnoAutopista = factorConsumoAutopistaTaxi * distanciaSubidaAutopistaCambioUno * cambioUno;
        consumoCambioDosAutopista = factorConsumoAutopistaTaxi * distanciaSubidaAutopistaCambioDos * cambioDos;
        consumoCambioTresAutopista = factorConsumoAutopistaTaxi * distanciaSubidaAutopistaCambioTres * cambioTres;
        totalConsumoCambiosAutopistaTaxi = consumoCambioUnoAutopista + consumoCambioDosAutopista + consumoCambioTresAutopista;

        //SANTA ELENA
        factorConsumoSantaElenaTaxi = consumoSantaElenaTaxi / distanciaBajadaSantaElena;
        consumoCambioUnoSantaElena = factorConsumoSantaElenaTaxi * distanciaSubidaSantaElenaCambioUno * cambioUno;
        consumoCambioDosSantaElena = factorConsumoSantaElenaTaxi * distanciaSubidaSantaElenaCambioDos * cambioDos;
        consumoCambioTresSantaElena = factorConsumoSantaElenaTaxi * distanciaSubidaSantaElenaCambioTres * cambioTres;
        totalConsumoCambiosSantaElenaTaxi = consumoCambioUnoSantaElena + consumoCambioDosSantaElena + consumoCambioTresSantaElena;

        //PALMAS
        factorConsumoPalmasTaxi = consumoPalmasTaxi / distanciaBajadaPalmas;
        consumoCambioUnoPalmas = factorConsumoPalmasTaxi * distanciaSubidaPalmasCambioUno * cambioUno;
        consumoCambioDosPalmas = factorConsumoPalmasTaxi * distanciaSubidaPalmasCambioDos * cambioDos;
        consumoCambioTresPalmas = factorConsumoPalmasTaxi * distanciaSubidaPalmasCambioTres * cambioTres;
        totalConsumoCambiosPalmasTaxi = consumoCambioUnoPalmas + consumoCambioDosPalmas + consumoCambioTresPalmas;

        //OPERACIONES PARA HALLAR EL TOTAL DE CONSUMO DE LOS CAMBIOS VANS
        //AUTOPISTA
        factorConsumoAutopistaVans = consumoAutopistaVans / distanciaBajadaAutopista;
        consumoCambioUnoAutopista = factorConsumoAutopistaVans * distanciaSubidaAutopistaCambioUno * cambioUno;
        consumoCambioDosAutopista = factorConsumoAutopistaVans * distanciaSubidaAutopistaCambioDos * cambioDos;
        consumoCambioTresAutopista = factorConsumoAutopistaVans * distanciaSubidaAutopistaCambioTres * cambioTres;
        totalConsumoCambiosAutopistaVans = consumoCambioUnoAutopista + consumoCambioDosAutopista + consumoCambioTresAutopista;

        //SANTA ELENA
        factorConsumoSantaElenaVans = consumoSantaElenaVans / distanciaBajadaSantaElena;
        consumoCambioUnoSantaElena = factorConsumoSantaElenaVans * distanciaSubidaSantaElenaCambioUno * cambioUno;
        consumoCambioDosSantaElena = factorConsumoSantaElenaVans * distanciaSubidaSantaElenaCambioDos * cambioDos;
        consumoCambioTresSantaElena = factorConsumoSantaElenaVans * distanciaSubidaSantaElenaCambioTres * cambioTres;
        totalConsumoCambiosSantaElenaVans = consumoCambioUnoSantaElena + consumoCambioDosSantaElena + consumoCambioTresSantaElena;

        //PALMAS
        factorConsumoPalmasVans = consumoPalmasVans / distanciaBajadaSantaElena;
        consumoCambioUnoPalmas = factorConsumoPalmasVans * distanciaSubidaSantaElenaCambioUno * cambioUno;
        consumoCambioDosPalmas = factorConsumoPalmasVans * distanciaSubidaSantaElenaCambioDos * cambioDos;
        consumoCambioTresPalmas = factorConsumoPalmasVans * distanciaSubidaSantaElenaCambioTres * cambioTres;
        totalConsumoCambiosPalmasVans = consumoCambioUnoPalmas + consumoCambioDosPalmas + consumoCambioTresPalmas;

        //OPERACIONES PARA HALLAR EL TOTAL DE CONSUMO DE LOS CAMBIOS BUSETA
        //AUTOPISTA
        factorConsumoAutopistaBuseta = consumoAutopistaBuseta / distanciaBajadaAutopista;
        consumoCambioUnoAutopista = factorConsumoAutopistaBuseta * distanciaSubidaAutopistaCambioUno * cambioUno;
        consumoCambioDosAutopista = factorConsumoAutopistaBuseta * distanciaSubidaAutopistaCambioDos * cambioDos;
        consumoCambioTresAutopista = factorConsumoAutopistaBuseta * distanciaSubidaAutopistaCambioTres * cambioTres;
        totalConsumoCambiosAutopistaBuseta = consumoCambioUnoAutopista + consumoCambioDosAutopista + consumoCambioTresAutopista;

        //SANTA ELENA
        factorConsumoSantaElenaBuseta = consumoSantaElenaBuseta / distanciaBajadaSantaElena;
        consumoCambioUnoSantaElena = factorConsumoSantaElenaBuseta * distanciaSubidaSantaElenaCambioUno * cambioUno;
        consumoCambioDosSantaElena = factorConsumoSantaElenaBuseta * distanciaSubidaSantaElenaCambioDos * cambioDos;
        consumoCambioTresSantaElena = factorConsumoSantaElenaBuseta * distanciaSubidaSantaElenaCambioTres * cambioTres;
        totalConsumoCambiosSantaElenaBuseta = consumoCambioUnoSantaElena + consumoCambioDosSantaElena + consumoCambioTresSantaElena;

        //PALMAS
        factorConsumoPalmasBuseta = consumoPalmasBuseta / distanciaBajadaSantaElena;
        consumoCambioUnoPalmas = factorConsumoPalmasBuseta * distanciaSubidaSantaElenaCambioUno * cambioUno;
        consumoCambioDosPalmas = factorConsumoPalmasBuseta * distanciaSubidaSantaElenaCambioDos * cambioDos;
        consumoCambioTresPalmas = factorConsumoPalmasBuseta * distanciaSubidaSantaElenaCambioTres * cambioTres;
        totalConsumoCambiosPalmasBuseta = consumoCambioUnoPalmas + consumoCambioDosPalmas + consumoCambioTresPalmas;

    }//END VOID CAMBIOS

    double[][] ingresosMatriz = new double[6][3]; // Columna 0: Taxi, Columna 1: Vans, Columna 2: Buseta
    double[][] gastosMatriz = new double[6][3];

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

        System.out.println("");
        System.out.println("=====RENTABILIDAD EN AUTOPISTA=====");
        System.out.println("Taxi:" + promedioRentabilidadAutopistaTaxi + " pesos");
        System.out.println("Vans " + promedioRentabilidadAutopistaVans + " pesos");
        System.out.println("Buseta " + promedioRentabilidadAutopistaBuseta + " pesos");
        System.out.println("");
        System.out.println("=====RENTABILIDAD EN SANTA ELENA=====");
        System.out.println("Taxi:" + promedioRentabilidadSantaElenaTaxi + " pesos");
        System.out.println("Vans " + promedioRentabilidadSantaElenaVans + " pesos");
        System.out.println("Buseta " + promedioRentabilidadSantaElenaBuseta + " pesos");
        System.out.println("");
        System.out.println("=====RENTABILIDAD EN PALMAS=====");
        System.out.println("Taxi:" + promedioRentabilidadPalmasTaxi + " pesos");
        System.out.println("Vans " + promedioRentabilidadPalmasVans + " pesos");
        System.out.println("Buseta " + promedioRentabilidadPalmasBuseta + " pesos");

    } // END VOID MATRIZ

    int pasajerosCambio1;
    int pasajerosCambio2;
    int pasajerosCambio3;
    int pasajerosTotales;

    public void Menu() {
        Scanner Dato = new Scanner(System.in);

        // Datos de vehículos
        String[] vehiculos = {"Taxi", "Van", "Buseta"};
        int[] capacidades = {4, 10, 15}; // Capacidad según el vehículo

        // Datos de rutas
        String[] rutas = {"Autopista Medellín-Bogotá", "Santa Elena", "Las Palmas"};
        int[] distancias = {90, 100, 110}; // Distancia ida y vuelta en km

        // Selección de vehículo
        System.out.println("Seleccione el tipo de vehículo:");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println((i + 1) + ". " + vehiculos[i]);
        }
        int opcionVehiculo = Dato.nextInt();
        while (opcionVehiculo < 1 || opcionVehiculo > vehiculos.length) {
            System.out.println("Opción inválida. Seleccione un vehículo válido:");
            opcionVehiculo = Dato.nextInt();
        }

        String vehiculoSeleccionado = vehiculos[opcionVehiculo - 1];
        int capacidadVehiculo = capacidades[opcionVehiculo - 1];

        // Selección de ruta
        System.out.println("Seleccione la ruta:");
        for (int i = 0; i < rutas.length; i++) {
            System.out.println((i + 1) + ". " + rutas[i] + " (" + distancias[i] + " km)");
        }
        int opcionRuta = Dato.nextInt();
        while (opcionRuta < 1 || opcionRuta > rutas.length) {
            System.out.println("Opción inválida. Seleccione una ruta válida:");
            opcionRuta = Dato.nextInt();
        }

        String rutaSeleccionada = rutas[opcionRuta - 1];

        for (int cambio = 1; cambio <= 3; cambio++) {
            System.out.println("¿Cuántos pasajeros subirán en el cambio " + cambio + "?");
            int pasajerosCambio = Dato.nextInt();

            // Asegurarse de que no se exceda la capacidad del vehículo
            while (pasajerosTotales + pasajerosCambio > capacidadVehiculo) {
                System.out.println("¡Error! No puedes exceder la capacidad máxima del vehículo (" + capacidadVehiculo + ").");
                System.out.println("Por favor, ingresa un número válido de pasajeros para el cambio " + cambio + ":");
                pasajerosCambio = Dato.nextInt();
            }

            // Almacenar el número de pasajeros de cada cambio
            switch (cambio) {
                case 1:
                    pasajerosCambio1 = pasajerosCambio;
                    break;
                case 2:
                    pasajerosCambio2 = pasajerosCambio;
                    break;
                case 3:
                    pasajerosCambio3 = pasajerosCambio;
                    break;
                default:
                    break;
            }

            // Actualizar el total de pasajeros
            pasajerosTotales += pasajerosCambio;
        }

        switch (opcionVehiculo) {
            case 1:
                Taxi(); // Llama al método taxi() si el usuario elige Taxi
                break;
            case 2:
                Vans(); // Llama al método van() si el usuario elige Van
                break;
            case 3:
                Buseta(); // Llama al método buseta() si el usuario elige Buseta
                break;
            default:
                break;
        }

        // Mostrar resultados
        System.out.println("\nResumen del viaje:");
        System.out.println("Vehículo seleccionado: " + vehiculoSeleccionado);
        System.out.println("Ruta seleccionada: " + rutaSeleccionada);
        System.out.println("Pasajeros totales abordados: " + pasajerosTotales);
        System.out.println("Validación completada. ¡Buen viaje!");
    }

    public static void main(String[] args) {
        Vehiculo Prueba = new Vehiculo();

        Prueba.Menu();
        Prueba.Matriz();

    }
}
