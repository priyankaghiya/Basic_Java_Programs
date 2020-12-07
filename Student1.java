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
                                    System.out.println(sid+"\t"+sna+"\t"+sage);

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
			super.show();
                    System.out.println("\t"+m1);
                    System.out.println("\t"+m2);
                    System.out.println("\t"+m3);
                    System.out.println("tot\t"+tot+"\nper "+per);
    }


}

class  Mech  extends Student
{
	int m1,m2,m3,tot;
	float per;
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
    {			super.show();
                    System.out.println("\t"+m1);
                    System.out.println("\t"+m2);
                    System.out.println("\t"+m3);
                    System.out.println("tot\t"+tot+"\nper "+per);
    }
}

public class Student1
{
    public static void main(String []st)
    {
        Computer c1=new Computer(19,"Piyu",19,99,88,77);
        Mech m1=new Mech(41,"Krinal",19,99,77,88);
        c1.show();
        m1.show();
    }
}
