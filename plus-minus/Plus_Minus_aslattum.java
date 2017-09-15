public class Plus_Minus_aslattum {
  public static void main(String[] args) {

    int[] array = {-4, 3, -9, 0, 4, 1};
    int size = 6;

    double frac_pos = 0.0;
    double frac_neg = 0.0;
    double frac_zero = 0.0;

    for (int i = 0; i < size; i++) {
      if (array[i] > 0) {
        frac_pos += array[i];
      } else if (array[i] < 0) {
        frac_neg += array[i];
      } else {
        // element is zero
        frac_zero += array[i];
      }
    }
    System.out.println(frac_pos/size);
    System.out.println(frac_neg/size);
    System.out.println(frac_zero/size);
  }
}