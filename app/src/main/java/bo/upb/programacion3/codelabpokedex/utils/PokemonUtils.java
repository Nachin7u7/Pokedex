package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(5, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(6, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(7, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(8, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(9, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(10, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(11, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(12, "Zubat", R.drawable.zubat, "Poison"));

        pokemons.add(new Pokemon(13, "Elon Musk", R.drawable.elon_musk, "visionary"));
        pokemons.add(new Pokemon(14, "Faraon Love Shady", R.drawable.faraon, "Peruvian"));
        pokemons.add(new Pokemon(15, "Britney Spears", R.drawable.britney, "Carzy Singer"));
        pokemons.add(new Pokemon(16, "Palomo", R.drawable.palomo, "Terrorist"));
        pokemons.add(new Pokemon(17, "programer", R.drawable.programer, "Copy-paster from Stackoverflow"));
        pokemons.add(new Pokemon(18, "spiderman", R.drawable.spider, "hero"));
        pokemons.add(new Pokemon(19, "corona", R.drawable.corona, "virus"));
        pokemons.add(new Pokemon(20, "pilfrut", R.drawable.pilfrut, "juice"));
        pokemons.add(new Pokemon(21, "Saxoman", R.drawable.saxoman, "Crazy Singer"));
        pokemons.add(new Pokemon(22, "Evo", R.drawable.evo, "donkey"));
        pokemons.add(new Pokemon(23, "PinkGuy", R.drawable.pink, "Wizzard"));
        return pokemons;
    }
}
