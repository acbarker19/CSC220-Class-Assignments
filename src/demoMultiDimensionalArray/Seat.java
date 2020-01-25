/*
Bvase class for theater demo.
*/
package demoMultiDimensionalArray;

/**
 *
 * @author barkera2020
 */
public class Seat {
    private int x, y, cost;
    private String name;
    private Boolean empty;
    
    public Seat(int x, int y, String name, int cost){
        this.x = x;
        this.y = y;
        this.name = name;
        this.cost = cost;
        empty = true;
    }
    
    public Boolean isEmpty(){
        return empty;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void setName(String name){
        this.name = name;
        empty = false;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCost(){
        return cost;
    }
    
    public static void main(String[] args){
        Seat temp = new Seat(34, 56, "Bob", 10);
        System.out.println("x: " + temp.getX());
    }
}
