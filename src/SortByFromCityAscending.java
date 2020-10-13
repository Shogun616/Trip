import java.util.Comparator;

public class SortByFromCityAscending implements Comparator<Trip>{

    @Override
    public int compare(Trip t1, Trip t2){
        return t1.fromCity.compareTo(t2.fromCity);
    }
}
