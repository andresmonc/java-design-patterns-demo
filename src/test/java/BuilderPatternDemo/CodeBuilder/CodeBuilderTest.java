package BuilderPatternDemo.CodeBuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeBuilderTest {

    CodeBuilder codeBuilder;

    @BeforeEach
    void setUp() {
        codeBuilder = new CodeBuilder("Test");
    }

    @Test
    void AddField_FieldAddedToString_True() {
        codeBuilder.addField("test", "boolean");
        assertTrue(codeBuilder.toString().contains("boolean test"));
    }

    @Test
    void Clear_FieldsNotCleared_False() {
        codeBuilder.addField("test", "boolean")
                .clear();
        assertFalse(codeBuilder.toString().contains("boolean test"));
    }

}