//class Test19_interface_private_methods {
//
//    public static void main(String[] args) {
//
//        Calculatable c = new Calculation();
//        System.out.println(c.sum(1, 2));
//        System.out.println(c.sum(1, 3, 5));
//    }
//}
//class Calculation implements Calculatable{
//
//}
//interface Calculatable{
//
//    default int sum(int a, int b){
//        return sumAll(a, b);
//    }
//    default int sum(int a, int b, int c){
//        return sumAll(a, b, c);
//    }
//    private int sumAll(int... values){
//        int result =0;
//        for(int n: values){
//            result +=n;
//        }
//        return result;
//    }
//}