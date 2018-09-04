import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest 
{



    @Test
    public void test() 
    {
        assertEquals(1000000000000000000L,Solution.flagstones(1000000000, 1000000000, 1), 0.1);
        
    }
    
    @Test
    public void test2()
    {
        assertEquals(4, Solution.flagstones(6, 6, 4), 0.1);
    }

}
