/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package assignments.niit.java.lab3;

/**
 *
 * @author gautam
 */
public class Main {
    public static void main(String [] args){
    MyPoint start = new MyPoint(10,10);
    MyPoint end = new MyPoint(20,30);

    System.out.println("Start point is " + start);
    System.out.println("End point is " + end+"\n");
    MyPoint stray = end;

    System.out.println("Stray point is " + stray);
    System.out.println("End point is " + end+"\n");

    stray.x = 47;
    stray.y = 50;
    System.out.println("Stray point is " + stray);
    System.out.println("End point is " + end);
    System.out.println("Start point is " + start);
    }

}
