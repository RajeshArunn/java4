package newpackage3;
import java.util.Scanner;
public class NewMain1 {

    public static void main(String[] args) {
        Rectangle[] obj=new Rectangle[5];
        Scanner s=new Scanner(System.in);
        int a=1;
        for(int i=0;i<5;i++)
        {
            obj[i] = new Rectangle();
            obj[i].name="Rectangle"+a;
            a++;
            System.out.println(obj[i].name);
            System.out.println("Enter length:");
            obj[i].l=s.nextInt();
            System.out.println("Enter breadth:");
            obj[i].b=s.nextInt();
            obj[i].area=obj[i].area();
            obj[i].perimeter=obj[i].perimeter();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(obj[i].name);
            System.out.println("Area:"+obj[i].area());
            System.out.println("Perimeter:"+obj[i].perimeter());
        }
    }   
}
interface CompareShapes
{
    double area();
    double perimeter();
    int Compare(Object o[]);
}
class Rectangle implements CompareShapes
{
    int l,b;
    double area,perimeter;
    String name;
    @Override
    public double area()
    {
       area=l*b;
       return area;
    }
    @Override
    public double perimeter()
    {
        perimeter=2*(l+b);
        return perimeter;
    }
    @Override
    public int Compare(Object o[])
    {
      return 0;
    }    
}
