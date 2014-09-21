package com.sgt.primoz.d20p1.DClasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Primoz on 21.9.2014.
 */
public class DContainer {
    public static List<DAbility> abilities = null;
    public static List<DMenuItem> menu = null;
    public static List<DFeat> feats = null;

    public static void initAll(){
        initMenu();
        initAbilities();
        initFeats();
    }

    public static void initAbilities(){
        if(abilities==null){
            abilities = DAbility.getD20Abilities();
        }
    }

    public static void initMenu(){
        if(menu==null){
            menu = new ArrayList<DMenuItem>();
            menu.add(new DMenuItem("Abilities",DConstants.ABILITIES));
            menu.add(new DMenuItem("Feats",DConstants.FEATS));
            menu.add(new DMenuItem("Skills",DConstants.SKILLS));
            menu.add(new DMenuItem("Classes",DConstants.CLASSES));
            menu.add(new DMenuItem("Weapons",DConstants.WEAPONS));
            menu.add(new DMenuItem("Armor", DConstants.ARMOR));
            menu.add(new DMenuItem("Items",DConstants.ITEMS));
            menu.add(new DMenuItem("D20 Dice",DConstants.D20DICE));
        }
    }

    public static void initFeats(){
        if(feats==null){
            feats = DFeat.getD20Feats();
        }
    }

    public static List<DAbility> getAbilities(){
        if(abilities==null){
            initAbilities();
        }
        return abilities;
    }

}
