package junit5;

public class Gentleman {
    public String sayingHi = "Hello ";
    public String sayHello(String name){
        if (name == null){
            return this.sayingHi + "Anonymus";
        }else{
            return this.sayingHi + name;
        }
    }
}
