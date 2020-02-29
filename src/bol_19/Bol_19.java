/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_19;

import javax.swing.JOptionPane;

/**
 *
 * @author Josemolamazo
 */
public class Bol_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] goles = new int[3][3];
        String[] equipos = {"Celta","Depor","Malaga"};
        String[] xornadas = {"X1","X2","X3"};
        int[] total= new int [3];
        Metodos obx = new Metodos();
       
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("**** MENU ****\n 1--->crear Matriz\n 2---> Amosar \n "
                    + "3--->Orde de goles crecente \n 4--->Equipo con máis goles/xornada \n 5---> Goles segun equipo e xornada "
                    + "\n 6--->Busqueda avanzada \n 7--->Sair \nTeclea opcion: \n"));
            switch (opcion) {
                case 1:
                    goles = obx.crearTaboa(goles);
                    break;
                case 2:
                    obx.verTaboa(goles, equipos, xornadas);
                    break;
                case 3:
                    obx.listaEquipos(goles, equipos, total);
                    break;     
                case 4:
                    obx. maxGolesPorXornada(equipos, goles, total);
                    break;
                case 5:
                    obx.buscarGolesEnXornada(equipos, xornadas, goles);
                    break;
                case 6:
                    obx.buscaAvanzada(equipos, xornadas, goles);
                    break;
                case 7:
                    obx.sair();
                  
                
            }
        } while (opcion < 8);

    }
    
}
