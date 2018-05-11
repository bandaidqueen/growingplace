package veggies;

public class Cabbage  implements CanGrow{
    private int count;
    Cabbage(){
        count=0;
    }
    @Override

    public void growing() {
        count++;
    }

    @Override
    public void ShowInfo() {

    }

    public int GetCount()
    {
        return count;
    }
}