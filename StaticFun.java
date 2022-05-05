
 public class Example2{
    public static void main(String args[]){
        Hello He1= new Hello();
        Hello.y= 5;
        Hello.fun2();
        System.out.println(Hello.Test.country);


    }
}
 

 class Hello {

    int x; //instance variable
    static int y; //static member variable
    public void fun1(){ 
        //body
        //cannot have static variable inside a function, but we can have static inner class
     } //instance function

    public static void fun2(){ 
        y=4;
        //static functions only access static members
        //body
    } //static member function

    static class Test{
        public static String country = "Pakistan";
    
    }
 }   