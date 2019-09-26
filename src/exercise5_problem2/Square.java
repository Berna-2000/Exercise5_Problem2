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
public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide (double side){
         this.setLength(side);
         this.setWidth(side);
    }
    public double getSide(){
        return this.length;
    }
    public void setWidth (double side){
        super.setWidth(side);
    }
    public void setLength (double side){
        super.setLength(side);
    }
    public String toString() {
        return "A square with side = "+this.length+", which is a subclass of "+super.toString();
    }
}
