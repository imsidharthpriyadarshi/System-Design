package LLD.Patterns.structural.flyWeight;

import LLD.Patterns.structural.flyWeight.with.Robots;
import LLD.Patterns.structural.flyWeight.with.RobotsFactory;
import LLD.Patterns.structural.flyWeight.without.Sprites;

public class Main {
    public static void main(String[] args) {

        //?without fly weight pattern
        //?by following this ,we might we run out of memory
//        int x=0,y=0;
//        for(int i=0;i<500000;i++){
//            //offcourse i can argue that just keep this thing out of this loop,
//            //but think from the prospective of client who can do this as well
//            Sprites humanSprite= new Sprites();
//            Robots human_robot= new Robots(humanSprite,x+i,y+i, "human");
//        }
//        for(int i=0;i<500000;i++){
//            Sprites dogSprite= new Sprites();
//            Robots dog_robot= new Robots(dogSprite,x+i,y+i, "dog");
//        }
        //?with fly weight , this will take very less memory
        int x=0,y=0;
        for (int i=0;i<500000;i++){
            RobotsFactory robotsFactory= new RobotsFactory();
            Robots robots= new Robots(x+i,y+i,robotsFactory.getRobotType("human"));
        }

        for (int i=0;i<500000;i++){
            RobotsFactory robotsFactory= new RobotsFactory();
            Robots robots= new Robots(x+i,y+i,robotsFactory.getRobotType("dog"));
        }



    }
}
