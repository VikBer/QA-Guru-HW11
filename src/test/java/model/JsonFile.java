package model;

import java.util.List;
public class JsonFile {
    private String squadName;
    private String city;
    private int formed;
    private String goal;
    private boolean active;
    private List<String> members;

    public String getSquadName() {
        return squadName;
    }


    public String getCity() {
        return city;
    }

    public int getFormed() {
        return formed;
    }

    public String getGoal() {
        return goal;
    }

    public boolean isActive() {
        return active;
    }

    public List<String> getMembers() {
        return members;
    }
}
