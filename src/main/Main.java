/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import time.Time;
/**
 *
 * @author johan
 */
public class Main {
    public static void main(String[] args) {
        Time time = new Time(58, 33, 5);
        
        time.nextSecond();
        time.nextSecond();
        System.out.println(time.toString());
        
        time.previousSecond();
        
        System.out.println(time.toString());
        
    }
}
