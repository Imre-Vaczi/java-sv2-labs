package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store("chair");
        System.out.println(store.getStock());
        store.store(1000);
        System.out.println(store.getStock());
        store.dispatch(300);
        System.out.println(store.getStock());

    }
}
