package buoi13.junit;

public class MyClass {

        public int phepChia(int x, int y){
            if (x == 0){
                throw new IllegalArgumentException("x cannot be zero");
            }

            return x*y;
        }

}
