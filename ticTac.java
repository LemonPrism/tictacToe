import java.util.Scanner; 

public class ticTac
{
    public static void main ( String [] args){
        Scanner coor  = new Scanner (System.in); 

        int rNum = 1; 
        int f = 0 ; 
        String XorO = ""; 
        boolean WorL=  false; 
        String XorOturn = "X";
        int [][] grid  = new int [3] [3]; 

        while ( WorL == false) {
            if (rNum%2==0){
                XorOturn = "0"; 
            }else {
                XorOturn = "X"; 
            }

            System.out.println( "Round " + rNum); 

            int row = 0 ; 
            int col = 0 ; 
            while (  row < grid.length ){
                while (  col < grid[0].length){
                    XorO = getSymbol(grid[row][col]);
                    System.out.print ( "["+ XorO + "]" ); 
                    col ++;
                }
                System.out.println();
                row++;
                col=0;
            }

            System.out.print(XorOturn+", make your move (row, col): "); 
            String c = coor.nextLine(); 
            rNum++; 

            int rowXcoor = Integer.parseInt(c.substring( 0 , 1)); 

 
            
            //grid[rowXcoor][colXcoor] = ;  
            
        }
    }

    public static String getSymbol(int f) {

        if ( f == 0 ){
            return " "; 
        }else if ( f == 1){
            return "X"; 
        }else {
            return "O"; 
        }
    }

}