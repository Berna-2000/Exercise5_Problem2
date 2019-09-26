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
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return this.width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return this.length;
    }
     public double getArea() {
        double area;
        area = this.getWidth()*this.getLength(); 
        return area;
    }
    public double getPerimeter (){
        double perimeter = 2*this.length + 2*this.width;
        return perimeter;
    }
    public String toString() {
        return "A Rectangle with width = "+this.width+" and length = "+this.length+", which is a subclass of "+super.toString();
    }
}
