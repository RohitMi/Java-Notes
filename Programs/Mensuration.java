class Mensuration
{
    double AreaTriangle(double bs, double ht)
    {
        double area = (bs * ht)/2;
        return area;
    }
    
    double AreaTriangle(double s1, double s2, double s3)
    {
        double SA = (s1 +s2 + s3) / 2;
        double area = Math.sqrt(SA * (SA - s1) * (SA - s2) * (SA - s3));
        return area;
    }
    
    double AreaTriangle(double side)
    {
        double area = (Math.sqrt(3) / 4) * side * side;
        return area;
    }
    
    double AreaSquare(double side)
    {
        double area = side * side;
        return area;
    }
    
    double AreaRectangle(double len, double br)
    {
        double area = len * br;
        return area;
    }
    
    double AreaParallelogram(double bs, double ht)
    {
        double area = bs * ht;
        return area;
    }
    
    double AreaTrapezium(double ht, double bs1, double bs2)
    {
        double area = ((bs1 + bs2) / 2) * ht;
        return area;
    }
    
    double AreaRhombus(double d1, double d2)
    {
        double area = (d1 * d2) / 2;
        return area;
    }
    
    double AreaCircle(double r)
    {
        double area = (22/7) * r * r;
        return area;
    }
    
    double PerimeterCircle(double r)
    {
        double per = (2 * 22 * r) / 7;
        return per;
    }
    
    double PerimeterTriangle(double s1, double s2, double s3)
    {
        double per = s1 + s2 +s3;
        return per;
    }
    
    double PerimeterTriangle(double side)
    {
        double per = 3 * side;
        return per;
    }
    
    double PerimeterParallelogram(double len, double br)
    {
        double per = 2 * (len + br);
        return per;
    }
    
    double PerimeterSquare(double side)
    {
        double per = 4 * side;
        return per;
    }
    
    double PerimeterRhombus(double side)
    {
        double per = 4 * side;
        return per;
    }
    
    double VolumeCone(double r, double ht)
    {
        double vol = (22/7) * r * r * (ht / 3);
        return vol;
    }
    
    double VolumeCylinder(double r, double ht)
    {
        double vol = (22/7) * r * r * ht;
        return vol;
    }
    
    double VolumeSphere(double r)
    {
        double vol = (4 / 3) * (22/7) * r * r * r;
        return vol;
    }
    
    double VolumePrism(double bs1, double bs2, double ht)
    {
        double ArBs = (1 / 2) * bs1 * bs2;
        double vol = ArBs * ht;
        return vol;
    }
    
    double SACylinder(double r, double ht)
    {
        double SA = 2 * (22 / 7) * r * (r + ht);
        return SA;
    }
    
    double CSACone(double r, double l)
    {
        double SA = (22 / 7) * r * l;
        return SA;
    }
    
    double SASphere(double r)
    {
        double SA = 4 * (22/7) * r;
        return SA;
    }
}