public class main {
    public static void main(String[] args) {

        // Create all pokemons
        new FirePokemon( "Dizzy", 45);
        new FirePokemon( "Simon", 60, 33);
        new WaterPokemon( "Swimmy John", 55);
        new ElectricPokemon( "Shock", 102);
        new GrassPokemon( "Grogro", 66);

        System.out.println( "There are at this moment " + Pokemon.count + " pokemons");

        // Print all pokemons
        for ( Pokemon p : Pokemon.pokemons ){
            System.out.println( p.toString() );
        }

        // Print all actions per type of pokemon
        System.out.println( "\n - And this is what they do:");

        for ( FirePokemon f : FirePokemon.firePokemons){
            f.thunder();
        }

        for ( WaterPokemon w : WaterPokemon.waterPokemons){
            w.dive();
        }

        for ( GrassPokemon g : GrassPokemon.grassPokemons){
            g.plantSeed();
        }

        for ( ElectricPokemon e : ElectricPokemon.electricPokemons){
            e.charge();
        }
    }
}
