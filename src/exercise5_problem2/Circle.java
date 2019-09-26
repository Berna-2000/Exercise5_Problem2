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
public class Circle extends Shape {
    protected double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle (double radius){
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled){
        
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        double area;
        area = Math.PI* Math.pow(this.radius, 2);
        return area;
    }
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }
    public String toString() {
        String stat;
        if(this.filled==true){
            stat = "filled";
        }else{
            stat = "not filled";
        }
        return "A Circle with the radius "+this.radius+", which is a subclass of "+super.toString();
    }
}
