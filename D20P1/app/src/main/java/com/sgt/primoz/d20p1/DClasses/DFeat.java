package com.sgt.primoz.d20p1.DClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Primoz on 21.9.2014.
 */
public class DFeat {
    UUID id;
    String name;
    String description;
    String prerequisite;
    String benefit;
    String normal;
    String special;

    DFeat(){
        this.id = UUID.randomUUID();
        this.name = "";
        this.description = "";
        this.prerequisite = "";
        this.benefit = "";
        this.normal = "";
        this.special = "";
    }

    DFeat(String name, String description, String prerequisite, String benefit, String normal, String special){
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.prerequisite = prerequisite;
        this.benefit = benefit;
        this.normal = normal;
        this.special = special;
    }


    public void resetAll(){
        this.id = null;
        this.name = "";
        this.description = "";
        this.prerequisite = "";
        this.benefit = "";
        this.normal = "";
        this.special = "";
    }

    public static DFeat findByName(String name, List<DFeat> feats){
        if(feats==null && DContainer.feats != null){
            feats = DContainer.feats;
        }
        else{
            feats = new ArrayList<DFeat>(0);
        }

        DFeat feat = null;
        for(int i=0;i<feats.size();i++){
            DFeat current = DContainer.feats.get(i);
            if(current.name.equals(name)){
                feat = current;
                break;
            }
        }
        return feat;
    }

