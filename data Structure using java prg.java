public class Karthi
{
public static <T> void karthick(T t){
System.out.println(t.getClass().getName()+ ":" + t);
}
public static void main(String [] args){
karthick(101);
karthick("joy with java");
karthick(3.12456);
}
}