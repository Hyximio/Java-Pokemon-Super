import java.util.ArrayList;

public class ElectricPokemon extends Pokemon {

    public static ArrayList<ElectricPokemon> electricPokemons = new ArrayList<>();

    public ElectricPokemon(String _name, int _level ){
        super( _name, _level);
        Pokemon.pokemons.add( this );
        ElectricPokemon.electricPokemons.add( this );
    }

    @Override
    public void doPowerMove(){
        System.out.println( "ElectricPokemon " + this.getName() + " does a powermove!");
    }

    public void charge() {
        System.out.println( "ElectricPokemon " + this.getName() + " is gonna charge!");
    }

    @Override
    public String toString(){
        String sleepStatus = "";
        if (this.isSleeping()){
            sleepStatus += " is currently sleeping";
        }else{
            sleepStatus += " is currently awake";
        }
        return ( "ElectricPokemon: " + this.getName() + " -> " + this.getLevel() + sleepStatus);
    }
}
