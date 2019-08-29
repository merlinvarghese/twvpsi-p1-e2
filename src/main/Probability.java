//Represent the occurance of an event

class Probability {
    private double occurance;

    Probability(double occurance) {
        this.occurance = occurance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            Probability probabilityToCompare = (Probability) obj;
            return this.occurance == probabilityToCompare.occurance;
        }
    }
}
