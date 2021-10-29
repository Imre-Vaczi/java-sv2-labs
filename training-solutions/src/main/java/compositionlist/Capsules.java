package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private ArrayList<String> colours  = new ArrayList<>();

    public void addLast(String newCap){
        this.colours.add(newCap);
    }
    public void addFirst(String newCap){
        this.colours.add(0,newCap);
    }
    public void removeFirst(){
        this.colours.remove(0);
    }
    public void removeLast(){
        this.colours.remove(this.colours.size()-1);
    }
    public List<String> getColors(){
        List<String> result = colours;
        return result;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("lila");
        capsules.addFirst("zöld");
        System.out.println(capsules.getColors());
        capsules.addLast("fekete");
        capsules.addLast("narancs");
        capsules.addLast("bíbor");
        capsules.addLast("piros");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
