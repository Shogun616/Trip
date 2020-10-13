import java.util.Comparator;

public class SortByTypeAscending implements Comparator<Trip>{

    @Override
    public int compare(Trip t1, Trip t2){
        return t1.type.compareTo(t2.type);
    }
}
