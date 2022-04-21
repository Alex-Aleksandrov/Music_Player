package itAcademyy.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Tests12 {
    public static void main(String[] args) {
        MusicBand groups1 = new MusicBand("Linkin Park", 1999);
        MusicBand groups2 = new MusicBand("Green Day", 1995);
        MusicBand groups3 = new MusicBand("Stigmata", 1992);
        MusicBand groups4 = new MusicBand("Nervous", 2007);
        MusicBand groups5 = new MusicBand("Nirvana", 1888);
        MusicBand groups6 = new MusicBand("Black Star", 2010);
        MusicBand groups7 = new MusicBand("Slipknot", 1990);
        MusicBand groups8 = new MusicBand("Gorillas", 2002);
        MusicBand groups9 = new MusicBand("Rammstein", 1991);
        MusicBand groups10 = new MusicBand("AC/DC", 1882);

        List<MusicBand> musicGroup = new ArrayList<>();

        musicGroup.add(groups1);
        musicGroup.add(groups2);
        musicGroup.add(groups3);
        musicGroup.add(groups4);
        musicGroup.add(groups5);
        musicGroup.add(groups6);
        musicGroup.add(groups7);
        musicGroup.add(groups8);
        musicGroup.add(groups9);
        musicGroup.add(groups10);

        Collections.shuffle(musicGroup);

        System.out.println(musicGroup);

        List<MusicBand> musicGroupsAfter2000 = new ArrayList<>();
        for (MusicBand groupBand : musicGroup) {
            if (groupBand.getYear() > 2000){
                musicGroupsAfter2000.add(groupBand);
            }
        }

        System.out.println(musicGroupsAfter2000);

    }

}