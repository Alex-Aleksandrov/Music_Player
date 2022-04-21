package itAcademyy.task2;

import java.util.ArrayList;
import java.util.List;

public class Tests4 {

    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();

        members1.add(new MusicArtist("Lexa Alekseev", 44));
        members1.add(new MusicArtist("Ivan Ivanov", 55));
        members1.add(new MusicArtist("Vova Vovachkin", 77));

        MusicBand musicBand1 = new MusicBand("Nirvana", 2000, members1);

        List<MusicArtist> members2 = new ArrayList<>();

        members2.add(new MusicArtist("Lena Lenochka", 40));
        members2.add(new MusicArtist("Ira Irochka", 33));
        members2.add(new MusicArtist("Vika Viktoriya", 55));

        MusicBand musicBand2 = new MusicBand("Devochki", 2001, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();


        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}