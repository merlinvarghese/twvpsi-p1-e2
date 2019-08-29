import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProbabilityTest {
    @Test
    void expectTrueFor1_2And3_6Probability() {
        Probability probability1 = new Probability(2, 1);
        Probability probability2 = new Probability(6, 3);
        Assertions.assertTrue(probability1.equals(probability2));
    }
    @Test
    void expectFalseFor1_2And2_6Probability() {
        Probability probability1 = new Probability(2, 1);
        Probability probability2 = new Probability(6, 2);
        Assertions.assertFalse(probability1.equals(probability2));
    }
    @Test
    void expectTrueFor1_3And2_6Probability() {
        Probability probability1 = new Probability(3, 1);
        Probability probability2 = new Probability(6, 2);
        Assertions.assertTrue(probability1.equals(probability2));
    }
}
