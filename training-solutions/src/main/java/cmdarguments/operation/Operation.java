package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (String element: args){
            if (element.equals("/list")){
                System.out.println("Listázás");
            }
            else if (element.equals("/add")){
                System.out.println("Hozzáadás");
            }
            else if (element.equals("/delete")){
                System.out.println("Törlés");
            }
            else {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}