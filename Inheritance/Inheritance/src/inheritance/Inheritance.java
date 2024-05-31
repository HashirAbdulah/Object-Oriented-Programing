package inheritance;
import java.util.*;
public class Inheritance {
    protected int marks1;
    protected int marks2;
    protected int marks3;
    static double gpa[]=new double[3];
    protected double t;
    public static int i;
    public static int j;
    public void set(int x ,int y ,int z){
        marks1=x;
        marks2=y;
        marks3=z;
    }
    public void set1(double x){
        gpa[j]=x;
    }
    public double gpa(){
        double gpa1,gpa2,gpa3,res;
        gpa1=marks1*0.04705;
        if(gpa1>4.0)
            gpa1=4;
        gpa1*=4;
        gpa2=marks2*0.04705;
        if(gpa2>4.0)
            gpa2=4;
        gpa2*=4;
        gpa3=marks3*0.04705;
        if(gpa3>4.0)
            gpa3=4;
        gpa3*=3;
        res=(gpa1+gpa2+gpa3)/11;
        System.out.println("Your GPA is  of semester "+(j+1)+" is "+res);
        return res;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        gpa[0]=0;
        gpa[1]=0;
        gpa[2]=0;
        System.out.println("Enter Semester to Calculate GPA/CGPA");
        i=in.nextInt();
        if(i>=1){
        Inheritance sem1=new Inheritance();
        int a,b,c;
        double r;
        System.out.println("Enter Your subject Marks (4 CR Hours)");
        a=in.nextInt();
        System.out.println("Enter Your subject Marks (4 CR Hours)");
        b=in.nextInt();
        System.out.println("Enter Your subject Marks (3 CR Hours)");
        c=in.nextInt();
        j=0;
        sem1.set(a,b,c);
        r=sem1.gpa();
        sem1.set1(r);
        }
        if(i>=2){
            E1 sem2=new E1();
            int a,b,c;
        double r;
        System.out.println("Enter Your subject Marks (4 CR Hours)");
        a=in.nextInt();
        System.out.println("Enter Your subject Marks (4 CR Hours)");
        b=in.nextInt();
        System.out.println("Enter Your subject Marks (3 CR Hours)");
        c=in.nextInt();
        j=1;
        sem2.set(a,b,c);
        r=sem2.gpa();
        sem2.set1(r);
        sem2.cgpa();
        }
        if(i>=3){
            E1 sem3=new E1();
            int a,b,c;
        double r;
        System.out.println("Enter Your subject Marks (4 CR Hours)");
        a=in.nextInt();
        System.out.println("Enter Your subject Marks (4 CR Hours)");
        b=in.nextInt();
        System.out.println("Enter Your subject Marks (3 CR Hours)");
        c=in.nextInt();
        j=1;
        sem3.set(a,b,c);
        r=sem3.gpa();
        sem3.set1(r);
        sem3.cgpa();
        }
    }}
