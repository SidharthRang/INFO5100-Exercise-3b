import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        Shape c = new Circle(5);
        Shape r = new Rectangle(6, 7);
        Shape sq = new Square(5);
        Shape t = new Triangle(4, 5, 6, 6);

        //Serialize the shapes in a file
        FileOutputStream f = new FileOutputStream("shapes.ser");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(c);
        out.writeObject(r);
        out.writeObject(t);
        out.writeObject(sq);
        out.close(); //Close output stram
        f.close(); //Close filestream
        
        System.out.println("Shapes are serialized in shapes.ser");

        //Deserialize the shapes from a file
        FileInputStream f1 = new FileInputStream("shapes.ser");
        ObjectInputStream in = new ObjectInputStream(f1);
        while(f1.available() != 0){
            Object o = in.readObject();
            String shape = o.getClass().getName();
            switch(shape){
                case "Circle": Circle s = (Circle) o;
                System.out.println("Shape: "+s.name+"\n"+
                                   "Radius: "+s.radius+"\n"+
                                   "Area: "+s.area+"\n"+
                                   "Perimeter: "+s.perimeter);
                break;
                case "Rectangle": Rectangle s1 = (Rectangle) o;
                System.out.println("Shape: "+s1.name+"\n"+
                                   "Length: "+s1.length+"\n"+
                                   "Width: "+s1.width+"\n"+
                                   "Area: "+s1.area+"\n"+
                                   "Perimeter: "+s1.perimeter);
                break;
                case "Triangle": Triangle s2 = (Triangle) o;
                System.out.println("Shape: "+s2.name+"\n"+
                                   "Base: "+s2.base+"\n"+
                                   "Height: "+s2.height+"\n"+
                                   "side1: "+s2.side1+"\n"+
                                   "side2: "+s2.side2+"\n"+
                                   "Area: "+s2.area+"\n"+
                                   "Perimeter: "+s2.perimeter);
                break;
                case "Square": Square s3 = (Square) o;
                System.out.println("Shape: "+s3.name+"\n"+
                                   "Length: "+s3.length+"\n"+
                                   "Width: "+s3.width+"\n"+
                                   "Area: "+s3.area+"\n"+
                                   "Perimeter: "+s3.perimeter);
                break;
            }
        }
        in.close(); //Close input stram
        f1.close(); //Close filestream
    }
}
