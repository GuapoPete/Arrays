public class PowerArray {

    public static void main(String[] args) {
        int[] result = toPower(4, 2);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] toPower(int size, int power) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.pow(i, power);
        }
        return array;
    }
}
