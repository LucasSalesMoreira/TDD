import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringFilterTest {
    @Test
    fun containsInString() {
        val stringFilter = StringFilter()
        Assertions.assertEquals(true, stringFilter.containsInString("njkjlnajlnckslanckslan%nklnklnklnkl"))
    }

    /**
     * Deve retornar uma lista com apenas números maiores que 100.
     */
    @Test
    fun filterNumber() {
        val stringFilter = StringFilter()
        Assertions.assertEquals(listOf("1001", "200", "187"), stringFilter.filterNumber("1001,87,200,99,187,55", 100))
    }
}