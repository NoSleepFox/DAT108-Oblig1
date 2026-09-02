import java.util.ArrayList;
import java.util.List;

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

        // ny liste med kun ansattes etternavn

        // antall kvinner blant ansatte

        // gjennomsnittslønn til kvinlige ansatte

        // alle sjefer 7% lønnsøkning vb. Streams, "map" skriver ut liste av ansatte

        // finn ut om noen tjener over 800 000,-

        // Skriv alle ansatte ut - System.out.println() uten å bruke løkke

        // Ansatt/e med lavest lønn

        // finn summen av alle heltall i [1, 1000 > som er delelig med 3 eller 5
    }
}
