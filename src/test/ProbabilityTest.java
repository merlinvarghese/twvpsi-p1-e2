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
        assertEquals(new Probability(0.12), probability1.and(probability2));
    }

    @Test
    void expect0_15ForCombinedProbabilityOf0_3And0_5() {
        Probability probability1 = new Probability(0.3);
        Probability probability2 = new Probability(0.5);
        assertNotEquals(new Probability(0.10), probability1.and(probability2));
    }

    @Test
    void expect0_28ForOrOfProbability0_3And0_2() {
        Probability probability1 = new Probability(0.1);
        Probability probability2 = new Probability(0.2);
        assertNotEquals(new Probability(0.5), probability1.or(probability2));
    }

    @Test
    void expect0_44ForOrOfProbability0_3And0_2() {
        Probability probability1 = new Probability(0.3);
        Probability probability2 = new Probability(0.2);
        assertEquals(new Probability(0.44), probability1.or(probability2));
    }

    @Test
    void expect0_2ForNotOfProbability0_8() {
        Probability probability = new Probability(0.2);
        assertNotEquals(new Probability(0.5), probability.not());
    }

    @Test
    void expect0_45ForNotOfProbabilityOfo_45() {
        Probability probability = new Probability(0.45);
        assertEquals(new Probability(0.55), probability.not());
    }

}
