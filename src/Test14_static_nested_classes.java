class Test14_static_nested_classes {
    public static void main(String[] args) {

     Math.Factorial fact = Math.getFactorial(6);
        System.out.println("Factorial from " + fact.key+"\tequal: "+ fact.result);
    }

     static class Math {

         public static class Factorial {
             private int result;
             private int key;

             public Factorial(int number, int x) {
                 result = number;
                 key = x;
             }

             public int getResult() {
                 return result;
             }

             public int getKey() {
                 return key;
             }
         }


         public static Factorial getFactorial(int x) {
             int result = 1;
             for (int i = 1; i < x; i++) {
                 result *= i;
             }
             return new Factorial(result, x);
         }
     }
}


