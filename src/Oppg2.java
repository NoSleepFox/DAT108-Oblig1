import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Oppg2 {

    private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> fu) {
        for (Ansatt a : ansatte) {
            int nyLonn = fu.apply(a);
            a.setAarslonn(nyLonn);
        }
    }

    public static void skrivUtAlle(List<Ansatt> ansatte) {
        for (Ansatt a : ansatte) {
            System.out.println(a.toString());
        }
    }

    public static void main(String[] args) {

        List<Ansatt> ansatte = new ArrayList<>(List.of(
                new Ansatt("Ola", "Hansen", Kjonn.MANN, "Utvikler", 300000),
                new Ansatt("Kari", "Olsen", Kjonn.KVINNE, "Prosjektleder", 420000),
                new Ansatt("Per", "Johansen", Kjonn.MANN, "Konsulent", 380000),
                new Ansatt("Anne", "Larsen", Kjonn.KVINNE, "Designer", 410000),
                new Ansatt("Erik", "Nilsen", Kjonn.MANN, "Utvikler", 470000)
        ));

        // Et fast kronetillegg
        lonnsoppgjor(ansatte, a -> a.getAarslonn() + 10000);
        skrivUtAlle(ansatte);
        System.out.println();

        // Et fast prosenttillegg
        lonnsoppgjor(ansatte, a -> (int) (a.getAarslonn() * 1.2));
        skrivUtAlle(ansatte);
        System.out.println();

        // Et fast kronetillegg hvis du har lav lønn
        lonnsoppgjor(ansatte, a -> { if (a.getAarslonn() < 400000) return a.getAarslonn() + 30000; else return a.getAarslonn(); });
        skrivUtAlle(ansatte);
        System.out.println();

        // Et fast prosenttillegg hvis du er mann
        lonnsoppgjor(ansatte, a -> { if (a.getKjonn() == Kjonn.MANN) return (int) (a.getAarslonn() * 1.2); else return a.getAarslonn(); });
        skrivUtAlle(ansatte);
        System.out.println();
    }


}
