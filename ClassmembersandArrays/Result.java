package ClassmembersandArrays;

public class Result {

    private int cows;
    private int bulls;

    public Result(int cows, int bulls) {
        assert(cows+bulls<=4);
        this.cows=cows;
        this.bulls=bulls;
    }

    public int cows() { return cows; }
    public int bulls() { return bulls; }

    public boolean isCorrect() { return bulls==4; }

    public boolean equals(Object o) {
        if (!(o instanceof Result)) {
            return false;
        }
        else {
            Result other = (Result)o;
            return this.cows()==other.cows()&&this.bulls()==other.bulls();
        }
    }

    public String toString() {
        String result = this.cows()+(this.cows()!=1 ? " cows" : " cow");
        result = result+" and "+this.bulls()+(this.bulls()!=1 ? " bulls" : " bull");
        return result;
    }

}