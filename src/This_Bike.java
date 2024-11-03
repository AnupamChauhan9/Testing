public class This_Bike {
    /*
    1.this is often used when the names of instance variables and method parameters
     are the same. It distinguishes between the parameter and the instance variable.
    2.You can use this() to call another constructor within the same class, which helps
     to avoid redundancy.
     3.this can be used to return the current object, which is useful for chaining multiple
     method calls together.
     4.
     5.

     */

    String name;
    String colour;
    int fuel;
    //1.point example
    public void fuel(int fuel){
        this.fuel = fuel;
    }
    //3.point example it will return the current object reference
    public  This_Bike drivein(){
        if (fuel>0){
            System.out.println("driving");
            fuel--;
        }
        else {
            System.out.println("no fuel");
        }
        return this;




    }




}
class Honda{
    public static void main(String[] args) {
        This_Bike sine= new This_Bike();

        sine.drivein().fuel(3);
        sine.drivein();
        System.out.println(sine.fuel);

    }
}

