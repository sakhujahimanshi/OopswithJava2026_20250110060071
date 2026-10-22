public class Overloading {
    public static void main(String[] args){
        Addition obj = new Addition();
        obj.sum();
        obj.sum(10,20);
        obj.sum(10.5 , 20.5);
    }
    
}
class Addition {
    void sum(){
        System.out.println("Addition");
    }
    void sum(int a , int b ){
        System.out.println("Addition " + (a+b));
    }
    static void sum(double a , double b ){
        System.out.println("Addition " + (a+b));
    }
}