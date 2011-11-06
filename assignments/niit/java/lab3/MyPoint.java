/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package assignments.niit.java.lab3;

/**
 *
 * @author gautam
 */
public class MyPoint {
    public int x , y;

    public MyPoint(){
        
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "["+x+","+y+"]";
    }

}
