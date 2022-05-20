package chapter9.Abstraction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    private List list;

    @BeforeEach
    public void setUp(){
        list = new ArrayList();
    }
    @Test
    public void addTest(){

        list.add("hey there");
        list.add("hey there");
        assertEquals(2, list.size());
    }

    @Test
    public void addWithIndexAndItem(){
        list.add("hello");
        list.add("hi");
        list.add("hey");
        list.add(3, "holla");
        list.add(2, "Funmi");
        assertEquals("Funmi", list.get(2));
        assertEquals("hi", list.get(3));
//        assertEquals(4, list.size());
    }

    @Test
    public void getArrayElementTest(){

        list.add("String on a guitar");
        list.add("Protection");
        assertEquals("Protection", list.get(2));
        assertEquals("String on a guitar", list.get(1));
    }
    @Test
    public void removeByIndexTest(){

        list.add("String on a guitar");
        list.remove(1);
        assertEquals(0, list.size());
    }

    @Test
    public void removeByItemTest(){

        list.add("String on a guitar");
        assertEquals(1, list.size());
        list.remove("String on a guitar");
        assertEquals(0, list.size());
        assertNull(list.get(1));
    }

    @Test
    public void noNullElementAfterRemoveTest(){
        list.add("String on a guitar");
        assertEquals(1, list.size());
        list.add("He plays so well");
        assertEquals(2, list.size());
        list.add("Keyboards are keys");
        assertEquals(3, list.size());
        list.remove(2);
        assertEquals(2, list.size());

        String test = list.get(3);
        assertEquals("Keyboards are keys", test);
    }

    @Test
    public void indexOfRemovedElementNotNullTest(){
        list.add("String on a guitar");
        assertEquals(1, list.size());
        list.add("He plays so well");
        assertEquals(2, list.size());
        list.add("Keyboards are keys");
        assertEquals(3, list.size());
        list.remove(2);
        assertEquals(2, list.size());

        String result = list.get(2);
        assertNotNull(result);
    }

    @Test
    public void indexRemovedByStringNotNullTest(){
        list.add("String on a guitar");
        assertEquals(1, list.size());
        list.add("He plays so well");
        assertEquals(2, list.size());
        list.add("Keyboards are keys");
        assertEquals(3, list.size());
        list.remove("He plays so well");
        assertEquals(2, list.size());

        String result = list.get(2);
        assertNotNull(result);
        assertEquals("Keyboards are keys", list.get(2));
        assertEquals("Keyboards are keys", list.get(3));
    }

    @Test
    public void arrayIsElasticTest(){
        list.add("String on a guitar");
        assertEquals(1, list.size());
        list.add("He plays so well");
        assertEquals(2, list.size());
        list.add("Keyboards are keys");
        assertEquals(3, list.size());

        assertTrue(list.isFull());
        list.add("milk");
        assertEquals(4, list.size());
    }

    @Test
    public void arrayCanReplaceByIndex(){
        list.add("honey");
        list.add("sugar");
        list.add("milk");
        assertEquals("sugar",list.get(2));
        list.replace(2, "cheese");
        assertEquals("cheese", list.get(2));

    }

}