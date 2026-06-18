public class Spilit {
public static void main(String[] args){
    String s1 = "Kill the boy Jon Snow. ";
    String[] arr = s1.split("\\s"); 
    for(String a : arr){    
        System.out.println(a);
    }               
} }
