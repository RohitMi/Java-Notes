/**
 * The following Mensuration class contains the method/function code for doing Mensuration operations.
 * Following is the list of Mensuration operations that can be performed:
 * Area of Triangle
 * Area of Square
 * Area of Rectangle
 * Area of Circle
 * Area of Parallelogram
 * Area of Rhombus
 * Area of Trapezium
 * Perimeter of Triangle
 * Perimeter of Square
 * Perimeter of Rectangle
 * Perimeter of Parallelogram
 * Circumference of Circle
 * Volume of Cone
 * Volume of Cylinder
 * Volume of Sphere
 * Volume of Prism
 * Surface Area of Cylinder
 * Curved Surface Area of Cone
 * Surface Area of Sphere
 * 
 * 
 */

class Mensuration
{
    double arTri(double bs, double ht)         //Calculates area of Triangle.
    {
        double area = (bs * ht)/2;
        return area;
    }
    
    double arTri(double s1, double s2, double s3)         //Calculates area of Scalene Triangle.
    {
        double SA = (s1 +s2 + s3) / 2;
        double area = Math.sqrt(SA * (SA - s1) * (SA - s2) * (SA - s3));
        return area;
    }
    
    double arTri(double side)         //Calculates area of Isosceles Triangle.
    {
        double area = (Math.sqrt(3) / 4) * side * side;
        return area;
    }
    
    double arSq(double side)         //Calculates area of Square.
    {
        double area = side * side;
        return area;
    }
    
    double arRect(double len, double br)         //Calculates area of Rectangle.
    {
        double area = len * br;
        return area;
    }
    
    double arPlg(double bs, double ht)         //Calculates area of Parallelogram.
    {
        double area = bs * ht;
        return area;
    }
    
    double arTp(double ht, double bs1, double bs2)         //Calculates area of Trapezium.
    {
        double area = ((bs1 + bs2) / 2) * ht;
        return area;
    }
    
    double arRh(double d1, double d2)          //Calculates area of Rhombus.
    {
        double area = (d1 * d2) / 2;
        return area;
    }
    
    double arCl(double r)         //Calculates area of Circle.
    {
        double area = (22/7) * r * r;
        return area;
    }
    
    double perCl(double r)         //Calculates perimeter of Circle
    {
        double per = (2 * 22 * r) / 7;
        return per;
    }
    
    double perTri(double s1, double s2, double s3)         //Calculates perimeter of Scalene Triangle
    {
        double per = s1 + s2 +s3;
        return per;
    }
    
    double perTri(double side)         //Calculates perimeter of Equilateral Triangle
    {
        double per = 3 * side;
        return per;
    }
    
    double perRecPlg(double len, double br)         //Calculates perimeter of rectangle, parallelogram.
    {
        double per = 2 * (len + br);
        return per;
    }
    
    double perSqRh(double side)         //Calculates perimeter of square, rhombus.
    {
        double per = 4 * side;
        return per;
    }
    
    double volCn(double r, double ht)           //Calculates the Volume of Cone
    {
        double vol = (22/7) * r * r * (ht / 3);
        return vol;
    }
    
    double volCy(double r, double ht)           //Calculates the Volume of Cylinder
    {
        double vol = (22/7) * r * r * ht;
        return vol;
    }
    
    double volSp(double r)           //Calculates the Volume of Sphere
    {
        double vol = (4 / 3) * (22/7) * r * r * r;
        return vol;
    }
    
    double volPm(double bs1, double bs2, double ht)           //Calculates the Volume of Prism
    {
        double ArBs = (1 / 2) * bs1 * bs2;
        double vol = ArBs * ht;
        return vol;
    }
    
    double saCy(double r, double ht)           //Calculates the Surface Area of Cylinder
    {
        double SA = 2 * (22 / 7) * r * (r + ht);
        return SA;
    }
    
    double csaCn(double r, double l)           //Calculates the Surface Area of Cone
    {
        double SA = (22 / 7) * r * l;
        return SA;
    }
    
    double saSp(double r)           //Calculates the Surface Area of Sphere
    {
        double SA = 4 * (22/7) * r;
        return SA;
    }
}