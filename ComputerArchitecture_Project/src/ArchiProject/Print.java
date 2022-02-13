package archiproject;


public class Print {
    
    public static void print2Darray( String register [][]){
    
        for(int i= 0; i<register.length; i++){
  
        System.out.println("Register with address "+register[i][0]+" contains value "+ register[i][1]);

        }
        System.out.println();
    }
    
}
