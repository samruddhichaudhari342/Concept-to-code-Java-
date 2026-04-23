class Mobile{
    String brand;
    String model;
    double price;
    String storage;

    Mobile(){ //It is recommended to have a no argument condtructor 
       this("NA");
    }
    Mobile(String brand){
        this(brand,"NA");
    }
    Mobile(String brand,String model){
        this(brand,model,0);
    }
    Mobile(String brand,String model,double price){
        this(brand,model,price,"NA");
    }

    Mobile(String brand,String model,double price,String storage){
        this.brand=brand ;
        this.model=model;
        this.price=price;
        this.storage=storage;

    }
    
    
    void displayMobile(){
        System.out.println("***MOBILE DETAILS***");
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Storage: "+storage);

    }
}

public class CunstructorOverloadingEx {
    public static void main(String [] args){
        Mobile m1 = new Mobile("Samaung","S24",70000,"128GB");
        Mobile m2 = new Mobile("Apple","17pro",90000);
        Mobile m3 = new Mobile("Redmi","note 9pro");
        Mobile m4 = new  Mobile();

        m1.displayMobile();
        System.out.println();
        m2.displayMobile();
        System.err.println();
        m3.displayMobile();
        System.err.println();
        m4.displayMobile();
    }
}
