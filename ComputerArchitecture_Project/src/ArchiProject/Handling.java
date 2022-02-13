package archiproject;
public class Handling {
    
    public static int GettingValueFromReg( String register [][], String RegAdress){ // To get value stored in specific register
    int m=0;
    for(int i= 0; i<32; i++){
    if(RegAdress.equals(register[i][0])){
         m=Integer.parseInt(register[i][1], 2);
        break;
      }
     }
      return m;
    }
    
    public static void SettingValuetoReg( String register [][], String RegAdress, int j){ // To store value in specific register
    String k= Integer.toBinaryString(j);
    for(int i= 0; i<32; i++){
    if(RegAdress.equals(register[i][0])){
        register[i][1]=k;
        break;
      }
     }
    }
}
