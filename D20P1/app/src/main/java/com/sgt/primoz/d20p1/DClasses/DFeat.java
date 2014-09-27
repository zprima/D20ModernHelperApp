package com.sgt.primoz.d20p1.DClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Primoz on 21.9.2014.
 */
public class DFeat {
    public UUID id;
    public String name;
    public String description;
    public String prerequisite;
    public String benefit;
    public String normal;
    public String special;

    DFeat(){
        this.id = UUID.randomUUID();
        this.name = "/";
        this.description = "/";
        this.prerequisite = "/";
        this.benefit = "/";
        this.normal = "/";
        this.special = "/";
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
        this.name = "/";
        this.description = "/";
        this.prerequisite = "/";
        this.benefit = "/";
        this.normal = "/";
        this.special = "/";
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
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Advanced Two-Weapon Fighting";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Two-Weapon Fighting, Improved Two-Weapon Fighting, base attack bonus +11.";
        tmp.benefit = "The character gets a third attack with his or her offhand weapon, albeit at a –10 penalty. This feat also allows the character to use a melee weapon in one hand and a ranged weapon in the other.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Agile Riposte";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Dodge.";
        tmp.benefit = "Once per round, if the opponent the character has designated as his or her dodge target (see the Dodge feat) makes a melee attack or melee touch attack against the character and misses, the character may make an attack of opportunity against that opponent. Resolve and apply the effects from both attacks simultaneously.\n" +
                "Even a character with the Combat Reflexes feat can’t use the Agile Riposte feat more than once per round. This feat does not grant more attacks of opportunity than the character is normally allowed in a round.";
        tmp.normal = "/";
        tmp.special = "/";
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
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Listen checks and Spot checks.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Animal Affinity";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Handle Animal checks and Ride checks.";
        tmp.normal = "/";
        tmp.special = "Remember that the Handle Animal skill can’t be used untrained.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Archaic Weapons Proficiency";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character takes no penalty on attack rolls when using any kind of archaic weapon.";
        tmp.normal = "A character without this feat takes the –4 nonproficient penalty when making attacks with archaic weapons.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Armor Proficiency (heavy)";
        tmp.description = "/";
        tmp.prerequisite = "Armor Proficiency (light), Armor Proficiency (medium).";
        tmp.benefit = "See Armor Proficiency (light).";
        tmp.normal = "See Armor Proficiency (light).";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Armor Proficiency (light)";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "When a character wears a type of armor with which he or she is proficient, the character gets to add the armor’s equipment bonus to his or her Defense. Also, the armor check penalty applies only to Balance, Climb, Escape Artist, Hide, Jump, Move Silently, and Tumble checks.";
        tmp.normal = "A character who wears armor with which he or she is not proficient adds only the armor’s nonproficient equipment bonus to his or her Defense. Also, he or she suffers its armor check penalty on attack rolls and on all skill checks that involve moving.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Armor Proficiency (medium)";
        tmp.description = "/";
        tmp.prerequisite = "Armor Proficiency (light).";
        tmp.benefit = "Armor Proficiency (light).";
        tmp.normal = "Armor Proficiency (light).";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Athletic";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Climb checks and Swim checks.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Attentive";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Investigate checks and Sense Motive checks.";
        tmp.normal = "/";
        tmp.special = "Remember that the Investigate skill can’t be used untrained.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Blind-Fight";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "In melee combat, every time the character misses because of concealment, the character can reroll the miss chance roll one time to see if the character actually hits.\n" +
                "The character takes only half the usual penalty to speed for being unable to see. Darkness and poor visibility in general reduces the character’s speed to three-quarters of normal, instead of one-half.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Brawl";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "When making an unarmed attack, the character receives a +1 competence bonus on attack rolls, and the character deals nonlethal damage equal to 1d6 + his or her Strength modifier.";
        tmp.normal = "Unarmed attacks normally deal nonlethal damage equal to 1d3 + Strength modifier.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Builder";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "Pick two of the following skills: Craft (chemical), Craft (electronic), Craft (mechanical), and Craft (structural). The character gets a +2 bonus on all checks with those skills.";
        tmp.normal = "/";
        tmp.special = "The character can select this feat twice. The second time, the character applies it to the two skills he or she didn’t pick originally. Remember that Craft (chemical), Craft (electronic), and Craft (mechanical) cannot be used untrained.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Burst Fire";
        tmp.description = "/";
        tmp.prerequisite = "Wisdom 13, Personal Firearms Proficiency, Advanced Firearms Proficiency.";
        tmp.benefit = "When using an automatic firearm with at least five bullets loaded, the character may fire a short burst as a single attack against a single target. The character receives a –4 penalty on the attack roll, but deal +2 dice of damage.\n" +
                "Firing a burst expends five bullets and can only be done if the weapon has five bullets in it.\n";
        tmp.normal = "Autofire uses ten bullets, targets a 10-foot-by-10-foot area, and can’t be aimed at a specific target. Without this feat, if a character attempts an autofire attack at a specific target, it simply counts as a normal attack and all the extra bullets are wasted.";
        tmp.special = "If the firearm has a three-round burst setting, firing a burst expends three bullets instead of five and can be used if the weapon has only three bullets in it.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Cautious";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Demolitions checks and Disable Device checks.";
        tmp.normal = "/";
        tmp.special = "Remember that the Demolitions skill and the Disable Device skill can’t be used untrained.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Cleave";
        tmp.description = "/";
        tmp.prerequisite = "Strength 13, Power Attack.";
        tmp.benefit = "If the character deals an opponent enough damage to make the opponent drop (either by knocking the opponent out due to massive damage or by reducing the opponent’s hit points to less than 0), the character gets an immediate extra melee attack against another opponent adjacent to the character. The character can’t take a 5-foot step before making this extra attack. The extra attack is with the same weapon and at the same bonus as the attack that dropped the previous opponent. The character can use this ability once per round.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Combat Expertise";
        tmp.description = "/";
        tmp.prerequisite = "Intelligence 13.";
        tmp.benefit = "When the character uses the attack action or the full attack action in melee, the character can take a penalty of up to –5 on his or her attack roll and add the same number (up to +5) to the character’s Defense. This number may not exceed the character’s base attack bonus. The changes to attack rolls and Defense last until the character’s next action. The bonus to the character’s Defense is a dodge bonus (and as such it stacks with other dodge bonuses the character may have).";
        tmp.normal = "A character without the Combat Expertise feat can fight defensively while using the attack or full attack action to take a –4 penalty on attacks and gain a +2 dodge bonus to Defense.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Combat Martial Arts";
        tmp.description = "You are skilled at attacking and dealing unarmed damage.";
        tmp.prerequisite = "Base attack bonus 1";
        tmp.benefit = "With an unarmed strike, you deal lethal or nonlethal damage (your choice) equal to 1d4 + your Strength modifier. Your unarmed attacks count as armed, which means that opponents do not get attacks of opportunity when you attack them unarmed. You may make attacks of opportunity against opponents who provoke such attacks.";
        tmp.normal = "Without this feat, you deal only 1d3 points of non-lethal damage. Unarmed attacks normally provoke attacks of opportunity, and unarmed combatants can’t normally make attacks of opportunity.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Combat Reflexes";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The maximum number of attacks of opportunity the character may make each round is equal to the character’s Dexterity modifier + 1.  The character can still only make one attack of opportunity on a single opponent.\n" +
                "With this feat, the character may also make attacks of opportunity when flat-footed.\n";
        tmp.normal = "A character without the Combat Reflexes feat can make only one attack of opportunity per round and can’t make attacks of opportunity when flat-footed.";
        tmp.special = "The Combat Reflexes feat doesn’t allow a Fast hero with the opportunist talent to use that talent more than once per round.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Combat Throw";
        tmp.description = "/";
        tmp.prerequisite = "Defensive Martial Arts.";
        tmp.benefit = "The character gains a +2 bonus on opposed Strength and Dexterity checks any time the character attempts trip or grapple attacks, or when the character trys to avoid a trip or grapple attack made against him or her.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Confident";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Gamble checks and Intimidate checks, and on level checks to resist intimidation.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Creative";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "Pick two of the following skills: Craft (visual art), Craft (writing), Perform (act), Perform (dance), Perform (keyboards), Perform (percussion instruments), Perform (sing), Perform (stand-up), Perform (string instruments), and Perform (wind instruments). The character gets a +2 bonus on all checks with those two skills.";
        tmp.normal = "/";
        tmp.special = "A character can select this feat as many as five times. Each time, the character selects two new skills from the choices given above.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Dead Aim";
        tmp.description = "/";
        tmp.prerequisite = "Wisdom 13, Far Shot.";
        tmp.benefit = "Before making a ranged attack, the character may take a full-round action to line up your shot. This grants the character a +2 circumstance bonus on his or her next attack roll. Once the character begins aiming, he or she can’t move, even to take a 5-foot step, until after the character makes his or her next attack, or the benefit of the feat is lost. Likewise, if the character’s concentration is disrupted or the character is attacked before his or her next action, the character loses the benefit of aiming.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Deceptive";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Bluff checks and Disguise checks.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Defensive Martial Arts";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gains a +1 dodge bonus to Defense against melee attacks.";
        tmp.normal = "/";
        tmp.special = "A condition that makes the character lose his or her Dexterity bonus to Defense also makes the character lose dodge bonuses. Also, dodge bonuses stack, unlike most other types of bonuses.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Dodge";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13.";
        tmp.benefit = "During the character’s action, the character designates an opponent and receives a +1 dodge bonus to Defense against any subsequent attacks from that opponent. The character can select a new opponent on any action.";
        tmp.normal = "/";
        tmp.special = "A condition that makes the character lose his or her Dexterity bonus to Defense also makes the character lose dodge bonuses. Also, dodge bonuses stack with each other, unlike most other types of bonuses.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Double Tap";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Point Blank Shot.";
        tmp.benefit = "When using a semiautomatic firearm with at least two bullets loaded, the character may fire two bullets as a single attack against a single target. The character receives a –2 penalty on this attack, but deals +1 die of damage with a successful hit. Using this feat fires two bullets and can only be done if the weapon has two bullets in it.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Drive-By Attack";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character takes no vehicle speed penalty when making an attack while in a moving vehicle. Also, if the character is the driver, he or she can take his or her attack action to make an attack at any point along the vehicle’s movement.";
        tmp.normal = "When attacking from a moving vehicle, a character takes a penalty based on the vehicle’s speed. Passengers can ready an action to make an attack when their vehicle reaches a particular location, but the driver must make his or her attack action either before or after the vehicle’s movement.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Educated";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "Pick two Knowledge skills. The character gets a +2 bonus on all checks with those skills.";
        tmp.normal = "/";
        tmp.special = "A character can select this feat as many as seven times. Each time, the character selects two new Knowledge skills. ";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Elusive Target";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Defensive Martial Arts.";
        tmp.benefit = "When fighting an opponent or multiple opponents in melee, other opponents attempting to target the character with ranged attacks take a –4 penalty. This penalty is in addition to the normal –4 penalty for firing into melee, making the penalty to target to character –8.";
        tmp.normal = "/";
        tmp.special = "An opponent with the Precise Shot feat has the penalty lessened to –4 when targeting the character.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Endurance";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gains a +4 bonus on the following checks and saves: hourly Swim checks to avoid becoming fatigued, Constitution checks to continue running, Constitution checks to hold the character’s breath, Constitution checks to avoid damage from starvation or thirst, Fortitude saves to avoid damage from hot or cold environments, and Fortitude saves to resist suffocation or drowning.\n" +
                "Also, the character may sleep in medium or light armor without becoming fatigued.\n";
        tmp.normal = "A character without this feat who sleeps in armor is automatically fatigued the following day.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Exotic Firearms Proficiency";
        tmp.description = "Choose a weapon type from the following list: cannons, heavy machine guns, grenade launchers, and rocket launchers. ";
        tmp.prerequisite = "Personal Firearms Proficiency, Advanced Firearms Proficiency.";
        tmp.benefit = "The character makes attack rolls with the weapon normally.";
        tmp.normal = "A character who uses a weapon without being proficient with it takes a –4 penalty on attack rolls.";
        tmp.special = "A character can gain this feat as many as four times. Each time a character takes the feat, he or she selects a different weapon group.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Exotic Melee Weapon Proficiency";
        tmp.description = "Choose one exotic melee weapon from. The character is proficient with that melee weapon in combat.";
        tmp.prerequisite = "Base attack bonus +1.";
        tmp.benefit = "The character makes attack rolls with the weapon normally.";
        tmp.normal = "A character who uses a weapon without being proficient with it takes a –4 penalty on attack rolls. ";
        tmp.special = "A character can gain this feat multiple times. Each time the character takes the feat, he or she selects a different exotic melee weapon.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Far Shot";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "When the character uses a firearm or archaic ranged weapon, its range increment increases by one-half (multiply by 1.5). When the character throws a weapon, its range increment is doubled.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Focused";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets get a +2 bonus on all Balance checks and Concentration checks.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Force Stop";
        tmp.description = "/";
        tmp.prerequisite = "Drive 4 ranks, Vehicle Expert.";
        tmp.benefit = "When the character at¬tempts a sideswipe stunt with a surface vehicle, the character can force the other vehicle to a stop by nudging it into a controlled side¬ways skid. In addition to the nor¬mal requirements for attempting a sideswipe stunt, the character must have sufficient movement re¬maining to move a number of squares equal to the character’s turn number.\n" +
                "After succeeding on the check to attempt the sideswipe, the character makes a Drive check opposed by the other driver. If the character succeeds, turn the other vehicle 90 degrees across the front of the character’s, so that they form a tee. Move them forward a distance equal to the character’s turn number. The vehicles end their movement at that location, at stationary speed, and take their normal sideswipe damage.\n" +
                "If the character fails the check, resolve the sideswipe normally.\n";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Frightful Presence";
        tmp.description = "/";
        tmp.prerequisite = "Charisma 15, Intimidate 9 ranks.";
        tmp.benefit = "When the character uses this feat, all opponents within 10 feet who have fewer levels than the character must make a Will saving throw (DC 10 + ½ the character’s level + the character’s Charisma modifier). An opponent who fails his or her save is shaken, taking a –2 penalty on attack rolls, saves, and skill checks for a number of rounds equal to 1d6 + the character’s Charisma modifier. The character can use the feat once per round as a free action.\n" +
                "A successful save indicates that the opponent is immune to the character’s use of this feat for 24 hours. This feat does not affect creatures with an Intelligence of 3 or lower.\n" +
                "If the character has the Renown feat, the Will saving throw’s DC increases by 5.\n";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Gearhead";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Computer Use checks and Repair checks. ";
        tmp.normal = "/";
        tmp.special = "Remember that the Computer Use skill and the Repair skill can only be used untrained in certain situations.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Great Cleave";
        tmp.description = "/";
        tmp.prerequisite = "Strength 13, Power Attack, Cleave, base attack bonus +4.";
        tmp.benefit = "As Cleave, except that the character has no limit to the number of times he or she can use it per round.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Great Fortitude";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Fortitude sav¬ing throws.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Guide";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Navigate checks and Survival checks. ";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Heroic Surge";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character may take an extra move action or attack action in a round, either before or after the character’s regular actions. The character may use Heroic Surge a number of times per day depending on his or her character level (as shown below), but never more than once per round.\n" +
                "Character Level\tTimes per Day\n" +
                "1st–4th\t1\n" +
                "5th–8th\t2\n" +
                "9th–12th\t3\n" +
                "13th–16th\t4\n" +
                "17th–20th\t5\n";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Brawl";
        tmp.description = "/";
        tmp.prerequisite = "Brawl, base attack bonus +3.";
        tmp.benefit = "When making an unarmed attack, the character receives a +2 competence bonus on his or her attack roll, and the character deals nonlethal damage equal to 1d8 + the character’s Strength modifier.";
        tmp.normal = "Unarmed attacks normally deal nonlethal damage equal to 1d3 + Strength modifier.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Bull Rush";
        tmp.description = "/";
        tmp.prerequisite = "Strength 13, Power Attack.";
        tmp.benefit = "When the character performs a bull rush, the character does not provoke an attack of opportunity from the defender.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Combat Martial Arts";
        tmp.description = "/";
        tmp.prerequisite = "Combat Martial Arts, base attack bonus +4.";
        tmp.benefit = "The character’s threat range on an unarmed strike im¬proves to 19–20.";
        tmp.normal = "A character without this feat threatens a critical hit with an unarmed strike only on a 20.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Combat Throw";
        tmp.description = "/";
        tmp.prerequisite = "Defensive Martial Arts, Combat Throw, base attack bonus +3.";
        tmp.benefit = "In melee combat, if an opponent attacks and misses the character, the character may immediately make a trip attack against the opponent. This counts as an attack of opportunity, which the character can make even if he or she is unarmed. Attacking unarmed in this way does not provoke an attack of opportunity.";
        tmp.normal = "/";
        tmp.special = "This feat doesn’t grant the character more attacks of opportunity than he or she is normally allowed in a round.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Damage Threshold";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character increases his or her massive damage threshold by 3 points.";
        tmp.normal = "A character without this feat has a massive damage threshold equal to his or her current Constitution score. With this feat, the character’s massive damage threshold is current Con +3.";
        tmp.special = "A character may gain this feat multiple times. Its effects stack.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Disarm";
        tmp.description = "/";
        tmp.prerequisite = "Intelligence 13, Combat Expertise.";
        tmp.benefit = "The character does not provoke an attack of opportunity when the character attempts to disarm an opponent, nor does the opponent get a chance to disarm the character.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Feint";
        tmp.description = "/";
        tmp.prerequisite = "Intelligence 13, Brawl, Streetfighting.";
        tmp.benefit = "The character can make a Bluff check in combat as a move action. The character receives a +2 bonus on Bluff checks made to feint in melee combat";
        tmp.normal = "Feinting in combat requires an attack action.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Initiative";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +4 circumstance bonus on initiative checks.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Knockout Punch";
        tmp.description = "/";
        tmp.prerequisite = "Brawl, Knockout Punch, base attack bonus +6.";
        tmp.benefit = "When making the character’s first unarmed attack against a flat-footed opponent, treat a successful attack as a critical hit. This critical hit deals triple damage. The damage is nonlethal damage.";
        tmp.normal = "/";
        tmp.special = "Even if the character has the ability to treat unarmed damage as lethal damage, the damage from a knockout punch is always nonlethal.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Trip";
        tmp.description = "/";
        tmp.prerequisite = "Intelligence 13, Combat Expertise.";
        tmp.benefit = "The character does not provoke an attack of opportunity when the character tries to trip an opponent while the character is unarmed.\n" +
                "If the character trips an opponent in melee combat, the character immediately gets to make a melee attack against that opponent as if the character had not used his or her attack action for the trip attempt.\n";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Improved Two-Weapon Fighting";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Two-Weapon Fighting, base attack bonus +6.";
        tmp.benefit = "The character gets a second attack with his or her offhand weapon, albeit at a –5 penalty.  Also, this feat allows the character to use a melee weapon in one hand and a ranged weapon in the other.";
        tmp.normal = "Without this feat, a character can only get a single extra attack with an off-hand weapon, and both weapons must be of the same type (either both ranged weapons or both melee weapons).";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Iron Will";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Will saving throws.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Knockout Punch";
        tmp.description = "/";
        tmp.prerequisite = "Brawl, base attack bonus +3.";
        tmp.benefit = "When making the character’s first unarmed attack against a flat-footed opponent, treat a successful attack as a critical hit. This damage is nonlethal damage.";
        tmp.normal = "/";
        tmp.special = "Even if the character has the ability to treat unarmed damage as lethal damage, the damage from a knockout punch is always nonlethal.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Lightning Reflexes";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Reflex saving throws.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Low Profile";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "Reduce the character’s Reputation bonus by 3 points.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Medical Expert";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Craft (pharmaceutical) checks and Treat Injury checks.";
        tmp.normal = "/";
        tmp.special = "Remember that the Craft (pharmaceutical) skill can’t be used untrained.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Meticulous";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Forgery checks and Search checks.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Mobility";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Dodge.";
        tmp.benefit = "The character gets a +4 dodge bonus to Defense against attacks of opportunity provoked when the character moves out of a threatened square.";
        tmp.normal = "/";
        tmp.special = "A condition that makes a character lose his or her Dexterity bonus to Defense also makes the character lose dodge bonuses. Also, dodge bonuses stack with each other, unlike most other types of bonuses.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Nimble";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Escape Artist checks and Sleight of Hand checks.";
        tmp.normal = "/";
        tmp.special = "Remember that the Sleight of Hand skill can’t be used untrained.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Personal Firearms Proficiency";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character can fire any personal firearm without penalty.";
        tmp.normal = "Characters without this feat take a –4 penalty on attack rolls made with personal firearms.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Point Blank Shot";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +1 bonus on attack and damage rolls with ranged weapons against opponents within 30 feet.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Power Attack";
        tmp.description = "/";
        tmp.prerequisite = "Strength 13.";
        tmp.benefit = "On the character’s action, before making attack rolls for a round, the character may choose to subtract a number from all melee attack rolls and add the same number to all melee damage rolls. This number may not exceed the character’s base attack bonus. The penalty on attacks and bonus on damage applies until the character’s next action.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Precise Shot";
        tmp.description = "/";
        tmp.prerequisite = "Point Blank Shot.";
        tmp.benefit = "The character can shoot or throw ranged weapons at an opponent engaged in melee without penalty.";
        tmp.normal = "A character takes a –4 penalty when using a ranged weapon to attack an opponent who is engaged in melee combat.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Quick Draw";
        tmp.description = "/";
        tmp.prerequisite = "Base attack bonus +1.";
        tmp.benefit = "The character can draw a weapon as a free action.\n" +
                "A character with this feat may throw weapons at his or her full normal rate of attacks.\n";
        tmp.normal = "A character can draw a weapon as a move action. If a character has a base attack bonus of +1 or higher, the character can draw a weapon as a free action when moving.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Quick Reload";
        tmp.description = "/";
        tmp.prerequisite = "Base attack bonus +1.";
        tmp.benefit = "Reloading a firearm with an already filled box magazine or speed loader is a free action. Reloading a revolver without a speed loader, or reloading any firearm with an internal magazine, is a move action.";
        tmp.normal = "Reloading a firearm with an already filled box magazine or speed loader is a move action. Reloading a revolver without a speed loader, or reloading any firearm with an internal magazine, is a full-round action.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Renown";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character’s Reputation bonus increases by +3.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Run";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "When running, the character moves a maximum of five times his or her normal speed instead of four times. If the character is in heavy armor, the character can move four times his or her speed rather than three times. If the character makes a long jump, the character gains a +2 competence bonus on his or her Jump check.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Shot on the Run";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Point Blank Shot, Dodge, Mobility.";
        tmp.benefit = "When using an attack action with a ranged weap¬on, the character can move both before and after the attack, provided that the character’s total distance moved is not greater than his or her speed.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Simple Weapons Proficiency";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character makes attack rolls with simple weapons normally.";
        tmp.normal = "A character without this feat takes the –4 nonproficient penalty when making attacks with simple weapons.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Skip Shot";
        tmp.description = "/";
        tmp.prerequisite = "Point Blank Shot, Precise Shot.";
        tmp.benefit = "If the character has a solid, relatively smooth surface on which to skip a bullet (such as a street or a concrete wall), and a target within 10 feet of that surface, the character may ignore cover between the character and the target. However, the character receives a –2 penalty on his or her attack roll, and the character’s attack deals –1 die of damage. ";
        tmp.normal = "/";
        tmp.special = "The surface doesn’t have to be perfectly smooth and level; a brick wall or an asphalt road can be used. The target can have no more than nine-tenths cover for A character to attempt a skip shot.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Spring Attack";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Dodge, Mobility, base attack bonus +4.";
        tmp.benefit = "When using an attack action with a melee weapon, the character can move both before and after the attack, provided that the total distance moved is not greater than the charater’s speed.\n" +
                "Moving in this way does not provoke an attack of opportunity from the defender the character is attacking (though it can provoke attacks of opportunity from others, as normal).\n" +
                "A character can’t use this feat if he or she is carrying a heavy load or wearing heavy armor.\n";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Stealthy";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Hide checks and Move Silently checks. ";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Strafe";
        tmp.description = "/";
        tmp.prerequisite = "Personal Firearms Proficiency, Advanced Firearms Proficiency.";
        tmp.benefit = "When using a firearm on autofire, the character can affect an area four 5-foot squares long and one square wide (that is, any four squares in a straight line).";
        tmp.normal = "A firearm on autofire normally affects a 10-foot-by-10-foot area.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Streetfighting";
        tmp.description = "/";
        tmp.prerequisite = "Brawl, base attack bonus +2.";
        tmp.benefit = "Once per round, if the character makes a successful melee attack with an unarmed strike or a light weapon, the character deals an extra 1d4 points of damage.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Studious";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Decipher Script checks and Research checks. ";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Sunder";
        tmp.description = "/";
        tmp.prerequisite = "Strength 13, Power Attack.";
        tmp.benefit = "When the character strikes an object held or carried by an opponent, such as a weapon, the character does not provoke an attack of opportunity.\n" +
                "The character gains a +4 bonus on any attack roll made to attack an object held or carried by another character. The character deals double normal damage to objects, whether they are held or carried or not.\n";
        tmp.normal = "A character without this feat incurs an attack of opportunity when he or she strikes at an object held or carried by another character.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Surface Vehicle Operation";
        tmp.description = "Select a class of surface vehicle (heavy wheeled, powerboat, sailboat, ship, or tracked). The character is proficient at operating that class of vehicle.\n" +
                "The heavy wheeled class includes all kinds of semi-trucks and tractor-trailers, as well as wheeled construction ve¬hicles (such as earth movers) and wheeled armored vehicles (such as some armored personnel carriers). Powerboats are engine-powered water vessels designed for operation by a single person and usually no more than 100 feet in length. Sailboats are wind-powered water vessels. Ships are large, multicrewed water vessels. Tracked vehicles include bulldozers and tanks and other military vehicles.\n";
        tmp.prerequisite = "Drive 4 ranks.";
        tmp.benefit = "The character takes no penalty on Drive checks or attack rolls made when operating a surface vehicle of the selected class.";
        tmp.normal = "Characters without this feat take a –4 penalty on Drive checks made to operate a surface vehicle that falls under any of these classes, and to attacks made with vehicle weapons. There is no penalty when you operate a general-purpose surface vehicle.";
        tmp.special = "A character can gain this feat as many as five times. Each time the character takes the feat, he or she selects a different class of surface vehicle.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Surgery";
        tmp.description = "/";
        tmp.prerequisite = "Treat Injury 4 ranks.";
        tmp.benefit = "The character can use the Treat Injury skill to perform surgery without penalty.  See the Treat Injury skill description.";
        tmp.normal = "Characters without this feat take a –4 penalty on Treat Injury checks made to perform surgery.";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Toughness";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gains +3 hit points.";
        tmp.normal = "/";
        tmp.special = "A character may gain this feat multiple times. Its effects stack.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Track";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "To find tracks or follow them for one mile requires a Survival check. The character must make another Survival check every time the tracks become difficult to follow.\n" +
                "The character moves at half his or her normal speed (or at the character’s normal speed with a –5 penalty on the check, or at up to twice the character’s speed with a –20 penalty on the check). The DC depends on the surface and the prevailing conditions.\n" +
                "Surface\tTrack DC\n" +
                "Very soft\t5\n" +
                "Soft\t10\n" +
                "Firm\t15\n" +
                "Hard\t20\n" +
                "Very Soft: Any surface (fresh snow, thick dust, wet mud) that holds deep, clear impressions of footprints.\n" +
                "Soft: Any surface soft enough to yield to pressure, but firmer than wet mud or fresh snow, in which the quarry leaves frequent but shallow footprints.\n" +
                "Firm: Most normal outdoor or exceptionally soft or dirty indoor surfaces. The quarry might leave some traces of its passage, but only occasional or partial footprints can be found.\n" +
                "Hard: Any surface that doesn’t hold footprints at all, such as bare rock, concrete, metal deckings, or indoor floors. The quarry leaves only traces, such as scuff marks.\n" +
                "If the character fails a Survival check, he or she can retry after 1 hour (out¬doors) or 10 minutes (indoors) of searching.\n";
        tmp.normal = "A character without this feat can use the Survival skill to find tracks, but can only follow tracks if the DC is 10 or less. A character can use the Search skill to find individual footprints, but cannot follow tracks using Search.\n" +
                "Condition\tDC Modifier\n" +
                "Every three targets in the group being tracked\t–1\n" +
                "Size of targets being tracked: 1\t\n" +
                "Fine\t+8\n" +
                "Diminutive\t+4\n" +
                "Tiny\t+2\n" +
                "Small\t+1\n" +
                "Medium-size\t+0\n" +
                "Large\t–1\n" +
                "Huge\t–2\n" +
                "Gargantuan\t–4\n" +
                "Colossal\t-8\n" +
                "Every 24 hours since the trail was made\t+1\n" +
                "Every hour of rain since the trail was made\t+1\n" +
                "Fresh snow cover since the trail was made\t+10\n" +
                "Poor visibility: 2\t\n" +
                "Overcast or moonless night\t+6\n" +
                "Moonlight\t+3\n" +
                "Fog or precipitation\t+3\n" +
                "Tracked target hides trail (and moves at half speed)\t+5\n" +
                "1 For a group of mixed sizes, apply only the modifier for the largest size category represented.\n";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Trustworthy";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Diplomacy checks and Gather Information checks. ";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Two-Weapon Fighting";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13";
        tmp.benefit = "The character’s penalties for fighting with two weapons are lessened by 2 for the primary hand and 6 for the off hand.\n" +
                "The weapons used must both be melee weapons or both be ranged weapons (the character can’t mix the types).\n";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Unbalance Opponent";
        tmp.description = "/";
        tmp.prerequisite = "Defensive Martial Arts, base attack bonus +6.";
        tmp.benefit = "During the character’s action, the character designates an opponent no more than one size category larger or smaller than the character. That opponent doesn’t get to add his or her Strength modifier to attack rolls when targeting the character. (If the opponent has a Strength penalty, he or hse still takes that penalty.)\n" +
                "The opponent’s Strength modifier applies to damage, as usual.\n" +
                "The character can select a new opponent on any action.\n";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Vehicle Dodge";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Drive 6 ranks or Pilot 6 ranks, Vehicle Expert.";
        tmp.benefit = "When driving a vehicle, during the character’s action the character designates an opposing vehicle or a single opponent. The character’s vehicle and everyone aboard it receive a +1 dodge bonus to Defense against attacks from that vehicle or opponent. The character can select a new vehicle or opponent on any action.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Vehicle Expert";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character gets a +2 bonus on all Drive checks and Pilot checks.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Weapon Finesse";
        tmp.description = "Choose one light melee weapon, a rapier (if the character can use it with one hand), or a chain.  A character can choose unarmed strike or grapple as a weapon for the purposes of this feat.";
        tmp.prerequisite = "Proficient with weapon, base attack bonus +1.";
        tmp.benefit = "With the selected melee weapon, the character may use his or her Dexterity modifier instead of his or her Strength modifier on attack rolls.";
        tmp.normal = "/";
        tmp.special = "A character can gain this feat multiple times. Each time the character takes the feat, the character selects a ¬different weapon";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Weapon Focus";
        tmp.description = "Choose a specific weapon. A character can choose unarmed strike or grapple for your weapon for purposes of this feat.";
        tmp.prerequisite = "Proficient with weapon, base attack bonus +1.";
        tmp.benefit = "The character gains a +1 bonus on all attack rolls he or she makes using the selected weapon.";
        tmp.normal = "/";
        tmp.special = "A character can gain this feat multiple times. Each time the character takes the feat, the character must select a different weapon.";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Whirlwind Attack";
        tmp.description = "/";
        tmp.prerequisite = "Dexterity 13, Intelligence 13, Dodge, Mobility, Spring Attack, Combat Expertise, base attack bonus +4.";
        tmp.benefit = "When the character performs a full-round action, the character can give up his or her regular attacks and instead make one melee attack at the character’s highest base attack bonus against each adjacent opponent.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Wild Talent ";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "Select one 0-level psionic power. The character can manifest this power up to three times in a 24-hour period. There is no power point cost for using this power. For effects that depends on manifester level the character is considered 1st level or his or her manifester level, whichever is higher.";
        tmp.normal = "/";
        tmp.special = "/";
        feats.add(tmp);

        tmp = new DFeat();
        tmp.name = "Windfall";
        tmp.description = "/";
        tmp.prerequisite = "/";
        tmp.benefit = "The character’s Wealth bonus increases by +3. Also, this feat provides a +1 bonus on all Profession checks.";
        tmp.normal = "/";
        tmp.special = "A character can select this feat multiple times. Each time, both of its effects stack.";
        feats.add(tmp);

        return feats;
    }
}
