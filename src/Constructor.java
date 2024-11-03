public class Constructor {
    Cons bmw = new Cons();
}
class Cons{
    String color;
    int noOfWheels;
    int gear;
    int maxSpeed;
    int fuel;
    //1.No-Argument Constructor:
    //
    //*A no-argument constructor is a constructor without any parameters.
    //*It can be explicitly defined in the class, or if no constructor is defined
    // at all, Java will provide one by default.
    // You can use this() to call another constructor within the same class, which helps
    //     to avoid redundancy.
    Cons(){
        this("black");
    }
    //2.Parameterized Constructor:
    //
    //A parameterized constructor is defined with parameters, allowing you to pass values
    // at the time of object creation to initialize the object with specific values.
    Cons(String color){
        this.color= color;
        noOfWheels = 6;
        gear = 4;
        maxSpeed = 160;


    }


}
