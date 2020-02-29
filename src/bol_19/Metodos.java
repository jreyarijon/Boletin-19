/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_19;

import javax.swing.JOptionPane;
import validar.pedirDato;

/**
 *
 * @author Josemolamazo
 */
public class Metodos {

    public int[][] crearTaboa(int[][] taboa) {
        for (int f = 0; f < taboa.length; f++) {
            for (int c = 0; c < taboa.length; c++) {
                taboa[f][c] = pedirDato.pedirInt();
            }
        }
        return taboa;
    }

    public void verTaboa(int[][] goles, String[] equipo, String[] xornada) {
        System.out.print("Equipo/Xornada  ");
        for (int k = 0; k < goles.length; k++) {
            System.out.print("   " + xornada[k] + "   ");
        }
        System.out.println("   ");
        for (int e = 0; e < goles.length; e++) {
            System.out.print(equipo[e] + " :       ");
            for (int x = 0; x < goles[e].length; x++) {
                System.out.print(goles[e][x] + "   ");
            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }

    public void listaEquipos(int[][] goles, String[] equipo, int[] total) {
        int acuGoles;
        for (int i = 0; i < goles.length; i++) {
            acuGoles = 0;
            for (int j = 0; j < goles.length; j++) {
                acuGoles = goles[i][j] + acuGoles;
            }
            total[i] = acuGoles;

            System.out.println("Goles totales marcados = " + total[i]);
        }
        int auxtotal;
        String auxequ;
        for (int i = 0; i < total.length - 1; i++) {
            for (int j = 1; j < total.length; j++) {

                if (total[i] < total[j]) {
                    auxtotal = total[i];
                    total[i] = total[j];
                    total[j] = auxtotal;
                    auxequ = equipo[i];
                    equipo[i] = equipo[j];
                    equipo[j] = auxequ;

                }

            }
        }
        for (int k = 0; k < equipo.length; k++) {
            System.out.print("  " + equipo[k] + "  ");

        }
        System.out.println("");
        for (int f = 0; f < goles.length; f++) {
            System.out.print("   " + total[f] + "      ");
        }
        System.out.println("");
    }

    public void maxGolesPorXornada(String[] equipo, int[][] listaxe, int[] goles) {
        int maxGoles;
    String equipoMax[]=new String[equipo.length];
        
    for(int i=0;i<listaxe[0].length;i++){
    maxGoles=0;
        for(int j=0;j<listaxe.length;j++){
            if(maxGoles<=listaxe[j][i]){
            maxGoles=listaxe[j][i];
            equipoMax[j]=equipo[j];
            }
        }
    System.out.println("Na xornada "+(i+1)+" os maximos goleadores foron (con "+maxGoles+" goles)" +":");
        for(int k=0;k<listaxe.length;k++){
            if(maxGoles==listaxe[k][i]){
            System.out.println(equipoMax[k]);
            }
        }
    }
        System.out.println("");

    }

    public void verTaboaEnOrde(int[][] taboa, String[] equipo, String[] xornada, int[] total) {
        System.out.print("Equipo/Jornada  ");
        for (int k = 0; k < taboa.length; k++) {
            System.out.print(xornada[k] + " ");
        }
        System.out.println("");
        for (int i = 0; i < taboa.length; i++) {
            System.out.print(equipo[i] + " - ");
            for (int j = 0; j < taboa[i].length; j++) {
                System.out.print(taboa[i][j] + " ");
            }
            System.out.println(" - " + total[i]);
        }
        System.out.println("");
    }

   
    public void buscarGolesEnXornada(String[] equipo, String[] xornada, int[][] total) {
        int max;
        String equipom[] = new String[equipo.length];

        for (int i = 0; i < total[0].length; i++) {
            max = 0;
            for (int j = 0; j < total.length; j++) {
                if (max <= total[j][i]) {
                    max = total[j][i];
                    equipom[j] = equipo[j];
                }
            }
            for (int j = 0; j < total.length; j++) {
                if (max == total[j][i]) {
                    System.out.println("O equipo: " + equipom[j] + " marcou: " + max + " goles na xornada: " + xornada[i]);
                }
            }
        }
        System.out.println("");
    }

  
    public void buscaAvanzada(String[] equipo, String[] xornada, int[][] goles) {
        int posicionE = 0, posicionJ = 0;
        String equ = JOptionPane.showInputDialog(null, "Nome do equipo: ");
        String xor = JOptionPane.showInputDialog(null, "Introduza a xornada: ");
        for (int i = 0; i < equipo.length; i++) {
            if (equ.equals(equipo[i])) {
                posicionE = i;
            }
        }
        for (int i = 0; i < xornada.length; i++) {
            if (xor.equals(xornada[i])) {
                posicionJ = i;
            }
        }
        System.out.println("O equipo " + equ + " marcou " + goles[posicionE][posicionJ] + " goles na xornada " + xor);

    }


    public void sair() {
        System.exit(0);
    }
}
