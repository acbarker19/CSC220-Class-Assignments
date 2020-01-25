/*
A basic 2D array of seats.
*/
package demoMultiDimensionalArray;

/**
 *
 * @author barkera2020
 */
public class Theater {
    private Seat[][] mySeat;
    
    private int NUM_COLS = 4;
    private int NUM_ROWS = 6;
    
    public Theater(){
        mySeat = new Seat[NUM_ROWS][NUM_COLS];
        
        for(int i = 0; i < NUM_ROWS; i++){
            for(int j = 0; j < NUM_COLS; j++){
                if(i < 2){
                    mySeat[i][j] = new Seat(i * 30, j * 30, "???", 15);
                }else{
                    mySeat[i][j] = new Seat(i * 30, j * 30, "???", 10);
                }
            }
        }
    }
    
    public void reserveSeat(int row, int col, String name){
        Boolean okayToReserve = true;
        
        if(row >= NUM_ROWS || row < 0){
            System.out.println("row not in range");
            okayToReserve = false;
        }
        if(col >= NUM_COLS || col < 0){
            System.out.println("column not in range");
            okayToReserve = false;
        }
        if(okayToReserve && mySeat[row][col].isEmpty()){
            System.out.println("Assigned seat " + row + " " + col);
            mySeat[row][col].setName(name);
        }
        else{
            System.out.println("seat taken");
        }
    }
    
    public void reserveSeatsInRow(int rowNum, int howMany, String name){
        Boolean okayToReserve = true;
        
        if(rowNum >= NUM_ROWS || rowNum < 0){
            System.out.println("row not in range");
            okayToReserve = false;
        }
        for(int i = 0; i < howMany; i++){
            if(okayToReserve && mySeat[rowNum][i].isEmpty()){
                mySeat[rowNum][i].setName(name);
            }
            else{
                System.out.println("Sorry, a seat was reserved");
            }
        }
    }
    
    public int getTotalReservedSeats(){
        int total = 0;
        
        for(int i = 0; i < NUM_ROWS; i++){
            for(int j = 0; j < NUM_COLS; j++){
                if(!mySeat[i][j].getName().equals("???")){
                    total++;
                }
            }
        }
        
        return total;
    }
    
    public int getTotalCostOfReservedSeats(){
        int total = 0;
        
        for(int i = 0; i < NUM_ROWS; i++){
            for(int j = 0; j < NUM_COLS; j++){
                if(!mySeat[i][j].getName().equals("???")){
                    total += mySeat[i][j].getCost();
                }
            }
        }
        
        return total;
    }
    
    public void printTheater(){
        for(int i = 0; i < NUM_ROWS; i++){
            for(int j = 0; j < NUM_COLS; j++){
                System.out.print(mySeat[i][j].getName() + " -- " +
                        mySeat[i][j].getX() + ", " + mySeat[i][j].getY() + "\t");
            }
            System.out.println("");
        }
    }
    
    public String toString(){
        String answer = "";
        
        for(int i = 0; i < NUM_ROWS; i++){
            for(int j = 0; j < NUM_COLS; j++){
                answer += mySeat[i][j].getX() + " " + mySeat[i][j].getY()
                + " " + mySeat[i][j].getName() + " " + mySeat[i][j].getCost() +
                "  --  ";
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args){
        Theater test = new Theater();
        
        System.out.println("toString");
        System.out.println(test.toString());
        
        String name = "Bob";
        test.reserveSeat(2, 3, name);
        
        name = "Sally";
        test.reserveSeat(222, 3, name);
        
        name = "Chuck";
        test.reserveSeat(2, 123, name);
        
        name = "Tom";
        test.reserveSeat(2, 3, name);
        
        name = "Sue";
        test.reserveSeatsInRow(0, 3, name);
        
        System.out.println("printTheater");
        test.printTheater();
        
        System.out.println("Reserved Seats: " + test.getTotalReservedSeats());
        System.out.println("Total Cost of Reserved Seats: " + test.getTotalCostOfReservedSeats());
    }
}
