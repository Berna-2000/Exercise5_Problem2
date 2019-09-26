/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5_problem2;

/**
 *
 * @author ferolinma_cis21035
 */
public class Exercise5_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape sh = new Circle();
        sh.setColor("red");
        sh.setFilled(false);
        System.out.println(sh.toString());
        System.out.println("Circumference: "+sh.getPerimeter());//check if the method getPerimeter() is overridden
        System.out.println("Area: "+sh.getArea());//check if getArea is overridden
        Shape r = new Rectangle(1.0, 1.0);
        System.out.println(r.toString());
        System.out.println("Perimeter: "+r.getPerimeter());//check if the method getPerimeter() is overridden
        System.out.println("Area: "+r.getArea());//check if getArea is overridden
        Square s = new Square ();
        s.setSide(1.0); 
        System.out.println(s.toString());
        System.out.println("Side: "+s.getSide());//just for checking if the value has been set
    }
    
}
