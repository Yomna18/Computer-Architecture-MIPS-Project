package archiproject;

public class Instructions {
    
    public static int add(int i, int j){
    int k = i + j;
    return k;
    }
    
    public static int beq(int i, int j){
        if(i==j)
            return 1;
        else
            return 0;
    }
    
    public static int slti(int i, int j){
    if(i<j)
        return 1;
    else
        return 0;
    
    }
}
