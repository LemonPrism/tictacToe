import java.util.Scanner; 


public class ticTac
{
    public static void main ( String [] args){
        Scanner coor  = new Scanner (System.in); 
        
        int rNum = 1; 
        int f = 0 ; 
        String XorO = ""; 
        boolean WorL=  false; 
        
        while ( WorL == false) {
        
        System.out.println( "Round " + rNum); 
        
        int [][] grid  = new int [3] [3]; 
        
        
        if ( f == 0 ){
            XorO = " "; 
        }else if ( f == 1){
            XorO = "X"; 
        }else {
             XorO = "O"; 
        }
        
        
        for ( int row =0; row < grid.length; row++){
            for ( int col = 0 ; col < grid[0].length; col ++){
                System.out.print ( "["+ XorO + "]" ); 
            }
            System.out.println();
        }
        
        
        System.out.print("X, make your move ( row, col): "); 
        String c = coor.nextLine(); 
        rNum++; 
        
        
        
        
        
    }
        
    }
}