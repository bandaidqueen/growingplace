package veggies;

public class Cucumber implements CanGrow {
    private int count;
    Cucumber(){
        count=0;
    }
    @Override

    public void growing() {
        count++;
    }
    public int GetCount()
    {
        return count;
    }
}