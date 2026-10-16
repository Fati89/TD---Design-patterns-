package benakka;

public class FilterImpl1 implements Filter {
    @Override
    public int[] filtrer(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i]*=2;
        }
        System.out.println("----- Filter x2 -----");
        return data;
    }
}
