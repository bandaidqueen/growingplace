package veggies;

public class Potato implements CanGrow{

    private int count;
    Potato(){
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