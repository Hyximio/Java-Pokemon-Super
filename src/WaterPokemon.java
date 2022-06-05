import java.util.ArrayList;

public class WaterPokemon extends Pokemon {

    public static ArrayList<WaterPokemon> waterPokemons = new ArrayList<>();

    public WaterPokemon(String _name, int _level ){
        super( _name, _level);
        Pokemon.pokemons.add( this );
        WaterPokemon.waterPokemons.add( this );
    }

    @Override
    public void doPowerMove(){
        System.out.println( "WaterPokemon " + this.getName() + " does a powermove!");
    }

    public void dive() {
        System.out.println( "WaterPokemon " + this.getName() + " dives!");
    }

    @Override
    public String toString(){
        String sleepStatus = "";
        if (this.isSleeping()){
            sleepStatus += " is currently sleeping";
        }else{
            sleepStatus += " is currently awake";
        }
        return ( "WaterPokemon: " + this.getName() + " -> " + this.getLevel() + sleepStatus);
    }
}
