package com.sgt.primoz.d20p1.DClasses;

import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Primoz on 21.9.2014.
 */
public class DMenuItem {
    public String name;
    public Character keyword;

    public DMenuItem(String n, Character k){
        this.name = n;
        this.keyword = k;
    }

    public static List<DMenuItem> getMenu(){
        List<DMenuItem> menu = new ArrayList<DMenuItem>();
        menu.add(new DMenuItem("Abilities",DConstants.ABILITIES));
        menu.add(new DMenuItem("Feats",DConstants.FEATS));
        menu.add(new DMenuItem("Skills",DConstants.SKILLS));
        menu.add(new DMenuItem("Classes",DConstants.CLASSES));
        menu.add(new DMenuItem("Weapons",DConstants.WEAPONS));
        menu.add(new DMenuItem("Armor", DConstants.ARMOR));
        menu.add(new DMenuItem("Items",DConstants.ITEMS));
        menu.add(new DMenuItem("D20 Dice",DConstants.D20DICE));
        menu.add(new DMenuItem("Ref pdfs",DConstants.REFPDF));
        return menu;
    }
}
