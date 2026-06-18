public static class Basic {
String name;
int roll;               // -> variables declare karne k liye ek class banani padti h quki variables 
double per;             // -> kisi class k andar hi declare hote h
}

    public static void main(){
Basic x = new Basic();      // -> jis bhi class ka object banate h usme hi variables hone chahiye. 
x.name = "Deepanshu";     // -> object se ham usi class k variables k andar value daalte h.
x.roll = 23;
x.per = 79.6;
System.out.println(x.per);

    }

