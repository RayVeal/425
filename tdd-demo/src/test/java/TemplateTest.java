import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemplateTest {

    @Test
    public void oneVariable() {
        Template template = new Template("Hello, ${name}");
        template.set("name","Reader");
        assertEquals("Hello, Reader", template.evaluate());
    }

    @Test
    public void anotherVariable() {
        Template template = new Template("Hello, ${name}");
        template.set("name","something else");
        assertEquals("Hello, something else", template.evaluate());
    }

    @Test
    public void multipleVariables() {
        Template template = new Template("${one}, ${two}, ${three}");
        template.set("one","1");
        template.set("two","2");
        template.set("three","3");
        assertEquals("1, 2, 3", template.evaluate());
    }

    @Test
    public void unknownVariablesAreIgnored() {
        Template template = new Template("Hello, ${name}");
        template.set("name","Reader");
        template.set("unknown","ignoreme");
        assertEquals("Hello, Reader", template.evaluate());
    }

//    @Test
//    public void missingValueThrowsException() {
//        Template template = new Template("Hello, ${name}");
//        assertThrows(MissingValueException.class, () -> {
//                template.evaluate();
//            });
//    }
}
