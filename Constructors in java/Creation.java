
class Student{
    String name ;
    int age;
    long phno;
    String add;

    Student(String name, int age,long phno,String add){
        this.name=name;
        this.age=age;
        this.phno=phno;
        this.add=add;
    }
    void displayStudent(){
        System.out.println("***STUDENT DETAIL***");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone no.: "+phno);
        System.out.println("Adress: "+add);
    }
}

public class Creation {
    public static void main(String[] args) {
        Student s1 =new Student ("Raju",18,9876543210l,"Pune");
        Student s2 =new Student ("Chinki",16,987655210l,"Kolhapur");
        Student s3 =new Student ("Pintu",21,7656543210l,"Amravati");

        s1.displayStudent();
        System.err.println();
        s2.displayStudent();
        System.err.println();
        s3.displayStudent();
    }
    
}

