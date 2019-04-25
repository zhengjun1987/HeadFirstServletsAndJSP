package beerV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeerExpert {
    public List<String> advice(String color){
        if (color.equals("amber")) {
            return Arrays.asList("Jack Amber","Red Moose");
        }
        if (color.equals("brown")) {
            return Arrays.asList("Jail Pale Ale","Gout Stout");
        }

        return new ArrayList<String>();
    }
}
