/*
Write an interface called Playable, with a method
void play();
Let this interface be placed in a package called music.

Write a class called Veena which implements Playable interface. Let this class be placed in a package music.string

Write a class called Saxophone which implements Playable interface. Let this class be placed in a package music.wind

Write another class Test in a package called live. Then,
a. Create an instance of Veena and call play() method
b. Create an instance of Saxophone and call play() method
c. Place the above instances in a variable of type Playable and then call play()
*/

package live;

import music.Playable;
import music.wind.Saxophone;
import music.string.Veena;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        v.play();
        Saxophone s = new Saxophone();
        s.play();
        Playable p1 = new Veena();
        p1.play();
        Playable p2 = new Saxophone();
        p2.play();
    }
}