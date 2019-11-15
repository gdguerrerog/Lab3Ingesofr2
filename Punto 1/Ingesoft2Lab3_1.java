/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingesoft2lab3_1;

import java.util.Scanner;

/**
 *
 * @author German le yo
 */
public class Ingesoft2Lab3_1 {
    
    interface CostStategy{
        int getCost();
    }
    
    interface TimeStrategy {
        int getTime();
    }
    
    static abstract class TransportMethod {
        String name;
        CostStategy cost;
        TimeStrategy time;
        
        void transport() throws InterruptedException {
            int cost = this.cost.getCost();
            int time = this.time.getTime();
            
            System.out.print("You payed: ");
            Thread.sleep(500);
            for(int j = 0; j < cost; j++){
                System.out.print("$$");
                Thread.sleep(500);
            }
            Thread.sleep(500);
            System.out.printf(" for use %s.\nTotal: %d\n", name, cost);
            Thread.sleep(500);
            System.out.println("Begin:");
            Thread.sleep(500);
            for(int i = 0; i < time; i++){
                System.out.println("Moving...");
                Thread.sleep(2000);
            }
            
            System.out.println("You are now on the airport :D");
        }
    }
    
    static class LowCostStrategy implements CostStategy{
        @Override
        public int getCost() {
            return 1;
        }  
    }
    
    static class MediumCostStrategy implements CostStategy{
        @Override
        public int getCost() {
            return 7;
        }  
    }
    
    static class HighCostStrategy implements CostStategy{
        @Override
        public int getCost() {
            return 20;
        }  
    }
    
    static class LowTimeStrategy implements TimeStrategy{
        @Override
        public int getTime() {
            return 5;
        }  
    }
    
    static class MediumTimeStrategy implements TimeStrategy{
        @Override
        public int getTime() {
            return 15;
        }  
    }
    
    static class HighTimeStrategy implements TimeStrategy{
        @Override
        public int getTime() {
            return 30;
        }  
    }
    
    static class Bicycle extends TransportMethod{
        public Bicycle(){
            name = "Bicycle";
            cost = new LowCostStrategy();
            time = new HighTimeStrategy();
        }
    }
    
    static class Bus extends TransportMethod{
        public Bus(){
            name = "Bus";
            cost = new MediumCostStrategy();
            time = new MediumTimeStrategy();
        }
    }
    
    static class Cab extends TransportMethod{
        public Cab(){
            name = "Cab";
            cost = new HighCostStrategy();
            time = new LowTimeStrategy();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        TransportMethod bicycle = new Bicycle(), bus = new Bus(), cab = new Cab();
        
        
        System.out.println("You have to get to the airport.");
        System.out.println("Which transport method you select:");
        System.out.printf("1) %s\n", bicycle.name);        
        System.out.printf("2) %s\n", bus.name);
        System.out.printf("3) %s\n", cab.name);
        
        System.out.print("Select: ");
        
        int input = new Scanner(System.in).nextInt();
        
        TransportMethod selected;
        switch(input){
            case 1: selected = bicycle; break;
            case 2: selected = bus; break;
            case 3: selected = cab; break;
            default: System.out.println("I don't know what you select :c"); return;
        }
        
        System.out.printf("You select: %s\n", selected.name);
        selected.transport();
    }
}
