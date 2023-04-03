public class Area0fTriangle {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        Triangle t2=new Triangle(20);
        Triangle t3=new Triangle(20,30);
        Triangle t4=new Triangle(40.5f);
    }
}

class Triangle{
    int base, height;
    double area;

    public Triangle(){
        calculateArea();
        System.out.println("Area of trianle :"+area);
    }

    public Triangle(int a){
        base=a;
        height=a;
        calculateArea();
        System.out.println("Area of trianle :"+area);
    }

    public Triangle(float a){
        base=(int)a;
        height=(int)a;
        calculateArea();
        System.out.println("Area of trianle :"+area);
    }

    public Triangle(int a, int b){
        base=a;
        height=b;
        calculateArea();
        System.out.println("Area of trianle :"+area);
    }

    private void calculateArea(){
        this.area=0.5*base*height;
    }
}
