package InPut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException {
        File file = new File("input/przyklad.txt");
        Read_From_File f = new Read_From_File();
        f.read_from_file(file);

        World world = new World();

        int [][] copiedworld;

        copiedworld = world.copy_world();

        int x = world.getXdim();
        int y = world.getYdim();

        for(int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(copiedworld[j][i] + " ");
            }
            System.out.print("\n");
        }

        Save_To_File save = new Save_To_File();

        save.save_to_file(10);


    }
}
