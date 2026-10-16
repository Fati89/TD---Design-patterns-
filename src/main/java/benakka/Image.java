package benakka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Image {
    private int[] pixels;
    Filter filter;
    Compression compression;

    public Image(int[] pixels){
        this.pixels = Arrays.copyOf(pixels, pixels.length);
    }

    public void filtrer(){
        int[] data = Arrays.copyOf(pixels, pixels.length);
        System.out.println("_______ avant filter ________");
        System.out.println(Arrays.toString(data));
        System.out.println("_______ apres filter ________");
        int[] filtredData = filter.filtrer(data);
        System.out.println(Arrays.toString(filtredData));
    }
    public void compresser(){
        int[] data = Arrays.copyOf(pixels, pixels.length);
        System.out.println("_______ avant compression ________");
        System.out.println(Arrays.toString(data));
        System.out.println("_______ apres compression ________");
        int[] compressedData = compression.compresser(data);
        System.out.println(Arrays.toString(compressedData));
    }

    public int[] getPixels() {
        return pixels;
    }

    public void setPixels(int[] pixels) {
        this.pixels = pixels;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void setCompression(Compression compression) {
        this.compression = compression;
    }
}
