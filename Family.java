public class Family {
    public static void main(String[] args) {
        Parent parent = new Parent(5, 10);
        Parent parent2 = new Parent("Mampi ", "Bhattacharya");
        parent.run();
        parent.Walk();

        Child child = new Child(5, 5, 10);
        Child child2 = new Child("Mampi ", "Varun ", "Sharma");
        child.run();
        child.Walk();
    }

    
}

class Parent{

    public static void run(){
        System.out.println("Parent run");
    }

    public static void Walk(){
        System.out.println("Parent walk");
    }

    Parent(int a, int b){
    
        System.out.println("Parent Constructor sum");
        System.out.println(a+b);
    }

    Parent(String firstName, String lastName){
        System.out.println(firstName + lastName);
    }

}

class Child{
    public static void run(){
        System.out.println("Child run");
    }

    public static void Walk(){
        System.out.println("Child Walk");
    }

    Child(int a, int b, int c){
    
        System.out.println("Child Constructor");
        System.out.println(a+b+c);
    }

    Child(String firstName, String middleName, String lastName){
        System.out.println(firstName + middleName + lastName);
    }
}