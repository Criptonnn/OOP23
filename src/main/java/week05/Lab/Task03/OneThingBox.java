package week05.Lab.Task03;

import java.util.ArrayList;

public class OneThingBox extends Box{
private ArrayList<Thing> things = new ArrayList<>();

public OneThingBox() {

}

@Override
public void add(Thing thing) {
    if(this.things.isEmpty()) {
        this.things.add(thing);
    }
}

@Override
public boolean isInTheBox(Thing thing) {
    for(Thing t : things) {
        if(t.getName().equals(thing.getName())) {
            return true;
        }
    }
    return false;
}
}
