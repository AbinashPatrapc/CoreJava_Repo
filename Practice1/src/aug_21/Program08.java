package aug_21;

class Program07 {
    
    
    {
         System.out.println("1st static block");
        
    }
    
    int b=20;
    
    Program07(){
         System.out.println("constructor executed");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Program07 p1=new Program07();
        //System.out.println(p1.a);
        System.out.println(p1.b);
        System.out.println(p1.c);
        p1.m1();
    }
    
    public void m1(){
         System.out.println("method executed");
    
    }
    
    {
         System.out.println("2nd static block executed");
    } 
    int c=30;
}
