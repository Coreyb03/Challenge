public class Rpg{
    String name;
    String role;
    int str , tgn , intel, mag, inf ;
    public Rpg(String name, String role, int str, int tgn, int intel, int mag, int inf){
        this.name = name;
        this.role = role;
        this.intel = intel;
        this.str = str;
        this.tgn = tgn;
        this.mag = mag;
        this.inf = inf;
    }

    public Rpg(String[] parameters){
        this(parameters[0], parameters[1],Integer.parseInt(parameters[2]),
        Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]),
        Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRole(String role){
        this.role = role;
    }

    public void setStr(int str){
        this.str = str;
    }

    public void setTgn(int tgn){
        this.tgn = tgn;
    }

    public void setIntel(int intel){
        this.intel = intel;
    }

    public void setMag(int mag){
        this.mag = mag;
    }

    public void setInf(int inf){
        this.inf = inf;
    }

    public String toString(){
        return name + "," + role + "," + str + "," + tgn + "," + intel 
        + "," + mag + "," + inf;
    }
}