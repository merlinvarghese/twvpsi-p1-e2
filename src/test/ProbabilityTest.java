import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProbabilityTest {
    @Test
    void expectTrueFor1_2And3_6Probability() {
        Probability probability1 = new Probability(1, 2);
        Probability probability2 = new Probability(3, 6);
        Assertions.assertTrue(probability1.equals(probability2));
    }
}
