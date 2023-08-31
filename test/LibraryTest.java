package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LibraryTest {
    @Test
    @DisplayName("preCondition Test")
    void preConditionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Library(-1));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 10, 100, 100})
    @DisplayName("Libraru constructor Test")
    void libraryTest(int size) {
        Library library = new Library(size);

        Assertions.assertEquals(size, library.getLibrarySize());
    }

    @Test
    @DisplayName("Library add() test")
    void addTest() {
        Library library = new Library(1);
        library.add("book 1");

        Assertions.assertEquals(1, library.getCount());
    }

    @Test
    @DisplayName("Library 꽉 찬 경우 테스트")
    void fullLibraryTest() {
        Library library = new Library(1);
        library.add("book 1");

        Assertions.assertThrows(IllegalArgumentException.class, () -> library.add("book 2"));
    }

    @Test
    @DisplayName("Library 책이 중복된 경우")
    void LibraryTest() {
        Library library = new Library(2);
        library.add("book 1");

        Assertions.assertThrows(IllegalArgumentException.class, () -> library.add("book 1"));
    }

    @Test
    @DisplayName("Delet 테스트")
    void deletLibraryTest() {
        Library library = new Library(1);
        library.add("book 1");
        library.delete("book 1");

        Assertions.assertEquals(0, library.getCount());

    }

    @Test
    @DisplayName("Library 빈 경우 테스트")
    void emptyLibraryTest() {
        Library library = new Library(1);

        Assertions.assertThrows(IllegalAccessError.class, () -> library.delete("book 1"));
    }


}
