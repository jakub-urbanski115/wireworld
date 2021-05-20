package Prefabricates;

import InPut.World;

public class Generator {

    public void draw_generator(int x, int y){
        World world = new World();
        if(collision_generator(x,y) == 0){
            world.overwrite(x,y,3);
            world.overwrite(x+1,y,3);
            world.overwrite(x+1,y+1,3);
            world.overwrite(x+1,y-1,3);
            world.overwrite(x+2,y,3);
        }
        else{
            System.out.println("Nastąpiła kolizja prefabrykatów");
        }
    }

    private int collision_generator(int x, int y){
        World world = new World();
        int[][] copied = world.copy_world();
        if (y < 1) return 1;
        else if(copied [x][y] == 3) return 1;
        else if(copied [x+1][y] == 3) return 1;
        else if(copied [x+1][y+1] == 3) return 1;
        else if(copied [x+1][y-1] == 3) return 1;
        else if(copied [x+2][y] == 3) return 1;
        else{return 0;}
    }
}
