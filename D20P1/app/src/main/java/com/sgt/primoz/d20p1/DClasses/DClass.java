package com.sgt.primoz.d20p1.DClasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Primoz on 21.9.2014.
 */
public class DClass {
    public String name;
    public String description;
    public String heroContent;
    public Boolean isBasic;

    /*public static List<DClass> getAdvanceClasses(List<DClass> classes){
        List<DClass> list = new ArrayList<DClass>();
        for(DClass c : classes){
            if(!c.isBasic) {
                list.add(c);
            }
        }
        return list;
    }*/

    /*public static List<DClass> getBasicClasses(List<DClass> classes){
        List<DClass> list = new ArrayList<DClass>();
        for(DClass c : classes){
            if(c.isBasic) {
                list.add(c);
            }
        }
        return list;
    }*/

    public static List<DClass> getD20Classes(){
        List<DClass> list = new ArrayList<DClass>();
        DClass tmp;

        tmp = new DClass();
        tmp.name = "THE STRONG HERO";
        tmp.description = "";
        tmp.heroContent = "Ability: Strength\n" +
                "Hit Die: 1d8\n" +
                "Action Points: Strong heroes gain a number of action points equal to 5 + one-half their character level, rounded down, at 1st level and every time they attain a new level in this class.\n" +
                "Class Skills: The Strong hero’s class skills (and the key ability for each skill) are:\n" +
                "Climb (Str), Craft (structural) (Int), Handle Animal (Cha), Jump (Str), Knowledge (current events, popular culture, streetwise, tactics) (Int), Profession (Wis), Read/Write Language (none), Repair (Int), Speak Language (none), and Swim (Str).\n" +
                "Also, the starting occupation selected can provide additional class skills to choose from.\n" +
                "\n" +
                "Skill Points at 1st Level: (3 + Int modifier)x4.\n" +
                "Skill Points at Each Additional Level: 3 + Int modifier.\n" +
                "Starting Feats\n" +
                "In addition to the two feats all characters get at 1st level, a Strong hero begins play with the Simple Weapons Proficiency feat.\n" +
                "\n" +
                "Table: The Strong Hero\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tClass Features\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+1\t+1\t+0\t+0\tTalent\t+1\t+0\n" +
                "2nd\t+2\t+2\t+0\t+0\tBonus feat\t+2\t+0\n" +
                "3rd\t+3\t+2\t+1\t+1\tTalent\t+2\t+0\n" +
                "4th\t+4\t+2\t+1\t+1\tBonus feat\t+3\t+0\n" +
                "5th\t+5\t+3\t+1\t+1\tTalent\t+3\t+1\n" +
                "6th\t+6/+1\t+3\t+2\t+2\tBonus feat\t+3\t+1\n" +
                "7th\t+7/+2\t+4\t+2\t+2\tTalent\t+4\t+1\n" +
                "8th\t+8/+3\t+4\t+2\t+2\tBonus feat\t+4\t+1\n" +
                "9th\t+9/+4\t+4\t+3\t+3\tTalent\t+5\t+2\n" +
                "10th\t+10/+5\t+5\t+3\t+3\tBonus feat\t+5\t+2\n" +
                "\n" +
                "Class Features\n" +
                "The following are class features of the Strong hero.\n" +
                "Talents\n" +
                "At 1st, 3rd, 5th, 7th, and 9th level, the Strong hero selects a talent from the following talent trees. Some trees have a set order that must be followed, while others provide a list to choose from. As long as the hero qualifies, he or she can select freely from any and all talent trees. No talent can be selected more than once unless expressly indicated.\n" +
                "\n" +
                "Extreme Effort Talent Tree\n" +
                "A Strong hero can push him or herself to make an extreme effort. The effort must relate either to a Strength check or a Strength-based skill check. You must decide to use this ability before making the check.\n" +
                "Extreme Effort: The effort requires a full-round action and provides a +2 bonus on the check.\n" +
                "Improved Extreme Effort: The effort requires a full-round action and provides a +2 bonus that stacks with the bonus provided by extreme effort (+4 total).\n" +
                "Prerequisite: Extreme effort.\n" +
                "Advanced Extreme Effort: The effort requires a full-round action and provides a +2 bonus that stacks with the bonuses provided by extreme effort and improved extreme effort (+6 total).\n" +
                "Prerequisites: Extreme effort, improved extreme effort.\n" +
                "\n" +
                "Ignore Hardness Talent Tree\n" +
                "The Strong hero has an innate talent for finding weaknesses in objects. This allows a Strong hero to ignore some of an object’s hardness when making a melee attack to break it.\n" +
                "Ignore Hardness: The Strong hero ignores 2 points of an object’s hardness.\n" +
                "Improved Ignore Hardness: The Strong hero ignores 2 additional points of an object’s hardness (for a total of 4).\n" +
                "Prerequisite: Ignore hardness.\n" +
                "Advanced Ignore Hardness: The Strong hero ignores 2 additional points of an object’s hardness (for a total of 6).\n" +
                "Prerequisites: Ignore hardness, improved ignore hardness.\n" +
                "\n" +
                "Melee Smash Talent Tree\n" +
                "The Strong hero has an innate talent that increases melee damage.\n" +
                "Melee Smash: The Strong hero receives a +1 bonus on melee damage.\n" +
                "Improved Melee Smash: The Strong hero receives an additional +1 bonus on melee damage (+2 total).\n" +
                "Prerequisite: Melee smash.\n" +
                "Advanced Melee Smash: The Strong hero receives an additional +1 bonus on melee damage (+3 total).\n" +
                "Prerequisites: Melee smash, improved melee smash.\n" +
                "\n" +
                "Bonus Feats\n" +
                "At 2nd, 4th, 6th, 8th, and 10th level, the Strong hero gains a bonus feat. This feat must be selected from the following list, and the Strong hero must meet any prerequisites.\n" +
                "Animal Affinity, Archaic Weapons Proficiency, Athletic, Blind-Fight, Brawl, Cleave, Combat Martial Arts, Combat Reflexes, Great Cleave, Improved Brawl, Improved Combat Martial Arts, Power Attack, Weapon Focus.\n";
        tmp.isBasic = true;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "THE FAST HERO";
        tmp.description = "";
        tmp.heroContent = "Ability: Dexterity\n" +
                "Hit Die: 1d8 \n" +
                "Action Points: Fast heroes gain a number of action points equal to 5 + one-half their character level, rounded down, at 1st level and every time they attain a new level in this class. \n" +
                "Class Skills: The Fast hero’s class skills (and the key ability for each skill) are: Balance (Dex), Craft (mechanical) (Int), Drive (Dex), Escape Artist (Dex), Hide (Dex), Knowledge (current events, popular culture, streetwise) (Int), Move Silently (Dex), Pilot (Dex), Profession (Wis), Read/Write Language (none), Ride (Dex), Sleight of Hand (Dex), Speak Language (none), and Tumble (Dex).\n" +
                "Also, the starting occupation the character selects can provide additional class skills to choose from.\n" +
                "Skill Points at 1st Level: (5 + Int modifier) x4.\n" +
                "Skill Points at Each Additional Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Fast Hero\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tClass Features\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+0\t+1\t+0\tTalent\t+3\t+0\n" +
                "2nd\t+1\t+0\t+2\t+0\tBonus feat\t+4\t+0\n" +
                "3rd\t+2\t+1\t+2\t+1\tTalent\t+4\t+1\n" +
                "4th\t+3\t+1\t+2\t+1\tBonus feat\t+5\t+1\n" +
                "5th\t+3\t+1\t+3\t+1\tTalent\t+5\t+1\n" +
                "6th\t+4\t+2\t+3\t+2\tBonus feat\t+6\t+2\n" +
                "7th\t+5\t+2\t+4\t+2\tTalent\t+6\t+2\n" +
                "8th\t+6/+1\t+2\t+4\t+2\tBonus feat\t+7\t+2\n" +
                "9th\t+6/+1\t+3\t+4\t+3\tTalent\t+7\t+3\n" +
                "10th\t+7/+2\t+3\t+5\t+3\tBonus feat\t+8\t+3\n" +
                "\n" +
                "Starting Feats\n" +
                "In addition to the two feats all characters get at 1st level, a Fast hero begins play with the Simple Weapons Proficiency feat.\n" +
                "Class Features\n" +
                "All of the following are class features of the Fast hero.\n" +
                "Talents\n" +
                "At 1st, 3rd, 5th, 7th, and 9th level, the Fast hero selects a talent from the following talent trees. Some trees have a set order that must be followed, while others provide a list to choose from. As long as the hero qualifies, he or she can select freely from any and all talent trees. No talent can be selected more than once unless expressly indicated.\n" +
                "Defensive Talent Tree\n" +
                "The Fast hero gains the ability to improve his or her innate defensive talents as the hero attains new levels.\n" +
                "Evasion: If the Fast hero is exposed to any effect that normally allows a character to attempt a Reflex saving throw for half damage, the Fast hero suffers no damage if he or she makes a successful saving throw. Evasion can only be used when wearing light armor or no armor.\n" +
                "Uncanny Dodge 1: The Fast hero retains his or her Dexterity bonus to Defense regardless of being caught flat-footed or struck by a hidden attacker. (The hero still loses his or her Dexterity bonus to Defense if the hero is immobilized.)\n" +
                "Prerequisite: Evasion.\n" +
                "Uncanny Dodge 2: The Fast hero can no longer be flanked; the hero can react to opponents on opposite sides of him or herself as easily as he or she can react to a single attacker.\n" +
                "Prerequisites: Evasion, uncanny dodge 1.\n" +
                "Defensive Roll: The Fast hero can roll with a potentially lethal attack to take less damage from it. When the Fast hero would be reduced to 0 hit points or less by damage in combat (from a ranged or melee attack), the Fast hero can attempt to roll with the damage.\n" +
                "A Fast hero spends 1 action point to use this talent. Once the point is spent, the hero makes a Reflex saving throw (DC = damage dealt). If the save succeeds, he or she takes only half damage. The Fast hero must be able to react to the attack to execute a defensive roll—if the hero is immobilized, he or she can’t use this talent.\n" +
                "Since this effect would not normally allow a character to make a Reflex save for half damage, the Fast hero’s evasion talent doesn’t apply to the defensive roll.\n" +
                "Prerequisites: Evasion, uncanny dodge 1.\n" +
                "Opportunist: The Fast hero can spend 1 action point to use this talent. Once the point is spent, the hero can make an attack of opportunity against an opponent who has just been struck for damage in melee by another character. This attack counts as the Fast hero’s attack of opportunity for that round. Even a Fast hero with the Combat Reflexes feat can’t use this talent more than once per round.\n" +
                "Prerequisite: Evasion.\n" +
                "Increased Speed Talent Tree\n" +
                "The Fast hero can increase his or her natural base speed.\n" +
                "Increased Speed: The Fast hero’s base speed increases by 5 feet.\n" +
                "Improved Increased Speed: The Fast hero’s base speed increases by 5 feet. This talent stacks with increased speed (10 feet total).\n" +
                "Prerequisite: Increased speed.\n" +
                "Advanced Increased Speed: The Fast hero’s base speed increases by 5 feet. This talent stacks with increased speed and improved increased speed (15 feet total).\n" +
                "Prerequisites: Increased speed, improved increased speed.\n" +
                "Bonus Feats\n" +
                "At 2nd, 4th, 6th, 8th, and 10th level, the Fast hero gains a bonus feat. This feat must be selected from the following list, and the Fast hero must meet any prerequisites.\n" +
                "Acrobatic, Combat Expertise, Combat Throw, Defensive Martial Arts, Double Tap, Elusive Target, Focused, Improved Disarm, Mobility, Personal Firearms Proficiency, Point Blank Shot, Stealthy, Weapon Finesse.\n";
        tmp.isBasic = true;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "THE TOUGH HERO";
        tmp.description = "";
        tmp.heroContent = "Ability: Constitution\n" +
                "Hit Die: 1d10\n" +
                "Action Points: Tough heroes gain a number of action points equal to 5 + one-half their character level, rounded down, at 1st level and every time they attain a new level in this class. \n" +
                "Class Skills\n" +
                "The Tough hero’s class skills (and the key ability for each skill) are: Climb (Str), Concentration (Con), Craft (mechanical, structural) (Int), Drive (Dex), Intimidate (Cha), Knowledge (current events, popular culture, streetwise) (Int), Profession (Wis), Read/Write Language (none), Ride (Dex), Speak Language (none), Spot (Wis), and Survival (Wis).\n" +
                "Also, the starting occupation the character selects can provide additional class skills to choose from.\n" +
                "Skill Points at 1st Level: (3 + Int modifier) x4.\n" +
                "Skill Points at Each Additional Level: 3 + Int modifier.\n" +
                "\n" +
                "Table: The Tough Hero\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tClass Features\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+1\t+0\t+0\tTalent\t+1\t+0\n" +
                "2nd\t+1\t+2\t+0\t+0\tBonus feat\t+2\t+0\n" +
                "3rd\t+2\t+2\t+1\t+1\tTalent\t+2\t+1\n" +
                "4th\t+3\t+2\t+1\t+1\tBonus feat\t+3\t+1\n" +
                "5th\t+3\t+3\t+1\t+1\tTalent\t+3\t+1\n" +
                "6th\t+4\t+3\t+2\t+2\tBonus feat\t+3\t+2\n" +
                "7th\t+5\t+4\t+2\t+2\tTalent\t+4\t+2\n" +
                "8th\t+6/+1\t+4\t+2\t+2\tBonus feat\t+4\t+2\n" +
                "9th\t+6/+1\t+4\t+3\t+3\tTalent\t+5\t+3\n" +
                "10th\t+7/+2\t+5\t+3\t+3\tBonus feat\t+5\t+3\n" +
                "\n" +
                "Starting Feats\n" +
                "In addition to the two feats all characters get at 1st level, a Tough hero begins play with the Simple Weapons Proficiency feat.\n" +
                "Class Features\n" +
                "All of the following are class features of the Tough hero.\n" +
                "Talents\n" +
                "At 1st, 3rd, 5th, 7th, and 9th level, the Tough hero selects a talent from the following talent trees. Some trees have a set order that must be followed, while others provide a list to choose from. As long as the hero qualifies, he or she can select freely from any and all talent trees. No talent can be selected more than once unless expressly indicated.\n" +
                "Damage Reduction Talent Tree\n" +
                "The Tough hero has an innate talent to ignore a set amount of damage from most weapons, but not from energy or special attack forms (which may or may not exist, depending on the campaign). Before the hero can select a talent from this tree the hero must have previously selected at least one talent from the Energy Resistance or Unbreakable Talent Tree.\n" +
                "Damage Reduction 1/—: The Tough hero ignores 1 point of damage from melee and ranged weapons.\n" +
                "Prerequisite: One other talent from either the Energy Resistance Talent Tree or the Unbreakable Talent Tree.\n" +
                "Damage Reduction 2/—: The Tough hero ignores an additional 1 point of damage from melee and ranged weapons (DR 2/— total).\n" +
                "Prerequisites: Damage reduction 1/—, one other talent from either the Energy Resistance Talent Tree or the Unbreakable Talent Tree.\n" +
                "Damage Reduction 3/—: The Tough hero ignores an additional 1 point of damage from melee and ranged weapons (DR 3/— total).\n" +
                "Prerequisites: Damage reduction 1/—, damage reduction 2/—, one other talent from either the Energy Resistance Talent Tree or the Unbreakable Talent Tree.\n" +
                "Energy Resistance Talent Tree\n" +
                "The Tough hero is particularly resistant to certain kinds of deadly energy effects. These talents can be selected in any order.\n" +
                "Acid Resistance: The Tough hero ignores an amount of acid damage equal to his or her Constitution modifier.\n" +
                "Cold Resistance: The Tough hero ignores an amount of cold damage equal to his or her Constitution modifier.\n" +
                "Electricity Resistance: The Tough hero ignores an amount of electricity damage equal to his or her Constitution modifier.\n" +
                "Fire Resistance: The Tough hero ignores an amount of fire damage equal to his or her Constitution modifier.\n" +
                "Sonic/Concussion Resistance: The Tough hero ignores an amount of sonic or concussion damage equal to his or her Constitution modifier.\n" +
                "Unbreakable Talent Tree\n" +
                "The Tough hero is particularly resilient thanks to the following talents.\n" +
                "Remain Conscious: The Tough hero gains the ability to continue to perform actions when he or she would otherwise be considered unconscious and dying. When the Tough hero’s hit points reach –1, the hero can perform as though he or she were disabled, making either an attack action or a move action every round until the hero reaches –10 hit points (and dies) or the hero’s hit points return to 1 or higher. The hero can choose to succumb to unconsciousness if he or she thinks that doing so might prevent him or her from taking more damage.\n" +
                "Robust: The Tough hero becomes especially robust, gaining a number of hit points equal to his or her Tough level as soon as he or she selects this talent. Thereafter, the hero gains +1 hit point with each level of Tough he or she gains.\n" +
                "Second Wind: The Tough hero can spend 1 action point to gain a second wind. When the hero does this, he or she recovers a number of hit points equal to his or her Constitution modifier. This talent does not increase the Tough hero’s hit points beyond the character’s full normal total.\n" +
                "Stamina: The Tough hero recovers twice as fast as normal. So, the hero recovers 2 hit points per character level per evening of rest, 2 points of temporary ability damage per evening of rest, and awakens in half the normal time after being knocked unconscious.\n" +
                "Prerequisite: Robust.\n" +
                "Bonus Feats\n" +
                "At 2nd, 4th, 6th, 8th, and 10th level, the Tough hero gains a bonus feat. This feat must be selected from the following list, and the Tough hero must meet any prerequisites.\n" +
                "Alertness, Athletic, Brawl, Confident, Endurance, Great Fortitude, Improved Brawl, Improved Bull Rush, Improved Feint, Knockout Punch, Power Attack, Streetfighting, Toughness, Vehicle Expert.\n";
        tmp.isBasic = true;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "THE SMART HERO";
        tmp.description = "";
        tmp.heroContent = "Ability: Intelligence\n" +
                "Hit Die: 1d6\n" +
                "Action Points: Smart heroes gain a number of action points equal to 5 + one-half their character level, rounded down, at 1st level and every time they attain a new level in this class. \n" +
                "Class Skills: The Smart hero’s class skills (and the key ability for each skill) are: Computer Use (Int), Craft (chemical, electronic, mechanical, pharmaceutical, structural, visual art, writing) (Int), Decipher Script (Int), Demolitions (Int), Disable Device (Int), Forgery (Int), Investigate (Int), Knowledge (arcane lore, art, behavioral sciences, business, civics, current events, earth and life sciences, history, physical sciences, popular culture, streetwise, tactics, technology, theology and philosophy) (Int), Navigate (Int), Profession (Wis), Read/Write Language (none), Repair (Int), Research (Int), Search (Int), and Speak Language (none).\n" +
                "Also, the starting occupation the hero selects can provide additional class skills to choose from.\n" +
                "Skill Points at 1st Level: (9 + Int modifier) x4.\n" +
                "Skill Points at Each Additional Level: 9 + Int modifier.\n" +
                "\n" +
                "Table: The Smart Hero\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tClass Features\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+0\t+0\t+1\tTalent\t+0\t+1\n" +
                "2nd\t+1\t+0\t+0\t+2\tBonus feat\t+1\t+1\n" +
                "3rd\t+1\t+1\t+1\t+2\tTalent\t+1\t+1\n" +
                "4th\t+2\t+1\t+1\t+2\tBonus feat\t+1\t+2\n" +
                "5th\t+2\t+1\t+1\t+3\tTalent\t+2\t+2\n" +
                "6th\t+3\t+2\t+2\t+3\tBonus feat\t+2\t+2\n" +
                "7th\t+3\t+2\t+2\t+4\tTalent\t+2\t+3\n" +
                "8th\t+4\t+2\t+2\t+4\tBonus feat\t+3\t+3\n" +
                "9th\t+4\t+3\t+3\t+4\tTalent\t+3\t+3\n" +
                "10th\t+5\t+3\t+3\t+5\tBonus feat\t+3\t+4\n" +
                "\n" +
                "Starting Feats\n" +
                "In addition to the two feats all characters get at 1st level, a Smart hero begins play with the Simple Weapons Proficiency feat.\n" +
                "Class Features\n" +
                "All of the following are class features of the Smart hero.\n" +
                "Talents\n" +
                "At 1st, 3rd, 5th, 7th, and 9th level, the Smart hero selects a talent from the following talent trees. Some trees have a set order that must be followed, while others provide a list to choose from. As long as the hero qualifies, he or she can select freely from any and all talent trees. No talent can be selected more than once unless expressly indicated.\n" +
                "Research Talent Tree\n" +
                "The Smart hero has a natural aptitude for study and fact-finding. These talents can be selected in any order.\n" +
                "Savant: Select one of the skills listed in the following paragraph. The hero must have ranks in the skill if it is Trained Only.  The Smart hero gets to add a bonus equal to his or her Smart level when making checks with that skill. A Smart hero can take this talent multiple times; each time it applies to a different skill.\n" +
                "Computer Use, Craft (any single skill), Decipher Script, Demolitions, Disable Device, Forgery, Investigate, Knowledge (any single skill), Navigate, Repair, Research, Search. \n" +
                "Linguist: With this talent, the Smart hero becomes a master linguist. Whenever the hero encounters a new language, either spoken or written, that he or she does not know the Smart hero can make an Intelligence check to determine if he or she can understand it. The check is made with a bonus equal to the hero’s Smart level. For a written language, the bonus applies to a Decipher Script check instead. \n" +
                "The DC for the check depends on the situation: DC 15 if the language is in the same group as a language the hero has as a Read/Write Language or Speak Language skill; DC 20 if the language is unrelated to any other languages the hero knows; and DC 25 if the language is ancient or unique.  With this special ability, a Smart hero can glean enough meaning from a conversation or document to ascertain the basic message, but this ability in no way simulates actually being able to converse or fluently read and write in a given language.\n" +
                "A single check covers roughly one minute of a spoken language or one page of a written language.\n" +
                "Prerequisite: At least 1 rank in either Read/Write Language or Speak Language for each of three different languages.\n" +
                "Strategy Talent Tree\n" +
                "The Smart hero has the brainpower to see solutions in most situations. These talents can be selected in any order, but before the hero can select a talent from this tree he or she must have previously selected at least one talent from the Research Talent Tree.\n" +
                "Exploit Weakness: After 1 round of combat, the Smart hero can designate one opponent and try to find ways to gain an advantage by using brains over brawn. The Smart hero uses a move action and makes an Intelligence check (DC 15) with a bonus equal to his or her Smart level. If the check succeeds, for the rest of the combat the Smart hero uses his or her Intelligence bonus instead of either Strength or Dexterity bonus on attack rolls as the hero finds ways to outthink his opponent and notices weaknesses in his opponent’s fighting style. \n" +
                "Prerequisite: One talent from the Research Talent Tree.\n" +
                "Plan: Prior to an encounter the Smart hero can develop a plan of action to handle the situation. Using this talent requires preparation; a Smart hero can’t use this talent when surprised or otherwise unprepared for a particular situation. Creating a plan requires 1 minute.\n" +
                "After creating the plan the Smart hero makes an Intelligence check (DC 10) with a bonus equal to his or her Smart level. The result of the check provides the Smart hero and allies with a circumstance bonus. A Smart hero can’t take 10 or 20 when making this check.\n" +
                "Check Result\tBonus\n" +
                "9 or lower\t+0 (check failed)\n" +
                "10–14\t+1\n" +
                "15–24\t+2\n" +
                "25 or higher\t+3\n" +
                "This bonus can be applied to all skill checks and attack rolls made by the Smart hero and his or her allies, but the bonus only lasts for the first 3 rounds after making the plan. After that time, reduce the bonus by 1 point (to a minimum of +0) for every additional round the situation continues, as the vagaries of circumstance begin to unravel even the best-laid plans.\n" +
                "Prerequisite: One talent from the Research Talent Tree.\n" +
                "Trick: The Smart hero has the ability to temporarily confuse a target through the use of ploy and deception. The target must have an Intelligence score of 3 or higher to be susceptible to a trick, must be within 30 feet of the hero, and must be able to hear and understand the hero.\n" +
                "To play a trick on a target, the hero must use a full-round action and make an Intelligence check (DC 15), adding his or her Smart level as a bonus. If the Intelligence check succeeds, the target can try to think quickly and ignore the trick.\n" +
                "The target resists the trick by making a Will saving throw (DC 10 + Smart hero’s class level + Smart hero’s Int bonus). If the saving throw fails, the target becomes dazed (unable to act, but can defend normally) for 1 round.\n" +
                "A trick can only be played on a particular target once per encounter. After the first trick in an encounter, whether the attempt succeeds or not, that target becomes wary and immune to such ploys.  This is a mind-affecting ability.\n" +
                "Prerequisite: One talent from the Research Talent Tree.\n" +
                "Bonus Feats\n" +
                "At 2nd, 4th, 6th, 8th, and 10th level, the Smart hero gains a bonus feat. This feat must be selected from the following list, and the Smart hero must meet any prerequisites.\n" +
                "Builder, Cautious, Combat Expertise, Educated, Gearhead, Improved Disarm, Improved Trip, Iron Will, Lightning Reflexes, Meticulous, Studious, Vehicle Expert, Weapon Focus.\n";
        tmp.isBasic = true;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "THE DEDICATED HERO";
        tmp.description = "";
        tmp.heroContent = "Ability: Wisdom\n" +
                "Hit Die: 1d6\n" +
                "Action Points: Dedicated heroes gain a number of action points equal to 5 + one-half their character level, rounded down, at 1st level and every time they attain a new level in this class.\n" +
                "Class Skills: The Dedicated hero’s class skills (and the key ability for each skill) are: Craft (pharmaceutical, visual art, writing) (Int), Gamble (Wis), Investigate (Int), Knowledge (arcane lore, art, behavioral sciences, business, civics, current events, earth and life sciences, history, physical sciences, popular culture, streetwise, tactics, technology, theology and philosophy) (Int), Listen (Wis), Profession (Wis), Read/Write Language (none), Sense Motive (Wis), Speak Language (none), Spot (Wis), Survival (Wis), and Treat Injury (Wis).\n" +
                "Also, the starting occupation the hero selects can provide additional class skills to choose from.\n" +
                "Skill Points at 1st Level: (5 + Int modifier) x4.\n" +
                "Skill Points at Each Additional Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Dedicated Hero\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tClass Features\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+1\t+0\t+1\tTalent\t+1\t+1\n" +
                "2nd\t+1\t+2\t+0\t+2\tBonus feat\t+2\t+1\n" +
                "3rd\t+2\t+2\t+1\t+2\tTalent\t+2\t+1\n" +
                "4th\t+3\t+2\t+1\t+2\tBonus feat\t+3\t+2\n" +
                "5th\t+3\t+3\t+1\t+3\tTalent\t+3\t+2\n" +
                "6th\t+4\t+3\t+2\t+3\tBonus feat\t+3\t+2\n" +
                "7th\t+5\t+4\t+2\t+4\tTalent\t+4\t+3\n" +
                "8th\t+6/+1\t+4\t+2\t+4\tBonus feat\t+4\t+3\n" +
                "9th\t+6/+1\t+4\t+3\t+4\tTalent\t+5\t+3\n" +
                "10th\t+7/+2\t+5\t+3\t+5\tBonus feat\t+5\t+4\n" +
                "\n" +
                "Starting Feats\n" +
                "In addition to the two feats all characters get at 1st level, a Dedicated hero begins play with the Simple Weapons Proficiency feat.\n" +
                "Class Features\n" +
                "The following are class features of the Dedicated hero.\n" +
                "Talents\n" +
                "At 1st, 3rd, 5th, 7th, and 9th level, the Dedicated hero selects a talent from the following talent trees. Some trees have a set order that must be followed, while others provide a list to choose from. As long as the hero qualifies, he or she can select freely from any and all talent trees. No talent can be selected more than once unless expressly indicated.\n" +
                "Empathic Talent Tree\n" +
                "The Dedicated hero’s innate talents give him or her a great capacity for empathy.\n" +
                "Empathy: The Dedicated hero has a knack for being sensitive to the feelings and thoughts of others without having those feelings and thoughts communicated in any objectively explicit manner. This innate talent provides a bonus on checks involving interaction skills (Bluff, Diplomacy, Handle Animal, Intimidate, Perform, and Sense Motive), provided the hero spends at least 1 minute observing his or her target prior to making the skill check. The bonus is equal to the hero’s Dedicated level.\n" +
                "Improved Aid Another: The Dedicated hero’s bonus on attempts to aid another increases by +1 on a successful aid another check. This talent can be selected multiple times, each time increasing the bonus by +1.\n" +
                "Prerequisite: Empathy.\n" +
                "Intuition: The Dedicated hero has an innate ability to sense trouble in the air. The Dedicated hero can make a Will saving throw (DC 15). On a successful save, the hero gets a hunch that everything is all right, or the hero gets a bad feeling about a specific situation, based on the GM’s best guess relating to the circumstances. This talent is usable a number of times per day equal to the character’s Dedicated level.\n" +
                "Prerequisite: Empathy.\n" +
                "Healing Talent Tree\n" +
                "The Dedicated hero has a talent for healing.\n" +
                "Healing Knack: The hero has a knack for the healing arts. The hero receives a +2 bonus on all Treat Injury skill checks.\n" +
                "Healing Touch 1: The Dedicated hero’s ability to restore damage with a medical kit or perform surgery with a surgery kit increases by +2 hit points.\n" +
                "Prerequisite: Healing knack.\n" +
                "Healing Touch 2: The Dedicated hero’s ability to restore damage with a medical kit or perform surgery with a surgery kit increases by +2 hit points, which stacks with healing touch 1 for a total of +4 hit points.\n" +
                "Prerequisites: Healing knack, healing touch 1.\n" +
                "Insightful Talent Tree\n" +
                "The Dedicated hero’s innate insightfulness serves her well.\n" +
                "Skill Emphasis: The Dedicated hero chooses a single skill and receives a +3 bonus on all checks with that skill. This bonus does not allow the hero to make checks for a trained-only skill if the hero has no ranks in the skill.\n" +
                "Aware: The Dedicated hero is intuitively aware of his or her surroundings. The hero adds his or her base Will saving throw bonus to Listen or Spot checks to avoid surprise.\n" +
                "Prerequisite: Skill emphasis.\n" +
                "Faith: The Dedicated hero has a great deal of faith. It might be faith in self, in a higher power, or in both. This unswerving belief allows the Dedicated hero to add his or her Wisdom modifier to the die roll whenever the hero spends 1 action point to improve the result of an attack roll, skill check, saving throw, or ability check.\n" +
                "Prerequisite: Skill emphasis.\n" +
                "Cool Under Pressure: The Dedicated hero selects a number of skills equal to 3 + the hero’s Wisdom modifier. When making a check with one of these skills, the Dedicated hero can take 10 even when distracted or under duress.\n" +
                "Prerequisite: Skill emphasis plus either faith or aware.\n" +
                "Bonus Feats\n" +
                "At 2nd, 4th, 6th, 8th, and 10th level, the Dedicated hero gains a bonus feat. This feat must be from this list, and the Dedicated hero must meet any prerequisites.\n" +
                "Advanced Firearms Proficiency, Alertness, Archaic Weapons Proficiency, Attentive, Blind-Fight, Deceptive, Educated, Far Shot, Iron Will, Medical Expert, Meticulous, Surgery, Track, Weapon Focus.\n";
        tmp.isBasic = true;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "THE CHARISMATIC HERO";
        tmp.description = "";
        tmp.heroContent = "Ability: Charisma\n" +
                "Hit Die: 1d6\n" +
                "Action Points: Charismatic heroes gain a number of action points equal to 5 + one-half their character level, rounded down, at 1st level and every time they attain a new level in this class.\n" +
                "Class Skills: The Charismatic hero’s class skills (and the key ability for each skill) are: Bluff (Cha), Craft (visual art, writing) (Int), Diplomacy (Cha), Disguise (Cha), Gather Information (Cha), Handle Animal (Cha), Intimidate (Cha), Knowledge (arcane lore, art, behavioral sciences, business, civics, current events, popular culture, streetwise, theology and philosophy) (Int), Perform (act, dance, keyboards, percussion instruments, sing, stand-up, stringed instruments, wind instruments) (Cha), Profession (Wis), Read/Write Language (none), and Speak Language (none).\n" +
                "Also, the starting occupation the hero selects can provide additional class skills to choose from.\n" +
                "Skill Points at 1st Level: (7 + Int modifier) x4.\n" +
                "Skill Points at Each Additional Level: 7 + Int modifier.\n" +
                "\n" +
                "Table: The Charismatic Hero\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tClass Features\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+1\t+1\t+0\tTalent\t+0\t+2\n" +
                "2nd\t+1\t+2\t+2\t+0\tBonus feat\t+1\t+2\n" +
                "3rd\t+1\t+2\t+2\t+1\tTalent\t+1\t+2\n" +
                "4th\t+2\t+2\t+2\t+1\tBonus feat\t+1\t+3\n" +
                "5th\t+2\t+3\t+3\t+1\tTalent\t+2\t+3\n" +
                "6th\t+3\t+3\t+3\t+2\tBonus feat\t+2\t+3\n" +
                "7th\t+3\t+4\t+4\t+2\tTalent\t+2\t+4\n" +
                "8th\t+4\t+4\t+4\t+2\tBonus feat\t+3\t+4\n" +
                "9th\t+4\t+4\t+4\t+3\tTalent\t+3\t+4\n" +
                "10th\t+5\t+5\t+5\t+3\tBonus feat\t+3\t+5\n" +
                "\n" +
                "Starting Feats\n" +
                "In addition to the two feats all characters get at 1st level, a Charismatic hero begins play with the Simple Weapons Proficiency feat.\n" +
                "Class Features\n" +
                "All of the following are class features of the Charismatic hero.\n" +
                "Talents\n" +
                "At 1st, 3rd, 5th, 7th, and 9th level, the Charismatic hero selects a talent from the following talent trees. Some trees have a set order that must be followed, while others provide a list to choose from. As long as the hero qualifies, he or she can select freely from any and all talent trees. No talent can be selected more than once unless expressly indicated.\n" +
                "Charm Talent Tree\n" +
                "The Charismatic hero has an innate talent for being charming and captivating.\n" +
                "Charm: The Charismatic hero gets a competence bonus on all Charisma-based skill checks made to influence members of his chosen gender. (Some characters are charming to members of the opposite gender, others to members of the same gender.) The bonus is equal to the character’s Charismatic level.\n" +
                "A Charismatic hero can only charm Gamemaster characters with attitudes of indifferent or better. The charm bonus can’t be used against characters who are unfriendly or hostile.\n" +
                "This ability can be taken more than once (for another gender).\n" +
                "Favor: The Charismatic hero has the ability to acquire minor aid from anyone he or she meets. By making a favor check, a Charismatic hero can gain important information without going through the time and trouble of doing a lot of research. Favors can also be used to acquire the loan of equipment or documents, or to receive other minor assistance in the course of an adventure.\n" +
                "A Charismatic hero spends 1 action point to activate this talent. To make a favor check, roll a d20 and add the character’s favor bonus, equal to the character’s Charismatic level. The GM sets the DC based on the scope of the favor being requested. The DC ranges from 10 for a simple favor to as high as 30 for formidable and highly dangerous, expensive, or illegal favors. A Charismatic hero can’t take 10 or 20 on this check, nor can the hero retry the check for the same (or virtually the same) favor.  Favors should help advance the plot of an adventure. A favor that would enable a character to avoid an adventure altogether should always be unavailable to the character, regardless of the result of a favor check.\n" +
                "The GM should carefully monitor a Charismatic hero’s use of favors to ensure that this ability isn’t abused. The success or failure of a mission shouldn’t hinge on the use of a favor, and getting a favor shouldn’t replace good roleplaying or the use of other skills. The GM may disallow any favor deemed to be disruptive to the game.\n" +
                "Prerequisite: Charm.\n" +
                "Captivate: The Charismatic hero has the ability to temporarily beguile a target through the use of words and bearing. The target must have an Intelligence score of 3 or higher to be susceptible to a captivate attempt, must be within 30 feet of the hero, must be flat-footed or not in combat, and must be able to see, hear, and understand the hero.\n" +
                "To captivate a target, the hero must use an attack action and make a Charisma check (DC 15), adding his or her Charismatic level as a bonus. If the Charisma check succeeds, the target can try to resist.\n" +
                "The target resists the captivation attempt by making a Will saving throw (DC 10 + Charismatic hero’s class level + Charismatic hero’s Cha bonus). If the saving throw fails, the hero becomes the target’s sole focus. The target pays no attention to anyone else for 1 round and remains flat-footed. This focusing of the target’s attention allows other characters to take actions of which the captivated target is unaware. The effect ends immediately if the target is attacked or threatened.\n" +
                "A Charismatic hero can concentrate to keep a target captivated for additional rounds. The Charismatic hero concentrates all his or her effort on the task, and the target gets to make a new Will save each round. The effect ends when the hero stops concentrating, or when the target succeeds on the save. This is a Mind-Affecting ability.\n" +
                "Prerequisites: Charm, Favor.\n" +
                "Fast-Talk Talent Tree\n" +
                "The Charismatic hero has an innate talent for bending the truth and dazzling others with a combination of words, mannerisms, and charm.\n" +
                "Fast-Talk: The Charismatic hero has a way with words when attempting to con and deceive. With this talent, he or she applies his or her Charismatic level as a competence bonus on any Bluff, Diplomacy, or Gamble checks the hero makes while attempting to lie, cheat, or otherwise bend the truth.\n" +
                "Dazzle: The Charismatic hero has the ability to dazzle a target through sheer force of personality, a winning smile, and fast-talking. The target must have an Intelligence score of 3 or higher to be susceptible to a dazzle attempt, must be within 30 feet of the hero, and must be able to see, hear, and understand the hero.\n" +
                "To dazzle a target, the hero must use an attack action and make a Charisma check (DC 15), adding his or her Charismatic level as a bonus. If the Charisma check succeeds, the target can try to resist.\n" +
                "The target resists the dazzle attempt by making a Will saving throw (DC 10 + Charismatic hero’s class level + Charismatic hero’s Cha bonus). If the save fails, the target receives a –1 penalty on attack rolls, ability checks, skill checks, and saving throws for a number of rounds equal to the character’s Charismatic level.\n" +
                "This talent can be selected multiple times, each time worsening the dazzled penalty by –1.  This is a Mind-Affecting ability.\n" +
                "Prerequisite: Fast-talk.\n" +
                "Taunt: The Charismatic hero has the ability to temporarily rattle a target through the use of insults and goading. The target must have an Intelligence score of 3 or higher to be susceptible to a taunt, must be within 30 feet of the hero, and must be able to hear and understand the hero.\n" +
                "To taunt a target, the hero must use an attack action and make a Charisma check (DC 15), adding his or her Charismatic level as a bonus. If the Charisma check succeeds, the target can try to resist.\n" +
                "The target resists the taunt by making a Will saving throw (DC 10 + Charismatic hero’s class level + Charismatic hero’s Cha bonus). If the save fails, the target becomes dazed (unable to act, but can defend normally) for 1 round.\n" +
                "A taunt can be played on an opponent any number of times.  This is a Mind-Affecting ability.\n" +
                "Prerequisites: Fast-talk, dazzle.\n" +
                "Leadership Talent Tree\n" +
                "The Charismatic hero has a talent for leadership and inspiration.\n" +
                "Coordinate: The Charismatic hero has a knack for getting people to work together. When the hero can spend a full round directing his or her allies and makes a Charisma check (DC 10), the hero provides any of his or her allies within 30 feet a +1 bonus on their attack rolls and skill checks. The bonus lasts for a number of rounds equal to the hero’s Charisma modifier.\n" +
                "The hero can coordinate a number of allies equal to one-half his or her Charismatic level, rounded down (to a minimum of one ally).\n" +
                "Inspiration: The Charismatic hero can inspire his or her allies, bolstering them and improving their chances of success. An ally must listen to and observe the Charismatic hero for a full round for the inspiration to take hold, and the hero must make a Charisma check (DC 10). The effect lasts for a number of rounds equal to the hero’s Charisma modifier.\n" +
                "An inspired ally gains a +2 morale bonus on saving throws, attack rolls, and damage rolls.\n" +
                "A Charismatic hero can’t inspire him or herself. The hero can inspire a number of allies equal to one-half his or her Charismatic level, rounded down (to a minimum of one ally).\n" +
                "Prerequisite: Coordinate.\n" +
                "Greater Inspiration: The Charismatic hero can inspire his or her allies to even greater heights, bolstering them and improving their chances of success. An ally must listen to and observe the Charismatic hero for a full round for the greater inspiration to take hold, and the hero must make a Charisma check (DC 10). The effect lasts for a number of rounds equal to the hero’s Charisma modifier.\n" +
                "An inspired ally gains an additional +1 morale bonus on saving throws, attack rolls, and damage rolls, which stacks with the bonus from inspiration for a total of a +3 morale bonus.\n" +
                "A Charismatic hero can’t inspire him or herself. The hero can inspire a number of allies equal to one-half his or her Charismatic level, rounded down (to a minimum of one ally).\n" +
                "Prerequisites: Coordinate, inspiration. \n" +
                "Bonus Feats\n" +
                "At 2nd, 4th, 6th, 8th, and 10th level, the Charismatic hero gains a bonus feat. This feat must be selected from the following list, and the Charismatic hero must meet any prerequisites.\n" +
                "Agile Riposte, Creative, Deceptive, Dodge, Frightful Presence, Iron Will, Lightning Reflexes, Low Profile, Point Blank Shot, Renown, Trustworthy, Windfall.\n";
        tmp.isBasic = true;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "SOLDIER";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Soldier, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +3.\n" +
                "Skill: Knowledge (tactics) 3 ranks.\n" +
                "Feat: Personal Firearms Proficiency.\n" +
                "Class Information\n" +
                "Hit Die: 1d10\n" +
                "Action Points: 6 + one-half character level, rounded down, every time the character attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Soldier’s class skills (and the key ability for each skill) are: Demolitions (Int), Drive (Dex), Intimidate (Cha), Jump (Str), Knowledge (current events, history, popular culture, tactics) (Int), Listen (Wis), Navigate (Int), Profession (Wis), Read/Write Language (none), Speak Language (none), Spot (Wis), Survival (Wis), Swim (Str).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Soldier\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation bonus\n" +
                "1st\t+0\t+1\t+1\t+0\tWeapon Focus\t+1\t+0\n" +
                "2nd\t+1\t+2\t+2\t+0\tWeapon specialization\t+1\t+0\n" +
                "3rd\t+2\t+2\t+2\t+1\tBonus feat\t+2\t+0\n" +
                "4th\t+3\t+2\t+2\t+1\tTactical aid\t+2\t+0\n" +
                "5th\t+3\t+3\t+3\t+1\tImproved critical\t+3\t+1\n" +
                "6th\t+4\t+3\t+3\t+2\tBonus feat\t+3\t+1\n" +
                "7th\t+5\t+4\t+4\t+2\tImproved reaction\t+4\t+1\n" +
                "8th\t+6\t+4\t+4\t+2\tGreater weapon specialization\t+4\t+1\n" +
                "9th\t+6\t+4\t+4\t+3\tBonus feat\t+5\t+2\n" +
                "10th\t+7\t+5\t+5\t+3\tCritical strike\t+5\t+2\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Soldier advanced class.\n" +
                "Weapon Focus\n" +
                "At 1st level, a Soldier gains the Weapon Focus class feature, providing the benefit of the feat with the same name. The Soldier chooses a specific weapon. The soldier can choose unarmed strike or grapple as the weapon. The soldier must be proficient with the chosen weapon.\n" +
                "The soldier adds +1 to all attack rolls made using the selected weapon.\n" +
                "Weapon Specialization\n" +
                "At 2nd level, a Soldier gains weapon specialization with a specific melee or ranged weapon that he or she also has applied the Weapon Focus feat or class feature to. The soldier gets a +2 bonus on damage rolls with the chosen weapon.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Soldier gets a bonus feat. The bonus feat must be selected from the following list, and the Soldier must meet all the prerequisites of the feat to select it.\n" +
                "Advanced Firearms Proficiency, Archaic Weapons Proficiency, Armor Proficiency (light), Armor Proficiency (medium), Armor Proficiency (heavy), Brawl, Burst Fire, Cleave, Combat Reflexes, Exotic Firearms Proficiency, Exotic Melee Weapon Proficiency, Far Shot, Great Cleave, Im¬proved Brawl, Improved Knockout Punch, Knockout Punch, Power Attack.\n" +
                "Tactical Aid\n" +
                "As a full-round action, the Soldier provides tactical aid to all of his allies (including himself) within sight and voice\n" +
                "range of his position. This use of tactical aid requires an action point.\n" +
                "This aid provides a +1 competence bonus on attack rolls. The bonus lasts for a number of rounds equal to one-half\n" +
                "of the Soldier’s level in the advanced class, rounded down.\n" +
                "Improved Critical\n" +
                "For the weapon the Soldier has applied weapon specialization to the Soldier’s threat range increases by one. \n" +
                "Improved Reaction\n" +
                "At 7th level, a Soldier gains a +2 competence bonus on initiative checks.\n" +
                "Greater Weapon Specialization\n" +
                "At 8th level, a Soldier gains greater weapon specialization with the weapon he  or she selected at 2nd level. This ability increases the bonus on damage rolls to +4 when using the selected weapon.\n" +
                "Critical Strike\n" +
                "At 10th level, a Soldier gains the ability to automatically confirm a threat as a critical hit when attacking with the weapon he or she has applied weapon specialization to, eliminating the need to make a roll to confirm the critical hit.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "MARTIAL ARTIST";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Martial Artist, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +3.\n" +
                "Skill: Jump 3 ranks.\n" +
                "Feats: Combat Martial Arts, Defensive Martial Arts.\n" +
                "Class Information\n" +
                "Hit Die: 1d8 \n" +
                "Action Points: 6 + one-half character level, rounded down, every time the martial artist attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Martial Artist’s class skills (and the key ability for each skill) are: Balance (Dex), Climb (Str), Escape Artist (Dex), Hide (Dex), Intimidate (Cha), Jump (Str), Knowledge (current events, popular culture, theology and philosophy) (Int), Move Silently (Dex), Perform (dance) (Cha), Profession (Wis), Read/Write Language (none), Speak Language (none), Spot (Wis), Tumble (Dex).\n" +
                "Skill Points at Each Level: 3 + Int modifier.\n" +
                "Table: The Martial Artist\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+1\t+0\t+2\t+0\tLiving weapon 1d6\t+1\t+0\n" +
                "2nd\t+2\t+0\t+3\t+0\tFlying kick\t+2\t+0\n" +
                "3rd\t+3\t+1\t+3\t+1\tBonus feat\t+2\t+0\n" +
                "4th\t+4\t+1\t+4\t+1\tLiving weapon 1d8\t+3\t+0\n" +
                "5th\t+5\t+1\t+4\t+1\tIron fist (one attack)\t+4\t+1\n" +
                "6th\t+6\t+2\t+5\t+2\tBonus feat\t+4\t+1\n" +
                "7th\t+7\t+2\t+5\t+2\tFlurry of blows\t+5\t+1\n" +
                "8th\t+8\t+2\t+6\t+2\tLiving weapon 1d10\t+6\t+1\n" +
                "9th\t+9\t+3\t+6\t+3\tBonus feat\t+6\t+2\n" +
                "10th\t+10\t+3\t+7\t+3\tIron fist (all attacks)\t+7\t+2\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Martial Artist advanced class.\n" +
                "Living Weapon\n" +
                "The Martial Artist attacks with either fist interchangeably, or even with elbows, knees, and feet. This means that the Martial Artist may even make unarmed strikes when his or her hands are full, and there is no such thing as an off-hand attack for a Martial Artist striking unarmed.\n" +
                "The Martial Artist also deals more damage with unarmed strikes. At 1st level, the martial artist deals 1d6 points of damage with an unarmed strike. At 4th level, damage increases to 1d8. At 8th level, it increases to 1d10.\n" +
                "This is an increase to Combat Martial Arts damage; this has no effect on Brawl.\n" +
                "Flying Kick\n" +
                "Starting at 2nd level, a Martial Artist can use a charge to deliver a devastating flying kick to an opponent. At the end of this charge, the martial artist adds his or her class level as a bonus to the damage he or she deals with an unarmed strike.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Martial Artist gets a bonus feat. The bonus feat must be selected from the following list, and the Martial Artist must meet all the prerequisites of the feat to select it.\n" +
                "Acrobatic, Advanced Combat Martial Arts, Archaic Weapons Proficiency, Combat Reflexes, Combat Throw, Elusive Target, Exotic Melee Weapon Proficiency, Improved Combat Throw, Improved Combat Martial Arts, Unbalance Opponent.\n" +
                "Iron Fist\n" +
                "At 5th level, a Martial Artist gains the ability to spend 1 action point to increase the damage he or she deals to a single opponent with a single unarmed strike. The martial artist declares the use of the action point after making a successful unarmed strike. The result of the action point roll is added to the damage roll for that attack.\n" +
                "At 10th level, this ability im¬proves. The Martial Artist now adds the result of the action point roll to all successful attacks he or she makes in a round.\n" +
                "Flurry of Blows\n" +
                "At 7th level, a Martial Artist gains the ability to strike with a flurry of blows at the expense of accuracy. The Martial Artist must be unarmored to use this talent, and he or she must make unarmed strikes to gain the benefit. With a flurry of blows, the Martial Artist may make one extra attack in a round at his or her highest base attack bonus. This attack and each other attack made in the round take a –2 penalty. This ability can only be used when taking the full attack action. The penalty applies to all attacks for one full round, including attacks of opportunity.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "GUNSLINGER";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Gunslinger, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +2.\n" +
                "Skills: Sleight of Hand 6 ranks, Tumble 6 ranks.\n" +
                "Feat: Personal Firearms Proficiency.\n" +
                "Class Information\n" +
                "Hit Die: 1d10 \n" +
                "Action Points: 6 + one-half character level, rounded down, every time the gunslinger attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Gunslinger’s class skills (and the key ability for each skill) are: Bluff (Cha), Demolitions (Int), Drive (Dex), Escape Artist (Dex), Gamble (Wis), Intimidate (Cha), Knowledge (current events, popular culture, streetwise) (Int), Move Silently (Dex), Profession (Wis), Read/Write Language (none), Ride (Dex), Sleight of Hand (Dex), Speak Language (none), Spot (Wis), Survival (Wis), Tumble (Dex).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "Table: The Gunslinger\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+0\t+1\t+1\tClose combat shot\t+1\t+0\n" +
                "2nd\t+1\t+0\t+2\t+2\tWeapon focus\t+1\t+0\n" +
                "3rd\t+2\t+1\t+2\t+2\tBonus feat\t+2\t+1\n" +
                "4th\t+3\t+1\t+2\t+2\tDefensive position \t+2\t+1\n" +
                "5th\t+3\t+1\t+3\t+3\tLightning shot\t+3\t+1\n" +
                "6th\t+4\t+2\t+3\t+3\tBonus feat\t+3\t+2\n" +
                "7th\t+5\t+2\t+4\t+4\tSharp-shooting\t+4\t+2\n" +
                "8th\t+6\t+2\t+4\t+4\tGreater weapon focus\t+4\t+2\n" +
                "9th\t+6\t+3\t+4\t+4\tBonus feat\t+5\t+3\n" +
                "10th\t+7\t+3\t+5\t+5\tBullseye\t+5\t+3\n" +
                "Class Features\n" +
                "The following features pertain to the Gunslinger advanced class.\n" +
                "Close Combat Shot\n" +
                "At 1st level, a Gunslinger gains the ability to make a ranged attack with a Medium-size or smaller firearm while in a threatened area without provoking an attack of opportunity.\n" +
                "Weapon Focus\n" +
                "At 2nd level, a Gunslinger gains the Weapon Focus class feature, providing the benefit of the feat with the same name. The Gunslinger must choose a specific personal firearm. \n" +
                "The gunslinger adds +1 to all attack rolls you make using the selected personal firearm.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Gunslinger gets a bonus feat. The bonus feat must be selected from the following list, and the Gunslinger must meet all the prerequisites of the feat to select it.\n" +
                "Advanced Firearms Proficiency, Advanced Two-Weapon Fighting, Burst Fire, Dead Aim, Double Tap, Far Shot, Improved Two-Weapon Fighting, Precise Shot, Quick Draw, Quick Reload, Shot on the Run, Skip Shot, Strafe, Two-Weapon Fighting.\n" +
                "Defensive Position\n" +
                "Starting at 4th level, the Gunslinger gains an additional +2 cover bonus to Defense and an additional +2 cover bonus on Reflex saves whenever he or she has one-quarter, one-half, three-quarters, or nine-tenths cover.\n" +
                "Lightning Shot\n" +
                "Starting at 5th level, a Gunslinger can make a flurry of ranged attacks with a personal firearm at the expense of accuracy. With a lightning shot, the Gunslinger may make one extra ranged attack with a personal firearm in a round at his or her highest base attack bonus. This attack and each other attack made in the round take a –2 penalty. This ability can only be used when taking the full attack action. The penalty applies to all attacks for one full round, including attacks of opportunity.\n" +
                "Sharp-Shooting\n" +
                "At 7th level, if the Gunslinger uses a personal firearm to attack a target, the cover bonus to the target’s Defense for one-quarter, one-half, three-quarters, or nine-tenths cover is reduced by 2.\n" +
                "Greater Weapon Focus\n" +
                "At 8th level, a Gunslinger receives a +1 competence bonus on attack rolls made with the firearm selected for the Weapon Focus ability at 2nd level. This bonus stacks with the earlier bonus.\n" +
                "Bullseye\n" +
                "At 10th level, a Gunslinger becomes so adept at using the firearm to which he or she has applied Weapon Focus and Greater Weapon Focus that the gunslinger’s attacks with that firearm can deal extra damage. With a successful attack, before damage is rolled, the gunslinger can spend 1 action point to deal +3d6 points of damage.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "INFILTRATOR";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become an Infiltrator, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +2.\n" +
                "Skills: Hide 6 ranks, Move Silently 6 ranks.\n" +
                "Class Information\n" +
                "The following information pertains to the Infiltrator advanced class.\n" +
                "Hit Die: 1d8\n" +
                "Action Points: 6 + one-half character level, rounded down, every time the infiltrator attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Infiltrator’s class skills (and the key ability for each skill) are: Balance (Dex), Climb (Str), Disable Device (Int), Disguise (Cha), Escape Artist (Dex), Hide (Dex), Investigate (Int), Jump (Str), Knowledge (art, business, current events, popular culture, streetwise) (Int), Listen (Wis), Move Silently (Dex), Profession (Wis), Read/Write Language (none), Search (Int), Sleight of Hand (Dex), Speak Language (none), Spot (Wis), Tumble (Dex).\n" +
                "Skill Points at Each Level: 7 + Int modifier.\n" +
                "Class Features\n" +
                "The following features pertain to the Infiltrator advanced class.\n" +
                "\n" +
                "Table: The Infiltrator\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+0\t+2\t+0\tSweep\t+1\t+1\n" +
                "2nd\t+1\t+0\t+3\t+0\tImprovised implements\t+2\t+1\n" +
                "3rd\t+1\t+1\t+3\t+1\tBonus feat\t+2\t+1\n" +
                "4th\t+2\t+1\t+4\t+1\tImproved evasion\t+3\t+2\n" +
                "5th\t+2\t+1\t+4\t+1\tSkill mastery\t+4\t+2\n" +
                "6th\t+3\t+2\t+5\t+2\tBonus feat\t+4\t+2\n" +
                "7th\t+3\t+2\t+5\t+2\tImprovised weapon damage\t+5\t+3\n" +
                "8th\t+4\t+2\t+6\t+2\tImproved sweep\t+6\t+3\n" +
                "9th\t+4\t+3\t+6\t+3\tBonus feat\t+6\t+3\n" +
                "10th\t+5\t+3\t+7\t+3\tWithout a trace\t+7\t+4\n" +
                "Sweep\n" +
                "An Infiltrator knows how to size up an area and get the lay of the land in a single sweep of his or her eyes. This sweep provides a +4 circumstance bonus on Spot checks and covers an area out to 30 feet away from the Infiltrator. The Infiltrator can use this bonus at the start of an encounter.\n" +
                "Anything not concealed can be spotted in a sweep with a successful check (DC 10). The DC for concealed or less obvious threats is equal to their Hide check result.\n" +
                "Improvised Implements\n" +
                "At 2nd level, an Infiltrator no longer takes a –4 penalty when wielding an improvised weapon. Also, the Infiltrator is able to make do without proper equipment in certain circumstances: the Infiltrator no longer takes a –4 penalty when using the Climb and Disable Device skills without the proper tools.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Infiltrator gets a bonus feat. The bonus feat must be selected from the following list, and the Infiltrator must meet all the prerequisites of the feat to select it.\n" +
                "Acrobatic, Alertness, Armor Proficiency (light), Athletic, Attentive, Brawl, Cautious, Defensive Martial Arts, Dodge, Elusive Target, Meticulous, Mobility, Nimble, Renown, Run, Stealthy.\n" +
                "Improved Evasion\n" +
                "If an Infiltrator of 4th level or higher is exposed to any effect that normally allows a character to attempt a Reflex saving throw for half damage, the Infiltrator suffers no damage if he or she makes a successful saving throw and only half damage on a failed save. Improved evasion can only be used when wearing light armor or no armor.\n" +
                "For an Infiltrator who does not have evasion (see the Fast hero class description), improved evasion counts as evasion for the purpose of meeting the prerequisites on the Fast hero’s defensive talent tree.\n" +
                "Skill Mastery\n" +
                "At 5th level, an Infiltrator selects a number of skills from his or her class list equal to 3 + his or her Intelligence modifier. When making a check using one of these skills, the Infiltrator may take 10 even if stress and distractions would normally prevent him or her from doing so.\n" +
                "Improvised Weapon Damage\n" +
                "At 7th level, an Infiltrator’s attacks with improvised weapons deal more damage. The Infiltrator treats an improvised weapon as one size category larger than it is for the purpose of determining the damage it deals.\n" +
                "Improved Sweep\n" +
                "At 8th level, an Infiltrator’s ability to get the lay of the land improves. Now the Infiltrator not only spots potential perils with a successful check, he or she can determine the relative strength of these dangers. A successful check relates the danger’s strength compared to the Infiltrator: stronger (higher level or Hit Dice), on par (same level or HD), or weaker (lower level or HD).\n" +
                "Without a Trace\n" +
                "At 10th level, when an Infiltrator uses any of the following skills: Balance, Climb, Disable Device, Escape Artist, Hide, Move Silently, and Sleight of Hand, those using Investigate, Listen, Search, or Spot to detect the Infiltrator’s activity take a –4 penalty.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "DAREDEVIL";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Daredevil, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +2.\n" +
                "Skills: Concentration 6 ranks, Drive 6 ranks.\n" +
                "Feat: Endurance.\n" +
                "Class Information\n" +
                "The following information pertains to the Daredevil advanced class.\n" +
                "Hit Die: 1d10 \n" +
                "Action Points: 6 + one-half character level, rounded down, every time he or she attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Daredevil’s class skills (and the key ability for each skill) are: Balance (Dex), Climb (Str), Concentration (Con), Demolitions (Int), Drive (Dex), Escape Artist (Dex), Intimidate (Cha), Jump (Str), Knowledge (current events, popular culture) (Int), Perform (act) (Cha), Pilot (Dex), Profession (Wis), Read/Write Language (none), Ride (Dex), Speak Language (none), Spot (Wis), Swim (Str), Tumble (Dex).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Daredevil\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+2\t+0\t+0\tFearless\t+1\t+0\n" +
                "2nd\t+1\t+3\t+0\t+0\tNip-up\t+2\t+0\n" +
                "3rd\t+1\t+3\t+1\t+1\tBonus feat\t+2\t+1\n" +
                "4th\t+2\t+4\t+1\t+1\tAction boost\t+3\t+1\n" +
                "5th\t+2\t+4\t+1\t+1\tAdrenaline rush\n" +
                "(one ability score)\t+4\t+1\n" +
                "6th\t+3\t+5\t+2\t+2\tBonus feat\t+4\t+2\n" +
                "7th\t+3\t+5\t+2\t+2\tDelay damage\t+5\t+2\n" +
                "8th\t+4\t+6\t+2\t+2\tAdrenaline rush\n" +
                "(two ability scores)\t+6\t+2\n" +
                "9th\t+4\t+6\t+3\t+3\tBonus feat\t+6\t+3\n" +
                "10th\t+5\t+7\t+3\t+3\tDamage threshold\t+7\t+3\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Daredevil advanced class.\n" +
                "Fearless\n" +
                "A Daredevil gains a +4 morale bonus on Will saves to resist fear effects and on level checks to oppose Intimidate checks.\n" +
                "Nip-Up\n" +
                "A Daredevil of 2nd level or higher can stand up from a prone position as a free action that does not provoke an attack of opportunity.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Daredevil gets a bonus feat. The bonus feat must be selected from the following list, and the Daredevil must meet all the prerequisites of the feat to select it.\n" +
                "Acrobatic, Armor Proficiency (light), Armor Proficiency (me¬di¬um), Athletic, Brawl, Cautious, Dodge, Force Stop, Im-proved Brawl, Improved Damage Threshold, Improved Knockout Punch, Knockout Punch, Mobility, Nimble, Spring Attack, Streetfighting, Surface Vehicle Operation, Toughness, Vehicle Dodge, Vehicle Expert.\n" +
                "Action Boost\n" +
                "This ability, gained at 4th level, allows a Daredevil to spend 2 action points on a single action in a round. A Daredevil can spend 1 action point, see the result of the roll, and then decide to spend a second point, as long as he or she does so before the Gamemaster reveals the result of the action.\n" +
                "Adrenaline Rush\n" +
                "At 5th level, a Daredevil can temporarily increase one of his or her physical ability scores (Strength, Dexterity, or Constitution). The Daredevil spends 1 action point and gets to increase the selected ability score by 1d4+1 points. The increase lasts for a number of rounds equal to his or her class level. At the end of the duration, the Daredevil is fatigued for 1d4+1 rounds.\n" +
                "At 8th level, a Daredevil can temporarily increase two physical ability scores. At the end of the duration, the Daredevil is fatigued for 1d6+2 rounds.\n" +
                "Delay Damage\n" +
                "Once per day, a Daredevil of 7th level or higher can delay the damage dealt by a single attack or effect for a number of rounds equal to his or her class level.\n" +
                "Damage Threshold\n" +
                "A 10th-level Daredevil increases his or her massive damage threshold by 3 points. This increase stacks with the increase provided by the Improved Damage Threshold feat.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "BODYGUARD";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Bodyguard, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +2.\n" +
                "Skills: Concentrate 6 ranks, Intimidate 6 ranks.\n" +
                "Feat: Personal Firearms Proficiency.\n" +
                "Class Information\n" +
                "The following information pertains to the Bodyguard advanced class.\n" +
                "Hit Die: 1d12 \n" +
                "Action Points: 6 + one-half character level, rounded down, every time the Bodyguard attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Bodyguard’s class skills (and the key ability for each skill) are: Concentration (Con), Disguise (Cha), Drive (Dex), Forgery (Int), Gather Information (Cha), Intimidate (Cha), Knowledge (behavioral sciences, civics, current events, streetwise) (Int), Listen (Wis), Profession (Wis), Read/Write Language (none), Search (Int), Sense Motive (Wis), Speak Language (none), Spot (Wis).\n" +
                "Skill Points at Each Level: 3 + Int modifier.\n" +
                "\n" +
                "Table: The Bodyguard\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+1\t+2\t+0\tHarm’s way\t+1\t+0\n" +
                "2nd\t+1\t+2\t+3\t+0\tCombat sense +1\t+1\t+0\n" +
                "3rd\t+2\t+2\t+3\t+1\tBonus feat\t+2\t+1\n" +
                "4th\t+3\t+2\t+4\t+1\tSudden action\t+2\t+1\n" +
                "5th\t+3\t+3\t+4\t+1\tImproved charge\t+3\t+1\n" +
                "6th\t+4\t+3\t+5\t+2\tBonus feat\t+3\t+2\n" +
                "7th\t+5\t+4\t+5\t+2\tDefensive strike\t+4\t+2\n" +
                "8th\t+6\t+4\t+6\t+2\tCombat sense +2\t+4\t+2\n" +
                "9th\t+6\t+4\t+6\t+3\tBonus feat\t+5\t+3\n" +
                "10th\t+7\t+5\t+7\t+3\tBlanket protection +5\t+3\t\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Bodyguard advanced class.\n" +
                "Harm’s Way\n" +
                "Once per round, if the Bodyguard is adjacent to an ally who is targeted by a direct melee or ranged attack (but not an area effect), the Bodyguard can subject him or herself to the attack in the ally’s stead. If the attack hits the Bodyguard, he or her takes damage normally. If it misses, it also misses the ally.\n" +
                "The Bodyguard must declare his or her intention to place him or herself in harm’s way before the attack roll is made. The Bodyguard selects his or her ally either prior to combat or immediately after the Bodyguard makes his or her initiative check. The Bodyguard can’t change his or her ally for the duration of the combat.\n" +
                "Combat Sense\n" +
                "This ability allows a Bodyguard of 2nd level or higher to designate a single opponent during his or her action and receive a +1 competence bonus on attacks against that opponent. The Bodyguard can select a new opponent on any action. \n" +
                "At 8th level, the competence bonus increases to +2.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Bodyguard gets a bonus feat. The bonus feat must be selected from the following list, and the Bodyguard must meet all the prerequisites of the feat to select it.\n" +
                "Advanced Firearms Proficiency, Armor Proficiency (light), Armor Proficiency (medium), Attentive, Combat Expertise, Combat Reflexes, Double Tap, Improved Brawl, Improved Feint, Improved Knockout Punch, Knockout Punch, Precise Shot, Quick Draw, Quick Reload, Streetfighting, Vehicle Expert.\n" +
                "Sudden Action\n" +
                "Once per day, a Bodyguard of 4th level or higher can focus his or her effort to burst into sudden action when the situation calls for it. The Bodyguard can change his or her place in the initiative order, moving higher in the count by a number less than or equal to his or her class level, as the Bodyguard sees fit. The Bodyguard can declare the use of this ability at the start of any round, before anyone else takes an action.\n" +
                "Improved Charge\n" +
                "A Bodyguard of 5th level or higher can make a charge without having to move in a straight line. All other charge rules apply, but the Bodyguard can alter his or her direction when making a charge to avoid obstacles.\n" +
                "Defensive Strike\n" +
                "At 7th level, if an opponent makes a melee attack against the Bodyguard and misses while the Bodyguard is using the total defense option, the Bodyguard can attack that opponent on his or her next turn (as an attack action) with a +4 bonus on his or her attack roll. The Bodyguard gains no bonus against an opponent who doesn’t attack the Bodyguard or against an opponent who makes a successful attack.\n" +
                "Blanket Protection\n" +
                "At 10th level, a Bodyguard can use his expertise to provide protection for up to six allies (not including himself) within sight and voice range of his position.\n" +
                "The Bodyguard spends 1 action point and takes a full-round action to issue orders and directions. Doing this provides the Bodyguard’s allies with a +1 insight bonus to Defense for 3 rounds.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "FIELD SCIENTIST";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Field Scientist, a character must fulfill the following criteria.\n" +
                "Skills: 6 ranks in either Craft (chemical) or Craft (electronic), plus 6 ranks in Knowledge (earth and life sciences), Knowledge (physical sciences), or Knowledge (technology), plus 6 ranks in Research.\n" +
                "Class Information\n" +
                "The following information pertains to the Field Scientist ¬advanced class.\n" +
                "Hit Die: 1d8 \n" +
                "Action Points: 6 + one-half character level, rounded down, every time the Field Scientist attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Field Scientist’s class skills (and the key ability for each skill) are: Computer Use (Int), Craft (chemical, electronic, mechanical, pharmaceutical), Decipher Script (Int), Demolitions (Int), Disable Device (Int), Drive (Dex), Investigate (Int), Knowledge (be¬havioral sciences, earth and life sciences, physical sciences, technology) (Int), Navigate (Int), Pilot (Dex), Profession (Wis), Read/Write Language (none), Research (Int), Search (Int), Speak Language (none).\n" +
                "Skill Points at Each Level: 7 + Int modifier.\n" +
                "\n" +
                "Table: The Field Scientist\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+1\t+1\t+0\tSmart defense\t+0\t+0\n" +
                "2nd\t+1\t+2\t+2\t+0\tScientific improvisation\t+1\t+0\n" +
                "3rd\t+1\t+2\t+2\t+1\tBonus feat\t+1\t+1\n" +
                "4th\t+2\t+2\t+2\t+1\tSkill mastery\t+1\t+1\n" +
                "5th\t+2\t+3\t+3\t+1\tMinor breakthrough\t+2\t+1\n" +
                "6th\t+3\t+3\t+3\t+2\tBonus feat\t+2\t+2\n" +
                "7th\t+3\t+4\t+4\t+2\tSmart survival\t+2\t+2\n" +
                "8th\t+4\t+4\t+4\t+2\tSmart weapon \t+3\t+2\n" +
                "9th\t+4\t+4\t+4\t+3\tBonus feat\t+3\t+3\n" +
                "10th\t+5\t+5\t+5\t+3\tMajor breakthrough\t+3\t+3\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Field Scientist advanced class.\n" +
                "Smart Defense\n" +
                "A Field Scientist applies his or her Intelligence bonus and his or her Dexterity bonus to his or her Defense. Any situation that would deny the Field Scientist his or her Dexterity bonus to Defense also denies the Intelligence bonus.\n" +
                "Scientific Improvisation\n" +
                "At 2nd level, a Field Scientist gains the ability to improvise solutions using common objects and scientific know-how. This ability lets the Field Scientist create objects in a dramatic situation quickly and cheaply, but that have a limited duration.\n" +
                "By spending 1 action point and combining common objects with a Craft check that corresponds to the function desired, the Field Scientist can build a tool or device to deal with any situation. The DC for the Craft check is equal to 5 + the purchase DC of the object that most closely matches the desired function. \n" +
                "Only objects that can normally be used more than once can be improvised. \n" +
                "Electronic devices, special tools, weapons, mechanical devices, and more can be built with scientific improvisation. It takes a full-round action to make an object with scientific improvisation. The object, when put into use, lasts for a number of rounds equal to the Field Scientist’s class level, or until the end of the current encounter, before it breaks down. It can’t be repaired.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Field Scientist gets a bonus feat. The bonus feat must be selected from the following list, and the Field Scientist must meet all the prerequisites of the feat to select it.\n" +
                "Archaic Weapons Proficiency, Attentive, Cautious, Combat Expertise, Educated, Gearhead, Personal Firearms Proficiency, Point Blank Shot, Renown, Studious.\n" +
                "Skill Mastery\n" +
                "At 4th level, a Field Scientist selects a number of skills from his or her class list equal to 3 + his or her Intelligence modifier. When making a skill check using one of these skills, the Field Scientist may take 10 even if stress and distractions would normally prevent him or her from doing so. \n" +
                "Minor Breakthrough\n" +
                "Upon attaining 5th level, a Field Scientist receives credit for a minor scientific breakthrough that earns him or her the recognition of her peers. The Field Scientist chooses one of the following Knowledge skills: behavioral sciences, earth and life sciences, physical sciences, or technology. When dealing with others with at least 1 rank in the same Knowledge skill, the Field Scientist gains a +2 bonus on Reputation checks.\n" +
                "This minor breakthrough also provides the Field Scientist with a +3 Wealth bonus increase.\n" +
                "Smart Survival\n" +
                "A Field Scientist of 7th level or higher can spend 1 action point to reduce the damage dealt by a single attack or effect by 5 points.\n" +
                "Smart Weapon\n" +
                "At 8th level, the Field Scientist selects one weapon that he or she is proficient in and can use with one hand. With the selected weapon, the Field Scientist can use his or her Intelligence modifier instead of Strength or Dexterity modifier on attack rolls.\n" +
                "Major Breakthrough\n" +
                "At 10th level, the Field Scientist gains a +2 bonus on Reputation checks when dealing with individuals who have at least 1 rank in any of the following Knowledge skills: behavioral sciences, earth and life sciences, physical sciences, or technology. This bonus stacks with the bonus provided by the minor breakthrough ability.\n" +
                "This major breakthrough also provides the Field Scientist with a +3 Wealth bonus increase.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "TECHIE";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Techie, a character must fulfill the following criteria.\n" +
                "Skills: Computer Use 6 ranks, either Craft (electronic) 6 ranks or Craft (mechanical) 6 ranks, and Disable Device 6 ranks.\n" +
                "Class Information\n" +
                "The following information pertains to the Techie advanced class.\n" +
                "Hit Die: 1d6\n" +
                "Action Points: 6 + one-half character level, rounded down, every time the Techie attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Techie’s class skills (and the key ability for each skill) are: Computer Use (Int), Craft (electronic, mechanical) (Int), Demolitions (Int), Disable Device (Int), Drive (Dex), Knowledge (behavioral sciences, earth and life sciences, physical sciences, popular culture, technology) (Int), Navigate (Int), Profession (Wis), Read/Write Language (none), Repair (Int), Research (Int), Speak Language (none), Spot (Wis).\n" +
                "Skill Points at Each Level: 7 + Int modifier.\n" +
                "\n" +
                "Table: The Techie\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+0\t+0\t+2\tJury-rig +2\t+1\t+0\n" +
                "2nd\t+1\t+0\t+0\t+3\tExtreme machine\t+1\t+0\n" +
                "3rd\t+1\t+1\t+1\t+3\tBonus feat\t+2\t+1\n" +
                "4th\t+2\t+1\t+1\t+4\tBuild robot\t+2\t+1\n" +
                "5th\t+2\t+1\t+1\t+4\tMastercraft\t+3\t+1\n" +
                "6th\t+3\t+2\t+2\t+5\tBonus feat\t+3\t+2\n" +
                "7th\t+3\t+2\t+2\t+5\tJury-rig +4\t+4\t+2\n" +
                "8th\t+4\t+2\t+2\t+6\tMastercraft\t+4\t+2\n" +
                "9th\t+4\t+3\t+3\t+6\tBonus feat\t+5\t+3\n" +
                "10th\t+5\t+3\t+3\t+7\tMastercraft\t+5\t+3\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Techie advanced class.\n" +
                "Jury-Rig\n" +
                "A Techie gains a +2 competence bonus on Repair skill checks made to attempt temporary or jury-rigged repairs. See the Repair skill for details on jury-rigging.\n" +
                "At 7th level, this competence bonus increases to +4.\n" +
                "Extreme Machine\n" +
                "If it has mechanical or electronic components, a Techie of 2nd level or higher can get maximum performance out of it. \n" +
                "By spending 1 action point and making either a Craft (electronic) or Craft (mechanical) check (whichever is appropriate for the machine in question), the Techie can temporarily improve a machine’s performance—at the risk of causing the machine to need repairs later. The DC for the Craft check depends on the type of improvement being made, as shown on the table below.\n" +
                "Improvement\tCraft DC\tRepair Chance (d%)\n" +
                "Ranged Weapons\t\t\n" +
                "+1 to damage\t15\t01–25\n" +
                "+2 to damage\t20\t01–50\n" +
                "+3 to damage\t25\t01–75\n" +
                "+5 ft. to range increment\t15\t01–25\n" +
                "+10 ft. to range increment\t25\t01–50\n" +
                "Electronic Devices\t\t\n" +
                "+1 equipment bonus\t15\t01–25\n" +
                "+2 equipment bonus\t20\t01–50\n" +
                "+3 equipment bonus\t25\t01–75\n" +
                "Vehicles\t\t\n" +
                "+1 on initiative checks\t20\t01–25\n" +
                "+1 to maneuver\t25\t01–50\n" +
                "+2 to maneuver\t30\t01–75\n" +
                "The Techie performs the extreme modifications in 1 hour. The Techie can’t take 10 or take 20 on this check. If the check succeeds, the effect of the improvement lasts for a number of minutes equal to his or her Techie class level, beginning when the object is first put into use. The Techie selects the single improvement he or she wants to make prior to making the check. After the duration of the effect ends, the machine reverts to its previous state and a repair chance percentile roll is made. The result of this roll indicates whether the machine re¬quires repairs before it can be used again.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Techie gets a bonus feat. The bonus feat must be selected from the following list, and the Techie must meet all the prerequisites of the feat to select it.\n" +
                "Builder, Cautious, Combat Expertise, Educated, Gearhead, Personal Firearms Proficiency, Point Blank Shot, Studious.\n" +
                "Build Robot\n" +
                "A Techie of 4th level or higher can build remote-controlled robots that are Tiny or Diminutive in size. These robots serve as the Techie’s eyes, ears, or hands out to a predetermined distance away from the character when the Techie wants to use one of the following skills: Computer Use, Demolitions, Disable Device, Listen, Repair, or Spot.\n" +
                "The Techie must have at least 1 rank in the skill that he wants to program into the robot. The Techie can only control one robot at a time, and only one of his robots can be active at any time.\n" +
                "Follow these steps to build a robot.\n" +
                "Wealth Check: The purchase DC for the components needed to construct a robot is based on the robot’s size.\n" +
                "Size\tPurchase DC\n" +
                "Diminutive\t18\n" +
                "Tiny\t15\n" +
                "Make the Wealth check to purchase and gather the necessary components prior to starting construction.\n" +
                "Construct Frame: The robot’s body determines its size, shape, locomotion, and hit points. The DC of the Craft (mechanical) check is set by the robot’s size and modified by the form of locomotion selected.\n" +
                "Size\tCraft DC\n" +
                "Diminutive\t15\n" +
                "Tiny\t12\n" +
                "\n" +
                "Components\tDC Modifier\n" +
                "Frame Shape and Locomotion 1\t\n" +
                "Bipedal\t+4\n" +
                "Quadruped\t+3\n" +
                "Treads\t+2\n" +
                "Wheels\t+1\n" +
                "External Components 2\t\n" +
                "Manipulators 3\t+3\n" +
                "Audio/visual sensor\t+2\n" +
                "Remote Range 1\t\n" +
                "Remote control link, 100 feet\t+1\n" +
                "Remote control link, 200 feet\t+3\n" +
                "Remote control link, 300 feet\t+5\n" +
                "1 Select only one of the options in this category.\n" +
                "2 Select one or more of the options in this category.\n" +
                "3 Necessary for a robot built to use any skill except Listen or Spot.\n" +
                "Select a frame size and form, add manipulators and sensors as necessary, and choose a type of remote control link. Add all the modifiers to determine the check’s DC. Make the Craft (mechanical) check to construct the robot’s frame.\n" +
                "It takes a Techie 30 hours to construct a Diminutive robot frame or 12 hours to construct a Tiny robot frame.\n" +
                "A Diminutive robot can be 6 to 12 inches long or tall and weighs about 1 pound. A Tiny robot can be 13 to 24 inches long or tall and weighs up to 3 pounds. Statistics for these robots can be found in the Creature listings.\n" +
                "Construct the Electronics: The next step is to build the internal electronics for the robot and install them in the frame. The DC is based on the size of the robot and modified by the number of components that need to be wired together. For a Diminutive robot, the DC is 20. For a Tiny robot, the DC is 15. Add +1 to the DC for each external component and +2 for the remote link. Make the Craft (electronic) check.\n" +
                "It takes a Techie 12 hours to wire a Diminutive robot or 6 hours to wire a Tiny robot.\n" +
                "Program the Robot: The Techie programs the robot as the final step. Decide how many ranks of the appropriate skill to program into the robot, up to the number of ranks the Techie has in the skill. A Techie’s robot can only contain programming for one skill. Make the Computer Use check to program the robot.\n" +
                "The DC for the Computer Use check is 20, modified by the number of ranks the Techie wants to program into the robot (+1 to the DC for each rank). It takes 1 hour to program the robot.\n" +
                "Reprogramming: A robot can be reprogrammed at any time. Doing this requires 1 hour of work and a Computer Use check (DC 20 + the number of ranks programmed into the robot).\n" +
                "Mastercraft\n" +
                "At 5th level, the Techie becomes adept at creating mastercraft objects. He of she applies the mastercraft ability to one of his or her Craft skills (electronic or mechanical). From this point on, he or she can build mastercraft objects using that skill.\n" +
                "With Craft (electronic), the Techie can build electronic devices. With Craft (mechanical), the Techie can build mechanical devices, including weapons.\n" +
                "On average, it takes twice as long to build a mastercraft object as it does to build an ordinary object of the same type. The cost to build a mastercraft object is equal to the purchase DC for the components (see the appropriate Craft skill description) + the bonus provided by the mastercraft feature. A Techie can add the mastercraft feature to an existing ordinary object by making the Wealth check and then making the Craft check as though he or she were constructing the object from scratch.\n" +
                "In addition to the Wealth check, the Techie must also pay a cost in experience points equal to 25 x his or her Techie level x the bonus provided by the mastercraft feature. The XP must be paid before making the Craft check. If the expenditure of these XP would drop the Techie to below the minimum needed for his or her current level, then the XP can’t be paid and the Techie can’t use the mastercraft ability until he or she gains enough additional XP to remain at his or her current level after the expenditure is made.\n" +
                "When successfully completed, a mastercraft object provides a +1 bonus to its quality compared to an ordinary object of the same type. All weapons and armor, and certain other types of equipment, such as computers and electronic devices, can be constructed as mastercraft objects.\n" +
                "At 8th level, the Techie can add the mastercraft ability to another Craft skill, or he or she can improve his or her ability in the skill selected at 5th level, so that his or her mastercraft objects provide a +2 bonus.\n" +
                "At 10th level, the Techie adds another +1 bonus to his or her mastercraft ability. If the Techie focuses his or her ability on one Craft skill, his or her mastercraft objects now provide a +3 bonus. If the Techie already has the ability for both Craft skills, he or she chooses which one to improve to a +2 bonus.\n" +
                "The Craft DC for a mastercraft object is the same as for a normal object of the same type, as described in the Craft skill, with the following modification: For a +1 object, add +3 to the Craft DC; for a +2 object, add +5 to the Craft DC; and for a +3 object, add +10 to the Craft DC.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "FIELD MEDIC";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Field Medic, a character must fulfill the following ¬criteria.\n" +
                "Base Attack Bonus: +2.\n" +
                "Skills: Treat Injury 6 ranks, Spot 6 ranks.\n" +
                "Feat: Surgery.\n" +
                "Class Information\n" +
                "The following information pertains to the Field Medic advanced class.\n" +
                "Hit Die: 1d8 \n" +
                "Action Points: 6 + one-half character level, rounded down, every time the Field Medic attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Field Medic’s class skills (and the key ability for each skill) are: Computer Use (Int), Concentration (Con), Craft (pharmaceutical) (Int), Diplomacy (Cha), Drive (Dex), Knowledge (behavioral sciences, current events, earth and life sciences, popular culture, technology) (Int), Listen (Wis), Pilot (Dex), Profession (Wis), Read/Write Language (none), Research (Int), Speak Language (none), Spot (Wis), Treat Injury (Wis).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Field Medic\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+2\t+0\t+1\tMedical specialist +1\t+1\t+1\n" +
                "2nd\t+1\t+3\t+0\t+2\tExpert healer\t+1\t+1\n" +
                "3rd\t+1\t+3\t+1\t+2\tBonus feat\t+2\t+1\n" +
                "4th\t+2\t+4\t+1\t+2\tMedical mastery\t+2\t+2\n" +
                "5th\t+2\t+4\t+1\t+3\tMedical specialist +2\t+3\t+2\n" +
                "6th\t+3\t+5\t+2\t+3\tBonus feat\t+3\t+2\n" +
                "7th\t+3\t+5\t+2\t+4\tMinor medical miracle\t+4\t+3\n" +
                "8th\t+4\t+6\t+2\t+4\tMedical specialist +3\t+4\t+3\n" +
                "9th\t+4\t+6\t+3\t+4\tBonus feat\t+5\t+3\n" +
                "10th\t+5\t+7\t+3\t+5\tMedical miracle\t+5\t+4\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Field Medic advanced class.\n" +
                "Medical Specialist\n" +
                "The Field Medic receives a competence bonus on Treat Injury checks. At 1st level, the bonus is +1. It increases to +2 at 5th level, and to +3 at 8th level.\n" +
                "Expert Healer\n" +
                "At 2nd level and higher, the Field Medic’s ability to restore hit points with a medical kit or surgery kit and a successful use of the Treat Injury skill improves. In addition to the normal hit point recovery rate (1d4 for a medical kit, 1d6 per patient’s character level for surgery), the Field Medic restores 1 hit point for every level he or she has in this advanced class.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Field Medic gets a bonus feat. The bonus feat must be selected from the following list, and the Field Medic must meet all the prerequisites of the feat to select it.\n" +
                "Armor Proficiency (light), Armor Proficiency (medium), Cautious, Defensive Martial Arts, Dodge, Educated, Im¬proved Initiative, Medical Expert, Personal Firearms Proficiency, Surface Vehicle Operation, Vehicle Expert.\n" +
                "Medical Mastery\n" +
                "When making a Treat Injury skill check, a Field Medic of 4th level or higher may take 10 even if stress and distractions would normally prevent him or her from doing so. \n" +
                "Minor Medical Miracle\n" +
                "At 7th level or higher, a Field Medic can save a character reduced to –10 hit points or lower. If the Field Medic is able to administer aid within 3 rounds of the character’s death, he or she can make a Treat Injury check. The DC for this check is 30, and the Field Medic can’t take 10 or take 20. If the check succeeds, the dead character can make a Fortitude save (DC 15) to stabilize and be restored to 0 hit points. \n" +
                "If the Field Medic fails the skill check or the patient fails the save, the dead character can’t be saved.\n" +
                "Medical Miracle\n" +
                "At 10th level, a Field Medic can revive a character reduced to –10 hit points or lower. If the Field Medic is able to administer aid within 3 minutes of the character’s death, he or she can make a Treat Injury check. The DC for this check is 40, and the Field Medic can’t take 10 or take 20. If the check succeeds, the dead character can make a Fortitude save (DC 20) to stabilize and be restored to 1d6 hit points.\n" +
                "If the Field Medic fails the skill check or the patient fails the Fortitude save, the dead character can’t be restored.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "INVESTIGATOR";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become an Investigator, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +2.\n" +
                "Skills: Investigate 6 ranks, Listen 6 ranks, Sense Motive 6 ranks.\n" +
                "Class Information\n" +
                "The following information pertains to the Investigator advanced class.\n" +
                "Hit Die: 1d6\n" +
                "Action Points: 6 + one-half character level, rounded down, every time the Investigator attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Investigator’s class skills (and the key ability for each skill) are: Bluff (Cha), Computer Use (Int), Disable Device (Dex), Drive (Dex), Forgery (Int), Gather Information (Cha), Intimidate (Cha), Investigate (Int), Knowledge (behavioral sciences, civics, current events, streetwise) (Int), Listen (Wis), Profession (Wis), Read/_Write Language (none), Research (Int), Search (Int), Sense Motive (Wis), Speak Language (none), Spot (Wis).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Investigator\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+0\t+1\t+1\tProfile\t+1\t+1\n" +
                "2nd\t+1\t+0\t+2\t+2\tContact, low-level\t+1\t+1\n" +
                "3rd\t+2\t+1\t+2\t+2\tBonus feat\t+2\t+1\n" +
                "4th\t+3\t+1\t+2\t+2\tNonlethal force\t+2\t+2\n" +
                "5th\t+3\t+1\t+3\t+3\tContact, mid-level\t+3\t+2\n" +
                "6th\t+4\t+2\t+3\t+3\tBonus feat\t+3\t+2\n" +
                "7th\t+5\t+2\t+4\t+4\tDiscern lie\t+4\t+3\n" +
                "8th\t+6\t+2\t+4\t+4\tContact, high-level\t+4\t+3\n" +
                "9th\t+6\t+3\t+4\t+4\tBonus feat\t+5\t+3\n" +
                "10th\t+7\t+3\t+5\t+5\tSixth sense\t+5\t+4\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Investigator advanced class.\n" +
                "Profile\n" +
                "By making a Gather Information check (DC 15) when talking to witnesses of a crime, the Investigator compiles a rough mental picture of the suspect. This mental picture provides a physical description, including distinguishing markings and visible mannerisms. Success makes the profile accurate, at least concerning a particular suspect as seen by witnesses. (For this Gather Information check, no money changes hands.)\n" +
                "The Investigator can expand the profile by making an Investigate check (DC 15) involving the crime scene or other evidence linked to the suspect. If successful, the Investigator combines eyewitness accounts with forensic evidence to develop a profile of the suspect’s method of operation. This provides a +2 circumstance bonus on any skill checks made to uncover additional evidence or otherwise locate and capture the suspect.\n" +
                "Contact\n" +
                "An Investigator of 2nd level or higher cultivates associates and informants. Each time the Investigator gains a contact, the GM should develop a supporting character to represent the contact. The player can suggest the type of contact his or her character wants to gain, but the contact must be an ordinary character, not a heroic character.\n" +
                "A contact will not accompany an Investigator on missions or risk his or her life. A contact can, however, provide information or render a service (make a specific skill check on the Investigator’s behalf).\n" +
                "At 2nd level, the Investigator gains a low-level contact, at 5th level a mid-level contact, and at 8th level a high-level contact.\n" +
                "The Investigator can’t call on the same contact more than once in a week, and when he or she does call on a contact, compensation may be required for the assistance the contact renders. In general, a professional associate won’t be compensated monetarily, but instead will consider that the Investigator owes him or her a favor. Contacts with underworld or street connections usually demand monetary compensation for the services they render, and experts in the use of skills normally want to be paid for the services they provide.\n" +
                "For underworld or street contacts, this expense is represented by a Wealth check against a purchase DC of 10 for the low-level contact, 15 for the mid-level contact, or 20 for the high-level contact. For skilled experts, the purchase DC is 10 + the ranks the expert has in the appropriate skill.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Investigator gets a bonus feat. The bonus feat must be selected from the following list, and the Investigator must meet all the prerequisites of the feat to select it.\n" +
                "Advanced Firearms Proficiency, Armor Proficiency (light), Armor Proficiency (medium), Brawl, Defensive Martial Arts, Dodge, Double Tap, Educated, Knockout Punch, Personal Firearms Proficiency, Point Blank Shot.\n" +
                "Nonlethal Force\n" +
                "At 4th level, an Investigator becomes adept at using nonlethal force to subdue an opponent. From this point on, he or she can deal nonlethal damage with a weapon that normally deals lethal damage (if he or she so chooses) without taking the normal –4 penalty on the attack roll.\n" +
                "Discern Lie\n" +
                "At 7th level, an Investigator develops the ability to gauge whether another character is telling the truth by reading facial expressions and interpreting body language. The Investigator must be able to see and hear (but not necessarily understand) the individual under scrutiny.\n" +
                "With a successful Sense Motive check opposed by the subject’s Bluff check result or against DC 10 (whichever is greater), the Investigator can tell whether the subject is deliberately and knowingly speaking a lie. This ability doesn’t reveal the truth, uncover unintentional inaccuracies, or necessarily reveal omissions in information.\n" +
                "Sixth Sense\n" +
                "At 10th level, an Investigator becomes so attuned at solving mysteries that he or she finds a way to put two and two together and rarely misses a clue. Whenever the Investigator spends 1 action point to improve the result of a skill check made using certain skills (see below), the Investigator gets to add an additional 1d6 to the result. \n" +
                "The skills that sixth sense applies to are Gather Information, Investigate, Listen, Research, Search, and Spot.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "PERSONALITY";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Personality, a character must fulfill the following criteria.\n" +
                "Skills: Diplomacy 6 ranks, Perform (select one) 6 ranks.\n" +
                "Feat: Renown.\n" +
                "Class Information\n" +
                "The following information pertains to the Personality advanced class.\n" +
                "Hit Die: 1d6\n" +
                "Action Points: 6 + one-half character level, rounded down, every time the Personality attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Personality’s class skills (and the key ability for each skill) are: Bluff (Cha), Craft (visual arts) (Int), Craft (writing) (Int), Diplomacy (Cha), Knowledge (art, behavioral sciences, business, civics, current events, popular culture) (Int), Perform (act, dance, sing, stand-up) (Cha), Profession (Wis), Read/_Write Language (none), Speak Language (none).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Personality\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+1\t+1\t+0\tUnlimited access\t+0\t+2\n" +
                "2nd\t+1\t+2\t+2\t+0\tBonus class skill\t+1\t+2\n" +
                "3rd\t+1\t+2\t+2\t+1\tBonus feat\t+1\t+2\n" +
                "4th\t+2\t+2\t+2\t+1\tRoyalty\t+1\t+3\n" +
                "5th\t+2\t+3\t+3\t+1\tWinning smile\t+2\t+3\n" +
                "6th\t+3\t+3\t+3\t+2\tBonus feat\t+2\t+3\n" +
                "7th\t+3\t+4\t+4\t+2\tBonus class skill\t+2\t+4\n" +
                "8th\t+4\t+4\t+4\t+2\tRoyalty\t+3\t+4\n" +
                "9th\t+4\t+4\t+4\t+3\tBonus feat\t+3\t+4\n" +
                "10th\t+5\t+5\t+5\t+3\tCompelling performance\t+3\t+5\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Personality advanced class.\n" +
                "Unlimited Access\n" +
                "When others would normally make a Diplomacy check or Bluff check to smooth-talk or trick their way into a private party or invitation-only event, the Personality adds a bonus equal to his or her Personality level. \n" +
                "When a Personality buys a ticket to a show or for transportation, he or she can make a Diplomacy check to get that ticket upgraded.  DCs are given below.\n" +
                "Upgrade\tDiplomacy DC\n" +
                "Seat at sporting event to field pass\t10\n" +
                "Hotel room to suite\t15\n" +
                "Concert or theater ticket to backstage pass\t20\n" +
                "Economy transportation to first-class\t25\n" +
                "Bonus Class Skill\n" +
                "At 2nd and again at 7th level, the Personality designates one cross-class skill as a class skill. Once designated, the skill is considered a class skill every time the character adds a new level of Personality.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Personality gets a bonus feat. The bonus feat must be selected from the following list, and the Personality must meet all the prerequisites of the feat to select it.\n" +
                "Alertness, Animal Affinity, Combat Expertise, Confident, Creative, Deceptive, Defensive Martial Arts, Educated, Trustworthy.\n" +
                "Royalty\n" +
                "At 4th and 8th level, a Personality’s activities in the public eye generate extra income. This income provides a Wealth bonus increase of +4.\n" +
                "Winning Smile\n" +
                "At 5th level, a Personality develops such a force of personal magnetism that he or she can convince a single target to regard him or her as a trusted friend. (If the target is currently being threatened or attacked by the Personality or his or her allies, this ability won’t work.)\n" +
                "The target makes a Will saving throw to avoid being persuaded by the Personality’s words and actions. The DC is 10 + Personality’s class level + Personality’s Charisma bonus.\n" +
                "This ability doesn’t enable the Personality to control the target, but the target perceives the Personality’s words and actions in the most favorable way. The Personality can try to give the target orders, but he or she must win an opposed Charisma check to convince the target to perform any actions the target wouldn’t normally undertake. The target never obeys suicidal or obviously harmful orders, and any act by the Personality or his or her allies that threatens the target breaks the mood and clears the target’s head. Otherwise, a target remains won over for 1 minute per Personality level.\n" +
                "After the duration expires, the GM determines the reaction and attitude of the target based on what the Personality compelled the target to do. \n" +
                "This is a Mind-Affecting ability.\n" +
                "Compelling Performance\n" +
                "At 10th level, a Personality’s force of personal magnetism increases to the point that he or she can arouse a single emotion of his or her choice—despair, hope, or rage—in a target. To use this ability, the Personality must spend 1 action point. The emotion he or she arouses affects one target (a GM character) within 15 feet of the Personality (or within 15 feet of a television, radio, or telephone that broadcasts the Personality’s performance). The performance requires a full-round action, and its effects on the target last for 1d4+1 rounds.\n" +
                "The target makes a Will saving throw. The DC is 10 + Personality’s class level + Personality’s Charisma bonus. If the target succeeds at the saving throw, he or she is immune to the compulsion of this performance. If the target fails, he or she reacts to the emotion as described below.\n" +
                "Despair: The target takes a –2 morale penalty on saving throws, attack rolls, ability checks, skill checks, and weapon damage rolls.\n" +
                "Hope: The target gains a +2 morale bonus on saving throws, attack rolls, ability checks, skill checks, and weapon damage rolls.\n" +
                "Rage: The target gains a +2 morale bonus to Strength and Constitution, a +1 morale bonus on Will saves, and a –1 penalty to Defense. In a dramatic situation, the target is compelled to fight, regardless of the danger.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "NEGOTIATOR";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Negotiator, a character must fulfill the following criteria.\n" +
                "Skills: Bluff 6 ranks, Diplomacy 6 ranks.\n" +
                "Feat: Alertness.\n" +
                "Class Information\n" +
                "The following information pertains to the Negotiator advanced class.\n" +
                "Hit Die: 1d8\n" +
                "Action Points: 6 + one-half character level, rounded down, every time the Negotiator attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Negotiator’s class skills (and the key ability for each skill) are: Bluff (Cha), Computer Use (Int), Diplomacy (Cha), Drive (Dex), Gamble (Wis), Gather Information (Cha), Intimidate (Cha), Investigate (Int), Knowledge (behavioral sciences, business, civics, current events, popular culture, streetwise) (Int), Profession (Wis), Read/Write Language (none), Sense Motive (Wis), Speak Language (none), Spot (Wis).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Negotiator\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+1\t+0\t+2\tConceal motive\t+0\t+1\n" +
                "2nd\t+1\t+2\t+0\t+3\tReact first\t+1\t+1\n" +
                "3rd\t+2\t+2\t+1\t+3\tBonus feat\t+1\t+1\n" +
                "4th\t+3\t+2\t+1\t+4\tTalk down one opponent\t+1\t+2\n" +
                "5th\t+3\t+3\t+1\t+4\tNo sweat\t+2\t+2\n" +
                "6th\t+4\t+3\t+2\t+5\tBonus feat\t+2\t+2\n" +
                "7th\t+5\t+4\t+2\t+5\tTalk down several opponents\t+2\t+3\n" +
                "8th\t+6\t+4\t+2\t+6\tSow distrust\t+3\t+3\n" +
                "9th\t+6\t+4\t+3\t+6\tBonus feat\t+3\t+3\n" +
                "10th\t+7\t+5\t+3\t+7\tTalk down all opponents\t+3\t+4\n" +
                "\n" +
                "Class Features\n" +
                "All of the following are features of the Negotiator advanced class.\n" +
                "Conceal Motive\n" +
                "A Negotiator gets to add a bonus equal to his or her Negotiator level whenever he or she opposes a Sense Motive check.\n" +
                "React First\n" +
                "Starting at 2nd level, a Negotiator gains the ability to react first when trying to make a deal or mediate a settlement. The Negotiator must make contact and speak to the participants prior to the start of combat. If he or she does this, he or she gains a free readied action that allows the Negotiator to make either a move or attack action if either side in the negotiation (other than the Negotiator) decides to start hostilities. The Negotiator gets to act before any initiative checks are made, in effect giving him or her the benefit of surprise.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Negotiator gets a bonus feat. The bonus feat must be selected from the following list, and the Negotiator must meet all the prerequisites of the feat to select it.\n" +
                "Advanced Firearms Proficiency, Armor Proficiency (light), Armor Proficiency (medium), Attentive, Confident, Dead Aim, Deceptive, Educated, Far Shot, Iron Will, Personal Firearms Proficiency, Trustworthy.\n" +
                "Talk Down\n" +
                "A Negotiator of 4th level or higher can talk his or her way out of trouble. Either prior to the start of hostilities or during combat, the Negotiator can talk down a single opponent within 15 feet of his or her position or otherwise able to hear the Negotiator’s voice. The target must be able to understand the Negotiator. That opponent immediately stops fighting and reverts to an indifferent attitude regarding the Negotiator and the situation in general. Any hostile action by the Negotiator or by one of the Negotiator’s allies directed at the opponent allows the opponent to act as he or she sees fit.\n" +
                "To initiate this talent, the Negotiator must spend a full-round action talking to his or her opponent. The opponent makes a Will saving throw. The DC is equal to 10 + Negotiator’s class level + Negotiator’s Charisma bonus. If the save fails, the opponent stops fighting. If the save succeeds, the opponent continues as normal.\n" +
                "At 7th level, a Negotiator can talk down a number of opponents equal to his or her Charisma bonus within 15 feet of his or her position or within 15 feet of a television, radio, or telephone broadcasting the Negotiator’s message.\n" +
                "At 10th level, the range extends to 30 feet and covers all opponents who can hear and understand the Negotiator’s voice.\n" +
                "This is a Mind-Affecting ability.\n" +
                "No Sweat\n" +
                "Starting at 5th level, whenever a Negotiator spends 1 action point to improve the result of a die roll, he or she rolls an additional 1d6. The Negotiator can then select the highest die roll to add to his or her d20 roll.\n" +
                "Sow Distrust\n" +
                "A Negotiator of 8th level or higher can turn one character against another. The Negotiator must spend a full-round action and know the name of the character he or she is attempting to persuade as well as the name of the character toward whom the target’s distrust will be directed. The target must be able to hear and understand the Negotiator.\n" +
                "The target makes a Will save. The DC is equal to 10 + Negotiator’s class level + Negotiator’s Charisma bonus. If the target fails the save, his or her attitude toward the other designated character worsens by one step: helpful turns to friendly, friendly to indifferent, indifferent to unfriendly, unfriendly to hostile (see the Diplomacy skill). The target makes a Will save whenever the Negotiator uses this talent against him or her. As long as the target continues to fail the Will save, the Negotiator can continue taking full-round actions to worsen the target’s attitude toward a designated character. When the target’s attitude drops to hostile, he or she attacks the designated character.\n" +
                "A successful Will save doesn’t restore previous attitude shifts, but it does render the target immune for 24 hours to further attempts by the Negotiator to sow distrust.\n" +
                "The Negotiator can’t use this talent on his or her allies.\n" +
                "This is a Mind-Affecting ability.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "SHADOW SLAYER";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Shadow Slayer, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +3.\n" +
                "Feats: Archaic Weapons Proficiency.\n" +
                "Class Information\n" +
                "The following information pertains to the Shadow Slayer advanced class.\n" +
                "Hit Die\n" +
                "The Shadow Slayer gains 1d8 hit points per level. The character’s Constitution modifier applies.\n" +
                "Action Points\n" +
                "The Shadow Slayer gains a number of action points equal to 6 + one-half his character level, rounded down, every time he attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Shadow Slayer’s class skills are as follows.\n" +
                "Balance (Dex), Climb (Str), Concentration (Con), Gather Information (Cha), Intimidate (Cha), Jump (Str), Knowledge (current events, popular culture, streetwise) (Int), Listen (Wis), Profession (Wis), Read/Write Language (none), Sense Motive (Wis), Speak Language (none), Spot (Wis), Tumble (Dex).\n" +
                "Skill Points at Each Level: 3 + Int modifier.\n" +
                "\n" +
                "Table: The Shadow Slayer\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+1\t+1\t+1\t+1\tDetect Shadow\t+1\t+0\n" +
                "2nd\t+2\t+2\t+2\t+2\tShadow immunity\t+1\t+0\n" +
                "3rd\t+3\t+2\t+2\t+2\tBonus feat\t+2\t+0\n" +
                "4th\t+4\t+2\t+2\t+2\tSlayer weapon\t+2\t+0\n" +
                "5th\t+5\t+3\t+3\t+3\tShadow enemy\t+3\t+1\n" +
                "6th\t+6\t+3\t+3\t+3\tBonus feat\t+3\t+1\n" +
                "7th\t+7\t+4\t+4\t+4\tShadow enemy\t+4\t+1\n" +
                "8th\t+8\t+4\t+4\t+4\tFast healing\t+4\t+1\n" +
                "9th\t+9\t+4\t+4\t+4\tBonus feat\t+5\t+2\n" +
                "10th\t+10\t+5\t+5\t+5\tWord of slaying\t+5\t+2\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Shadow Slayer advanced class.\n" +
                "Detect Shadow\n" +
                "A Shadow Slayer is uncannily aware of the denizens of Shadow and the true nature of reality. Once per day per the Slayer’s level in this advanced class, the Shadow Slayer can sense the presence of a denizen of Shadow. In most campaigns any creatures other than humans, animals, and vermin are considered denizens of Shadow. Using this talent is an attack action that requires concentration. It has a range of 30 feet and lasts as long as the Slayer concentrates, up to a number of rounds equal to the Slayer’s level in this advanced class.\n" +
                "The amount of information gleaned by this uncanny awareness depends on how long the Slayer focuses his attention.\n" +
                "1st Round: Presence or absence of Shadow creatures.\n" +
                "2nd Round: Number of Shadow auras (creatures or objects of Shadow) in the area and the power of the strongest Shadow aura present. If the power of the strongest Shadow aura is “overwhelming,” and has a rating of at least twice the Shadow Slayer’s character level, the Slayer is stunned for 1 round and the use of this ability ends. While stunned, the Slayer can’t act, he loses any Dexterity bonus to Defense, and attackers gain a +2 bonus on attacks made against him.\n" +
                "3rd Round: The power of each Shadow aura in the area becomes clear. If an aura is outside the Slayer’s line of sight, then he discerns its direction but not its exact location.\n" +
                "Shadow Aura: A creature of Shadow emanates an aura that links it to the supernatural dimension. The power of a Shadow aura depends on the type of creature or object emitting the aura and its Hit Dice or caster level.\n" +
                "Creature/Object\tRating\n" +
                "Outsider\tHD\n" +
                "Magic item or spell\tCaster level x 1/2\n" +
                "Aberration, construct, dragon, elemental, undead creature\tHD x 1/2\n" +
                "All other denizens of Shadow\tHD x 1/5\n" +
                "\n" +
                "Rating\tAura Power\n" +
                "1 or lower\tFaint\n" +
                "2–4\tModerate\n" +
                "5–10\tStrong\n" +
                "11 or higher\tOverwhelming\n" +
                "If an aura falls into more than one strength category (for instance, if a creature and a magic item are in the same place and each emits an aura), the ability indicates the stronger of the two.\n" +
                "Length Aura Lingers: How long a Shadow aura lingers after the creature or object has vacated the location depends on the aura’s original strength.\n" +
                "\n" +
                "Original Aura Power\tDuration\n" +
                "Faint\t1d6 minutes\n" +
                "Moderate\t1d6 x 10 minutes\n" +
                "Strong\t1d6 hours\n" +
                "Overwhelming\t1d6 days\n" +
                "Each round, a Shadow Slayer can turn to detect the presence of Shadow in a new area. The ability can penetrate barriers, but 1 foot of stone, 1 inch of metal, or 3 feet of wood or dirt blocks it.\n" +
                "\n" +
                "Shadow Immunity\n" +
                "At 2nd level, a Shadow Slayer gains damage reduction against the natural weapons of the denizens of Shadow (claws, bite, and so on). Shadow immunity doesn’t reduce the damage dealt by firearms, melee weapons, or hazardous effects. The damage reduction is equal to one-half of the Slayer’s level in this advanced class, rounded down.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Shadow Slayer gets a bonus feat. The bonus feat must be selected from the following list, and the Shadow Slayer must meet all the prerequisites of the feat to select it.\n" +
                "Acrobatic, Advanced Combat Martial Arts, Alertness, Cleave, Combat Reflexes, Defensive Martial Arts, Elusive Target, Exotic Melee Weapon Proficiency, Great Cleave, Power Attack, Unbalance Opponent.\n" +
                "Slayer Weapon\n" +
                "At 4th level, a Shadow Slayer gains the ability to empower any melee weapon he wields. An empowered weapon behaves like a magic weapon in the hands of the Shadow Slayer, providing an enhancement bonus equal to one-half of the Slayer’s level in this advanced class, rounded down. (At 4th level, the enhancement bonus is +2.) This bonus allows the weapon to deal extra damage and to hurt creatures with damage reduction.\n" +
                "Any melee weapon can be empowered by the Shadow Slayer, including the Shadow Slayer’s unarmed strikes. It takes a full-round action to empower a weapon. An empowered weapon only acts as an empowered weapon in the hands of the Shadow Slayer who empowered it. The enhancement bonus lasts for a number of rounds equal to the Shadow Slayer’s level in this advanced class.\n" +
                "Shadow Enemy\n" +
                "At 5th and 7th level, a Shadow Slayer selects a type of Shadow creature as a favored enemy. Due to his extensive study of these foes and training in the proper techniques for combating them, the Shadow Slayer gains a +1 bonus on Bluff, Listen, Search, Sense Motive, and Spot checks when using these skills against creatures of this type. He also gets a +1 bonus on weapon damage rolls against creatures of this type.\n" +
                "At each level after 5th, the Shadow Slayer may add +1 to the value of the bonus against each of his favored enemy types.\n" +
                "Shadow Enemy Type\n" +
                "Aberration\n" +
                "Construct\n" +
                "Dragon\n" +
                "Elemental\n" +
                "Fey\n" +
                "Giant\n" +
                "Humanoid\n" +
                "Lycanthrope\n" +
                "Magical beast\n" +
                "Monstrous humanoid\n" +
                "Outsider\n" +
                "Undead\n" +
                "\n" +
                "Fast Healing\n" +
                "Starting at 8th level, a Shadow Slayer gains the ability of fast healing. Every round, the Shadow Slayer recovers a number of hit points equal to one-half his level in this advanced class. So, as an 8th-level Shadow Slayer, he recovers 4 hit points every round.\n" +
                "Word of Slaying\n" +
                "At 10th level, a Shadow Slayer comes into his full power. By spending 1 action point and using an attack action, the Shadow Slayer can utter a word of power that can devastate creatures of Shadow. The word of slaying affects any denizens of Shadow within 15 feet of the Slayer. The ill effects depend on the Hit Dice of the creatures, as shown below.\n" +
                "\n" +
                "HD\tEffect\n" +
                "12 or more\tDazed\n" +
                "8–11\tStunned\n" +
                "4–7\tParalyzed\n" +
                "3 or less\tKilled\n" +
                "\n" +
                "A dazed creature can’t act for 1d4 rounds. A stunned creature is stunned for 2d4 rounds. A paralyzed creature can’t move or act for 1d10 minutes. A killed creature dies (if it is living) or is destroyed (if it is a construct or an undead).\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "OCCULTIST";
        tmp.description = "";
        tmp.heroContent = "The fastest path into this advanced class is from the Smart hero basic class, though other paths are possible.\n" +
                "Requirements\n" +
                "To qualify to become an Occultist, a character must fulfill the following criteria.\n" +
                "Skills: Decipher Script 6 ranks, Knowledge (arcane lore) 6 ranks, Research 6 ranks.\n" +
                "Feats: Educated, Studious.\n" +
                "Class Information\n" +
                "The following information pertains to the Occultist advanced class.\n" +
                "Hit Die\n" +
                "The Occultist gains 1d6 hit points per level. The character’s Constitution modifier applies.\n" +
                "Action Points\n" +
                "The Occultist gains a number of action points equal to 6 + one-half her character level, rounded down, every time she attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Occultist’s class skills are as follows.\n" +
                "Craft (visual arts, writing) (Int), Decipher Script (Int), Drive (Dex), Escape Artist (Dex), Forgery (Int), Investigate (Int), Knowledge (arcane lore, history, theology and philosophy) (Int), Profession (Wis), Read/Write Language (none), Re¬ search (Int), Sleight of Hand (Dex), Speak Language (none), Use Magic Device (Cha).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Occultist\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+0\t+0\t+1\tArcane skills, spell resistance\t+0\t+0\n" +
                "2nd\t+1\t+0\t+0\t+2\tArcane research (scrolls)\t+1\t+0\n" +
                "3rd\t+1\t+1\t+1\t+2\tBonus feat\t+1\t+1\n" +
                "4th\t+2\t+1\t+1\t+2\tShadow contact\t+1\t+1\n" +
                "5th\t+2\t+1\t+1\t+3\tBind Shadow creature\t+2\t+1\n" +
                "6th\t+3\t+2\t+2\t+3\tBonus feat\t+2\t+2\n" +
                "7th\t+3\t+2\t+2\t+4\tArcane research (items)\t+2\t+2\n" +
                "8th\t+4\t+2\t+2\t+4\tBind Shadow creature\t+3\t+2\n" +
                "9th\t+4\t+3\t+3\t+4\tBonus feat\t+3\t+3\n" +
                "10th\t+5\t+3\t+3\t+5\tBanish\t+3\t+3\n" +
                "\n" +
                "Class Features\n" +
                "The following features pertain to the Occultist advanced class.\n" +
                "Arcane Skills\n" +
                "An Occultist has access to the following arcane skills. These skills are considered class skills for the Occultist, and she can use her skill points to buy ranks in them, just like other skills in the game.\n" +
                "\n" +
                "Concentration (Con): The normal Concentration skill expands to include arcane applications, as defined below.\n" +
                "Check: You must make a Concentration check whenever you may potentially be distracted while engaged in an activity, including casting a spell or concentrating on an active spell, that requires your full attention.\n" +
                "If the check succeeds, you may continue with the action as normal. If the check fails, the action automatically fails and is wasted. If you were in the process of casting a spell, the spell is lost. If you were concentrating on an active spell, the spell ends.\n" +
                "The table in the Concentration skill description summarizes the various types of distractions. In situations where the distraction occurs while you are casting a spell, you add the level of the spell to the DC.\n" +
                "Try Again?: You can try again, but doing so doesn’t cancel the effects of a previous failure. If you lost a spell, the spell is lost.\n" +
                "Special: By making a check (DC 15 + spell level), you can use Concentration to cast a spell defensively, thus avoiding attacks of opportunity. If the check succeeds, you can attempt the casting without incurring any attacks of opportunity.\n" +
                "\n" +
                "Use Magic Device (Cha): Trained only. Use this skill to activate magic devices, including scrolls and wands, that you could not otherwise activate.\n" +
                "Check: You can use this skill to read a spell from a scroll or spellbook or activate a magic item. This skill lets you use a magic item as if you had the spell ability or class features of another class or a different allegiance. \n" +
                "When you’re attempting to activate a magic item using this skill, you do so as an attack action. However, the checks you make to determine whether you are successful at activating the item take no time by themselves and are included in the activate magic item attack action.\n" +
                "You make Use Magic Device checks each time you activate a device such as a scroll or a wand. If you are using the check to emulate some quality in an ongoing manner, you need to make the checks once per hour.\n" +
                "Task\tDC\n" +
                "Activate blindly\t25\n" +
                "Decipher a written spell\t25 + spell level\n" +
                "Emulate class feature\t20\n" +
                "Emulate ability score\tSee text\n" +
                "Emulate allegiance\t30\n" +
                "Use a scroll\t20 + caster level\n" +
                "Use a wand\t20\n" +
                "Activate Blindly: Some magic items are activated by special words, thoughts, or actions. You can activate such items as if you were using the activation word, thought, or action even if you’re not, and even if you don’t know it. You do have to use something equivalent. You have to speak, wave the item around, or otherwise attempt to get it to activate. You get a +2 bonus on the check if you’ve activated the item at least once in the past.\n" +
                "If you fail the check by 10 or more, you suffer a mishap. A mishap means that magical energy is released, but it doesn’t do what you wanted it to. The GM determines the result of a mishap. The default mishaps are that the item affects the wrong target or that uncontrolled magical energy deals 2d6 points of damage to you. This mishap is in addition to the chance for a mishap normally associated with casting a spell from a scroll when the spell’s caster level is higher than your level in this class.\n" +
                "Decipher a Written Spell: This works like the same use of the Spellcraft skill (see the Mage Advanced Class), except that the DC is 5 points higher. Deciphering a written spell takes 1 minute of concentration.\n" +
                "Emulate Class Feature: Sometimes you need a class feature to activate a magic item. Your effective level in the emulated class equals your check result minus 20.\n" +
                "This skill use doesn’t allow you to use the class feature of another class. It just lets you activate items as if you had the class feature.\n" +
                "If the class whose feature you are emulating has an allegiance requirement, you must meet it. This may require a separate check to emulate allegiance (see below).\n" +
                "Emulate Ability Score: To cast a spell from a scroll, you need a high ability score in the appropriate ability (Intelligence for arcane spells, Wisdom for divine spells). Your effective ability score (appropriate to the class you’re emulating when you try to cast a spell from a scroll) equals your check result minus 15. If you already have a high enough score in the ability, you don’t need to make this check.\n" +
                "Emulate Allegiance: Some magic items have positive or negative effects based on your allegiance. You can use these items as if you were of an allegiance of your choice. You can only emulate one allegiance at a time.\n" +
                "Use a Scroll: Normally, to cast a spell from a scroll, you must belong to a class that has access to the arcane or divine spell inscribed therein. This use of the skill allows you to use a scroll as if you were of the appropriate spellcasting class. The DC equals 20 + the caster level of the spell you are trying to cast from the scroll. To cast a spell from a scroll, you must first decipher it.\n" +
                "In addition, casting a spell from a scroll requires a minimum score of 10 + the spell’s level in the appropriate ability. If you don’t have a sufficiently high score, you must emulate the ability score with a separate check (see above).\n" +
                "Use a Wand: Normally, to use a wand you must belong to a class that has access to the arcane or divine spell ensorcelled therein. This use of the skill allows you to use a wand as if you were of the appropriate spellcasting class.\n" +
                "Try Again?: Yes, but if you ever roll a natural 1 while attempting to activate an item and you fail the check, then you can’t try to activate that item again for 24 hours.\n" +
                "Special: You can’t take 10 or take 20 with this skill. Magic is too unpredictable to make the use of this skill reliable.\n" +
                "\n" +
                "Spell Resistance\n" +
                "An Occultist has spell resistance equal to 5 + her Occultist level. It never interferes with her own spells, and she can voluntarily lower her spell resistance at any time.\n" +
                "Arcane Research (Scrolls)\n" +
                "Starting at 2nd level, an Occultist can research spells and scribe scrolls. Indeed, the only way for an Occultist to cast an arcane spell is by using a scroll. The method and process is unique to the Occultist, and it differs from the Mage’s scribe scroll ability. There is no purchase DC or XP cost for the scrolls the Occultist gains with each new level attained in this class.\n" +
                "When the Occultist attains 2nd level, and upon attaining each new level thereafter, she uncovers spell scrolls through arcane research and study. The GM randomly selects the spells contained on the scrolls, though the Occultist can make a Research check to select a certain number of her own spells. The table below shows how many scrolls of each spell level the Occultist receives upon gaining a new level, and how many of these can be researched at each level. A failed Research check indicates that the Occultist instead discovers all random spells.\n" +
                "Level\t1\t2\t3\t4\tResearch\n" +
                "2nd\t3\t—\t—\t—\t1 (DC 20)\n" +
                "3rd\t4\t—\t—\t—\t2 (DC 23)\n" +
                "4th\t5\t2\t—\t—\t3 (DC 25)\n" +
                "5th\t5\t3\t—\t—\t4 (DC 28)\n" +
                "6th\t5\t4\t—\t—\t5 (DC 30)\n" +
                "7th\t6\t5\t2\t—\t6 (DC 33)\n" +
                "8th\t6\t5\t3\t—\t7 (DC 35)\n" +
                "9th\t6\t5\t4\t—\t8 (DC 38)\n" +
                "10th\t7\t6\t5\t2\t9 (DC 40)\n" +
                "\n" +
                "So, at 2nd level, the Occultist gains three 1st-level arcane spell scrolls. One of these spells can be selected by the Occultist if she makes a successful Research check (DC 20); the other two spells are selected randomly. These are all the spell scrolls the Occultist has until she attains 3rd level. Once a spell is used, it disappears from the scroll that contained it. The Occultist may find other scrolls in the course of her adventures.\n" +
                "The Occultist uses the Use Magic Device arcane skill to cast a spell from a scroll (see above).\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Occultist gets a bonus feat. The bonus feat must be selected from the following list, and the Occultist must meet all the prerequisites of the feat to select it.\n" +
                "Alertness, Archaic Weapons Proficiency, Attentive, Confident, Defensive Martial Arts, Focused, Frightful Presence, Iron Will, Personal Firearms Proficiency, Point Blank Shot.\n" +
                "Shadow Contact\n" +
                "At 4th level, an Occultist gains a denizen of Shadow as a contact. The Shadow creature can have HD equal to one-half the Occultist’s class level or less. This Shadow creature may or may not be overtly hostile toward humans, but it tolerates the Occultist. The Shadow creature will provide information or other minor assistance as though its attitude toward the Occultist were friendly. It might still omit important details, depending on its relationship with the Occultist. The Shadow creature doesn’t accompany the Occultist on adventures, and it may not always be available when the Occultist wants it. In most cases, the Shadow contact can be called upon once per week, and the creature requires some form of compensation for each favor. Compensation can be a favor in return or something appropriate to the creature in question.\n" +
                "If the Shadow creature dies, a new creature replaces it when the Occultist attains her next level in this class.\n" +
                "Bind Shadow Creature\n" +
                "At 5th level, an Occultist can select a type of Shadow creature (any creature type other than animal or vermin) and bind one such creature into service. A Shadow creature of the appropriate type and Hit Dice (GM’s choice) appears at the Occultist’s side in 1d6+1 days. Thereafter, it serves the Occultist, with an outward attitude of helpful (though it might inwardly hate the Occultist who has trapped it into service). It obeys the Occultist, providing protection, fighting at her side, and performing other services. It always seeks to obey the letter of the Occultist’s command, and can sometimes use this behavior to harm the Occultist or otherwise hinder as much as it helps.\n" +
                "At 5th level, the Occultist can bind a Shadow creature with 2 HD or less.\n" +
                "At 8th level, the Occultist can bind a Shadow creature with 4 HD or less.\n" +
                "Arcane Research (Items)\n" +
                "Starting at 7th level, an Occultist can perform research to find magic items. The method and process is unique to the Occultist. There is no purchase DC or XP cost for the magic items the Occultist gains with each new level attained in this class.\n" +
                "When the Occultist attains 7th level, and upon attaining each new level thereafter, she uncovers one magic item through arcane research and study. The GM randomly selects the item, though the Occultist can make a Research check (DC 25) to specify the type of item gained. \n" +
                "The item must be a wondrous item, a wand, a magic weapon, or a set of magic armor.\n" +
                "The Occultist uses the Use Magic Device arcane skill to use a magic item (see above).\n" +
                "Banish\n" +
                "At 10th level, an Occultist comes into her full power. By spending 1 action point and an attack action, the Occultist can utter a word of power that forces a denizen of Shadow to return to the Shadow dimension. The Shadow creature gets a Will save (DC 10 + Occultist’s level + Occultist’s Cha modifier), adding a bonus equal to its HD to the save. If the save succeeds, the Shadow creature doesn’t disappear but is instead stunned for 1d4+1 rounds.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "TELEPATH";
        tmp.description = "";
        tmp.heroContent = "The fastest path into this advanced class is from the Charismatic hero basic class, though other paths are possible.\n" +
                "Requirements\n" +
                "To qualify to become a Telepath, a character must fulfill the following criteria.\n" +
                "Skills: Bluff 6 ranks, Diplomacy 6 ranks, Gather Information 6 ranks.\n" +
                "Feat: Wild Talent\n" +
                "Class Information\n" +
                "The following information pertains to the Telepath advanced class.\n" +
                "Hit Die\n" +
                "The Telepath gains 1d6 hit points per level. The character’s Constitution modifier applies.\n" +
                "Action Points\n" +
                "The Telepath gains a number of action points equal to 6 + one-half his character level, rounded down, every time he attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Telepath’s class skills are as follows.\n" +
                "Autohypnosis (Wis), Bluff (Cha), Concentration (Con), Diplomacy (Cha), Gather Information (Cha), Knowledge (behavioral sciences, current events, popular culture, philosophy and theology) (Int), Profession (Wis), Psicraft (Int), Read/Write Language (none), Sense Motive (Wis), Speak Language (none).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Telepath\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+0\t+0\t+2\tPsionic skills, psionic powers\t+0\t+1\n" +
                "2nd\t+1\t+0\t+0\t+3\tTrigger power, psionic powers\t+1\t+1\n" +
                "3rd\t+1\t+1\t+1\t+3\tBonus feat, psionic powers\t+1\t+1\n" +
                "4th\t+2\t+1\t+1\t+4\tPower crystal, psionic powers\t+1\t+2\n" +
                "5th\t+2\t+1\t+1\t+4\tTrigger power, psionic powers\t+2\t+2\n" +
                "6th\t+3\t+2\t+2\t+5\tBonus feat, psionic powers\t+2\t+2\n" +
                "7th\t+3\t+2\t+2\t+5\tCombat manifestation, psionic powers\t+2\t+3\n" +
                "8th\t+4\t+2\t+2\t+6\tTrigger power, psionic powers\t+3\t+3\n" +
                "9th\t+4\t+3\t+3\t+6\tBonus feat, psionic powers\t+3\t+3\n" +
                "10th\t+5\t+3\t+3\t+7\tMaximize power, psionic powers\t+3\t+4\n" +
                "\n" +
                "Class Features\n" +
                "All of the following features pertain to the Telepath advanced class.\n" +
                "Psionic Skills\n" +
                "A Telepath has access to the following psionic skills. These skills are considered class skills for the Telepath, and he can use his skill points to buy ranks in them, just like other skills in the game.\n" +
                "\n" +
                "Autohypnosis (Wis): Trained only. You have trained your mind to resist certain injuries and threats while also gaining a few select benefits.\n" +
                "Check: The DC and effect depend on the task you attempt.\n" +
                "Task\tDC\n" +
                "Resist fear\t15\n" +
                "Memorize\t15\n" +
                "Tolerate poison\tPoison’s DC\n" +
                "Willpower\t20\n" +
                "Resist Fear: In response to a fear effect, you can make an Autohypnosis check on your next action even if you’ve been overcome by fear. A successful check grants you another saving throw with a +4 morale bonus to resist the fear effect.\n" +
                "Memorize: You can attempt to memorize a long string of numbers, a long passage of verse, or other particularly difficult piece of information. Each successful check allows you to memorize up to 250 words or the equivalent of what could be comfortably contained on an 8 1/2-by-11-inch sheet of paper. You always retain this information; however, you can only recall it with a successful Autohypnosis check.\n" +
                "Tolerate Poison: In response to being poisoned, you can make an Autohypnosis check on your next action. A successful check grants you a +4 morale bonus on your saving throw to resist the poison’s secondary damage.\n" +
                "Willpower: If reduced to 0 hit points (disabled), you may make an Autohypnosis check. If successful, you can perform a strenuous action without taking 1 point of damage. A failed check carries no penalties—you can choose not to perform the strenuous action. If you do perform the strenuous action after failing the check, you take 1 point of damage, as normal.\n" +
                "Try Again?: For resist fear and memorize, you can make a check once per round. You can’t try again to tolerate poison. You can’t try again in the same round for willpower.\n" +
                "Special: You can take 10 on Autohypnosis checks, but you can’t take 20.\n" +
                "Most uses of Autohypnosis are attack actions. Willpower is a free action that can be attempted once per round.\n" +
                "\n" +
                "Concentration (Con): The normal Concentration skill expands to include psionic applications, as defined below.\n" +
                "Check: You must make a Concentration check whenever you may potentially be distracted while engaged in an activity, including manifesting a power or concentrating on an active power, that requires your full attention.\n" +
                "If the check succeeds, you may continue with the action as normal. If the check fails, the action automatically fails and is wasted. If you were in the process of manifesting a power, the power is lost. If you were concentrating on an active power, the power ends. The table in the Concentration skill description summarizes the various types of distractions. In situations where the distraction occurs while you are manifesting a power, you add the level of the power to the DC.\n" +
                "Try Again?: You can try again, but doing so doesn’t cancel the effects of a previous failure. If you lost a power, the power is lost.\n" +
                "Special: By making a check (DC 15 + power level), you can use Concentration to manifest a power defensively, thus avoiding attacks of opportunity. If the check succeeds, you can attempt the action without incurring any attacks of opportunity.\n" +
                "\n" +
                "Psicraft (Int): Trained only. Use this skill to identify psionic powers as they manifest or psionic effects already in place. \n" +
                "Check: You can identify psionic powers and effects.\n" +
                "DC\tTask\n" +
                "15 + power level\tIdentify a psionic power as it manifests. (You must sense the power’s display or see some visible effect to identify a power.) You can’t try again.\n" +
                "20 + power level\tIdentify a power that’s already in place and in effect. (You must be able to see or detect the effects of the power.) You can’t try again.\n" +
                "20 + power level\tIdentify materials created or shaped by psionics. You can’t try again.\n" +
                "30 or higher\tUnderstand a strange or unique psionic effect. You can’t try again.\n" +
                "Try Again?: See above.\n" +
                "Time: Unless otherwise indicated, Psicraft is a move action.\n" +
                "\n" +
                "Psionic Powers\n" +
                "The Telepath’s main strength is his ability to manifest psionic powers.\n" +
                "A psionic power is a one-time psionic effect. Psionic powers require power points to use. Unlike arcane spellcasters, Telepaths don’t have spellbooks and they don’t prepare powers ahead of time. In addition, a Telepath can use psionics while wearing armor without risking the failure of the power.\n" +
                "A Telepath’s level limits the number of power points available for manifesting powers. In addition, a Telepath must have a key ability score equal to at least 10 + the power’s level to manifest a particular power.\n" +
                "The Telepath’s selection of powers is extremely limited, although he enjoys ultimate flexibility. At 1st level, a Telepath knows three 0-level powers of your choice and one 1st-level power. At each level, the Telepath discovers one or more previously latent powers, as indicated on the table below.\n" +
                "The DC for saving throws to resist a psionic power is 10 + the power’s level + the Telepath’s key ability modifier.\n" +
                "Telepath Level\t\t—— Powers Discovered by Level ——\n" +
                "\tPts/Day\t0\t1\t2\t3\t4\t5\n" +
                "1st\t2\t3\t1\t—\t—\t—\t—\n" +
                "2nd\t3\t3\t2\t—\t—\t—\t—\n" +
                "3rd\t4\t3\t3\t—\t—\t—\t—\n" +
                "4th\t7\t4\t3\t1\t—\t—\t—\n" +
                "5th\t10\t4\t3\t2\t—\t—\t—\n" +
                "6th\t15\t4\t3\t2\t1\t—\t—\n" +
                "7th\t20\t5\t4\t3\t2\t—\t—\n" +
                "8th\t27\t5\t4\t3\t2\t1\t—\n" +
                "9th\t34\t5\t4\t3\t3\t2\t—\n" +
                "10th\t43\t6\t4\t3\t3\t2\t1\n" +
                "\n" +
                "A Telepath can manifest a certain number of powers per day based on his available power points. (0-level powers have a special cost; see FX Basics.) He just pays the power point cost of a power to manifest it, no preparation necessary. The base number of power points available per day is shown on the table above. This number is improved by bonus points determined by the Telepath’s Charisma score, as shown on the table below.\n" +
                "Cha Score\tBonus Power Points per Day\n" +
                "12–13\t1\n" +
                "14–15\t3\n" +
                "16–17\t5\n" +
                "18–19\t7\n" +
                "20–21\t9\n" +
                "22–23\t11\n" +
                "\n" +
                "Trigger Power\n" +
                "At 2nd, 5th, and 8th level, the Telepath chooses one psionic power that he can attempt to manifest for no power point cost.\n" +
                "At each of these levels, you select one 0-, 1st-, 2nd-, or 3rd-level power you can use. From that point on, you can attempt to trigger that power without paying its cost. To trigger a power, you must have enough power points to cover the normal cost of the power manifestation. Then, make an ability check appropriate to the power.\n" +
                "If you succeed at the ability check, the power manifests with no cost in power points. If the check fails, you pay the power point cost and the power manifests.\n" +
                "DCs for the ability check depend on the level of the power: 0-level, DC 11; 1st-level, DC 13; 2nd-level, DC 15; and 3rd-level, DC 17.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Telepath gets a bonus feat. The bonus feat must be selected from the following list, and the Telepath must meet all the prerequisites of the feat to select it.\n" +
                "Alertness, Animal Affinity, Attentive, Blind-Fight, Combat Expertise, Confident, Creative, Deceptive, Educated, Focused, Frightful Presence, Iron Will, Renown, Stealthy, Studious.\n" +
                "Power Crystal\n" +
                "At 4th level, the Telepath can store excess power points in a power crystal specially attuned to him. Encoding the crystal takes 24 hours and requires a gem with a purchase DC of 20. When complete, the power crystal is a psionically charged crystalline stone no more than an inch in diameter. A Telepath can possess no more than one power crystal at a time.\n" +
                "A power crystal is imbued with 5 power points when it is created. The Telepath can call upon these power points at any time and use them just as he would his natural power points. Once the crystal is depleted, the Telepath must refill it using up to 5 power points from his own reserves. A power crystal can be recharged after a Telepath has rested and renewed his own reserves of power points for the day..\n" +
                "Combat Manifestation\n" +
                "At 7th level, a Telepath becomes adept at manifesting psionic powers in combat. He gets a +4 bonus on Concentration checks to manifest a power while on the defensive.\n" +
                "Maximize Power\n" +
                "At 10th level, a Telepath learns to manifest psionic powers to maximum effect. All variable, numeric effects of a maximized power automatically achieve their maximum values. A maximized power deals the most possible points of damage, affects the maximum number of targets, and so forth, as appropriate. Saving throws and opposed checks are not affected. Powers without random variables are not affected. \n" +
                "A maximized power costs a number of power points equal to its normal cost +6.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "BATTLE MIND";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Battle Mind, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +3.\n" +
                "Skill: Jump 6 ranks.\n" +
                "Feat: Wild Talent\n" +
                "Class Information\n" +
                "The following information pertains to the Battle Mind advanced class.\n" +
                "Hit Die\n" +
                "The Battle Mind gains 1d8 hit points per level. The character’s Constitution modifier applies.\n" +
                "Action Points\n" +
                "The Battle Mind gains a number of action points equal to 6 + one-half her character level, rounded down, every time she attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Battle Mind’s class skills are as follows.\n" +
                "Autohypnosis (Wis), Balance (Dex), Climb (Str), Concentration (Con), Craft (visual arts) (Int), Drive (Dex), Jump (Str), Knowledge (current events, streetwise) (Int), Profession (Wis), Read/Write Language (none), Speak Language (none), Spot (Wis), Swim (Str).\n" +
                "Skill Points at Each Level: 3 + Int modifier.\n" +
                "\n" +
                "Table: The Battle Mind\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+2\t+0\t+0\tPsionic skills, psionic powers\t+1\t+0\n" +
                "2nd\t+1\t+3\t+0\t+0\tPsi-blade, imprint tattoo, psionic powers\t+2\t+0\n" +
                "3rd\t+2\t+3\t+1\t+1\tBonus feat, psionic powers\t+2\t+0\n" +
                "4th\t+3\t+4\t+1\t+1\tPsychic shield, psionic powers\t+3\t+0\n" +
                "5th\t+3\t+4\t+1\t+1\tCombat manifestation, psionic powers\t+4\t+1\n" +
                "6th\t+4\t+5\t+2\t+2\tBonus feat, psionic powers\t+4\t+1\n" +
                "7th\t+5\t+5\t+2\t+2\tImproved psi-blade, psionic powers\t+5\t+1\n" +
                "8th\t+6\t+6\t+2\t+2\tImproved psychic shield, psionic powers\t+6\t+1\n" +
                "9th\t+6\t+6\t+3\t+3\tBonus feat, psionic powers\t+6\t+2\n" +
                "10th\t+7\t+7\t+3\t+3\tUltimate psi-blade, psionic powers\t+7\t+2\n" +
                "\n" +
                "Class Features\n" +
                "All of the following features pertain to the Battle Mind advanced class.\n" +
                "Psionic Skills\n" +
                "A Battle Mind has access to the following psionic skills. These skills are considered class skills for the Battle Mind, and she can use her skill points to buy ranks in them, just like other skills in the game.\n" +
                "\n" +
                "Autohypnosis (Wis): Trained only. You have trained your mind to resist certain injuries and threats while also gaining a few select benefits.\n" +
                "Check: The DC and effect depend on the task you attempt.\n" +
                "Task\tDC\n" +
                "Resist fear\t15\n" +
                "Memorize\t15\n" +
                "Tolerate poison\tPoison’s DC\n" +
                "Willpower\t20\n" +
                "\n" +
                "Resist Fear: In response to a fear effect, you can make an Autohypnosis check on your next action even if you’ve been overcome by fear. A successful check grants you another saving throw with a +4 morale bonus to resist the fear effect.\n" +
                "Memorize: You can attempt to memorize a long string of numbers, a long passage of verse, or other particularly difficult piece of information. Each successful check allows you to memorize up to 250 words or the equivalent of what could be comfortably contained on an 8 1/2-by-11-inch sheet of paper. You always retain this information; however, you can only recall it with a successful Autohypnosis check.\n" +
                "Tolerate Poison: In response to being poisoned, you can make an Autohypnosis check on your next action. A successful check grants you a +4 morale bonus on your saving throw to resist the poison’s secondary damage.\n" +
                "Willpower: If reduced to 0 hit points (disabled), you may make an Autohypnosis check. If successful, you can perform a strenuous action without taking 1 point of damage. A failed check carries no penalties—you can choose not to perform the strenuous action. If you do perform the strenuous action after failing the check, you take 1 point of damage, as normal.\n" +
                "Try Again?: For resist fear and memorize, you can make a check once per round. You can’t try again to tolerate poison. You can’t try again in the same round for willpower.\n" +
                "Special: You can take 10 on Autohypnosis checks, but you can’t take 20.\n" +
                "Most uses of Autohypnosis are attack actions. Willpower is a free action that can be attempted once per round.\n" +
                "\n" +
                "Concentration (Con): The normal Concentration skill expands to include psionic applications, as defined below.\n" +
                "Check: You must make a Concentration check whenever you may potentially be distracted while engaged in an activity, including manifesting a power or concentrating on an active power, that requires your full attention.\n" +
                "If the check succeeds, you may continue with the action as normal. If the check fails, the action automatically fails and is wasted. If you were in the process of manifesting a power, the power is lost. If you were concentrating on an active power, the power ends. The table in the Concentration skill description summarizes the various types of distractions. In situations where the distraction occurs while you are manifesting a power, you add the level of the power to the DC.\n" +
                "Try Again?: You can try again, but doing so doesn’t cancel the effects of a previous failure. If you lost a power, the power is lost.\n" +
                "Special: By making a check (DC 15 + power level), you can use Concentration to manifest a power defensively, thus avoiding attacks of opportunity. If the check succeeds, you can attempt the action without incurring any attacks of opportunity.\n" +
                "\n" +
                "Psionic Powers\n" +
                "The Battle Mind’s main strength is her ability to manifest offensive psionic powers.\n" +
                "A psionic power is a one-time psionic effect. Psionic powers require power points to use. Unlike arcane spellcasters, Battle Minds don’t have spellbooks and they don’t prepare powers ahead of time. In addition, a Battle Mind can use psionics while wearing armor without risking the failure of the power.\n" +
                "A Battle Mind’s level limits the number of power points available for manifesting powers. In addition, a Battle Mind must have a key ability score equal to at least 10 + the power’s level to manifest a particular power.\n" +
                "The Battle Mind’s selection of powers is extremely limited and tied to combat. At 1st level, a Battle Mind knows two 0-level powers of your choice. At each level, the Battle Mind discovers one or more previously latent powers, as indicated on the table below.\n" +
                "The DC for saving throws to resist a psionic power is 10 + the power’s level + the Battle Mind’s key ability modifier.\n" +
                "Battle Mind Level\t \tPowers Discovered by Level\n" +
                "\tPts/Day\t0\t1\t2\t3\t4\n" +
                "1st\t2\t2\t—\t—\t—\t—\n" +
                "2nd\t3\t3\t—\t—\t—\t—\n" +
                "3rd\t4\t3\t1\t—\t—\t—\n" +
                "4th\t5\t3\t2\t—\t—\t—\n" +
                "5th\t8\t3\t3\t1\t—\t—\n" +
                "6th\t11\t3\t3\t2\t—\t—\n" +
                "7th\t16\t3\t3\t2\t1\t—\n" +
                "8th\t21\t3\t3\t3\t1\t—\n" +
                "9th\t26\t3\t3\t3\t2\t—\n" +
                "10th\t33\t3\t3\t3\t2\t1\n" +
                "\n" +
                "A Battle Mind can manifest a certain number of powers per day based on her available power points. She just pays the power point cost of a power to manifest it, no preparation necessary. The number of power points available per day is shown above.\n" +
                "Psi-Blade\n" +
                "At 2nd level, a Battle Mind can manifest a glowing blade of mental energy. This 1-foot-long blade extends from the Battle Mind’s fist. It can be manifested as a move action, and it lasts for a number of rounds equal to the Battle Mind’s level or until the Battle Mind wills it to dissipate. She can create another one on her next move action, as long as the Battle Mind’s power point reserve is 1 or more.\n" +
                "The psi-blade deals 1d6 points of piercing damage. At 3rd level, her psi-blade gains a +1 enhancement bonus. At 5th level the enhancement bonus improves to +2. At 7th level, it improves to +3, and at 9th level it improves to +4.\n" +
                "The Battle Mind can apply the Weapon Focus or Weapon Finesse feats to her psi-blade.\n" +
                "Imprint Tattoo\n" +
                "Starting at 2nd level, a Battle Mind can create create tattoos on his body or someone else’s that can be used to invoke psionic powers. A tattoo is a single-use item that duplicates the effect of a particular power. Imprinting a tattoo takes one day. The purchase DC for the raw materials to imprint a tattoo is 15 + the tattoo’s power level + the tattoo’s manifester level.\n" +
                "The Battle Mind must also spend experience points to imprint a tattoo. The XP cost is equal to the power level x the manifester level x the purchase DC of the raw materials.\n" +
                "Finally, the Battle Mind makes a Craft (visual arts) check. The DC for the check is 10 + the power level + the manifester level of the power. If the check fails, the raw materials are used up but the XP are not spent. The Battle Mind can try imprinting the tattoo again as soon as he purchases more raw materials. \n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Battle Mind gets a bonus feat. The bonus feat must be selected from the following list, and the Battle Mind must meet all the prerequisites of the feat to select it.\n" +
                "Archaic Weapons Proficiency, Athletic, Blind-Fight, Cleave, Combat Martial Arts, Combat Reflexes, Exotic Melee Weapon Proficiency, Focused, Improved Combat Martial Arts, Power Attack, Weapon Finesse, Weapon Focus.\n" +
                "Psychic Shield\n" +
                "At 4th level, a Battle Mind can manifest a shield of psychic energy, outlining her body in a barely perceptible glowing nimbus that provides a +3 equipment bonus to Defense. The shield can be manifested as a move action, and it lasts for a number of rounds equal to the Battle Mind’s level or until she wills it to dissipate. She can create another shield on her next move action, as long as her power point reserve is 1 or more.\n" +
                "Combat Manifestation\n" +
                "At 5th level, a Battle Mind becomes adept at manifesting psionic powers in combat. She gets a +4 bonus on Concentration checks to manifest a power while on the defensive.\n" +
                "Improved Psi-Blade\n" +
                "At 7th level, a Battle Mind’s psi-blade increases in damage capability. It now deals 1d8 points of piercing damage on a successful attack.\n" +
                "Improved Psychic Shield\n" +
                "At 8th level, a Battle Mind’s psychic shield improves. It now provides a +6 equipment bonus to Defense.\n" +
                "Ultimate Psi-Blade\n" +
                "At 10th level, a Battle Mind’s psi-blade increases further in damage capability. It now deals 2d6 points of piercing damage on a successful attack.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "MAGE";
        tmp.description = "";
        tmp.heroContent = "The fastest path into this advanced class is from the Smart hero basic class, though other paths are possible.\n" +
                "Requirements\n" +
                "To qualify to become a Mage, a character must fulfill the following criteria.\n" +
                "Skills: Craft (chemical) 6 ranks, Decipher Script 6 ranks, Knowledge (arcane lore) 6 ranks, Research 6 ranks.\n" +
                "Class Information\n" +
                "The following information pertains to the Mage advanced class.\n" +
                "Hit Die\n" +
                "The Mage gains 1d6 hit points per level. The character’s Constitution modifier applies.\n" +
                "Action Points\n" +
                "The Mage gains a number of action points equal to 6 + one-half his character level, rounded down, every time he attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Mage’s class skills are as follows.\n" +
                "Computer Use (Int), Concentration (Con), Craft (chemical) (Int), Craft (pharmaceutical) (Int), Craft (visual arts) (Int),Craft (writing) (Int), Decipher Script (Int), Investigate (Int), Knowledge (arcane lore, art, current events, earth and life sciences, physical sciences, popular culture, technology) (Int), Profession (Wis), Read/Write Language (none), Research (Int), Speak Language (none), Spellcraft (Int).\n" +
                "Skill Points at Each Level: 7 + Int modifier.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Table: The Mage\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+0\t+0\t+2\tArcane skills, arcane spells, summon familiar\t+1\t+1\n" +
                "2nd\t+1\t+0\t+0\t+3\tScribe scroll, arcane spells\t+1\t+1\n" +
                "3rd\t+1\t+1\t+1\t+3\tBonus feat, arcane spells, brew potion\t+2\t+1\n" +
                "4th\t+2\t+1\t+1\t+4\tScribe tattoo, arcane spells\t+2\t+2\n" +
                "5th\t+2\t+1\t+1\t+4\tSpell mastery, arcane spells\t+3\t+2\n" +
                "6th\t+3\t+2\t+2\t+5\tBonus feat, arcane spells\t+3\t+2\n" +
                "7th\t+3\t+2\t+2\t+5\tCombat casting, arcane spells\t+4\t+3\n" +
                "8th\t+4\t+2\t+2\t+6\tSpell mastery, arcane spells\t+4\t+3\n" +
                "9th\t+4\t+3\t+3\t+6\tBonus feat, arcane spells\t+5\t+3\n" +
                "10th\t+5\t+3\t+3\t+7\tMaximize spell, arcane spells\t+5\t+4\n" +
                "\n" +
                "Class Features\n" +
                "All of the following features pertain to the Mage advanced class.\n" +
                "Arcane Skills\n" +
                "A Mage has access to the following arcane skills. These skills are considered class skills for the Mage, and he can use his skill points to buy ranks in them.\n" +
                "\n" +
                "Concentration (Con): The normal Concentration skill expands to include arcane applications, as defined below.\n" +
                "Check: You must make a Concentration check whenever you may potentially be distracted while engaged in an activity, including casting a spell or concentrating on an active spell, that requires your full attention.\n" +
                "If the check succeeds, you may continue with the action as normal. If the check fails, the action automatically fails and is wasted. If you were in the process of casting a spell, the spell is lost. If you were concentrating on an active spell, the spell ends.\n" +
                "The table in the Concentration skill description summarizes the various types of distractions. In situations where the distraction occurs while you are casting a spell, you add the level of the spell to the DC.\n" +
                "Try Again?: You can try again, but doing so doesn’t cancel the effects of a previous failure. If you lost a spell, the spell is lost.\n" +
                "Special: By making a check (DC 15 + spell level), you can use Concentration to cast a spell defensively, thus avoiding attacks of opportunity. If the check succeeds, you can attempt the casting without incurring any attacks of opportunity.\n" +
                "\n" +
                "Craft (chemical) (Int): Trained only. This skill expands to include alchemy, which can be used to create potions.\n" +
                "\n" +
                "Spellcraft (Int): Trained only. Use this skill to identify spells as they are cast or spells already in place.\n" +
                "Check: You can identify spells and magic effects.\n" +
                "Additionally, certain spells allow you to gain information about magic provided that you make a Spellcraft check as detailed in the spell description.\n" +
                "Try Again?: See above.\n" +
                "Time: Unless otherwise indicated, using the Spellcraft skill is a move action.\n" +
                "DC\tTask\n" +
                "15 + spell level\tIdentify a spell being cast. (You must see or hear the spell’s verbal or somatic components.) You can’t try again.\n" +
                "15 + spell level\tLearn a spell from a spellbook or scroll. You can’t try again for that spell until you gain at least 1 rank in Spellcraft.\n" +
                "15 + spell level\tPrepare a spell from a borrowed spellbook. One try per day.\n" +
                "15 + spell level\tWhen casting detect magical aura, determine the school of magic involved in the aura of a single item or creature you can see. (If the aura isn’t a spell effect, the DC is 15 + one-half caster level.)\n" +
                "20 + spell level\tIdentify a spell that’s already in place and in effect. (You must be able to see or detect the effects of the spell.) You can’t try again.\n" +
                "20 + spell level\tIdentify materials created or shaped by magic, such as noting that an iron wall is the result of a wall of iron spell. You can’t try again.\n" +
                "20 + spell level\tDecipher a written spell (such as a  scroll) without using read magic. One try per day.\n" +
                "25 + spell level\tAfter rolling a saving throw against a spell targeted at you, determine what spell was cast upon you. This is a reaction.\n" +
                "25\tIdentify a potion. This takes 1 minute.\n" +
                "30 or higher\tUnderstand a strange or unique magical effect. You can’t try again.\n" +
                "\n" +
                "Arcane Spells\n" +
                "The Mage’s key characteristic is the ability to cast arcane spells. He is limited to a certain number of spells of each spell level per day, according to his Mage class level. In addition, the Mage receives bonus spells based on his Intelligence score. Determine the Mage’s total number of spells per day by consulting the two tables below.\n" +
                "Mage Level\t———— Spells per Day by Spell Level ————\n" +
                "\t0\t1\t2\t3\t4\t5\n" +
                "1st\t3\t1\t—\t—\t—\t—\n" +
                "2nd\t4\t2\t—\t—\t—\t—\n" +
                "3rd\t4\t2\t1\t—\t—\t—\n" +
                "4th\t4\t3\t2\t—\t—\t—\n" +
                "5th\t4\t3\t2\t1\t—\t—\n" +
                "6th\t4\t3\t3\t2\t—\t—\n" +
                "7th\t4\t4\t3\t2\t1\t—\n" +
                "8th\t4\t4\t3\t3\t2\t—\n" +
                "9th\t4\t4\t4\t3\t2\t1\n" +
                "10th\t4\t4\t4\t3\t3\t2\n" +
                "\n" +
                "Int Score\t———— Bonus Spells by Spell Level ————\n" +
                "\t0\t1\t2\t3\t4\t5\n" +
                "12–13\t—\t1\t—\t—\t—\t—\n" +
                "14–15\t—\t1\t1\t—\t—\t—\n" +
                "16–17\t—\t1\t1\t1\t—\t—\n" +
                "18–19\t—\t1\t1\t1\t1\t—\n" +
                "20–21\t—\t2\t1\t1\t1\t1\n" +
                "22–23\t—\t2\t2\t1\t1\t1\n" +
                "\n" +
                "The Mage must prepare spells ahead of time by resting for 8 hours and spending 1 hour studying his spellbook. While studying, the Mage decides which spells to prepare. To learn, prepare, or cast a spell, the Mage must have an Intelligence score of at least 10 + the spell’s level. \n" +
                "A Mage can prepare a lower-level spell in place of a higher-level one if he desires. place.\n" +
                "The Difficulty Class for saving throws to resist the effects of a Mage’s spells is 10 + the spell’s level + the Mage’s Intelligence modifier.\n" +
                "\n" +
                "Arcane Spells and Armor\n" +
                "The Mage can become proficient in the use of armor, but he still has a difficult time casting most arcane spells while wearing it. Armor restricts movement, making it harder to perform the complicated gestures needed to cast spells with somatic components. When casting an arcane spell with a somatic component, the chance of arcane spell failure depends on the type of armor being worn and whether the Mage has the appropriate Armor Proficiency feat, as shown below.\n" +
                "Armor Type\tArcane Spell Failure (Proficient)\tArcane Spell Failure (Nonproficient)\n" +
                "Light\t10%\t20%\n" +
                "Medium\t20%\t30%\n" +
                "Heavy\t30%\t40%\n" +
                "\n" +
                "Spellbooks\n" +
                "The Mage must study his spellbook each day to prepare his spells. The Mage can’t prepare any spell not recorded in his spellbook (except for read magic, which the Mage can prepare from memory). The Mage begins play with a spellbook containing all 0-level arcane spells and three 1st-level arcane spells of the player’s choice. For each point of Intelligence bonus the Mage has, his spellbook holds one additional 1st-level arcane spell. Each time the character attains a new level of Mage, he gains two new spells of any level or levels that he can cast, according to his new level. The Mage can also add spells found in other Mages’ spellbooks.\n" +
                "A spellbook can be an actual book or any other information storage device, such as a notebook computer, desktop computer, or PDA (personal data assistant).\n" +
                "\n" +
                "Summon Familiar\n" +
                "A Mage has the ability to obtain a familiar.\n" +
                "A familiar is magically linked to its master. In some sense, the familiar and the Mage who controls it are practically one being. That’s why, for example, the Mage can cast a personal range spell on a familiar even though normally he can only cast such a spell on himself. A familiar is a magical beast, similar physically to the normal creature it resembles. However, a familiar grants special abilities to its master, as described below. A special ability granted by a familiar only applies when the Mage and the familiar are within 1 mile of each other.\n" +
                "For all familiar special abilities based on the master’s level count only Mage levels. Any levels from classes other than Mage are not included in this calculation unless specifically stated otherwise.\n" +
                "Depending on what kind of creature the familiar is, the master gains a special benefit, as summarized on the above table.\n" +
                "Familiar Qualities: Use the basic statistics for a creature of its type but make these changes.\n" +
                "Hit Dice: Treat as the Mage’s character level (for effects related to Hit Dice). Use the familiar’s normal total if it is higher.\n" +
                "Hit Points: One-half the Mage’s total, rounded down. \n" +
                "Action Points: A familiar cannot gain or spend action points, and a Mage cannot spend an action point through his familiar.\n" +
                "Attacks: Use the Mage’s base attack bonus. Use the familiar’s Dexterity modifier or Strength modifier, whichever is greater, to determine the familiar’s melee attack bonus with unarmed attacks. Damage equals that of a normal creature of its type.\n" +
                "Saving Throws: The familiar uses the Mage’s base saving throw bonuses if they’re better than the familiar’s. The familiar uses its own ability modifiers to saves, and does not enjoy other bonuses that the Mage may have (such as from feats).\n" +
                "Skills: For each skill, use either the normal skill ranks for a creature of its type or the Mage’s skill ranks, whichever is better. In either case, the familiar uses its own ability modifiers. Regardless of a familiar’s total skill modifiers, some skills may remain beyond the ability of the familiar to perform (such as Craft, for instance). \n" +
                "Familiar Special Abilities: Familiars have special abilities, or impart abilities to their Mages, depending on the level of the Mage.\n" +
                "Natural Armor (Ex): This number represents a bonus to the familiar’s existing natural armor bonus to Defense. Add the given value directly to the familiar’s Defense. It represents a familiar’s preternatural toughness.\n" +
                "Familiar’s Intelligence (Ex): The familiar’s Intelligence score. (Normal creatures of its type have a much lower Intelligence score.)\n" +
                "Alertness (Ex): The presence of a familiar sharpens its master’s senses. While the familiar is within 5 feet, the Mage gains the Alertness feat.\n" +
                "Share Spells (Su): At the Mage’s option, he may have any spell he casts on himself also affect his familiar. The familiar must be within 5 feet at the time. If the spell has a duration other than instantaneous, the spell stops affecting the familiar if the creature moves farther than 5 feet away. The spell’s effect is not restored even if the familiar returns to the Mage before the duration would otherwise have ended. Additionally, the Mage may cast a spell with a target of “You” on his familiar (as a touch range spell) instead of on himself. The Mage and the familiar can share spells even if the spells normally do not affect creatures of the familiar’s type (magical beast).\n" +
                "Empathic Link (Su): The Mage has an empathic link with the familiar out to a distance of up to 1 mile. The Mage can’t see through the familiar’s eyes, but the two of them can communicate telepathically. Note that the relatively low Intelligence of a low-level Mage’s familiar limits what it is able to communicate or understand, and even intelligent familiars see the world differently from humans.\n" +
                "Touch (Su): The familiar of a Mage who is 3rd level or higher can deliver touch spells for him. When the mage casts a touch spell, he can designate his familiar as the “toucher.” (The Mage and the familiar have to be in contact at the time of casting.) The familiar can then deliver the touch spell just as the Mage could. As normal, if the Mage casts another spell, the touch spell dissipates.\n" +
                "Improved Evasion (Ex): If a familiar is subjected to an attack that normally allows a Reflex saving throw for half damage, the familiar takes no damage if it makes a successful saving throw and half damage even if the saving throw fails.\n" +
                "Speak with Familiar/Speak with Master (Ex): A Mage of 5th level or higher and his familiar can communicate verbally as if they were using a common language. Other creatures do not understand the communication without magical help.\n" +
                "Speak with Animals of Its Type (Ex): The familiar of a Mage of 7th level or higher can communicate with animals of approximately the same type as itself: bats and rats with rodents, cats with felines, ferrets with creatures of the family Mustelidae (weasels, minks, polecats, ermines, skunks, wolverines, and badgers), hawks and owls with birds, snakes with reptiles, toads with amphibians. The communication is limited by the Intelligence of the conversing creatures.\n" +
                "Spell Resistance (Ex): The familiar of a Mage of 9th level or higher gains spell resistance equal to the Mage’s level + 5.\n" +
                "Familiar\tSpecial Benefit\n" +
                "Bat\tMage gains +3 bonus on Listen checks\n" +
                "Cat\tMage gains +3 bonus on Move Silently checks\n" +
                "Ferret\tMage gains +2 bonus on Reflex saves\n" +
                "Hawk\tMage gains +3 bonus on Spot checks in daylight\n" +
                "Owl\tMage gains +3 bonus on Spot checks in dusk or darkness\n" +
                "Rat\tMage gains +2 bonus on Fortitude saves\n" +
                "Snake (Tiny viper)\tMage gains +3 bonus on Bluff checks\n" +
                "Toad\tMage gains +3 hit points\n" +
                "\n" +
                "Scribe Scroll\n" +
                "Starting at 2nd level, a Mage can create scrolls from which he or another spellcaster can cast a scribed spell. You can create a scroll of any spell you know. Scribing a scroll takes one day. The purchase DC for the raw materials to scribe a scroll is 13 + the scroll’s spell level + the scroll’s caster level.\n" +
                "The Mage must also spend experience points to scribe a scroll. The XP cost is equal to the spell level ¥ the caster level ¥ the purchase DC of the raw materials.\n" +
                "Finally, the Mage makes a Craft (writing) check. The DC for the check is 10 + the spell level + the caster level of the scroll. If the check fails, the raw materials are used up but the XP are not spent. The Mage can try scribing the scroll again as soon as he purchases more raw materials.\n" +
                "Any scroll that stores a spell with a costly material component or an XP cost also carries a commensurate cost. In addition to the costs derived from the base price, you must expend the material component or pay the XP when scribing the scroll.\n" +
                "A scroll can be written on a sheet of paper or parchment, or it can be saved as a file on a computer or PDA.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Mage gets a bonus feat. The bonus feat must be selected from the following list, and the Mage must meet all the prerequisites of the feat to select it.\n" +
                "Attentive, Archaic Weapons Proficiency, Combat Expertise, Educated, Frightful Presence, Low Profile, Nimble, Studious.\n" +
                "Brew Potion\n" +
                "At 3rd level, a Mage can create potions, which carry spells within themselves.\n" +
                "The Mage can create a potion of any spell of 3rd level or lower that he knows. The spell must target a character or characters. Brewing a potion takes 24 hours. When the Mage creates a potion, he sets the caster level. The caster level must be sufficient to cast the spell in question and no higher than the Mage’s class level. The caster level has an effect on the purchase DC of the raw materials to brew the potion, the skill check to create the potion, the experience point cost to brew the potion, and the DC of a saving throw (if applicable) to resist the effect of the potion.\n" +
                "The purchase DC for the raw materials to brew a potion is 15 + the potion’s spell level + the potion’s caster level.\n" +
                "The Mage must also spend experience points to brew a potion. The XP cost is equal to the spell level ¥ the caster level ¥ the purchase DC of the raw materials.\n" +
                "Finally, the Mage makes a Craft (chemical) check. The DC for the check is 10 + the spell level + the caster level of the potion. If the check fails, the raw materials are used up but the XP are not spent. The Mage can try brewing the potion again as soon as he purchases more raw materials.\n" +
                "When a Mage creates a potion, he makes any choices that he would normally make when casting the spell. Whoever drinks the potion is the target of the spell.\n" +
                "Any potion that stores a spell with a costly material component or an XP cost also carries a commensurate cost. In addition to the raw materials cost, the Mage must expend the material component or pay the XP when creating the potion.\n" +
                "Scribe Tattoo\n" +
                "At 4th level, a Mage can create tattoos on his body or someone else’s. Tattoos function similarly to scrolls, and are created in the same way (see the scribe scroll ability), except that the pertinent skill is Craft (visual arts). See Chapter Ten: FX Abilities for more about tattoos.\n" +
                "Spell Mastery\n" +
                "At 5th and 8th level, a Mage gains the spell mastery ability. Each time, the Mage chooses a number of spells that he already knows equal to his Intelligence modifier. From that point on, the Mage can prepare these spells without referring to a spellbook. The Mage is so intimately familiar with these spells that he doesn’t need a spellbook to prepare them anymore.\n" +
                "Combat Casting\n" +
                "At 7th level, a Mage becomes adept at casting spells during combat. He gets a +4 bonus on Concentration checks made to cast a spell while on the defensive.\n" +
                "Maximize Spell\n" +
                "At 10th level, a Mage learns to cast some of his spells to maximum effect. All variable, numeric effects of a maximized spell automatically achieve their maximum values. A maximized spell deals the most possible points of damage, affects the maximum number of targets, and so forth, as appropriate. Saving throws and opposed checks are not affected. Spells without random variables are not affected. \n" +
                "When a maximized spell is prepared, it is treated as a spell of three levels higher than the spell’s actual level. Therefore, a Mage can only maximize 0-, 1st-, or 2nd-level spells—a maximized 1st-level spell is treated as a 4th-level spell when you decide what spells the Mage will have available for the coming day, so it limits the number of other 4th-level spells the Mage can prepare. Likewise, a maximized 2nd-level spell is treated as a 5th-level spell.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "ACOLYTE";
        tmp.description = "";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become an Acolyte, a character must fulfill the following criteria.\n" +
                "Base Attack Bonus: +2.\n" +
                "Skills: Knowledge (theology and philosophy) 6 ranks, Listen 6 ranks, Sense Motive 6 ranks.\n" +
                "Allegiance: At the time that the character receives her first level in the Acolyte advanced class, she must decide if her faith leans toward the positive energy or negative energy of the universe. This choice adds either the good (positive) or evil (negative) allegiance to the character, and determines how the Acolyte uses certain aspects of her faith.\n" +
                "Holy Symbol: When the character declares her allegiance, she must designate one of her personal possessions as a symbol of her dedication to her allegiance. This possession can be either an actual religious object or some other item of personal significance. This object is referred to as the Acolyte’s holy symbol. It is typically of Tiny or Diminutive size, so that it can be easily held and manipulated in one hand, and its weight is negligible, so that it does not affect the Acolyte’s carrying capacity.\n" +
                "An Acolyte needs her holy symbol in order to cast certain divine spells. It is also necessary for the Acolyte to be able to turn or rebuke undead (see below).\n" +
                "Class Information\n" +
                "The following information pertains to the Acolyte advanced class.\n" +
                "Hit Die\n" +
                "The Acolyte gains 1d8 hit points per level. The character’s Constitution modifier applies.\n" +
                "Action Points\n" +
                "The Acolyte gains a number of action points equal to 6 + one-half her character level, rounded down, every time she attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Acolyte’s class skills are as follows.\n" +
                "Concentration (Con), Craft (structural, visual arts, writing) (Int), Diplomacy (Cha), Knowledge (behavioral sciences, earth and life sciences, theology and philosophy) (Int), Listen (Wis), Profession (Wis), Read/Write Language (none), Sense Motive, Speak Language (none), Spellcraft (Int), Treat Injury (Wis).\n" +
                "Skill Points at Each Level: 5 + Int modifier.\n" +
                "\n" +
                "Table: The Acolyte\n" +
                "Class Level\tBase Attack Bonus\tFort Save\tRef Save\tWill Save\tSpecial\tDefense Bonus\tReputation Bonus\n" +
                "1st\t+0\t+2\t+0\t+2\tDivine skills, divine spells\t+1\t+2\n" +
                "2nd\t+1\t+3\t+0\t+3\tTurn or rebuke undead, divine spells\t+1\t+2\n" +
                "3rd\t+2\t+3\t+1\t+3\tBonus feat, divine spells\t+2\t+2\n" +
                "4th\t+3\t+4\t+1\t+4\tSpontaneous cast, divine spells\t+2\t+3\n" +
                "5th\t+3\t+4\t+1\t+4\tCombat casting, divine spells\t+3\t+3\n" +
                "6th\t+4\t+5\t+2\t+5\tBonus feat, divine spells\t+3\t+3\n" +
                "7th\t+5\t+5\t+2\t+5\tTurn or rebuke magical beast, divine spells\t+4\t+4\n" +
                "8th\t+6\t+6\t+2\t+6\tTurn or rebuke outsider, divine spells\t+4\t+4\n" +
                "9th\t+6\t+6\t+3\t+6\tBonus feat, divine spells\t+5\t+4\n" +
                "10th\t+7\t+7\t+3\t+7\tMaximize spell, divine spells\t+5\t+5\n" +
                "\n" +
                "Class Features\n" +
                "All of the following features pertain to the Acolyte advanced class.\n" +
                "Divine Skills\n" +
                "An Acolyte has access to the following divine skills. These skills are considered class skills for the Acolyte, and she can use her skill points to buy ranks in them, just like other skills in the game.\n" +
                "\n" +
                "Concentration (Con): The normal Concentration skill expands to include divine applications, as defined below.\n" +
                "Check: You must make a Concentration check whenever you may potentially be distracted while engaged in an activity, including casting a spell or concentrating on an active spell, that requires your full attention.\n" +
                "If the check succeeds, you may continue with the action as normal. If the check fails, the action automatically fails and is wasted. If you were in the process of casting a spell, the spell is lost. If you were concentrating on an active spell, the spell ends.\n" +
                "The table in the Concentration skill description summarizes the various types of distractions. In situations where the distraction occurs while you are casting a spell, you add the level of the spell to the DC.\n" +
                "Try Again?: You can try again, but doing so doesn’t cancel the effects of a previous failure. If you lost a spell, the spell is lost.\n" +
                "Special: By making a check (DC 15 + spell level), you can use Concentration to cast a spell defensively, thus avoiding attacks of opportunity. If the check succeeds, you can attempt the casting without incurring any attacks of opportunity.\n" +
                "\n" +
                "Spellcraft (Int): Trained only. Use this skill to identify spells as they are cast or spells already in place.\n" +
                "Check: You can identify spells and magic effects.\n" +
                "Additionally, certain spells allow you to gain information about magic provided that you make a Spellcraft check as detailed in the spell description.\n" +
                "Try Again?: See above.\n" +
                "Time: Unless otherwise indicated, Spellcraft is a move action.\n" +
                "\n" +
                "DC\tTask\n" +
                "15 + spell level\tIdentify a spell being cast. (You must see or hear the spell’s verbal or somatic components.) You can’t try again.\n" +
                "15 + spell level\tWhen casting detect magical aura, determine the school of magic involved in the aura of a single item or creature you can see. (If the aura isn’t a spell effect, the DC is 15 + one-half caster level.)\n" +
                "20 + spell level\tIdentify a spell that’s already in place and in effect. (You must be able to see or detect the effects of the spell.) You can’t try again.\n" +
                "20 + spell level\tIdentify materials created or shaped by magic, such as noting that an iron wall is the result of a wall of iron spell. You can’t try again.\n" +
                "20 + spell level\tDecipher a written spell (such as a  scroll) without using read magic. One try per day.\n" +
                "25 + spell level\tAfter rolling a saving throw against a spell targeted at you, determine what spell was cast upon you. This is a reaction.\n" +
                "25\tIdentify a potion. This takes 1 minute.\n" +
                "30 or higher\tUnderstand a strange or unique magical effect. You can’t try again.\n" +
                "\n" +
                "Divine Spells \n" +
                "The Acolyte’s key characteristic is the ability to cast divine spells. (See Chapter Ten: FX Abilities for a list and descriptions of divine spells.)\n" +
                "The Acolyte is limited to a certain number of spells of each spell level per day, according to her Acolyte class level. In addition, the Acolyte receives bonus spells based on her Wisdom score. Determine the Acolyte’s total number of spells per day by consulting the two tables below.\n" +
                "Acolyte Level\t———— Spells per Day by Spell Level ————\n" +
                "\t0\t1\t2\t3\t4\t5\n" +
                "1st\t3\t2\t—\t—\t—\t—\n" +
                "2nd\t4\t3\t—\t—\t—\t—\n" +
                "3rd\t4\t3\t2\t—\t—\t—\n" +
                "4th\t5\t4\t3\t—\t—\t—\n" +
                "5th\t5\t4\t3\t2\t—\t—\n" +
                "6th\t5\t4\t4\t3\t—\t—\n" +
                "7th\t6\t5\t4\t3\t2\t—\n" +
                "8th\t6\t5\t4\t4\t3\t—\n" +
                "9th\t6\t5\t5\t4\t3\t2\n" +
                "10th\t6\t5\t5\t4\t4\t3\n" +
                "\n" +
                " Wis Score\t———— Bonus Spells by Spell Level ————\n" +
                "\t0\t1\t2\t3\t4\t5\n" +
                "12–13\t—\t1\t—\t—\t—\t—\n" +
                "14–15\t—\t1\t1\t—\t—\t—\n" +
                "16–17\t—\t1\t1\t1\t—\t—\n" +
                "18–19\t—\t1\t1\t1\t1\t—\n" +
                "20–21\t—\t2\t1\t1\t1\t1\n" +
                "22–23\t—\t2\t2\t1\t1\t1\n" +
                "The Acolyte meditates or prays for her spells, receiving them through her own strength of faith or as divine inspiration. The Acolyte must spend 1 hour each day in quiet contemplation or supplication to regain her daily allotment of spells. Time spent resting has no effect on the Acolyte’s spell preparation. To learn, prepare, or cast a spell, an Acolyte must have a Wisdom score of at least 10 + the spell’s level. \n" +
                "An Acolyte can prepare a lower-level spell in place of a higher-level one if she desires. \n" +
                "An Acolyte may prepare and cast any spell on the divine spell list, provided she can cast spells of that level.\n" +
                "The Difficulty Class of a saving throw to resist the effects of an Acolyte’s spell is 10 + the spell’s level + the Acolyte’s Wisdom modifier.\n" +
                "Turn or Rebuke Undead\n" +
                "Starting at 2nd level, an Acolyte gains the supernatural ability to affect undead creatures, such as zombies, skeletons, ghosts, and vampires. The Acolyte’s allegiance (good or evil) determines the effect she can have on these unholy abominations. A character of the good allegiance can turn undead, driving them away or perhaps destroying them. One of the evil allegiance can use negative energy to rebuke undead, causing the creatures to cower in her presence. (In the text that follows, up to the section on Effect and Duration of Turning, “turning” refers to turning or rebuking, whichever is appropriate for a particular Acolyte.)\n" +
                "How Turning Works: An Acolyte can turn undead (or other types of creatures at higher level) as an attack action. Doing so does not provoke an attack of opportunity. An Acolyte must present her holy symbol to make a turning attempt, holding it in one hand in such a way that it is visible to the creatures she wants to affect.\n" +
                "Times per Day: An Acolyte may attempt to turn a number of times per day equal to 3 + her Charisma modifier.\n" +
                "Range: The Acolyte turns the closest turnable creature first. She can’t turn creatures that are more than 60 feet away or that have total cover.\n" +
                "Turning Check: First, roll a turning check to determine how powerful a creature you can turn. This is a Charisma check (1d20 + Charisma modifier). The table below shows the Hit Dice of the most powerful creature you can affect, relative to your Acolyte level. With a given turning attempt, you can’t turn any creature whose Hit Dice exceeds the result of your turning check.\n" +
                "Turning Check Result\tMost Powerful Creature Affected (Maximum Hit Dice)\n" +
                "0 or lower\tAcolyte level –4\n" +
                "1–3\tAcolyte level –3\n" +
                "4–6\tAcolyte level –2\n" +
                "7–9\tAcolyte level –1\n" +
                "10–12\tAcolyte level\n" +
                "13–15\tAcolyte level +1\n" +
                "16–18\tAcolyte level +2\n" +
                "19–21\tAcolyte level +3\n" +
                "22 or higher\tAcolyte level +4\n" +
                "Turning Damage: If your turning check result is high enough to let you turn at least some of the undead (or other appropriate) creatures within 60 feet, roll 2d6 and add your Acolyte level and your Charisma modifier to the result to determine turning damage. That’s how many total Hit Dice of undead (or other) creatures you can turn on this attempt.\n" +
                "You may skip over already turned creatures that are still within range so that you don’t waste your turning capacity on them.\n" +
                "Effect and Duration of Turning: Turned creatures flee from the Acolyte by the best and fastest means available to them. A turned creature flees for 10 rounds (1 minute). If it can’t flee, it cowers (can take no actions, –2 penalty to Defense).\n" +
                "If the Acolyte moves to within 10 feet of a cowering turned creature, it overcomes the turning and can act normally. (The Acolyte can be standing within 10 feet of the creature without breaking the turning effect; she just can’t approach any closer to the creature.) The Acolyte can attack a turned and cowering creature with ranged attacks from more than 10 feet away, and others can attack in any fashion, without breaking the turning effect.\n" +
                "Destroying Undead: If the Acolyte has twice as many Acolyte levels (or more) as the undead has Hit Dice, she destroys any creature that she would normally turn.\n" +
                "Evil Acolytes and Undead: An Acolyte with the evil allegiance channels negative energy to rebuke (awe) or command (control) undead, instead of turning or destroying them. An evil Acolyte makes the equivalent of a turning check. Creatures that would be turned are rebuked instead, and those that would be destroyed are commanded.\n" +
                "Rebuked: A rebuked creature cowers as if in awe (can take no actions, –2 penalty to Defense) for 10 rounds.\n" +
                "Commanded: A commanded creature falls under the mental control of the Acolyte. The Acolyte can give mental orders to a commanded creature as an attack action. The Acolyte can command any number of creatures whose total Hit Dice don’t exceed her Acolyte level. She may voluntarily relinquish command in order to establish command on different creatures.\n" +
                "Dispel Turning: An evil Acolyte may dispel the turning effect of a good Acolyte. To do so, the evil Acolyte makes a turning check as if attempting to rebuke. If the turning check result is equal to or greater than the turning check result that the good Acolyte scored when turning them, then the creatures are no longer turned. The evil Acolyte rolls turning damage to see how many Hit Dice worth of creatures she can affect in this way.\n" +
                "Bolster Undead: An evil Acolyte may bolster creatures against turning effects in advance. She makes a turning check as if attempting to rebuke them, but the Hit Dice result becomes the creatures’ effective Hit Dice as far as turning is concerned (provided the result is higher than the creatures’ normal Hit Dice). This bolstering lasts for 10 rounds.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, the Acolyte gets a bonus feat. The bonus feat must be selected from the following list, and the Acolyte must meet all the prerequisites of the feat to select it.\n" +
                "Animal Affinity, Archaic Weapons Proficiency, Armor Proficiency (light), Attentive, Combat Expertise, Educated, Frightful Presence, Iron Will, Medical Expert, Studious, Trustworthy.\n" +
                "Spontaneous Casting\n" +
                "An Acolyte of 4th level or higher can channel stored energy into spells she has not prepared ahead of time. The Acolyte “loses” a prepared spell to cast another spell of the same level or lower.\n" +
                "An Acolyte with a good allegiance can spontaneously cast cure spells (spells with “cure” in their name). An Acolyte with an evil allegiance can spontaneously convert prepared spells into inflict spells (spells with “inflict” in their name).\n" +
                "Combat Casting\n" +
                "At 5th level, the Acolyte becomes adept at casting spells during combat. She gets a +4 bonus on Concentration checks made to cast a spell while on the defensive.\n" +
                "Turn or Rebuke Magical Beast\n" +
                "At 7th level, the Acolyte gains the supernatural ability to affect magical beasts. This ability works just like turning undead, except the creature type is magical beast. Magical beasts, unlike undead creatures, can’t be destroyed or commanded. All other rules pertaining to turning apply. The number of times per day the Acolyte can make a turning attempt (3 + Cha modifier) does not increase.\n" +
                "Turn or Rebuke Outsider\n" +
                "At 8th level, the Acolyte gains the supernatural ability to affect outsiders. This ability works just like turning undead and magical beasts, except the creature type is outsider. Outsiders, unlike undead creatures, can’t be destroyed or commanded. All other rules pertaining to turning apply. The number of times per day the Acolyte can make a turning attempt (3 + Cha modifier) does not increase.\n" +
                "Maximize Spell\n" +
                "At 10th level, an Acolyte learns to cast some of her spells to maximum effect. All variable, numeric effects of a maximized spell automatically achieve their maximum values. A maximized spell deals the most possible points of damage, affects the maximum number of targets, and so forth, as appropriate. Saving throws and opposed checks are not affected. Spells without random variables are not affected. \n" +
                "When a maximized spell is prepared, it is treated as a spell of three levels higher than the spell’s actual level.\n";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "ENGINEER";
        tmp.description = "Engineers can range from craftsmen to scientist.";
        tmp.heroContent = "Training\n" +
                "\n" +
                "The following are Training for the Engineer.\n" +
                "\n" +
                "Advanced Training - Advanced Engineering\n" +
                "\n" +
                "Prerequisite: Reconfigure\n" +
                "\n" +
                "Benefit: An Engineer gains access to Advanced Training. You also gain any one of the Item Creation feats.\n" +
                "\n" +
                "ADVANCED TRAINING – STRANGE SCIENCE\n" +
                "\n" +
                "Prerequisite: Advanced Training - Advanced Engineering\n" +
                "\n" +
                "Benefit: An Engineer knows how to create an item with a special ability the same as you would a magic item. The magic item creation feats are required and the appropriate craft skill is used in place of the Spellcraft skill.\n" +
                "\n" +
                "These special abilities are based in technology rather magic, but with the same game modifications. The GM will decide if a certain magical effect can be replicated in a technology version.\n" +
                "\n" +
                "For all skill checks, the appropriate craft skill is used instead of the Spellcraft skill.\n" +
                "\n" +
                "If a certain spell is required to create a special ability, you use any spell, but the spell level is base on the chart below using the character's Craft skill ranks.\n" +
                "\n" +
                "Craft Ranks\tSpell Level\n" +
                "10\t0\n" +
                "12\t0\n" +
                "13\t1\n" +
                "14\t1\n" +
                "15\t2\n" +
                "16\t2\n" +
                "17\t3\n" +
                "18\t3\n" +
                "19\t4\n" +
                "20\t4\n" +
                "21\t5\n" +
                "22\t5\n" +
                "23\t6\n" +
                "24\t6\n" +
                "25\t7\n" +
                "26\t7\n" +
                "27\t8\n" +
                "28\t8\n" +
                "29\t9\n" +
                "30\t9\n" +
                "To use the spell to create a special ability, you must make a Craft (skill required) check DC 10 + spell level.\n" +
                "\n" +
                "All engineered special abilities items are considered non-magical.\n" +
                "\n" +
                "Keep in mind to convert all GP prices to USD: 1 silver piece is to 1 US dollar. Example: 1 gold piece is equal to 10 US dollars\n" +
                "\n" +
                "Breakthrough\n" +
                "\n" +
                "Benefit: An Engineer receives credit for an engineering breakthrough that earns him recognition of his or her peers.\n" +
                "\n" +
                "The Engineer gains 10 points in Fame with a Faction.This can be taken again.\n" +
                "\n" +
                "Engineering Improvisation\n" +
                "\n" +
                "Benefit: An Engineer gains the ability to improvise solutions using common objects and engineering know-how. This ability lets the Engineer create objects in a dramatic situation quickly and cheaply, but that have a limited duration.\n" +
                "\n" +
                "By combining common objects with a Craft check that corresponds to the function desired, the Engineer can build a tool or device to deal with any situation.\n" +
                "\n" +
                "Electronic devices, special tools, weapons, mechanical devices and more can be built with engineering improvisation.\n" +
                "\n" +
                "It takes a full-round action to make an object with engineering improvisation. The object, when put into use, lasts for a number of rounds equal to the Engineer's ranks in the Craft skill (or for each Hero Point used) before it breaks down. It can't be repaired.\n" +
                "\n" +
                "Improve Kit\n" +
                "\n" +
                "Prerequisite: See below\n" +
                "\n" +
                "Benefit: An Engineer can improve any skill tool kit with an extra +2 circumstance bonus. The Engineer will need to the same skill as the tool kit in order to improve the tool kit.\n" +
                "\n" +
                "Improved Quick Craft\n" +
                "\n" +
                "Prerequisite: Quick Craft\n" +
                "\n" +
                "Benefit: An Engineer learns how to craft objects more quickly than normal.\n" +
                "\n" +
                "When using any Craft skill, the Engineer reduces the time usage by 1/2.\n" +
                "\n" +
                "Improvised Tool Master\n" +
                "\n" +
                "Benefit: An Engineer does not need a tool kit for any of his Craft skills.\n" +
                "\n" +
                "If the Engineer uses a kit he receives an additional +2 bonus to skill checks.\n" +
                "\n" +
                "Quick Craft\n" +
                "\n" +
                "Benefit: An Engineer learns how to craft objects more quickly than normal.\n" +
                "\n" +
                "When using any Craft skill, the Engineer reduces the time required by 1/4.\n" +
                "\n" +
                "Reconfigure\n" +
                "\n" +
                "Prerequisite: Superior Repair\n" +
                "\n" +
                "Benefit: An Engineer knows how to temporarily create an item with an Engineered Special Ability (item creation feats are not required.)\n" +
                "\n" +
                "Engineered Special Abilities are the same as Magic items Special Abilities, but are based in technology rather magic with these modifications (the GM will decide if a magical effect can be replicated in a technology version.\n" +
                "\n" +
                "For all skill checks, the appropriate craft skill is used instead of the Spellcraft skill.\n" +
                "\n" +
                "Engineered Special Abilities items are considered non-magical.\n" +
                "\n" +
                "The Engineer must spend 1 hour working with the item to temporary upgrade it. There is no cost, but the Engineered Special Ability only last for 1 round or use, per level or Hero Point spent.\n" +
                "\n" +
                "Reconfigure Weapon\n" +
                "\n" +
                "Benefit: An Engineer can reconfigure a melee or ranged weapon, improving one aspect of it. Reconfiguring a weapon requires 1 hour of work and a successful craft check (DC 20); reconfiguring a mastercraft weapon is slightly harder (DC 20 + the weapon's mastercraft bonus feature). An Engineer may take 10 or take 20 on this check.\n" +
                "\n" +
                "The reconfiguration imposes a –1 penalty on attack rolls made with the weapon but grants one of the following benefits indefinitely:\n" +
                "\n" +
                "Changed Rate of Fire: The reconfiguration changes the weapon's rate of fire. A semiautomatic-only weapon switches to an automatic-only weapon, or vice versa. This benefit applies only to a ranged weapon with either a semiautomatic or automatic fire setting.\n" +
                "Greater Ammo Capacity: The reconfigured weapon can hold 50% more ammunition than normal. This benefit applies only to weapons that take ammunition.\n" +
                "Greater Concealment: The reconfiguration grants a +2 bonus on Sleight of Hand checks made to conceal the reconfigured weapon.\n" +
                "Greater Range Increment: The reconfigured weapon's range increment increases by 1 range increment. This benefit applies only to weapons with range increments.\n" +
                "Signature Shooter: The weapon is reconfigured for a single individual's use only and is treated as a unique exotic weapon. Anyone else who uses the weapon takes a –4 non-proficient penalty on attack rolls.\n" +
                "Weapons can be reconfigured multiple times; each time a weapon is reconfigured, it imparts a new benefit. Undoing an Engineer's weapon reconfiguration requires 1 hour and a successful Disable Device check (DC 20 + the Engineer's class level).\n" +
                "\n" +
                "Sabotage\n" +
                "\n" +
                "Benefit: The Engineer can sabotage an object so that it operates poorly. The Engineer must succeed on a Disable Device check (DC 20) to accomplish the downgrade and sabotaging a mastercraft object is slightly harder (DC 20 + the mastercraft object's bonus feature). Noticing the Engineer's handiwork without first testing the sabotaged device requires a successful Perception check (DC = the Engineer's Disable Device check result). Fixing the sabotaged item requires a successful Craft check.\n" +
                "\n" +
                "Sabotaging a Device: As a full-round action, the Engineer can reconfigure so that anyone who uses it suffers a penalty equal to the Engineer's class level on skill checks made to use the device.\n" +
                "Sabotaging a Weapon: As a full-round action, the Engineer can sabotage a weapon so that it has the broken condition the next time it is used. A sabotaged weapon cannot be used effectively until repaired. This use of sabotage also applies to vehicles.\n" +
                "Superior Repair\n" +
                "\n" +
                "Prerequisite: Engineering Improvisation\n" +
                "\n" +
                "Benefit: An Engineer can convert a non-masterwork item into its masterwork equivalent.\n" +
                "\n" +
                "A normal firearm becomes a masterwork firearm, a suit of armor becomes a masterwork suit of armor, a set of tools becomes masterwork tools, etc.\n" +
                "\n" +
                "The Engineer must spend 1 hour working with the item to upgrade it.\n" +
                "\n" +
                "Unflustered\n" +
                "\n" +
                "Benefit: Engineer can perform complicated tasks without provoking attacks of opportunity from adjacent foes.\n" +
                "\n" +
                "During any round in which the Engineer uses a craft skill, he can use the desired skill without provoking attacks of opportunity.";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "PHYSICIAN";
        tmp.description = "A physician varies from a medic to a doctor.";
        tmp.heroContent = "Training\n" +
                "\n" +
                "The following are Training for a Physician.\n" +
                "\n" +
                "Advanced Training - Advanced Healing\n" +
                "\n" +
                "Prerequisite: Healer\n" +
                "\n" +
                "Benefit: A Physician gains access to Advanced Training. You also gain the Healing Domain and all of its powers. This is not magical in nature but a representation of modern medical procedures.\n" +
                "\n" +
                "ADVANCED TRAINING – MEDICAL PROCEDURE\n" +
                "\n" +
                "Prerequisite: Advanced Training - Advanced Healing\n" +
                "\n" +
                "Benefit: A Physician knows how to “cast” a spell from the Healing Domain. This is not magical but a representation of modern medical procedures. The GM will decide if a certain spell can be replicated in a modern medical adaptation.\n" +
                "\n" +
                "To cast the healing spell for a medical procedure, the character must use 1 Hero Point and make a Heal check DC 10 + spell level.\n" +
                "\n" +
                "The level of spell the Physician can employ is based on his ranks in the Heal skill.\n" +
                "\n" +
                "Heal Ranks\tSpell Level\n" +
                "10\t0\n" +
                "12\t0\n" +
                "13\t1\n" +
                "14\t1\n" +
                "15\t2\n" +
                "16\t2\n" +
                "17\t3\n" +
                "18\t3\n" +
                "19\t4\n" +
                "20\t4\n" +
                "21\t5\n" +
                "22\t5\n" +
                "23\t6\n" +
                "24\t6\n" +
                "25\t7\n" +
                "26\t7\n" +
                "27\t8\n" +
                "28\t8\n" +
                "29\t9\n" +
                "20\t9\n" +
                "All medical healing is considered non-magical.\n" +
                "\n" +
                "Calming Touch\n" +
                "\n" +
                "Benefit: For one Hero Point per individual, the Physician can relieve the individual of a condition. Your touch can remove the dazed, fatigued, shaken, or staggered condition.\n" +
                "\n" +
                "Healer\n" +
                "\n" +
                "Benefit: The Physician can heal Hit Point damage 1d4 per ranks the Heal skill.\n" +
                "\n" +
                "In addition, for another Hero Point spent, the Physician can increase his healing dice by one (from a d4 to a d6).\n" +
                "\n" +
                "Medical Miracle\n" +
                "\n" +
                "Prerequisite: Minor Medical Miracle\n" +
                "\n" +
                "Benefit: A Physician can revive a character reduced to –10 hit points or lower. If the Physician is able to administer aid within 10 rounds of the character's death, he or he can make a Heal check.\n" +
                "\n" +
                "Heal skill - DC 20 + the negative Hit Points\n" +
                "\n" +
                "If the check succeeds, the dead character can make a Fortitude save (DC 10 + the negative Hit Points) to stabilize and be restored to 1d6 hit points.\n" +
                "\n" +
                "If the Physician fails the skill check or the patient fails the Fortitude save, the dead character can't be restored.\n" +
                "\n" +
                "Medical Quick Fix\n" +
                "\n" +
                "Benefit: For one Hero Point spent, the Physician cures 1d4 points of temporary ability damage to one of the subject's ability scores.\n" +
                "\n" +
                "Medical Specialist\n" +
                "\n" +
                "Benefit: The Physician adds 1/2 his level to Craft (pharmaceutical) and Heal skill (minimum +1).\n" +
                "\n" +
                "Minor Medical Miracle\n" +
                "\n" +
                "Prerequisite: Medical Specialist\n" +
                "\n" +
                "Benefit: A Physician can save a character reduced to –10 hit points or lower. If the Physician is able to administer aid within 5 rounds of the character's death, he or he can make a Heal check.\n" +
                "\n" +
                "Heal skill - DC 15 + the negative Hit Points\n" +
                "\n" +
                "If the check succeeds, the dead character can make a Fortitude save (DC 15 + the negative Hit Points) to stabilize and be restored to 0 hit points.\n" +
                "\n" +
                "If the Physician fails the skill check or the patient fails the save, the dead character can't be saved.\n" +
                "\n" +
                "Reduce Condition\n" +
                "\n" +
                "Prerequisite: Calming Touch\n" +
                "\n" +
                "Benefit: For one Hero Point per individual, the Physician can relieve the individual of a condition. Your touch can remove the exhausted, nauseated, sickened, or stunned condition.\n" +
                "\n" +
                "Reduce Disease\n" +
                "\n" +
                "Prerequisite: Medical Specialist\n" +
                "\n" +
                "Benefit: A Physician can cure a disease from which the subject is suffering.\n" +
                "\n" +
                "The Physician must make a Craft (pharmaceutical) check against the DC of each disease affecting the target.\n" +
                "\n" +
                "Reduce Toxin\n" +
                "\n" +
                "Prerequisite: Medical Specialist\n" +
                "\n" +
                "Benefit: A Physician can detoxify any sort of poison, drug, or toxin in the individual or object touched.\n" +
                "\n" +
                "The Physician must make a Craft (pharmaceutical) check against the DC of each poison affecting the target. Success means that the poison is neutralized.\n" +
                "\n" +
                "A cured individual suffers no additional effects from the poison and any temporary effects are ended, but the check does not reverse instantaneous effects, such as hit point damage, temporary ability damage, or effects that don't go away on their own.\n" +
                "\n" +
                "Therapy\n" +
                "\n" +
                "Prerequisite: Medical Specialist\n" +
                "\n" +
                "Benefit: For one Hero Point spent, the Physician cures 1 point of permanent ability damage to one of the subject's ability scores.\n" +
                "\n" +
                "This takes one month to heal. This is reduced by 1 day per each rank in the Heal skill.";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "ROAD WARRIOR";
        tmp.description = "The Road Warrior vies for supremacy on the crumbling roads of the postapocalyptic world. On the \n" +
                "empty highways bands of Road Warriors, both \n" +
                "marauders and crusaders, maintain and salvage \n" +
                "the best vehicles they can acquire for the purpose \n" +
                "of dominating the routes between settlements. For \n" +
                "the Road Warrior, a vehicle is both armor and \n" +
                "weapon, and battles take place at speeds sometimes reaching a hundred miles per hour. A few \n" +
                "Road Warriors apply their skills with small aircraft and take to the sky rather than doing battle \n" +
                "on the roadways.\n" +
                " Groups of malign Road Warriors are commonly \n" +
                "interested in controlling heavily traveled routes \n" +
                "between settlements so that they can extort trade \n" +
                "goods. When not harassing other motorists, Road \n" +
                "Warrior bands often raid settlements. While the \n" +
                "accumulation of booty benefits these groups, their \n" +
                "main goal is usually the acquisition of fuel.\n" +
                " On the other end of the spectrum are those who \n" +
                "take to the roads trying to end the tyranny of the \n" +
                "gangers. These crusaders are just as dependent \n" +
                "upon fuel as their malicious counterparts, but they \n" +
                "salvage what they can from wrecks and abandoned \n" +
                "vehicles, and attempt to find more peaceful ways \n" +
                "of obtaining fuel through trade.";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Road Warrior, a character \n" +
                "must fulfill the following criteria.\n" +
                "Base Attack Bonus:+2.\n" +
                "Skills:Craft (mechanical) 4 ranks, Drive 6 \n" +
                "ranks.\n" +
                "Class Information\n" +
                "The following information pertains to the Road \n" +
                "Warrior advanced class.\n" +
                "Hit Die\n" +
                "The Road Warrior gains 1d8 hit points per level. \n" +
                "The character’s Constitution modifier applies.\n" +
                "Action Points\n" +
                "A Road Warrior gains a number of action points \n" +
                "equal to 6 + one-half her character level, rounded \n" +
                "down, every time she attains a new level in this \n" +
                "class.\n" +
                "Class Skills\n" +
                "The Road Warrior’s class skills are as follows.\n" +
                " Balance (Dex), Craft (mechanical), Demolitions \n" +
                "(Int), Drive (Dex), Intimidate (Cha), Jump (Str), \n" +
                "Knowledge (current events, tactics) (Int), Listen \n" +
                "( Wis), Navigate (Int), Pilot, Read/Write Language \n" +
                "(none), Ride (Dex), Speak Language (none), Spot \n" +
                "(Wis), Survival (Wis).\n" +
                "Skill Points at Each Level:5 + Int modifier.\n" +
                "Class Features\n" +
                "The following features pertain to the Road \n" +
                "Warrior advanced class.\n" +
                "Improved Vehicle \n" +
                "Modification\n" +
                "A Road Warrior is adept at \n" +
                "modifying vehicles. She gains a \n" +
                "competence bonus on Craft \n" +
                "(mechanical) checks when making vehicle modifications (see page 31) \n" +
                "equal to one-half her class level (rounded down).\n" +
                "Improved Retain Control\n" +
                "At 2nd level a Road Warrior becomes better able \n" +
                "to control her vehicle in difficult circumstances. \n" +
                "She receives a +2 competence bonus when making \n" +
                "a Drive check to retain control of her vehicle.\n" +
                "Bonus Feat\n" +
                "At 3rd, 6th, and 9th level, a Road Warrior gets a \n" +
                "bonus feat. The bonus feat must be selected from \n" +
                "the following list, and the Road Warrior must meet \n" +
                "all the prerequisites of the feat to select it.\n" +
                " Advanced Firearms Proficiency, Aircraft \n" +
                "Operation, Archaic Weapons Proficiency, Armor \n" +
                "Proficiency (light), Armor Proficiency (medium), \n" +
                "Brawl, Burst Fire, Cleave, Combat Reflexes, Double \n" +
                "Tap, Expert Scrounger*, Far Shot, Great Cleave, \n" +
                "Improved Brawl, Improved Knockout Punch, Mutation Immunity*, Power Attack, Rad Soaker*, Thrifty \n" +
                "Mechanic*, Vehicle Dodge, Vehicle Expert. \n" +
                " *Indicates a feat described in this chapter.\n" +
                "Shot on the Move\n" +
                "At 4th level, a Road Warrior is highly skilled at \n" +
                "timing her attacks. She may take an attack action \n" +
                "at any point during her vehicle’s movement.\n" +
                "Skillful Boarding\n" +
                "At 5th level, a Road Warrior becomes \n" +
                "skilled at jumping onto the exterior \n" +
                "of the vehicles of her enemies. \n" +
                "When making a \n" +
                "Jump check \n" +
                "to jump between moving vehicles while moving, a Road \n" +
                "Warrior gets a bonus equal to her class level.\n" +
                "Off-Roader\n" +
                "At 7th level, a Road Warrior’s skills off-road \n" +
                "become highly developed. The check/roll modifier for the vehicle’s speed category is not doubled \n" +
                "when a Road Warrior drives off-road. The Drive \n" +
                "check penalty for the terrain type (see page 36) \n" +
                "still applies.\n" +
                "Collision Control\n" +
                "At 8th level, a Road Warrior has perfected the art \n" +
                "of using the capabilities of one vehicle against the \n" +
                "inherent weaknesses of another, able to expertly \n" +
                "land a crippling blow against her opponent’s \n" +
                "vehicle when ramming. At the Road Warrior’s \n" +
                "discretion, the smallest vehicle involved in a \n" +
                "collision may be treated as though it is one size \n" +
                "larger or smaller for the purpose of determining the damage caused by the collision. A Road \n" +
                "Warrior may use this ability even if she did not \n" +
                "instigate the collision.\n" +
                "Free Driving\n" +
                "At 10th level, a Road Warrior has perfected the skill \n" +
                "of combat while behind the wheel. She is able to \n" +
                "drive any ground vehicle as a free action. (Drive \n" +
                "checks made to perform a second stunt require a \n" +
                "move action.)Table 3–1: The Road Warrior\n" +
                "Class Base Attack Fort Ref Will  Defense Reputation \n" +
                "Level Bonus Save Save Save Special  Bonus Bonus\n" +
                "1st  +0  +1  +1  +0  Improved vehicle modification  +1  +0\n" +
                "2nd  +1  +2  +2  +0  Improved retain control  +1  +0\n" +
                "3rd +2 +2 +2 +1 Bonus feat  +2 +0\n" +
                "4th  +3  +2  +2  +1  Shot on the move  +2  +0\n" +
                "5th +3 +3 +3 +1 Skillful boarding  +3 +1\n" +
                "6th +4 +3 +3 +2 Bonus feat  +3 +1\n" +
                "7th +5 +4 +4 +2 Off-roader  +4 +1\n" +
                "8th +6 +4 +4 +2 Collision control  +4 +1\n" +
                "9th +6 +4 +4 +3 Bonus feat  +5 +2\n" +
                "10th +7 +5 +5 +3 Free driving  +5 +2";
        tmp.isBasic = false;
        list.add(tmp);

        tmp = new DClass();
        tmp.name = "SALVAGER";
        tmp.description = "The Salvager is a master scrounger, adept at finding \n" +
                "long-lost treasures and useful items in the wastes \n" +
                "of the apocalypse. He has an uncanny knack for \n" +
                "locating items that others have overlooked, as \n" +
                "well as being able to repair gear that appears too \n" +
                "mangled to be worth anything. A Salvager can be \n" +
                "a community’s savior, finding goods needed for \n" +
                "survival, or he might be a stingy merchant who \n" +
                "sells his find to the highest bidder.\n" +
                " Select this advanced class if you want your character to excel at finding and making the most of \n" +
                "useful goods among the dwindling resources of \n" +
                "the postapocalyptic world.\n" +
                " The fastest path into this advanced class is from \n" +
                "the Smart hero basic class, though other paths are \n" +
                "possible.";
        tmp.heroContent = "Requirements\n" +
                "To qualify to become a Salvager, a character must \n" +
                "fulfill the following criteria.\n" +
                "Skills:Disable Device 6 ranks, Repair 6 ranks, \n" +
                "Search 6 ranks.\n" +
                "Feat:Expert Scrounger*.\n" +
                " *Indicates a feat described in this chapter.\n" +
                "Class Information\n" +
                "The following information pertains to the Salvager \n" +
                "advanced class.\n" +
                "Hit Die\n" +
                "The Salvager gains 1d6 hit points per level. The \n" +
                "character’s Constitution modifier applies.\n" +
                "Action Points\n" +
                "The Salvager gains a number of action points equal \n" +
                "to 6 + one-half his character level, rounded down, \n" +
                "every time he attains a new level in this class.\n" +
                "Class Skills\n" +
                "The Salvager’s class skills are as follows.\n" +
                " Computer Use (Int), Craft (electronic, mechanical) \n" +
                "(Int), Decipher Script (Int), Diplomacy (Cha), Disable Device (Int), Drive (Dex), Knowledge (current \n" +
                "events, earth and life sciences, physical sciences, \n" +
                "technology) (Int), Navigate (Int), Read/Write Language (none), Repair (Int), Search (Int), Speak \n" +
                "Language (none), Spot (Wis), Survival (Wis).\n" +
                "Skill Points at Each Level:7 + Int modifier.\n" +
                "Class Features\n" +
                "The following features pertain to the Salvager \n" +
                "advanced class.\n" +
                "Bargainer\n" +
                "A Salvager is a skilled negotiator when it comes to \n" +
                "getting the most for the materials he’s scrounged. \n" +
                "When making a Diplomacy check to affect the \n" +
                "attitude of an NPC with whom he is bartering, a \n" +
                "Salvager receives a +2 competence bonus.\n" +
                "Jury-Rig\n" +
                "A Salvager gains a +1 competence bonus on Repair \n" +
                "checks made to attempt temporary or jury-rigged \n" +
                "repairs. See the Repair skill, page 70 of the d20 Modern\n" +
                "Roleplaying Game, for details on jury-rigging.This ability increase to +2 at 4th level, +3 at 7th \n" +
                "level, and +4 at 10th level.\n" +
                "Scavenger\n" +
                "At 2nd level, the Salvager adds one-half his Salvager \n" +
                "class level (rounded down) to all Search checks \n" +
                "when scavenging (see Scavenging, page 18).\n" +
                "Mishap Sense\n" +
                "Starting at 2nd level, a Salvager has an intuitive \n" +
                "sense that alerts him to danger from potential \n" +
                "mishaps in damaged structures (see Exploring \n" +
                "Unsafe Structures, page 17), giving him a +1 bonus \n" +
                "on Reflex saves made to avoid mishaps. These \n" +
                "bonuses increase by 1 every three Salvager levels \n" +
                "thereafter (5th and 8th level).\n" +
                " Any bonuses the Salvager has from the trap sense \n" +
                "class feature apply to mishaps and stack with the \n" +
                "Salvager’s bonuses from this class feature.\n" +
                "Bonus Feats\n" +
                "At 3rd, 6th, and 9th level, a Salvager gains a bonus \n" +
                "feat. The bonus feat must be selected from the following list, and the Salvager must meet all the \n" +
                "prerequisites of the feat to select it.\n" +
                " Alertness, Archaic Weapon Proficiency, Builder, \n" +
                "Endurance, Exotic Weapon Proficiency, Fight with \n" +
                "Anything*, Gearhead, Great Fortitude, Lightning \n" +
                "Reflexes, Low Profile, Meticulous, Personal Firearms Proficiency, Renown, Shrewd Bargainer*, \n" +
                "Thrifty Mechanic*, Surface Vehicle Operation.\n" +
                " *Indicates a feat described in \n" +
                "this chapter.Treasure from Trash\n" +
                "At 7th level, a Salvager may spend an action point \n" +
                "when making a Repair check on improvised or juryrigged equipment to make the repair permanent, \n" +
                "allowing the item to be used normally.\n" +
                "Master Scavenger\n" +
                "At 10th level, a Salvager’s instincts become so acute \n" +
                "that he can find items that others simply overlook. \n" +
                "Once per day, when the Salvager finds miscellaneous items while scavenging, he can choose \n" +
                "to roll on the table below instead of the normal \n" +
                "miscellaneous items table.\n" +
                "d% Item  d%  Item\n" +
                "01–05 Ammunition kit\n" +
                "1\n" +
                "50–52 Glock 17\n" +
                "06–08  Beretta 92F  53–57  Laser sight\n" +
                "09–15 Chainsaw  58–60  Light-duty vest\n" +
                "16–22  Climbing gear  61–67  Lockpick set\n" +
                "23–25 Colt M1911  68–70  M16A2\n" +
                "26–28 Colt Python  71–73  Night-vision \n" +
                "  goggles 29–31  Concealable vest  74–80  Portable stove\n" +
                "32–36  Deluxe electrical  81–87  Standard scope\n" +
                "tool kit\n" +
                "37–41  Deluxe mechanical  88–94  Surgery kit\n" +
                "tool kit\n" +
                "42–44  Electrical  95–97  Toiletries kit\n" +
                "1\n" +
                "generator\n" +
                "1\n" +
                "45–49  Electro-optical  98–100  Undercover vest\n" +
                "binoculars\n" +
                "1 Indicates a new item described in Chapter 2\n\nTable 3–2: The Salvager\n" +
                "Class Base Attack  Fort  Ref  Will\n" +
                "Level  Bonus  Save  Save  Save  Special\n" +
                " 1st  +0  +0  +0  +2  Bargainer, jury-rig +1\n" +
                " 2nd  +1  +0  +0  +3  Scavenger, mishap sense +1\n" +
                " 3rd  +2  +1  +1  +3  Bonus feat\n" +
                " 4th  +3  +1  +1  +4  Jury-rig +2\n" +
                " 5th  +3  +1  +1  +4  Mishap sense +2\n" +
                " 6th  +4  +2  +2  +5  Bonus feat\n" +
                " 7th  +5  +2  +2  +5  Jury-rig +3, treasure from trash\n" +
                " 8th  +6/+1  +2  +2  +6  Mishap sense +3\n" +
                " 9th  +6/+1  +3  +3  +6  Bonus feat\n" +
                "10th  +7/+2  +3  +3  +7  Jury-rig +4, master scavenger";
        tmp.isBasic = false;
        list.add(tmp);

        return list;
    }
}


