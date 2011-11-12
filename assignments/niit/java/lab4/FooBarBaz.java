
package assignments.niit.java.lab4;

/**
 *
 * @author gautam
 */
public class FooBarBaz {

    public static void main(String [] args){
        for(int i=1;i<=50;i++){
            System.out.print(i);
            if(i%3 == 0)
                System.out.print(" Foo");
            if(i%5 == 0 )
                System.out.print(" Bar");
            if(i%7 == 0)
                System.out.print(" Baz");
            System.out.println();

        }
    }

}
