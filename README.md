# PokemonBook
use pokemon api on jetpack with java 
updating...
<img width="353" alt="pokemon_1" src="https://user-images.githubusercontent.com/20679974/117152161-57b07000-adec-11eb-96c5-695f8ed59dca.png">
主api：https://pokeapi.co/api/v2/
一级api:
{

    "ability":"https://pokeapi.co/api/v2/ability/",

    "berry":"https://pokeapi.co/api/v2/berry/",

    "berry-firmness":"https://pokeapi.co/api/v2/berry-firmness/",

    "berry-flavor":"https://pokeapi.co/api/v2/berry-flavor/",

    "characteristic":"https://pokeapi.co/api/v2/characteristic/",

    "contest-effect":"https://pokeapi.co/api/v2/contest-effect/",

    "contest-type":"https://pokeapi.co/api/v2/contest-type/",

    "egg-group":"https://pokeapi.co/api/v2/egg-group/",

    "encounter-condition":"https://pokeapi.co/api/v2/encounter-condition/",

    "encounter-condition-value":"https://pokeapi.co/api/v2/encounter-condition-value/",

    "encounter-method":"https://pokeapi.co/api/v2/encounter-method/",

    "evolution-chain":"https://pokeapi.co/api/v2/evolution-chain/",

    "evolution-trigger":"https://pokeapi.co/api/v2/evolution-trigger/",

    "gender":"https://pokeapi.co/api/v2/gender/",

    "generation":"https://pokeapi.co/api/v2/generation/",

    "growth-rate":"https://pokeapi.co/api/v2/growth-rate/",

    "item":"https://pokeapi.co/api/v2/item/",

    "item-attribute":"https://pokeapi.co/api/v2/item-attribute/",

    "item-category":"https://pokeapi.co/api/v2/item-category/",

    "item-fling-effect":"https://pokeapi.co/api/v2/item-fling-effect/",

    "item-pocket":"https://pokeapi.co/api/v2/item-pocket/",

    "language":"https://pokeapi.co/api/v2/language/",

    "location":"https://pokeapi.co/api/v2/location/",

    "location-area":"https://pokeapi.co/api/v2/location-area/",

    "machine":"https://pokeapi.co/api/v2/machine/",

    "move":"https://pokeapi.co/api/v2/move/",

    "move-ailment":"https://pokeapi.co/api/v2/move-ailment/",

    "move-battle-style":"https://pokeapi.co/api/v2/move-battle-style/",

    "move-category":"https://pokeapi.co/api/v2/move-category/",

    "move-damage-class":"https://pokeapi.co/api/v2/move-damage-class/",

    "move-learn-method":"https://pokeapi.co/api/v2/move-learn-method/",

    "move-target":"https://pokeapi.co/api/v2/move-target/",

    "nature":"https://pokeapi.co/api/v2/nature/",

    "pal-park-area":"https://pokeapi.co/api/v2/pal-park-area/",

    "pokeathlon-stat":"https://pokeapi.co/api/v2/pokeathlon-stat/",

    "pokedex":"https://pokeapi.co/api/v2/pokedex/",

    "pokemon":"https://pokeapi.co/api/v2/pokemon/",

    "pokemon-color":"https://pokeapi.co/api/v2/pokemon-color/",

    "pokemon-form":"https://pokeapi.co/api/v2/pokemon-form/",

    "pokemon-habitat":"https://pokeapi.co/api/v2/pokemon-habitat/",

    "pokemon-shape":"https://pokeapi.co/api/v2/pokemon-shape/",

    "pokemon-species":"https://pokeapi.co/api/v2/pokemon-species/",

    "region":"https://pokeapi.co/api/v2/region/",

    "stat":"https://pokeapi.co/api/v2/stat/",

    "super-contest-effect":"https://pokeapi.co/api/v2/super-contest-effect/",

    "type":"https://pokeapi.co/api/v2/type/",

    "version":"https://pokeapi.co/api/v2/version/",

    "version-group":"https://pokeapi.co/api/v2/version-group/"

}

三级api之pokemon"https://pokeapi.co/api/v2/pokemon/“：
offset就是start位置   limit就是数量
{

    "count":1118,

    "next":"https://pokeapi.co/api/v2/pokemon/?offset=20&limit=20",

    "previous":null,

    "results":[

        {

            "name":"bulbasaur",

            "url":"https://pokeapi.co/api/v2/pokemon/1/"

        },

        {

            "name":"ivysaur",

            "url":"https://pokeapi.co/api/v2/pokemon/2/"

        },

        {

            "name":"venusaur",

            "url":"https://pokeapi.co/api/v2/pokemon/3/"

        },

        {

            "name":"charmander",

            "url":"https://pokeapi.co/api/v2/pokemon/4/"

        },

        {

            "name":"charmeleon",

            "url":"https://pokeapi.co/api/v2/pokemon/5/"

        },

        {

            "name":"charizard",

            "url":"https://pokeapi.co/api/v2/pokemon/6/"

        },

        {

            "name":"squirtle",

            "url":"https://pokeapi.co/api/v2/pokemon/7/"

        },

        {

            "name":"wartortle",

            "url":"https://pokeapi.co/api/v2/pokemon/8/"

        },

        {

            "name":"blastoise",

            "url":"https://pokeapi.co/api/v2/pokemon/9/"

        },

        {

            "name":"caterpie",

            "url":"https://pokeapi.co/api/v2/pokemon/10/"

        },

        {

            "name":"metapod",

            "url":"https://pokeapi.co/api/v2/pokemon/11/"

        },

        {

            "name":"butterfree",

            "url":"https://pokeapi.co/api/v2/pokemon/12/"

        },

        {

            "name":"weedle",

            "url":"https://pokeapi.co/api/v2/pokemon/13/"

        },

        {

            "name":"kakuna",

            "url":"https://pokeapi.co/api/v2/pokemon/14/"

        },

        {

            "name":"beedrill",

            "url":"https://pokeapi.co/api/v2/pokemon/15/"

        },

        {

            "name":"pidgey",

            "url":"https://pokeapi.co/api/v2/pokemon/16/"

        },

        {

            "name":"pidgeotto",

            "url":"https://pokeapi.co/api/v2/pokemon/17/"

        },

        {

            "name":"pidgeot",

            "url":"https://pokeapi.co/api/v2/pokemon/18/"

        },

        {

            "name":"rattata",

            "url":"https://pokeapi.co/api/v2/pokemon/19/"

        },

        {

            "name":"raticate",

            "url":"https://pokeapi.co/api/v2/pokemon/20/"

        }

    ]

}

