package Part1_3;

import Part1_3.animals.Cat;
import Part1_3.animals.Bee;
import Part1_3.animals.Cow;
import Part1_3.animals.Pig;
import Part1_3.animals.Dog;
import Part1_3.animals.Cricket;
import Part1_3.animals.Frog;
import Part1_3.soundmakers.SoundMaker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SoundMaker> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Cow());
        list.add(new Pig());
        list.add(new Bee());
        list.add(new Cricket());
        list.add(new Frog());

        for (SoundMaker soundMaker : list) {
            soundMaker.makeSound();
        }
    }
}

