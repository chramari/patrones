package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.HashMap;
import java.util.Map;

public class CREApiClient {
    public Map<Integer, UserData> getCREinfo(){
        Map<Integer, UserData> CREUsers = new HashMap<Integer, UserData>();
        CREUsers.put(1, new UserData("Jhon Wick", "Death street", 10.25));
        CREUsers.put(5, new UserData("Bruce Wayne", "Gothic Street", 26.37));
        CREUsers.put(9, new UserData("Tony Stark", "Stark tower", 50.81));
        
        return CREUsers;
    }
}
