package mindustry.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class Items{
    public static Item
    scrap, copper, lead, graphite, coal, titanium, thorium, silicon, plastanium,
    phaseFabric, surgeAlloy, sporePod, sand, blastCompound, pyratite, metaglass,
    beryllium, tungsten, oxide, carbide, fissileMatter, dormantCyst;

    //TODO remove, these are for debugging only
    public static final Seq<Item> serpuloItems = new Seq<>(), erekirItems = new Seq<>(), erekirOnlyItems = new Seq<>();

    public static void load(){
        copper = new Item("copper", Color.valueOf("d99d73")){{
            hardness = 1;
            cost = 0.5f;
            hidden = true;
        }};

        lead = new Item("lead", Color.valueOf("8c7fa9")){{
            hardness = 1;
            cost = 0.7f;
            hidden = true;
        }};

        metaglass = new Item("metaglass", Color.valueOf("ebeef5")){{
            cost = 1.5f;
            hidden = true;
        }};

        graphite = new Item("graphite", Color.valueOf("95abd9")){{
            cost = 1f;
            hidden = true;
        }};

        sand = new Item("sand", Color.valueOf("f7cba4")){{
            lowPriority = true;
            hidden = true;
            buildable = false;
        }};

        coal = new Item("coal", Color.valueOf("272727")){{
            explosiveness = 0.2f;
            flammability = 1f;
            hardness = 2;
            buildable = false;
            hidden = true;
        }};

        titanium = new Item("titanium", Color.valueOf("8da1e3")){{
            hardness = 3;
            cost = 1f;
            hidden = true;
        }};

        thorium = new Item("thorium", Color.valueOf("f9a3c7")){{
            explosiveness = 0.2f;
            hardness = 4;
            radioactivity = 1f;
            cost = 1.1f;
            healthScaling = 0.2f;
            hidden = true;
        }};

        scrap = new Item("scrap", Color.valueOf("777777")){{
            hidden = true;
        }};

        silicon = new Item("silicon", Color.valueOf("53565c")){{
            cost = 0.8f;
            hidden = true;
        }};

        plastanium = new Item("plastanium", Color.valueOf("cbd97f")){{
            flammability = 0.1f;
            explosiveness = 0.2f;
            cost = 1.3f;
            healthScaling = 0.1f;
            hidden = true;
        }};

        phaseFabric = new Item("phase-fabric", Color.valueOf("f4ba6e")){{
            cost = 1.3f;
            radioactivity = 0.6f;
            healthScaling = 0.25f;
            hidden = true;
        }};

        surgeAlloy = new Item("surge-alloy", Color.valueOf("f3e979")){{
            cost = 1.2f;
            charge = 0.75f;
            healthScaling = 0.25f;
            hidden = true;
        }};

        sporePod = new Item("spore-pod", Color.valueOf("7457ce")){{
            flammability = 1.15f;
            buildable = false;
            hidden = true;
        }};

        blastCompound = new Item("blast-compound", Color.valueOf("ff795e")){{
            flammability = 0.4f;
            explosiveness = 1.2f;
            buildable = false;
            hidden = true;
        }};

        pyratite = new Item("pyratite", Color.valueOf("ffaa5f")){{
            flammability = 1.4f;
            explosiveness = 0.4f;
            buildable = false;
            hidden = true;
        }};

        beryllium = new Item("beryllium", Color.valueOf("3a8f64")){{
            hardness = 3;
            cost = 1.2f;
            healthScaling = 0.6f;
            hidden = true;
        }};

        tungsten = new Item("tungsten", Color.valueOf("768a9a")){{
            hardness = 5;
            cost = 1.5f;
            healthScaling = 0.8f;
            hidden = true;
        }};

        oxide = new Item("oxide", Color.valueOf("e4ffd6")){{
            cost = 1.2f;
            healthScaling = 0.5f;
            hidden = true;
        }};

        carbide = new Item("carbide", Color.valueOf("89769a")){{
            cost = 1.4f;
            healthScaling = 1.1f;
            hidden = true;
        }};

        fissileMatter = new Item("fissile-matter", Color.valueOf("5e988d")){{
            radioactivity = 1.5f;
            hidden = true;
        }};

        dormantCyst = new Item("dormant-cyst", Color.valueOf("df824d")){{
            flammability = 0.1f;
            hidden = true;
        }};

        // Zumdustry items

        serpuloItems.addAll(
        scrap, copper, lead, graphite, coal, titanium, thorium, silicon, plastanium,
        phaseFabric, surgeAlloy, sporePod, sand, blastCompound, pyratite, metaglass
        );

        erekirItems.addAll(
        graphite, thorium, silicon, phaseFabric, surgeAlloy, sand,
        beryllium, tungsten, oxide, carbide, fissileMatter, dormantCyst
        );

        erekirOnlyItems.addAll(erekirItems).removeAll(serpuloItems);

    }
}
