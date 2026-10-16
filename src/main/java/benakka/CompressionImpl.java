package benakka;

public class CompressionImpl implements Compression {
    @Override
    public int[] compresser(int[] data) {
        int[] resultat = new int[(data.length + 1) / 2];

        for (int i = 0; i < data.length; i += 2) {
            resultat[i / 2] = data[i];
        }
        return resultat;
    }
}
