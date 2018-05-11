package veggies;

public class Pepper implements CanGrow {
    private int count;
    Pepper(){
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