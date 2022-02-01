import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SkillDemoTesting{
    private int x;
    private int y;
    SkillDemo demo;

    @Before
    public void setUp(){
        this.x = 3;
        this.y = 20;
        demo = new SkillDemo(x,y);
    }

    @Test
    public void testAddition(){
        assertEquals(23, demo.add());
    }
}