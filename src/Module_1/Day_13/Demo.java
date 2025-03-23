

public class Demo {
    public static void main(String[] args) {
        // class without a name -> anonymous class -> lambda expression
//        Interf i = new Interf() {
//            @Override
//            public int add(int a, int b) {
//                return 0;
//            }
//        };
//        Interf i = (a, b) -> {
//            return a + b;
//        };

        Interf i = (a, b) -> a + b;

        int sum = i.add(100, 200);
        System.out.println(sum);
    }
}

@FunctionalInterface
interface Interf {
    int add(int a, int b);
}

class B implements Interf {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}


// FunctionalInterface -> lambda expression