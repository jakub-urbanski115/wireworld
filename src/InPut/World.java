package InPut;

public class World {
    public static int [][] world;
    public static int X;
    public static int Y;

    public void set_world(int maxX, int maxY){
        Read_From_File r = new Read_From_File();
        X = maxX + 10;
        Y = maxY + 10;
        world = new int[X][Y];

        for(int i = 0; i < Y; i++)
            for(int j = 0; j < X; j++)
                world[j][i] = 0;

        /*for(int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print(world[j][i] + " ");
            }
            System.out.print("\n");
        }*/
    }

    public void overwrite(int xpos, int ypos, int value){
        world[xpos][ypos] = value;
    }

    public int [][] copy_world(){
        int [][] copy = new int [X][Y];
        for(int i = 0; i < Y; i++)
            for (int j = 0; j < X; j++)
                copy[j][i] = world[j][i];

        return copy;
    }

    public int getXdim(){
        return X;
    }

    public int getYdim(){
        return Y;
    }

}
