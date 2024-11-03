//Key Aspects of Encapsulation
//1.Data Hiding: Only relevant data and methods are exposed to the outside world, while
// internal details are hidden. By using private variables and public methods, a class can hide
// its data and make it accessible only through controlled methods.
//
//2.Controlled Access: Encapsulation provides controlled access to the object’s data through getters
// and setters. Getters retrieve the value of a private variable, and setters update it while
// allowing validation or restrictions.
//Access modifier :-
//
//Private-only in class this can be accessible
//Default - only in package classes can  access
//public - anyone can be access from anywhere
//protector:- Inherited by subclasses, even if they are in different packages.(inheritance)
//3.Modularity: Encapsulation helps break down complex systems into smaller, self-contained parts,
// which simplifies understanding and maintenance.
public class Encapsulation {
    public static void main(String[] args) {
        GetterAndSetter age = new GetterAndSetter();
        age.setAge(40);
        System.out.println(age.getAge());

        age.setAge(100);
        System.out.println(age.getAge());
        age.setName(null);
        age.setName("priya");
        System.out.println(age.getName());
    }





}
class GetterAndSetter{
    private int age ;
    private String name;

    public String getName(){

        return name;
    }
    public void setName(String name){
        if (name != null) {
            this.name = name;
        }
        else {
            System.out.println("invalid name");
        }

    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age >100||age<=0){
            System.out.println("invalid age");
        }else {
            this.age = age;

        }

    }
}
