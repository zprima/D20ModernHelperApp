package com.sgt.primoz.d20p1.DClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Primoz on 21.9.2014.
 */
public class DAbility {
    public UUID id;
    public String name;
    public String description;

    DAbility(){
        this.id = UUID.randomUUID();
        this.name = "";
        this.description ="";
    }

    public static List<DAbility> getD20Abilities(){
        List<DAbility> list = new ArrayList<DAbility>();
        DAbility tmp;

        tmp = new DAbility();
        tmp.name = "Strength (STR)";
        tmp.description = "Your muscle and physical power.\n"+
        "\nAssociated with Strong heroes.\n\n"+
        "You apply it to:\n"+
        "- Melee attack rolls\n"+
        "- Damage rolls for melee and throw weapons. (Exception: Grenade damage isn't modified by STR)\n"+
        "- Climb, Jump, Swim check\n"+
        "- STR checks (for breaking down doors and pre-forming similar actions)";
        list.add(tmp);

        tmp = new DAbility();
        tmp.name = "Dexterity (DEX)";
        tmp.description = "Hand-eye coordination, agility, reflexes and balance. Important for who want to be good shots with range weapons (such as pistols) or vehicle control.\n"+
        "\nAssociated with Fast heroes.\n\n"+
        "You apply it to:\n"+
        "- Ranged attack rools, such as with firearms.\n"+
        "- Defense, provided the character can react to the attack.\n"+
        "- Reflex saving throws, for avoiding grenades and similar attacks.\n"+
        "- Move silently, Hide and Drive checks, and any other which DEX is the key ability";
        list.add(tmp);

        tmp = new DAbility();
        tmp.name = "Constitution (CON)";
        tmp.description = "Health and stamina. Also factors into massive damage rules.\n"+
        "\nAssociated with Tough heroes.\n\n"+
        "You apply it to:\n"+
        "- Each die roll for gaining additional hit points (Never below 1HP. Always gains min 1HP each level.\n"+
        "- Fortitude saving, for resisting poison and similar threats.\n"+
        "- Concentration check";
        list.add(tmp);

        tmp = new DAbility();
        tmp.name = "Inteligence (INT)";
        tmp.description = "Learning and reasoning. Important to anyone who wants to have wide range of skills.\n"+
        "\nAssociated with Smart heroes.\n\n"+
        "You apply it to:\n"+
        "- Number of skill points gained at each new lvl (Never ruduce below 1; you gain min 1 skill point per level).\n"+
        "- Search and Knowledge checks, and any other for which INT is key.";
        list.add(tmp);

        tmp = new DAbility();
        tmp.name = "Wisdom (WIS)";
        tmp.description = "Willpower, common sense, perception and intuition. Compared to INT, WIS relates to beeing aware of one's surroundings, while INT analyzes things. If you want keen senses, put high score in WIS.\n"+
        "\nAssociated with Dedicated heroes.\n\n"+
        "You apply it to:\n"+
        "- Saving throws, for using certain class talents or resisting other class talents.\n"+
        "- Listen, Spot and Treat Injury checks, and any other for which WIS is key.\n"+
        list.add(tmp);

        tmp = new DAbility();
        tmp.name = "Charisma (CHA)";
        tmp.description = "Your force of personality, persuasiveness, magnetism, ability to lead, physical attraction. Strength of personality, not only how other perceive you in a social setting.\n"+
        "\nAssociated with Charismatic heros.\n\n"+
        "You apply it to:\n"+
        "- Bluff, Diplomacy, Disguise check, any other for wich CHA is key.\n"+
        "- Checks represent attempts to influence others";
        list.add(tmp);

        return list;
    }
}
