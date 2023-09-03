public class TypeCasting {
    public static void main(String[] args){

     //implicit type casting    
    int a,b;
    a=15;
    b=20;
    double a1,b1,div;
    a1=a;
    b1=b;
    div=a1/b1;
    System.out.println("div is"+div);

    //explicit type casting (double to int)
    //syntax destination variable=(destination data type)source variable
    double pi=3.14;
    int p=(int)pi;
    System.out.println("pi value is"+p);
    
    //constant and static variable
     String collegeName="Pillai HOC";
     System.out.println("my college name is"+collegeName);
     //collegeName="MGM college";
     //System.out.println("my college name is"+collegeName);
    }   

}
