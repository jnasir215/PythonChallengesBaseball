import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testNumOuts1() {
        Solution solution = new Solution();

        int expected = 14;
        int actual = solution.numOuts(4.2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumOuts2() {
        Solution solution = new Solution();

        int expected = 6;
        int actual = solution.numOuts(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumOuts3() {
        Solution solution = new Solution();

        int expected = 4;
        int actual = solution.numOuts(1.1);

        Assert.assertEquals(expected, actual);
    }
}
