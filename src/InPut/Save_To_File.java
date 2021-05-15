package InPut;

import java.io.*;

public class Save_To_File {

    public void save_to_file(int iteration) throws IOException {
        Read_From_File file = new Read_From_File();
        File f = file.getFile();
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        try {
            File save = new File("output/zapis_iteracji" + iteration + ".txt");
            save.createNewFile();
            FileWriter write = new FileWriter("output/zapis_iteracji" + iteration + ".txt");

        while ((line = br.readLine()) != null) {
            String[] w = line.split("\\s+");
            if (w.length == 3) {
                if (w[0].equals("Diode")) {
                    write.write(w[0] + " " + w[1] + " " + w[2] + "\n");
                } else if (w[0].equals("Cable")) {
                    write.write(w[0] + " " + w[1] + " " + w[2] + "\n");
                } else if (w[0].equals("And")) {
                    write.write(w[0] + " " + w[1] + " " + w[2] + "\n");
                } else if (w[0].equals("Generator")) {
                    write.write(w[0] + " " + w[1] + " " + w[2] + "\n");
                } else if (w[0].equals("Not")) {
                    write.write(w[0] + " " + w[1] + " " + w[2] + "\n");
                } else if (w[0].equals("Or")) {
                    write.write(w[0] + " " + w[1] + " " + w[2] + "\n");
                } else if (w[0].equals("Xor")) {
                    write.write(w[0] + " " + w[1] + " " + w[2] + "\n");
                }
            }

        }
        World world = new World();
        int [][] copy = world.copy_world();
        int x = world.getXdim();
        int y = world.getYdim();

        for(int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if(copy[j][i] == 2)
                    write.write("Head " + j + " " + i + "\n" );
                else if(copy[j][i] == 3)
                    write.write("Tail " + j + " " + i + "\n" );
            }
        }
        write.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
