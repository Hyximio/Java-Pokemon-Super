import java.util.ArrayList;

public abstract class Pokemon {

    public static int count = 0;
    public static ArrayList<Pokemon> pokemons = new ArrayList<>();

    private String name;
    private int level;

    private boolean sleep = false;

    public Pokemon( String _name, int _level ){
        Pokemon.count += 1;
        this.name = _name;
        this.level = _level;
    }

    public void toSleep(){
        if ( this.sleep ){
            System.out.println( name + " is already sleeping");
        }else {
            this.sleep = true;
            System.out.println(name + " goes to sleep now... zzz");
        }
    }

    public void awake(){
        if ( !this.sleep ){
            System.out.println( name + " is already awake");
        }else {
            this.sleep = false;
            System.out.println(name + " is awake now... Whoohoo!");
        }
    }

    public boolean isSleeping() {
        return this.sleep;
    }

    public abstract void doPowerMove();

    public void setName( String _name ){
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }

    public void setLevel( int _level){
        this.level = _level;
    }

    public int getLevel(){
        return this.level;
    }

    public abstract String toString();
}
