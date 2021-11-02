package introjunit;

public class Gentleman {
    private String message = "Hello ";
    public String sayHello(String name){
        if (name == null){
            return this.message + "Anonymus";
        }else{
            return this.message + name;
        }

    }
}
