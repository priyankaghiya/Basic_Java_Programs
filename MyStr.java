public class MyStr
{
public static void main(String[] st)
{
String s1="HELLO WORLD OYE";
System.out.println("\n LEN : "+s1.length());
String s2=s1;
System.out.println("\n S2 = "+s2);
s1="soham";
s2=" tanna";
s1=s1+s2;
System.out.println(s1);

s1="MSU";
s2="msu";
boolean b=s1.equals(s2);
System.out.println(b);

if(s1.equalsIgnoreCase(s2)==true)
{
System.out.println("\n BOTH R SAME");
}
else
{
System.out.println("\n BOTH R NOT SAME");
}

int l=s1.compareTo(s2);
System.out.println("\n L = "+l);

s1="HELLO WORLD OYE";
int p=s1.indexOf('O');
System.out.println("\n POSITION : "+p);
p=s1.lastIndexOf('O');
System.out.println("\n POSITION : "+p);
p=s1.indexOf('O',5);
System.out.println("\n POSITION : "+p);
p=s1.indexOf("WOR");
System.out.println("\n POSITION : "+p);
p=s1.indexOf('V');
System.out.println("\n POSITION : "+p);

 s1="HELLO WORLD OYE";
char c=s1.charAt(6);
System.out.println("char : "+c);
c=s1.charAt(4);
System.out.println("char : "+c);

s1="TODAY IS A GOOD DAY DAYNIGHT DAY IS DAY";
s1=s1.replace("DAY","NIGHT");
System.out.println(s1);

s1=s1.toLowerCase();
System.out.println(s1);

s1=s1.toUpperCase();
System.out.println(s1);

s1="          SOHAM            TANNNA            ";
s1=s1.trim();
System.out.println(s1);

s1="BALAGURUSAMY";
s1=s1.substring(4,8);
System.out.println(s1);

s1="SOHAM";
StringBuffer sb=new StringBuffer(s1);
s1=sb.reverse().toString();
System.out.println("\n S1 = "+s1);

s1="SOHAM TANNA";
sb=new StringBuffer(s1);
sb.insert(6,"KUMAR ");
System.out.println(sb);
sb.delete(6,12);
System.out.println(sb);




}  }
