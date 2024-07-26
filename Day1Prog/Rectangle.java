package Training;

public class Rectangle {
    int length;
    int width;
    Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    int area()
    {
        return length*width;
    }
    int perimeter()
    {
        return 2*(length+width);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(13,14);
        System.out.println("Area of rectangle :"+obj.area());
        System.out.println("Perimeter of rectangle :"+obj.perimeter());
    }
}