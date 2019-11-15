/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JLabel;

/**
 *
 * @author Camilo Quiroga
 */
public class Main {
            Scanner scan = new Scanner(System.in);

            
            private static final int VENTIUNA = 21;
            public int[] hand;
    
    private static int generateCard(Random random){
        return Math.abs(random.nextInt() % 13) + 1;
    }
    
    private static String getCharOfCard(int card){
        switch(card){
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.format("%d", card);
        }
    }
    
    private static void printHand(List<Integer> hand){
        Iterator<Integer> it = hand.iterator();
        String out = "";
        while(it.hasNext()) out += getCharOfCard(it.next()) + " ";
        
        System.out.println(out);
    }
    
    private static int getNumberOfA(List<Integer> hand){
        int count = 0;
        Iterator<Integer> it = hand.iterator();
        while(it.hasNext()) if(it.next() == 1) count++;
        return count;
        
    }
    
    private static int getSumWithoutA(List<Integer> hand){
        int count = 0, temp;
        Iterator<Integer> it = hand.iterator();
        while(it.hasNext()) {
            if((temp = it.next()) > 1 ){
                if(temp == 11 || temp == 12 ||temp == 13) count += 10;
                else count += temp;
            }
        }
        return count;
        
    }
    
    private static int[] getPosibilidades(List<Integer> hand){
        int sum = getSumWithoutA(hand), lenght = getNumberOfA(hand) + 1;
        int[] salida = new int[lenght];
        
        for (int i = 0; i < lenght; i++) {
            salida[i] = sum + (lenght - i - 1) + 11 * i;
        }
        
        return salida;
    }
    
     public static void main(String args[]) {
        // y al final no corres nada C:
    } 
     
    public static int getBestSum(int[] pos){
        int salida = pos[0];
        if(salida > VENTIUNA) return -1 * salida;
        for (int i = 1; i < pos.length; i++) {
            if(pos[i] <= VENTIUNA) salida = pos[i];
        }
        
        return salida;
    }
    
    private static void printHands( List<Integer> humanHand, List<Integer> machineHand){
        System.out.println("Su mano es: ");
            printHand(humanHand);
        System.out.println("La mÃ¡quina tiene: ");
            printHand(machineHand);
    }
    
    int numTower = /*200000;//*/scan.nextInt();
        long restriction = /*712712;//*/scan.nextLong();
        int[] towers = new int[numTower];
        int low = 1000000000, high = -1;
        
    private static String listToString(LinkedList<Character> actualString){
        String salida = "";
        for (Iterator<Character> it = actualString.iterator(); it.hasNext();) {
            salida += it.next();
        }
        return salida;
    }
    
     public static void resolve(String input1){
        String salida = "", actualString = "", input = new Scanner(System.in).nextLine();
        char[] arr = input.toCharArray();
        boolean insertarAlInicio = true;     
        for (int i = 0; i < arr.length; i++) {        
            if(arr[i] == '(' || arr[i] == ')'){
                if(insertarAlInicio) salida = actualString + salida;
                else salida = salida + actualString;
                insertarAlInicio = arr[i] == '(';
                actualString = "";
            }else actualString += arr[i];
        }        
        System.out.println((insertarAlInicio) ? actualString + salida : salida + actualString);
    }
    
    
    
    
    public int random() {

        int x = (int) (Math.random() * 255 + 1);
        return x;
    }

    public void verify(int x, String a, JLabel b) {

        switch (x) {
            case 1:
                if ("feliz".equals(a) || "felicidad".equals(a) || "alegria".equals(a)) {
                    b.setText("Correcto");
                } else {
                    b.setText("No es correcto, intentalo de nuevo");
                }
                break;
            case 2:
                if ("confundido".equals(a) || "confusion".equals(a) || "confuso".equals(a)) {
                    b.setText("Correcto");
                } else {
                    b.setText("No es correcto, intentalo de nuevo");
                }
                break;
            case 3:
                if ("triste".equals(a) || "tristeza".equals(a)) {
                    b.setText("Correcto");
                } else {
                    b.setText("No es correcto, intentalo de nuevo");
                }
                break;
            case 4:
                if ("enojado".equals(a) || "bravo".equals(a) || "furioso".equals(a)) {
                    b.setText("Correcto");
                } else {
                    b.setText("No es correcto, intentalo de nuevo");
                }
                break;
        }
    }
}
