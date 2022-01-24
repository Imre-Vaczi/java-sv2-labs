package collectionslist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    @Test
    void testInnit() {
        Postman postman = new Postman();
        assertEquals(0, postman.getAddresses().size());
    }

    @Test
    void testAddAddresses() {
        Postman postman = new Postman();
        postman.addAddress("aaa");
        postman.addAddress("bbb");
        postman.addAddress("ccc");
        postman.addAddress("aaa");

        assertEquals(4, postman.getAddresses().size());
    }

    @Test
    void testRemoveAddresses(){
        Postman postman = new Postman();
        postman.addAddress("aaa");
        postman.addAddress("bbb");
        postman.addAddress("ccc");
        postman.addAddress("aaa");
        postman.removeAddress("aaa");

        assertEquals(3, postman.getAddresses().size());
        assertEquals("bbb", postman.getAddresses().get(0).toString());
    }


}