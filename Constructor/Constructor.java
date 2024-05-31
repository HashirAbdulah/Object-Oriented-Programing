import java.util.*;

public class Constructor {
    Constructor(){
        System.out.println("0 Argument constructor");
            for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 6; j++){
                if ((i == 1 || i == 6) || (j == 1 || j == 6)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    Constructor(int f,int g){
        System.out.println("Sum is "+(f+g));
        System.out.println("2 Argument constructor (int,int)");
    }
    
    Constructor(double f, double g, int q, int w){
        System.out.println("Sum is "+(f+g+q+w));
        System.out.println("4 Argument constructor (double,double,int,int)");
    }
    public static void main(String[] args){
        Constructor obj=new Constructor();
        int x,y;
        double a,b;
        System.out.println("Enter Two Numbers");
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        Constructor obj1=new Constructor(x,y);
        System.out.println("Enter Two Numbers");
        a=in.nextDouble();
        b=in.nextDouble();
        Constructor obj2=new Constructor(a,b,x,y);
    }
}


