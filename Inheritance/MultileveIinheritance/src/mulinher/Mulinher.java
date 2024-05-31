package mulinher;
import java.util.*;
public class Mulinher {
    protected int a;
    public void set(int x){
        a=x;
    }
    public void evenOdd(){
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
    static class E1 extends Mulinher{
    public void weekDays(){
        if(a==1)
            System.out.println("Monday");
        else if(a==2)
            System.out.println("Tuesday");
        else if(a==3)
            System.out.println("Wednesday");
        else if(a==4)
            System.out.println("Thusday");
        else if(a==5)
            System.out.println("Friday");
        else if(a==6)
            System.out.println("Saturday");
        else if(a==7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid Input");    
    }
}
    static class E2 extends Mulinher{
        public void Square(){
            System.out.println("Square is "+(a*a));
        }
        public void positiveNegative(){
            if(a>0)
                System.out.println("Positive");
            else if(a<0)
                System.out.println("Negative");
            else
                System.out.println("Number is Zero");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c;
        System.out.println("Enter Your choice(1.Even/Odd 2.WeekDay 3.Square 4.+ve/-ve");
        c=in.nextInt();
        if(c==1){
            Mulinher obj=new Mulinher();
            System.out.println("Enter a number for even/odd");
            int x;
            x=in.nextInt();
            obj.set(x);
            obj.evenOdd();
        }
        else if(c==2){
            E1 obj=new E1();
            System.out.println("Enter a number for WeekDay");
            int x;
            x=in.nextInt();
            obj.set(x);
            obj.weekDays();
        }
        else if(c==3){
            E2 obj=new E2();
            System.out.println("Enter a number for Square");
            int x;
            x=in.nextInt();
            obj.set(x);
            obj.Square();
        }
        else if(c==4){
            E2 obj=new E2();
            System.out.println("Enter a number for +ve/-ve");
            int x;
            x=in.nextInt();
            obj.set(x);
            obj.positiveNegative();
        }
    }
    
}
