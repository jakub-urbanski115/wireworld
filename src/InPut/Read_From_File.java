package InPut;

import Prefabricates.*;

import java.io.*;

public class Read_From_File {

    private static int maxX = 0;
    private static int maxY = 0;
    private static File f;

    //funkcja ta czyta plik, ustala maksymalne granice swiata na podstawie maksymalnych wspolrzednych prefabrykatow i na tej podstawie tworzy swiat
    public void read_from_file(File f) throws FileNotFoundException {
        this.f = f;
        try {
            int linenr = 0;
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while( (line = br.readLine()) != null){
                String [] w = line.split("\\s+");
                if( w.length == 3) {
                    if (w[0].equals("Diode")) {
                        if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                        if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        linenr++;
                    } else if (w[0].equals("Cable")) {
                        if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                        if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        linenr++;
                    } else if (w[0].equals("And")) {
                        if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                        if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        linenr++;
                    } else if (w[0].equals("Generator")) {
                        if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                        if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        linenr++;
                    } else if (w[0].equals("Head")) {
                        if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                        if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        linenr++;
                    } else if (w[0].equals("Not")) {
                        if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                        if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        linenr++;
                    } else if (w[0].equals("Or")) {
                        if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                        if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        linenr++;
                    } else if (w[0].equals("Tail")) {
                        if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                        if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        linenr++;
                    } else if (w[0].equals("Xor")) {
                        if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                        if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        linenr++;
                    } else {
                        linenr++;
                        System.out.println("Zła nazwa prefabrtykatu w linii " + linenr);
                    }
                }
                else{
                    linenr++;
                    System.out.println("Zła liczba argumentów w linii " + linenr);}
            }
            World world = new World();

            world.set_world(maxX, maxY);

            setprefabricates(f);
        }
        catch (FileNotFoundException e){
            System.err.println("nie można odczytać pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //funkcja ta sluzy do odczytania prefabrykatow z pliku i "narysowaniu" ich na mapie swiata
    public void setprefabricates(File f){
        try {
            int linenr = 0;
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while( (line = br.readLine()) != null){
                String [] w = line.split("\\s+");
                if( w.length == 3) {
                    if (w[0].equals("Diode")) {
                        Diode diode = new Diode();
                        diode.draw_diode(Integer.parseInt(w[1]),Integer.parseInt(w[2]));
                        linenr++;
                    } else if (w[0].equals("Cable")) {
                        Cable cable = new Cable();
                        cable.draw_cable(Integer.parseInt(w[1]),Integer.parseInt(w[2]));
                        linenr++;
                    } else if (w[0].equals("And")) {
                        // tu wkrótce będzie kod :)
                        linenr++;
                    } else if (w[0].equals("Generator")) {
                        // tu wkrótce będzie kod :)
                        linenr++;
                    } else if (w[0].equals("Head")) {
                        Head head = new Head();
                        head.draw_head(Integer.parseInt(w[1]),Integer.parseInt(w[2]));
                        linenr++;
                    } else if (w[0].equals("Not")) {

                        linenr++;
                    } else if (w[0].equals("Or")) {
                        // tu wkrótce będzie kod :)
                        linenr++;
                    } else if (w[0].equals("Tail")) {
                        Tail tail = new Tail();
                        tail.draw_tail(Integer.parseInt(w[1]),Integer.parseInt(w[2]));
                        linenr++;
                    } else if (w[0].equals("Xor")) {
                        // tu wkrótce będzie kod :)
                        linenr++;
                    } else {
                        linenr++;
                        System.out.println("Zła nazwa prefabrtykatu w linii " + linenr);
                    }
                }
                else{
                    linenr++;
                    System.out.println("Zła liczba argumentów w linii " + linenr);}
            }

        }
        catch (FileNotFoundException e){
            System.err.println("nie można odczytać pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public File getFile(){
        return f;
    }

}
