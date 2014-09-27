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
    public static List<DClass> classes = null;

    public static void initAll(){
        initMenu();
        initAbilities();
        initFeats();
        initClasses();
    }

    public static void initAbilities(){
        if(abilities==null){
            abilities = DAbility.getD20Abilities();
        }
    }

    public static void initMenu(){
        if(menu==null){
            menu = DMenuItem.getMenu();
        }
    }

    public static void initFeats(){
        if(feats==null){
            feats = DFeat.getD20Feats();
        }
    }

    public static void initClasses(){
        if(classes==null){
            classes = DClass.getD20Classes();
        }
    }

    public static List<DAbility> getAbilities(){
        if(abilities==null){
            initAbilities();
        }
        return abilities;
    }

    public static List<DFeat> getFeats(){
        if(feats==null){
            initFeats();
        }
        return feats;
    }

    public static List<DClass> getClasses(){
        if(classes==null){
            initClasses();
        }
        return classes;
    }
}
