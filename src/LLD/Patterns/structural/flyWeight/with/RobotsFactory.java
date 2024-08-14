package LLD.Patterns.structural.flyWeight.with;

import java.util.HashMap;

public class RobotsFactory {
    //!this has a map so i can return cached data
    private HashMap<String, RobotType> hashMap;
    public RobotsFactory(){
        this.hashMap=new HashMap<>();
    }
    public RobotType getRobotType(String type){
        if (!hashMap.containsKey(type)){
            Sprites sprites = new Sprites();
         hashMap.put(type,new RobotType(sprites,type));
        }
        return hashMap.get(type);
    }
}
