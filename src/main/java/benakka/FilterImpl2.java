package benakka;

public class FilterImpl2 implements Filter {
    @Override
    public int[] filtrer(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i]-=1;
        }
        System.out.println("----- Filter -1 -----");
        return data;
    }
}
