import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Oppg3 {

    public static void main(String[] args) {

        // bruker bare samme fra forrige oppgave
        List<Ansatt> ansatte = new ArrayList<>(List.of(
                new Ansatt("Ola", "Hansen", Kjonn.MANN, "Utvikler", 300000),
                new Ansatt("Kari", "Olsen", Kjonn.KVINNE, "Prosjektleder", 420000),
                new Ansatt("Per", "Johansen", Kjonn.MANN, "Konsulent", 380000),
                new Ansatt("Anne", "Larsen", Kjonn.KVINNE, "Designer", 410000),
                new Ansatt("Erik", "Nilsen", Kjonn.MANN, "Utvikler", 470000)
        ));

        // a) ny liste med kun ansattes etternavn
        List<String> etternavn =  ansatte.stream()
                .map(a -> a.getEtternavn())
                .toList();
        System.out.println(etternavn);

        // b) antall kvinner blant ansatte
        long antallKvinner = ansatte.stream()
                .filter(a -> a.getKjonn() == Kjonn.KVINNE)
                .count();
        System.out.println(antallKvinner);

        // c) gjennomsnittslønn til kvinnlige ansatte
        double gjennomsnitt = ansatte.stream()
                .filter(a -> a.getKjonn() == Kjonn.KVINNE)
                .mapToInt(a -> a.getAarslonn())
                .average()
                .orElse(0);
        System.out.println(gjennomsnitt);

        // d) alle sjefer 7% lønnsøkning vb. Streams, skriver ut liste av ansatte
        ansatte.stream()
                .filter(a -> a.getStilling().toLowerCase().contains("sjef"))
                .forEach(a -> a.setAarslonn((int) (a.getAarslonn() * 1.07)));
        ansatte.forEach(System.out::println);

        // e) finn ut om noen tjener over 800 000,-
        System.out.println("Tjener noen over 800 000kr?");
        boolean lonnOver800k = ansatte.stream()
                .anyMatch(a -> a.getAarslonn() > 800000);
        System.out.println(lonnOver800k);

        // f) Skriv alle ansatte ut - System.out.println() uten å bruke løkke
        ansatte.forEach(System.out::println);

        // g) Ansatt/e med lavest lønn
        int lavesteLonn = ansatte.stream()
                .mapToInt(a -> a.getAarslonn())
                .min()
                .orElse(0);

        System.out.println("Person med lavest lønn: ");
        List<Ansatt> lavestLonnede = ansatte.stream()
                .filter(a -> a.getAarslonn() == lavesteLonn)
                .toList();
        System.out.println(lavestLonnede);

        // h) finn summen av alle heltall i [1, 1000 > som er delelig med 3 eller 5
        System.out.println("summen av alle heltall i [1, 1000] delelig med 3 eller 5:");
        int sum = IntStream.range(1, 1000)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();
        System.out.println(sum);
    }
}
