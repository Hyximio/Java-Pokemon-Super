import java.util.ArrayList;

public class FirePokemon extends Pokemon {

    public static ArrayList<FirePokemon> firePokemons = new ArrayList<>();

    // default heat value
    private int heat = 0;

    public FirePokemon( String _name, int _level ){
        super( _name, _level);
        Pokemon.pokemons.add( this );
        FirePokemon.firePokemons.add( this );
    }

    public FirePokemon( String _name, int _level, int _heat){
        super( _name, _level);
        Pokemon.pokemons.add( this );
        FirePokemon.firePokemons.add( this );

        this.heat = _heat;
    }

    @Override
    public void doPowerMove(){
        System.out.println( "Firepokemon " + this.getName() + " does a powermove!");
    }

    public void thunder() {
        System.out.println( "Firepokemon " + this.getName() + " gives a thunder!");
    }

    @Override
    public String toString(){
        String sleepStatus = "";
        if (this.isSleeping()){
            sleepStatus += " is currently sleeping";
        }else{
            sleepStatus += " is currently awake";
        }
        return ( "Firepokemon: " + this.getName() + " -> " + this.getLevel() + sleepStatus + " : Has a heat of " + this.heat);
    }
}
