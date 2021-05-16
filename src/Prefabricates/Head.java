package Prefabricates;

import InPut.World;

public class Head {

    public void draw_head(int x, int y){
        World world = new World();
        if(collision_head(x,y) == 0)
            world.overwrite(x,y,1);
    }

    private int collision_head(int x, int y){
        World world = new World();
        int [][] copied = world.copy_world();
        // dla elektronu nalezy sprawdzic czy rysujemy go "na kablu", lub czy nie ma juz w tym miejscu innego elektronu
        if(copied[x][y] == 0) return 1;
        else if(copied[x][y] == 1) return 1;
        else if(copied[x][y] == 2) return 1;
        else{return 0;}
    }
}
