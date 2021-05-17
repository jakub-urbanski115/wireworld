package Prefabricates;

import InPut.World;

public class Cable {

    public void draw_cable(int x, int y){
        World world = new World();
        if(collision_cable(x,y) == 0)
            world.overwrite(x,y,3);
        else{
            System.out.println("Nastąpiła kolizja prefabrykatów");
        }
    }

    private int collision_cable(int x, int y){
        World world = new World();
        int [][] copied = world.copy_world();
        if(copied[x][y] == 3){ return 1; } // moze byc tylko jedna kolizja
        else{return 0;}
    }
}
