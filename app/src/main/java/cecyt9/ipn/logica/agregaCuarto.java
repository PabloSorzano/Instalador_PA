/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecyt9.ipn.logica;


import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author Sorz Torres
 */
public class agregaCuarto {



    BD bd = new BD();
    validacionesJT vd = new validacionesJT();
    Scanner leer = new Scanner(System.in);
    Connection co = null;
    Statement s = null;
    ResultSet rs = null;

    int idUsr = 666, idHs = 666;

    String resTex = "", datos[] = null;
    boolean sigueCu = true, siguePi = true, sigueDis = true;
    String sigCu, sigPi, sigDis;
    int pisos = 1, cuartos = 1, dispositivos = 1;

    int numeroPiso = 0, disP = 0;
    String nombreCuarto = "", obS = "";

    boolean numP;

    public agregaCuarto(String d) {
        //String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        //System.out.println(Arrays.toString(fontNames));

        this.datos = d.split(",");
        idHs = Integer.parseInt(datos[0]);
        idUsr = Integer.parseInt(datos[1]);
        System.out.println("Usuario: " + idUsr);
        System.out.println("Casa: " + idHs);
        System.out.println(d);
        agregaC();
    }

    public void agregaC() {
        System.out.println("==========Agregar cuarto(s)==========");
        do {
            System.out.println("Ingrese el numero del piso");
            numeroPiso += Integer.parseInt(leer.nextLine().trim()) + 0;
            analiza(String.valueOf(numeroPiso).trim());

            do {
                System.out.println("Ingrese el nombre del cuarto");
                nombreCuarto += leer.nextLine().trim() + ",";
                cuartos++;
                analiza(nombreCuarto);

                do {
                    System.out.println("Seleccione un  dispositivo a agregar");
                    System.out.println("1. FOCO");
                    System.out.println("2. VENTILA");
                    System.out.println("3. PUERTA");
                    System.out.println("4. VENTANA");
                    System.out.println("5. CÁMARA");
                    disP += Integer.parseInt(leer.nextLine().trim()) + cuartos;
                    if (Integer.parseInt(leer.nextLine()) == 1 || Integer.parseInt(leer.nextLine()) == 2 || Integer.parseInt(leer.nextLine()) == 3 || Integer.parseInt(leer.nextLine()) == 4 || Integer.parseInt(leer.nextLine()) == 5) {
                        System.out.println("Desea agregar otro dispositivo en el mismo cuarto? SI / NO");
                        sigDis = leer.nextLine();
                    } else {
                        System.out.println("Seleccione una opción válida");
                        System.out.println("1. FOCO");
                        System.out.println("2. VENTILA");
                        System.out.println("3. PUERTA");
                        System.out.println("4. VENTANA");
                        System.out.println("5. CÁMARA");
                        disP += Integer.parseInt(leer.nextLine()) + cuartos;
                    }
                } while (sigDis.equalsIgnoreCase("si"));

                System.out.println("Desea agregar otro cuarto en el mismo piso? SI / NO");
                sigCu = leer.nextLine().trim();

            } while (sigCu.equalsIgnoreCase("si"));

            System.out.println("Ingrese observaciones (optativa)");
            obS += leer.nextLine().trim() + numeroPiso + ",";
            analiza(obS);

            System.out.println("Desea agregar otro piso? SI / NO");
            sigPi = leer.nextLine().trim();

        } while (sigPi.equalsIgnoreCase("si"));

        System.out.println(numeroPiso);
        System.out.println(nombreCuarto);
        System.out.println(disP);
        System.out.println(obS);
//        evalua();
    }

    public void evalua() {
        System.out.println("===========Numero Piso===========");
        System.out.println(numeroPiso);
        numP = vd.soloNumeros(String.valueOf(numeroPiso));

        System.out.println("===========Numero Piso===========");
        System.out.println(numeroPiso);
        numP = vd.soloNumeros(String.valueOf(numeroPiso));
    }

    public void analiza(String t) {
        if (t.equalsIgnoreCase("cerrar")) {
            cerrar();
        } else {
        }
    }

    public void cerrar() {
        System.out.println("-------Cerrar-------");
        bd.conectar();
        System.out.println(bd.eliminarDatos("usuario", "idUsuario", "" + idUsr + "", ""));
        System.out.println(bd.eliminarDatos("Casa", "idCasa", "" + idHs + "", ""));
        System.exit(0);
    }

}
