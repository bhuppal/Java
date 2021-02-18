public class PrimitiveDataTypes {
    public static void main(String[] args) {
        final int MAX_SCORE = 100;
        double d = 19d;
        int i = 100;
        d = i;//widening conversion
      float m = 1;

      int n = 2;
      int x = 5;
      int y = 10;
      m = (float) (50 + 0.6);
      System.out.println(m);

      int[] tempArr = new int[] {1, 2, 3, 4, 5, 6};
      for(int myVal: tempArr){
          System.out.println(myVal+100);
      }
    }
}
