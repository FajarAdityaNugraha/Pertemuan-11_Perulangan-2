/**
 * Porseni
 */
public class Porseni {

    public static void main(String[] args) {
        String[][] namaAtlet = {
            { "Fajar", "Badminton" },
            { "Yefta", "Badminton" },
            { "Gilang", "Badminton" },
            { "Heru", "Badminton" },
            { "Adib", "Badminton" },
            { "Kiki", "Tenis Meja" },
            { "Benok", "Tenis Meja" },
            { "Rizky", "Tenis Meja" },
            { "Muklas", "Tenis Meja" },
            { "Tora", "Tenis Meja" },
            { "Hikmah", "Basket" },
            { "Bernard", "Basket" },
            { "Ijat", "Basket" },
            { "Aldrin", "Basket" },
            { "Abdillah", "Basket" },
            { "Digda", "Bola Voly" },
            { "Kristiawan", "Bola Voly" },
            { "Purnomo", "Bola Voly" },
            { "Octa", "Bola Voly" },
            { "Aditya", "Bola Voly" }
    };
    for (int i = 0; i < namaAtlet.length - 1; i++) {
        for (int j = 0; j < namaAtlet.length - i - 1; j++) {
            if (namaAtlet[j][0].compareTo(namaAtlet[j + 1][0]) > 0) {
                String[] temp = namaAtlet[j];
                namaAtlet[j] = namaAtlet[j + 1];
                namaAtlet[j + 1] = temp;
            }
        }
    }
    System.out.println("\nInformasi Atlet Porseni 2024:");
    for (String[] atlet : namaAtlet) {
        System.out.println("Nama: " + atlet[0] + ", Cabang: " + atlet[1]);
    }
}
}