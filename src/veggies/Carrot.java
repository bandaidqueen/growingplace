package veggies;

public class Carrot implements CanGrow
{
    private int count;
    Carrot(){
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
