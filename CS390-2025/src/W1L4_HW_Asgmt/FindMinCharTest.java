package W1L4_HW_Asgmt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinCharTest {
    @Test
    void findMinEmptyStringThrowsExceptionTest() {
        // assertThrows → verifies if the expected exception is thrown.
        assertThrows(IllegalArgumentException.class,() -> {
            FindMinChar.findMinChar("");
        });
    }

    @Test
    void findMinNormalStringTest() {
        char res =  FindMinChar.findMinChar("akel");
        char exp = 'a';
        assertEquals(exp, res);
    }

    @Test
    void findMinSingleCharacterTest() {
        char res =  FindMinChar.findMinChar("e");
        char exp = 'e';
        assertEquals(exp, res);
    }

    @Test
    void findMinSingleRepeatedCharacterTest() {
        char res =  FindMinChar.findMinChar("eeeeeeeee");
        char exp = 'e';
        assertEquals(exp, res);
    }
}