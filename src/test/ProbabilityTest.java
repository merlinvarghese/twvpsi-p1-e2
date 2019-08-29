import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ALL")
class ProbabilityTest {
    @Test
    void expectTrueFor0_5And0_5Probability() {
        Probability probability = new Probability(0.5);
        assertTrue(probability.equals(probability));
    }

    @Test
    void expectFalseFor0_3AndNullProbability() {
        Probability probability1 = new Probability(0.3);
        assertFalse(probability1.equals(null));
    }

    @Test
    void expectTrueFor0_3ProbabilityAndValue() {
        Probability probability1 = new Probability(0.3);
        assertFalse(probability1.equals(2));
    }

    @Test
    void expectTrueFor0_6And0_6Probability() {
        Probability probability1 = new Probability(0.6);
        Probability probability2 = new Probability(0.6);
        assertTrue(probability1.equals(probability2));
    }

    @Test
    void expectFalseFor0_2And0_6Probability() {
        Probability probability1 = new Probability(0.2);
        Probability probability2 = new Probability(0.6);
        assertFalse(probability1.equals(probability2));
    }

    @Test
    void expect0_12ForCombinedProbabilityOf0_2And0_6() {
        Probability probability1 = new Probability(0.2);
        Probability probability2 = new Probability(0.6);
        assertEquals(0.12, probability1.combinedProbability(probability2));
    }

    @Test
    void expect0_15ForCombinedProbabilityOf0_3And0_5() {
        Probability probability1 = new Probability(0.3);
        Probability probability2 = new Probability(0.5);
        assertNotEquals(0.10, probability1.combinedProbability(probability2));
    }
}
