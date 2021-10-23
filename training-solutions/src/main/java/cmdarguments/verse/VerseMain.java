package cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {
        for (String element: args){
            System.out.print(element + " ");
        }
        System.out.println("\n");

        for (int i = args.length-1; i >= 0; i--){
            System.out.println(args[i]);
        }

    }
}
