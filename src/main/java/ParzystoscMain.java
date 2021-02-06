public class ParzystoscMain {
    public static void main (String[] args){
       System.out.println(IsEven(1));
    }
    static String IsEven(int x){
        if (x % 2==0)
            return "parzysta";
        else
            return "nieparzysta";
    }

}
