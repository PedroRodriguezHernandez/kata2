package software;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ShootLoader shootLoader = new CsvFileShootLoader(new File("shootings.csv"));
        List<Shoot> shoots = shootLoader.load();
        Map<String, Integer> chart = new HashMap<>();
        for (Shoot shoot: shoots){
            String race = shoot.getRace();
            chart.put(race, chart.getOrDefault(race, 0)+1);
        }
        for (String key : chart.keySet()){
            System.out.println(key + " : " + chart.get(key));
        }
    }
}
