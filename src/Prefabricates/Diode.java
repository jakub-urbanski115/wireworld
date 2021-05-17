package Prefabricates;

import InPut.World;

public class Diode {

    public void draw_diode(int x, int y){
        World world = new World();
        if(collision_diode(x,y) == 0){
            world.overwrite(x,y,3);
            world.overwrite(x,y+1,3);
            world.overwrite(x,y-1,3);
            world.overwrite(x+1,y-1,3);
            world.overwrite(x+1,y+1,3);
        }
        else{
            System.out.println("Nastąpiła kolizja prefabrykatów");
        }

    }

    private int collision_diode(int x, int y){
        World world = new World();
        int [][] copied = world.copy_world();
        if(y<1)return 1; // dioda wyjdzie wtedy poza krawedz
        // sprawdzanie czy nie następuje kolizja z innym prefabrtykatem
        else if(copied[x][y] == 3)return 1;
        else if(copied[x][y+1] == 3)return 1;
        else if(copied[x][y-1] == 3)return 1;
        else if(copied[x+1][y+1] == 3)return 1;
        else if(copied[x+1][y-1] == 3)return 1;
        else{return 0;}
    }
}
