 class Pen {  
    String brand; //global variables
    String type;
    String color;
    double price;

    Pen(String brand, String type, String color, double price){ //Constructor is used to initialize the states of an object
        this.brand=brand; //Local variables
        this.type=type;
        this.color=color;
        this.price=price;
    }
    void displayPen(){
        System.out.println("***Pen details***");
        System.out.println("Brand:"+brand);
        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Price:"+price);

    }   
}
public class CreationOfObject {
    public static void main(String [] args){
        Pen p = new Pen("Cello","Gel","blue",10);// we can creat multiple objs using class/blueprint
        Pen p1 = new Pen("Trimax","Gel","blue",70);
        p.displayPen(); //using reference var we can acces behaviours of an object
        System.out.println();
        p1.displayPen();

    }
    
}
