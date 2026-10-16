package benakka;

public class NonStandardImpl implements NonStandard {

    @Override
    public int[] filtrer(String filterName, int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i]*=10;
        }
        System.out.println("*** ((( "+filterName+" ))) ***");
        return data;
    }
}
