package InPut;

import Prefabricates.*;

import java.io.*;

public class Read_From_File {

    private static int maxX = 0;
    private static int maxY = 0;
    private static File f;

    //funkcja ta czyta plik, ustala maksymalne granice swiata na podstawie maksymalnych wspolrzednych prefabrykatow i na tej podstawie tworzy swiat
    public void read_from_file(File f) {
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
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0){
                            if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                            if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        }
                        else {
                            System.out.println("Zły typ wartości wspołrzędnej w linii " + linenr + ". Współrzędne powinny być liczbami całkowitymi nieujemnymi");
                        }
                    } else if (w[0].equals("Cable")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0){
                            if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                            if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        }
                        else {
                            System.out.println("Zły typ wartości wspołrzędnej w linii " + linenr + ". Współrzędne powinny być liczbami całkowitymi nieujemnymi");
                        }
                    } else if (w[0].equals("And")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0){
                            if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                            if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        }
                        else {
                            System.out.println("Zły typ wartości wspołrzędnej w linii " + linenr + ". Współrzędne powinny być liczbami całkowitymi nieujemnymi");
                        }
                    } else if (w[0].equals("Generator")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0){
                            if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                            if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        }
                        else {
                            System.out.println("Zły typ wartości wspołrzędnej w linii " + linenr + ". Współrzędne powinny być liczbami całkowitymi nieujemnymi");
                        }
                    } else if (w[0].equals("Head")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0){
                            if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                            if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        }
                        else {
                            System.out.println("Zły typ wartości wspołrzędnej w linii " + linenr + ". Współrzędne powinny być liczbami całkowitymi nieujemnymi");
                        }
                    } else if (w[0].equals("Not")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0){
                            if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                            if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        }
                        else {
                            System.out.println("Zły typ wartości wspołrzędnej w linii " + linenr + ". Współrzędne powinny być liczbami całkowitymi nieujemnymi");
                        }
                    } else if (w[0].equals("Or")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0){
                            if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                            if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        }
                        else {
                            System.out.println("Zły typ wartości wspołrzędnej w linii " + linenr + ". Współrzędne powinny być liczbami całkowitymi nieujemnymi");
                        }
                    } else if (w[0].equals("Tail")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0){
                            if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                            if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        }
                        else {
                            System.out.println("Zły typ wartości wspołrzędnej w linii " + linenr + ". Współrzędne powinny być liczbami całkowitymi nieujemnymi");
                        }
                    } else if (w[0].equals("Xor")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0){
                            if (maxX < Integer.parseInt(w[1])) maxX = Integer.parseInt(w[1]);
                            if (maxY < Integer.parseInt(w[2])) maxY = Integer.parseInt(w[2]);
                        }
                        else {
                            System.out.println("Zły typ wartości wspołrzędnej w linii " + linenr + ". Współrzędne powinny być liczbami całkowitymi nieujemnymi");
                        }
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
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0) {
                            Diode diode = new Diode();
                            diode.draw_diode(Integer.parseInt(w[1]), Integer.parseInt(w[2]));
                        }
                    } else if (w[0].equals("Cable")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0) {
                            Cable cable = new Cable();
                            cable.draw_cable(Integer.parseInt(w[1]), Integer.parseInt(w[2]));
                        }
                    } else if (w[0].equals("And")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0) {
                            And and = new And();
                            and.draw_and(Integer.parseInt(w[1]), Integer.parseInt(w[2]));
                        }
                    } else if (w[0].equals("Generator")) {
                        // tu wkrótce będzie kod :)
                        linenr++;
                    } else if (w[0].equals("Head")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0) {
                            Head head = new Head();
                            head.draw_head(Integer.parseInt(w[1]), Integer.parseInt(w[2]));
                        }
                    } else if (w[0].equals("Not")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0) {
                            Not not = new Not();
                            not.draw_not(Integer.parseInt(w[1]), Integer.parseInt(w[2]));
                        }
                    } else if (w[0].equals("Or")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0) {
                            Or or = new Or();
                            or.draw_or(Integer.parseInt(w[1]), Integer.parseInt(w[2]));
                        }
                    } else if (w[0].equals("Tail")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0) {
                            Tail tail = new Tail();
                            tail.draw_tail(Integer.parseInt(w[1]), Integer.parseInt(w[2]));
                        }
                    } else if (w[0].equals("Xor")) {
                        linenr++;
                        if(parse(w[1]) >= 0 && parse(w[2]) >= 0) {
                            Xor xor = new Xor();
                            xor.draw_xor(Integer.parseInt(w[1]), Integer.parseInt(w[2]));
                        }
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

    public int parse(String s){
        try{
            return Integer.parseInt(s);
        } catch(NumberFormatException e){
            return -1;
        }

}
