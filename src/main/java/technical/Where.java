package technical;

import java.util.Arrays;


public class Where implements IDescribable {
    private final String[] places = {Places.ROCKET.toString(),
            Places.CITY.toString(),
            Places.PAVILION_OF_ZERO_GRAVITY.toString(),
            Places.THE_MOON.toString()};
    private final String[] whereExactly = {Places.IN.toString(),Places.NEAR.toString(), Places.ON.toString(), Places.RIVER.toString()};
    private String place;

    public void setPlace(String whereExactly, String where) {
        if (Arrays.asList(this.whereExactly).contains(whereExactly) && Arrays.asList(this.places).contains(where)) {
            this.place = whereExactly + " " + where ;
        }
        else {
            this.place = null;
        }
    }

    public String getPlace() {
        return this.place + " ";
    }


    @Override
    public String describe() {
        return null;
    }
}
