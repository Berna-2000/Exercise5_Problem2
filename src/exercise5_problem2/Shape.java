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
public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor (String color){
        this.color = color;
    }
    public String getColor (){
        return this.color;
    }
    public void setFilled (boolean filled){
        this.filled = filled;
    }
    public boolean isFilled (){
        return this.filled;
    }
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
    public String toString (){
        String stat;
        if(this.filled==true){
            stat = "filled";
        }else{
            stat = "not filled";
        }
        return "A Shape with color of "+this.color+" and "+stat;
    }
}
