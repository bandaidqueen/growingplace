package veggies;

public class Tomato implements CanGrow{

        private int count;
        Tomato(){
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

