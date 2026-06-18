// WAP to print 0 to 5 but skip 3 using continue and break.
public class ContinueBreak {
    public static void main(String[] args){
        int i = 0;
        // while(i<5){
        //     System.out.println(i);
        //     i++;                         // --> AISE BHI KAR SAKTE H. 
        //     if(i==3){
        //         i++;
        //         continue; }
        // }
        while(true){                       // True se infinite baar chalta h.
             System.out.println(i);
            i++;
            if(i==3){
                i++;                        // --> AND AISE BHI.    
                continue;
            }
                if(i>5){
                break;
            }
        }
    }
}