    public static List<DFeat> getD20Feats(){
        List<DFeat> feats = new ArrayList<DFeat>();
        DFeat tmp;

        tmp = new DFeat();
        tmp.name = "Acrobatics";
        tmp.description = "Either through rigorous training or natural ability, you are very agile.";
        tmp.benefit = "You get a +2 bonus on all Acrobatics and Jump checks.";
        tmp.special = "Remember that the Acrobatics skill can’t be used untrained.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Advanced Combat Martial Arts";
        tmp.description = "You are a master of unarmed combat due to your advanced training.";
        tmp.prerequisite = "Base attack bonus 8, Combat Martial Arts, Improved Combat Martial Arts";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Advanced Firearms Proficiency";
        tmp.description = "You can use firearms set on autofire";
        tmp.prerequisite = "Personal Firearms Proficiency.";
        tmp.benefit = "The character can fire any personal firearm on autofire without penalty (provided, of course, that it has an autofire setting).";
        tmp.normal = "Characters without this feat take a –4 penalty on attack rolls made with personal firearms set on autofire.";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Advanced Two-Weapon Fighting";
        tmp.description = "";
        tmp.prerequisite = "Dexterity 13, Two-Weapon Fighting, Improved Two-Weapon Fighting, base attack bonus +11.";
        tmp.benefit = "The character gets a third attack with his or her offhand weapon, albeit at a –10 penalty. This feat also allows the character to use a melee weapon in one hand and a ranged weapon in the other.";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Agile Riposte";
        tmp.description = "";
        tmp.prerequisite = "Dexterity 13, Dodge.";
        tmp.benefit = "Once per round, if the opponent the character has designated as his or her dodge target (see the Dodge feat) makes a melee attack or melee touch attack against the character and misses, the character may make an attack of opportunity against that opponent. Resolve and apply the effects from both attacks simultaneously.\n" +
                "Even a character with the Combat Reflexes feat can’t use the Agile Riposte feat more than once per round. This feat does not grant more attacks of opportunity than the character is normally allowed in a round.";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Aircraft Operation";
        tmp.description = "Select a class of aircraft (heavy aircraft, helicopters, jet fighters, or spacecraft). The character is proficient at operating that class of aircraft.\n" +
                "The heavy aircraft class includes jumbo passenger airplanes, large cargo planes, heavy bombers, and any other aircraft with three or more engines. Helicopters include transport and combat helicopters of all types. Jet fighters include military fighter and ground attack jets. Spacecraft are vehicles such as the space shuttle and the lunar lander.";
        tmp.prerequisite = "Pilot 4 ranks.";
        tmp.benefit = "The character takes no penalty on Pilot checks or attack rolls made when operating an aircraft of the selected class.";
        tmp.normal = "Characters without this feat take a –4 penalty on Pilot checks made to operate an aircraft that falls in any of these classes, and on attacks made with aircraft weapons. There is no penalty when the character operates a general-purpose aircraft.";
        tmp.special = "The character can gain this feat multiple times. Each time the character takes the feat, the character selects a different class of aircraft.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Alertness";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "The character gets a +2 bonus on all Listen checks and Spot checks.";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Animal Affinity";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "The character gets a +2 bonus on all Handle Animal checks and Ride checks.";
        tmp.normal = "";
        tmp.special = "Remember that the Handle Animal skill can’t be used untrained.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Archaic Weapons Proficiency";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "The character takes no penalty on attack rolls when using any kind of archaic weapon.";
        tmp.normal = "A character without this feat takes the –4 nonproficient penalty when making attacks with archaic weapons.";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Armor Proficiency (heavy)";
        tmp.description = "";
        tmp.prerequisite = "Armor Proficiency (light), Armor Proficiency (medium).";
        tmp.benefit = "See Armor Proficiency (light).";
        tmp.normal = "See Armor Proficiency (light).";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Armor Proficiency (light)";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "When a character wears a type of armor with which he or she is proficient, the character gets to add the armor’s equipment bonus to his or her Defense. Also, the armor check penalty applies only to Balance, Climb, Escape Artist, Hide, Jump, Move Silently, and Tumble checks.";
        tmp.normal = "A character who wears armor with which he or she is not proficient adds only the armor’s nonproficient equipment bonus to his or her Defense. Also, he or she suffers its armor check penalty on attack rolls and on all skill checks that involve moving.";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Armor Proficiency (medium)";
        tmp.description = "";
        tmp.prerequisite = "Armor Proficiency (light).";
        tmp.benefit = "Armor Proficiency (light).";
        tmp.normal = "Armor Proficiency (light).";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Athletic";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "The character gets a +2 bonus on all Climb checks and Swim checks.";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Attentive";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "The character gets a +2 bonus on all Investigate checks and Sense Motive checks.";
        tmp.normal = "";
        tmp.special = "Remember that the Investigate skill can’t be used untrained.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Blind-Fight";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "In melee combat, every time the character misses because of concealment, the character can reroll the miss chance roll one time to see if the character actually hits.\n" +
                "The character takes only half the usual penalty to speed for being unable to see. Darkness and poor visibility in general reduces the character’s speed to three-quarters of normal, instead of one-half.";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Brawl";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "When making an unarmed attack, the character receives a +1 competence bonus on attack rolls, and the character deals nonlethal damage equal to 1d6 + his or her Strength modifier.";
        tmp.normal = "Unarmed attacks normally deal nonlethal damage equal to 1d3 + Strength modifier.";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "";
        tmp.description = "";
        tmp.prerequisite = "";
        tmp.benefit = "";
        tmp.normal = "";
        tmp.special = "";
        feats.add(tmp);





        tmp = new DFeat();
        tmp.name = "Combat Martial Arts";
        tmp.description = "You are skilled at attacking and dealing unarmed damage.";
        tmp.prerequisite = "Base attack bonus 1";
        tmp.benefit = "With an unarmed strike, you deal lethal or nonlethal damage (your choice) equal to 1d4 + your Strength modifier. Your unarmed attacks count as armed, which means that opponents do not get attacks of opportunity when you attack them unarmed. You may make attacks of opportunity against opponents who provoke such attacks.";
        tmp.normal = "Without this feat, you deal only 1d3 points of non-lethal damage. Unarmed attacks normally provoke attacks of opportunity, and unarmed combatants can’t normally make attacks of opportunity.";
        feats.add(tmp);





        return feats;
    }
}
