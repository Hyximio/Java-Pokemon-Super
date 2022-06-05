import java.util.ArrayList;

public class GrassPokemon extends Pokemon {

    public static ArrayList<GrassPokemon> grassPokemons = new ArrayList<>();

    public GrassPokemon(String _name, int _level ){
        super( _name, _level);
        Pokemon.pokemons.add( this );
        GrassPokemon.grassPokemons.add( this );
    }

    @Override
    public void doPowerMove(){
        System.out.println( "GrassPokemon " + this.getName() + " does a powermove!");
    }

    public void plantSeed() {
        System.out.println( "GrassPokemon " + this.getName() + " plants a seed!");
    }

    @Override
    public String toString(){
        String sleepStatus = "";
        if (this.isSleeping()){
            sleepStatus += " is currently sleeping";
        }else{
            sleepStatus += " is currently awake";
        }
        return ( "GrassPokemon: " + this.getName() + " -> " + this.getLevel() + sleepStatus);
    }
}
