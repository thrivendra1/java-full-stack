//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws age{
            Main m=new Main();
//           m.checking();
           String s1="hello";
           String s2=new String("hello").intern();
        System.out.println(s1==s2);
        }

        public void checking()  {
            try {
                ages(80);
            }
            catch (age e)
            {
                System.out.println(e.getMessage());
            }
//            catch (age1 e)
//            {
//                System.out.println(e.getMessage());
//            }
        }

        public void ages(int age) throws age
        {
            if(age<18)
            {
                throw new age("should be above 19");
            }
            if(age>70)
            {
                throw  new age("get new lincws");
            }
        }
    }

    class age extends Exception
    {
    public age(String me)
    {
        super(me);
    }
    }

//class age1 extends Exception
//{
//    public age1(String me)
//    {
//        super(me);
//    }
//}
