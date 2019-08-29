//Represent the occurance of an event

class Probability {
    final private double value;

    Probability(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            Probability probabilityToCompare = (Probability) obj;
            return this.value == probabilityToCompare.value;
        }
    }

    Probability and(Probability other) {
        return new Probability(this.value * other.value);
    }

    Probability or(Probability other) {
        return new Probability((this.value + other.value) - (and(other)).value);
    }

    Probability not() {
        return new Probability(1 - this.value);
    }
}
