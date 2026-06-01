class Calculator{
    int num1;
    int num2;

    void add(){
        num1 =100;
        num2 = 200;
        int res =num1+num2;
        System.out.println("the result is : "+res);
    }
}
public class Launch2 {
   public static void main(String[] args) {

    Calculator calculator = new Calculator();
    calculator.add();

    
   } 
}
