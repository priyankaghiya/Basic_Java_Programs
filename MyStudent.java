import java.util.Scanner;

class Student
{
        int sid,sage;
        String sna;
        Student()
        {}
        Student(int sid,String sna,int sage)
        {
            this.sid=sid;
            this.sna=sna;
            this.sage=sage;
        }
        void show()
        {
                        System.out.println("STUDENT DETAILS : ");
                                    System.out.println("STUDENT ID : "+sid);
                                    System.out.println("STUDENT NAME : "+sna);
                                    System.out.println("STUDENT AGE : "+sage);

        }

}

class Computer extends Student
{
    int m1,m2,m3;
    float tot,per;
    Computer()
    {}
    Computer(int sid,String sna,int sage,int m1,int m2,int m3)
    {
     super(sid,sna,sage);
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;

        tot=m1+m2+m3;
        per=tot/3;
    }
    void show()
    {
  //      System.out.println("Student Details");
        super.show();
            System.out.println("MARKS OF SUBJECTS : ");
                    System.out.println("C\t"+m1);
                    System.out.println("C++ \t"+m2);
                    System.out.println("JAVA\t"+m3);
                    System.out.println("TOTAL\t"+tot+"\nPERCENTAGE"+per);
    }


}

class  Mech  extends Student
{
    int m1,m2,m3;
    float tot,per;
        Mech()
        {}
        Mech(int sid,String sna,int sage,int m1,int m2,int m3)
             {
                 super(sid,sna,sage);
                   this.m1=m1;
        this.m2=m2;
        this.m3=m3;

        tot=m1+m2+m3;
        per=tot/3;
             }
              void show()
    {
     //   System.out.println("Student Details");

        super.show();
            System.out.println("MARKS OF SUBJECTS : ");
                    System.out.println("EG : \t"+m1);
                    System.out.println("EEE : \t"+m2);
                    System.out.println("MOS : \t"+m3);
                    System.out.println("TOTAL \t"+tot+"\nPERCENTAGE "+per);
    }
}

public class MyStudent
{
    public static void main(String []st)
    {
        Computer c1=new Computer(19,"Piyu",19,99,88,77);
        Mech m1=new Mech(41,"Krinal",19,99,77,88);
        c1.show();
        m1.show();
    }
}
