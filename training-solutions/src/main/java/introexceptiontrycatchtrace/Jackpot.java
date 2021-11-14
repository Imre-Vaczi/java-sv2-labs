package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        Winner winner = new Winner();
        try{
            String result = winner.getWinner();
            System.out.println(result);
        }
        catch (NullPointerException exception){
            System.out.println("Listában null szerepelt, az nem nyerhet.");
        }
    }
}
