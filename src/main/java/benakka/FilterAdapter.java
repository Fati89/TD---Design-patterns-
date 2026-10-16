package benakka;

public class FilterAdapter implements Filter{

    public NonStandard nonStandard;

    public void setNonStandard(NonStandard nonStandard) {
        this.nonStandard = nonStandard;
    }

    @Override
    public int[] filtrer(int[] data) {
        System.out.println("Adapting...");
        return nonStandard.filtrer("non standard", data);
    }
}
