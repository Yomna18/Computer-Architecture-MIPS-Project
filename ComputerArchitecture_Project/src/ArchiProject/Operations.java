package archiproject;

public class Operations {
    
   public static int CheckType(String OpcodeString){
   if(OpcodeString.equals("000000"))
       return 1; // This means that the the operation type is R-type
   else if (OpcodeString.equals("001010") || OpcodeString.equals("000100"))  // This means that the the operation type is I-type
       return 2;
   else if (OpcodeString.equals("000010"))   // This means that the the operation type is j-type
       return 3;  
   else {
       System.out.println("There is an error with your input");
       return 0;
   }
   
   }
    
}
