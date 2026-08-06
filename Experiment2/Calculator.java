public class Calculator {
    int num1;
    int num2;

    Calculator(){
        num1=0;
        num2=0;
    }

    Calculator(int i, int j){
        num1=i;
        num2=j;
    }

    void add(int p, int q){
        int sum = p+q;
        System.out.println("Sum Integer: "+sum);
    }

     void add(double p, double q){
        double sum = p+q;
        System.out.println("Sum Integer: "+sum);
    }
    
}
