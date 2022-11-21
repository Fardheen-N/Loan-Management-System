public class Loantype {
    private int ID;
    private int EMI;
    private float interest;
    private int minDuration;
    private int maxDuration;
    private int penalty;
    public int getEMI() {
        return EMI;
    }
    public void setEMI(int EMI) {
        this.EMI = EMI;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }

    public int getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }
}
