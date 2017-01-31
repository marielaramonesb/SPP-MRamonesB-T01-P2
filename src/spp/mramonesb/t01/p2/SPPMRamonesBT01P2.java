//Mariela Ramones Balvoa- A01411449- IMT
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.t01.p2;
import java.util.Scanner;

/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Calculador de superficie y perimetro");    
    //Paso1. variables
    double base, altu;
    double oper;
    base=solicitarDatos("base");
    altu=solicitarDatos("altura");
    oper = operacion(base,altu);
    }
    // paso2. introducir datos
    public static double solicitarDatos(String n){
    //Paso 2. introducir datos
    double datos;
    Scanner kb= new Scanner (System.in);
    
    System.out.println("Introduce de la " + n + "de tu rectangulo");
    datos=kb.nextDouble();
    return datos;
    }
    public static double operacion (double base, double altu){    
    //Paso 3. operaciones
    double sup, per;
    sup= (double) (base*altu);
    System.out.println("La superficie es " + sup);
    
    per= (double) ((base+altu)*2);
    System.out.println("El perimetro es " + per);
    return sup;
    }


    }
    


