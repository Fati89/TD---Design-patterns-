package benakka;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Image image = new Image(new int[] {1, 2, 3, 4, 5, 6});

        image.setFilter(new FilterImpl1());
        image.filtrer();
        System.out.println("");
        image.setFilter(new FilterImpl2());
        image.filtrer();
        System.out.println("");
        image.setCompression(new CompressionImpl());
        image.compresser();

        System.out.println("\n");
        FilterAdapter filterAdapter = new FilterAdapter();
        filterAdapter.setNonStandard(new NonStandardImpl());
        image.setFilter(filterAdapter);
        image.filtrer();

    }
}
