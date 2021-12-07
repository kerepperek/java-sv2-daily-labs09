package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortestWords(){

        List<String> result=new StringLists().shortestWords(Arrays.asList("baba","mama","csicsóka","bogyesz","vakarcs","cica","kutya"));

        assertEquals(3,result.size());

    }
}