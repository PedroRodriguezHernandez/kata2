package software;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileShootLoader implements ShootLoader{
    private final File file;

    public CsvFileShootLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Shoot> load() {
        try {
            return load(new FileReader(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Shoot> load(FileReader reader) throws IOException{
        return load(new BufferedReader(reader));
    }

    private List<Shoot> load(BufferedReader reader) throws IOException {
        reader.skip(1);
        List<Shoot> shoots = new ArrayList<>();
        while (true){
            String line = reader.readLine();
            if (line == null) return shoots;
            shoots.add(toShoot(line.split("\t")));
        }
    }

    private Shoot toShoot(String[] field) {
        return new Shoot(
                field[0],
                field[1],
                field[2],
                field[3],
                field[4],
                field[5],
                field[6],
                field[7],
                field[8],
                field[9],
                field[10],
                field[11],
                field[12],
                field[13],
                field[14]
        );
    }
}
