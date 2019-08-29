//Represent the occurance of an event

class Probability {
    private float maxChances;
    private float occurance;

    Probability(float maxChances, float occurance) {
        this.maxChances = maxChances;
        this.occurance = occurance;
    }

    boolean equals(Probability probabilityToCompare) {
        float value1 = this.occurance / this.maxChances;
        float value2 = probabilityToCompare.occurance / probabilityToCompare.maxChances;
        System.out.println(value1+","+value2);
        if (value1 != value2) {
            return false;
        }
        return true;
    }
}
