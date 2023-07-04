# Arrow Bench
Arrow Bench adds a functional fletching table to Minecraft.

### Datapacks
Arrow Bench provides a new recipe type for the fletching table where new recipes can get added.\
If you don't know how to create a datapack check out [Data Pack Wiki](https://minecraft.fandom.com/wiki/Data_Pack) website and try to create your first one for the vanilla game.\
The new recipe files have to be inside a recipe folder, just like vanilla recipes.\
An example for a recipe can be found below:

```json
{
    "type": "minecraft:fletching",
    "top": {
        "item": "minecraft:flint"
    },
    "middle": {
        "item": "minecraft:stick"
    },
    "bottom": {
        "item": "minecraft:feather"
    },
    "addition": {
        "item": "minecraft:potion",
        "data": "{Potion:\"minecraft:harming\"}"
    },
    "result": {
        "item": "minecraft:tipped_arrow",
        "count": 6,
        "data": "{Potion:\"minecraft:harming\"}"
    }
}
```
Only the "addition" and "result" item can have nbt information.\
The "addition" field is not necessary!

### CREDITS & LICENSE
This project uses code that is MIT licensed. Base of this Project is the fletching table from [AdditionZ](https://github.com/Globox1997/AdditionZ) from [Globox1997](https://github.com/Globox1997). Check out AdditionZ as Arrow Bench is only a single stripped down functionality of it.
 
[Changelog](https://github.com/dadoirie/arrowbench/blob/master/CHANGELOG.md)
