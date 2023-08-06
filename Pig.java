/** Autor: Esteban enrique Cárcamo Urízar
 *  Fecha de creación: 7/05/23 ; Hora: 7:30
 *  Última fecha de modificación: 5/08/23 ; Hora: 12:40
 *  Descripción: Juego de pig con objetos en java
 */

import java.util.Scanner;

public class Pig{
    public static void main(String[] args) {

        int opc = 0;
        int decision = 0;

        Scanner scan = new Scanner(System.in);

        Dado dado1 = new Dado();
        Dado dado2 = new Dado();


        Jugador jugador1 = new Jugador("1");

        Jugador jugador2 = new Jugador("2");

        Jugador jugador3 = new Jugador("3");

        Jugador jugador4 = new Jugador("4");


        
        System.out.println("---------------------------");
        System.out.println("Bienvenidos jugadores");

        while(opc==0){

            while(decision==0){
                System.out.println("---------------------------");
                System.out.println("Turno del jugador " + jugador1.getIdentificador());
                System.out.println("---------------------------");
                        
                dado1.randomNumber();
                int numerorandom1 = dado1.getNumeroDado();

                dado2.randomNumber();
                int numerorandom2 = dado2.getNumeroDado();

                int suma = numerorandom1 + numerorandom2;

                System.out.println("Dado 1: " + numerorandom1);
                System.out.println("Dado 2: " + numerorandom2);
                
                //jugador1.setPuntosTemporales(0);

                if(numerorandom1 == 1 || numerorandom2==1){
                    System.out.println("OH! Acabas de sacar un 1, se borran tus puntos");
                    jugador1.setPuntosLocales(0);
                    jugador1.setPuntosTotales(0);
                    jugador1.setPuntosTemporales(0);
                }else{
                    jugador1.setPuntosLocales(suma);
                    jugador1.setPuntosTotales(suma);
                    jugador1.setPuntosTemporales(jugador1.getPuntosLocales());
                }

                if(jugador1.getPuntosTemporales()>=20){
                    System.out.println("Tus puntos en este tiro son: " + jugador1.getPuntosLocales());
                    
                    System.out.println("Tus puntos durante tus turnos son: " + jugador1.getPuntosTemporales());
                    
                    System.out.println("Puntos totales: " + jugador1.getPuntosTotales());
                    System.out.println("UPS! Acabas de acumular "+ jugador1.getPuntosTemporales() + " seguidos, pasas el turno.");
                    jugador1.setPuntosTemporales(0);
                    break;
                }else if(jugador1.getPuntosTotales()>=100){
                    break;
                }else{   
                    System.out.println("Tus puntos en este tiro son: " + jugador1.getPuntosLocales());
                    System.out.println("Tus puntos durante tus turnos son: " + jugador1.getPuntosTemporales());
                    
                    System.out.println("Puntos totales: " + jugador1.getPuntosTotales());
                    
                }

                    System.out.println("\nDesea continuar tirando? \nPresione 0 para continuar\nPresione 1 para pasar el turno");
                    decision = scan.nextInt();
                

            }//decision
            decision=0;

            if(jugador1.getPuntosTotales()>=100)
                    break;
            else if(jugador2.getPuntosTotales()>=100)
                    break;
            else if(jugador3.getPuntosTotales()>=100)
                    break;
            else if(jugador4.getPuntosTotales()>=100)
                    break;

            while(decision==0){
                System.out.println("---------------------------");
                System.out.println("Turno del jugador " + jugador2.getIdentificador());
                System.out.println("---------------------------");
                        
                dado1.randomNumber();
                int numerorandom1 = dado1.getNumeroDado();

                dado2.randomNumber();
                int numerorandom2 = dado2.getNumeroDado();

                int suma = numerorandom1 + numerorandom2;

                System.out.println("Dado 1: " + numerorandom1);
                System.out.println("Dado 2: " + numerorandom2);
                
                //jugador2.setPuntosTemporales(0);

                if(numerorandom1 == 1 || numerorandom2==1){
                    System.out.println("OH! Acabas de sacar un 1, se borran tus puntos");
                    jugador2.setPuntosLocales(0);
                    jugador2.setPuntosTotales(0);
                    jugador2.setPuntosTemporales(0);
                }else{
                    jugador2.setPuntosLocales(suma);
                    jugador2.setPuntosTotales(suma);
                    jugador2.setPuntosTemporales(jugador2.getPuntosLocales());
                }

                if(jugador2.getPuntosTemporales()>=20){
                    System.out.println("Tus puntos en este tiro son: " + jugador2.getPuntosLocales());
                    
                    System.out.println("Tus puntos durante tus turnos son: " + jugador2.getPuntosTemporales());
                    
                    System.out.println("Puntos totales: " + jugador2.getPuntosTotales());
                    System.out.println("UPS! Acabas de acumular "+ jugador2.getPuntosTemporales() + " seguidos, pasas el turno.");
                    jugador2.setPuntosTemporales(0);
                    break;
                }else if(jugador2.getPuntosTotales()>=100){
                    break;
                }else{   
                    System.out.println("Tus puntos en este tiro son: " + jugador2.getPuntosLocales());
                    System.out.println("Tus puntos durante tus turnos son: " + jugador2.getPuntosTemporales());
                    
                    System.out.println("Puntos totales: " + jugador2.getPuntosTotales());
                    
                }

                    System.out.println("\nDesea continuar tirando? \nPresione 0 para continuar\nPresione 1 para pasar el turno");
                    decision = scan.nextInt();
                

            }//decision
            decision=0;

            if(jugador1.getPuntosTotales()>=100)
                    break;
            else if(jugador2.getPuntosTotales()>=100)
                    break;
            else if(jugador3.getPuntosTotales()>=100)
                    break;
            else if(jugador4.getPuntosTotales()>=100)
                    break;

            
            while(decision==0){
                System.out.println("---------------------------");
                System.out.println("Turno del jugador " + jugador3.getIdentificador());
                System.out.println("---------------------------");
                        
                dado1.randomNumber();
                int numerorandom1 = dado1.getNumeroDado();

                dado2.randomNumber();
                int numerorandom2 = dado2.getNumeroDado();

                int suma = numerorandom1 + numerorandom2;

                System.out.println("Dado 1: " + numerorandom1);
                System.out.println("Dado 2: " + numerorandom2);
                
                //jugador3.setPuntosTemporales(0);

                if(numerorandom1 == 1 || numerorandom2==1){
                    System.out.println("OH! Acabas de sacar un 1, se borran tus puntos");
                    jugador3.setPuntosLocales(0);
                    jugador3.setPuntosTotales(0);
                    jugador3.setPuntosTemporales(0);
                }else{
                    jugador3.setPuntosLocales(suma);
                    jugador3.setPuntosTotales(suma);
                    jugador3.setPuntosTemporales(jugador3.getPuntosLocales());
                }

                if(jugador3.getPuntosTemporales()>=20){
                    System.out.println("Tus puntos en este tiro son: " + jugador3.getPuntosLocales());
                    
                    System.out.println("Tus puntos durante tus turnos son: " + jugador3.getPuntosTemporales());
                    
                    System.out.println("Puntos totales: " + jugador3.getPuntosTotales());
                    System.out.println("UPS! Acabas de acumular "+ jugador3.getPuntosTemporales() + " seguidos, pasas el turno.");
                    jugador3.setPuntosTemporales(0);
                    break;
                }else if(jugador3.getPuntosTotales()>=100){
                    break;
                }else{   
                    System.out.println("Tus puntos en este tiro son: " + jugador3.getPuntosLocales());
                    System.out.println("Tus puntos durante tus turnos son: " + jugador3.getPuntosTemporales());
                    
                    System.out.println("Puntos totales: " + jugador3.getPuntosTotales());
                    
                }

                    System.out.println("\nDesea continuar tirando? \nPresione 0 para continuar\nPresione 1 para pasar el turno");
                    decision = scan.nextInt();
                

            }//decision
            decision=0;

            if(jugador1.getPuntosTotales()>=100)
                    break;
            else if(jugador2.getPuntosTotales()>=100)
                    break;
            else if(jugador3.getPuntosTotales()>=100)
                    break;
            else if(jugador4.getPuntosTotales()>=100)
                    break;

            
            while(decision==0){
                System.out.println("---------------------------");
                System.out.println("Turno del jugador " + jugador4.getIdentificador());
                System.out.println("---------------------------");
                        
                dado1.randomNumber();
                int numerorandom1 = dado1.getNumeroDado();

                dado2.randomNumber();
                int numerorandom2 = dado2.getNumeroDado();

                int suma = numerorandom1 + numerorandom2;

                System.out.println("Dado 1: " + numerorandom1);
                System.out.println("Dado 2: " + numerorandom2);
                
                //jugador4.setPuntosTemporales(0);

                if(numerorandom1 == 1 || numerorandom2==1){
                    System.out.println("OH! Acabas de sacar un 1, se borran tus puntos");
                    jugador4.setPuntosLocales(0);
                    jugador4.setPuntosTotales(0);
                    jugador4.setPuntosTemporales(0);
                }else{
                    jugador4.setPuntosLocales(suma);
                    jugador4.setPuntosTotales(suma);
                    jugador4.setPuntosTemporales(jugador4.getPuntosLocales());
                }

                if(jugador4.getPuntosTemporales()>=20){
                    System.out.println("Tus puntos en este tiro son: " + jugador4.getPuntosLocales());
                    
                    System.out.println("Tus puntos durante tus turnos son: " + jugador4.getPuntosTemporales());
                    
                    System.out.println("Puntos totales: " + jugador4.getPuntosTotales());
                    System.out.println("UPS! Acabas de acumular "+ jugador4.getPuntosTemporales() + " seguidos, pasas el turno.");
                    jugador4.setPuntosTemporales(0);
                    break;
                }else if(jugador4.getPuntosTotales()>=100){
                    break;
                }else{   
                    System.out.println("Tus puntos en este tiro son: " + jugador4.getPuntosLocales());
                    System.out.println("Tus puntos durante tus turnos son: " + jugador4.getPuntosTemporales());
                    
                    System.out.println("Puntos totales: " + jugador4.getPuntosTotales());
                    
                }

                    System.out.println("\nDesea continuar tirando? \nPresione 0 para continuar\nPresione 1 para pasar el turno");
                    decision = scan.nextInt();
                

            }//decision
            decision=0;

            if(jugador1.getPuntosTotales()>=100)
                    break;
            else if(jugador2.getPuntosTotales()>=100)
                    break;
            else if(jugador3.getPuntosTotales()>=100)
                    break;
            else if(jugador4.getPuntosTotales()>=100)
                    break;

            
            jugador1.setPuntosTemporales(0);
            jugador2.setPuntosTemporales(0);
        }//opc

        System.out.println("Fin :D");

    }//main
}//clase