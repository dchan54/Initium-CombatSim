/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

/**
 *
 * @author Derrick
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class statGUI 
{

    static double statsStrNum;
    static double statsDexNum;
    static double statsIntNum;
    static int statsMaxHPNum;

    static int helmBcNum;
    static int helmDpNum;
    static int helmDrNum;
    static double helmBludgeNum;
    static double helmPierceNum;
    static double helmSlashNum;

    static int chestBcNum;
    static int chestDpNum;
    static int chestDrNum;
    static double chestBludgeNum;
    static double chestPierceNum;
    static double chestSlashNum;

    static int shirtBcNum;
    static int shirtDpNum;
    static int shirtDrNum;
    static double shirtBludgeNum;
    static double shirtPierceNum;
    static double shirtSlashNum;

    static int glovesBcNum;
    static int glovesDpNum;
    static int glovesDrNum;
    static double glovesBludgeNum;
    static double glovesPierceNum;
    static double glovesSlashNum;

    static int legsBcNum;
    static int legsDpNum;
    static int legsDrNum;
    static double legsBludgeNum;
    static double legsPierceNum;
    static double legsSlashNum;

    static int bootsBcNum;
    static int bootsDpNum;
    static int bootsDrNum;
    static double bootsBludgeNum;
    static double bootsPierceNum;
    static double bootsSlashNum;

    static int shieldBcNum;
    static int shieldDpNum;
    static int shieldDrNum;
    static double shieldBludgeNum;
    static double shieldPierceNum;
    static double shieldSlashNum;

    static int weaponDiceNum;
    static int weaponMaxRollNum;
    static int weaponCritMultiNum;
    static int weaponCritChanceNum;
    static String weaponDmgTypeChar;
    static int weaponBcNum;
    static int weaponDpNum;
    static int weaponDrNum;
    static double weaponBludgeNum;
    static double weaponPierceNum;
    static double weaponSlashNum;

    //other variables
    public static void addComponentsToPane(Container pane) 
    {
        // Creating all the panels
        JPanel mainPanel = new JPanel(new FlowLayout());

        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new BoxLayout(statsPanel, BoxLayout.Y_AXIS));

        JPanel helmetPanel = new JPanel();
        helmetPanel.setLayout(new BoxLayout(helmetPanel, BoxLayout.Y_AXIS));

        JPanel chestPanel = new JPanel();
        chestPanel.setLayout(new BoxLayout(chestPanel, BoxLayout.Y_AXIS));

        JPanel shirtPanel = new JPanel();
        shirtPanel.setLayout(new BoxLayout(shirtPanel, BoxLayout.Y_AXIS));

        JPanel glovesPanel = new JPanel();
        glovesPanel.setLayout(new BoxLayout(glovesPanel, BoxLayout.Y_AXIS));

        JPanel legsPanel = new JPanel();
        legsPanel.setLayout(new BoxLayout(legsPanel, BoxLayout.Y_AXIS));

        JPanel bootsPanel = new JPanel();
        bootsPanel.setLayout(new BoxLayout(bootsPanel, BoxLayout.Y_AXIS));

        JPanel shieldPanel = new JPanel();
        shieldPanel.setLayout(new BoxLayout(shieldPanel, BoxLayout.Y_AXIS));

        JPanel weaponPanel = new JPanel();
        weaponPanel.setLayout(new BoxLayout(weaponPanel, BoxLayout.Y_AXIS));

        JLabel statsLabel = new JLabel("Stats", JLabel.CENTER); //Stats Column
        JPanel stats1 = new JPanel(new FlowLayout());
        JPanel stats2 = new JPanel(new FlowLayout());
        JPanel stats3 = new JPanel(new FlowLayout());
        JPanel stats4 = new JPanel(new FlowLayout());

        JLabel statsStr = new JLabel("Str: ", JLabel.CENTER);
        JTextField statsStrVar = new JTextField();
        statsStrVar.setPreferredSize(new Dimension(38, 23));
        stats1.add(statsStr);
        stats1.add(statsStrVar);

        JLabel statsDex = new JLabel("Dex: ", JLabel.CENTER);
        JTextField statsDexVar = new JTextField();
        statsDexVar.setPreferredSize(new Dimension(38, 23));
        stats2.add(statsDex);
        stats2.add(statsDexVar);

        JLabel statsInt = new JLabel("Int: ", JLabel.CENTER);
        JTextField statsIntVar = new JTextField();
        statsIntVar.setPreferredSize(new Dimension(38, 23));
        stats3.add(statsInt);
        stats3.add(statsIntVar);

        JLabel statsMaxHP = new JLabel("Max HP: ", JLabel.CENTER);
        JTextField statsMaxHPVar = new JTextField();
        statsMaxHPVar.setPreferredSize(new Dimension(38, 23));
        stats4.add(statsMaxHP);
        stats4.add(statsMaxHPVar);

        statsPanel.add(statsLabel);
        JPanel stats[] = new JPanel[4];
        stats[0] = stats1;
        stats[1] = stats2;
        stats[2] = stats3;
        stats[3] = stats4;
        for (int i = 0; i < stats.length; i++) 
        {
            statsPanel.add(stats[i]);
        }

        JLabel helmLabel = new JLabel("Helmet", JLabel.CENTER); //Helmet Column
        JPanel helm1 = new JPanel(new FlowLayout());
        JPanel helm2 = new JPanel(new FlowLayout());
        JPanel helm3 = new JPanel(new FlowLayout());
        JPanel helm4 = new JPanel(new FlowLayout());
        JPanel helm5 = new JPanel(new FlowLayout());
        JPanel helm6 = new JPanel(new FlowLayout());
        //create rest of Rows for helm 
        JLabel helmBc = new JLabel("BC: ", JLabel.CENTER);
        JTextField helmBcVar = new JTextField();
        helmBcVar.setPreferredSize(new Dimension(38, 23));
        helm1.add(helmBc);
        helm1.add(helmBcVar);

        JLabel helmDp = new JLabel("DP: ", JLabel.CENTER);
        JTextField helmDpVar = new JTextField();
        helmDpVar.setPreferredSize(new Dimension(38, 23));
        helm2.add(helmDp);
        helm2.add(helmDpVar);

        JLabel helmDr = new JLabel("DR: ", JLabel.CENTER);
        JTextField helmDrVar = new JTextField();
        helmDrVar.setPreferredSize(new Dimension(38, 23));
        helm3.add(helmDr);
        helm3.add(helmDrVar);

        JLabel helmBludge = new JLabel("Bludge: ", JLabel.CENTER);
        JTextField helmBludgeVar = new JTextField();
        helmBludgeVar.setPreferredSize(new Dimension(38, 23));
        helm4.add(helmBludge);
        helm4.add(helmBludgeVar);

        JLabel helmPierce = new JLabel("Pierce: ", JLabel.CENTER);
        JTextField helmPierceVar = new JTextField();
        helmPierceVar.setPreferredSize(new Dimension(38, 23));
        helm5.add(helmPierce);
        helm5.add(helmPierceVar);

        JLabel helmSlash = new JLabel("Slash: ", JLabel.CENTER);
        JTextField helmSlashVar = new JTextField();
        helmSlashVar.setPreferredSize(new Dimension(38, 23));
        helm6.add(helmSlash);
        helm6.add(helmSlashVar);
        //create rest of variables

        helmetPanel.add(helmLabel);
        JPanel helm[] = new JPanel[6];
        helm[0] = helm1;
        helm[1] = helm2;
        helm[2] = helm3;
        helm[3] = helm4;
        helm[4] = helm5;
        helm[5] = helm6;
        for (int i = 0; i < helm.length; i++) 
        {
            helmetPanel.add(helm[i]);
        }

        JLabel chestLabel = new JLabel("Chest", JLabel.CENTER);
        JPanel chest1 = new JPanel(new FlowLayout());
        JPanel chest2 = new JPanel(new FlowLayout());
        JPanel chest3 = new JPanel(new FlowLayout());
        JPanel chest4 = new JPanel(new FlowLayout());
        JPanel chest5 = new JPanel(new FlowLayout());
        JPanel chest6 = new JPanel(new FlowLayout());

        JLabel chestBc = new JLabel("BC: ", JLabel.CENTER);
        JTextField chestBcVar = new JTextField();
        chestBcVar.setPreferredSize(new Dimension(38, 23));
        chest1.add(chestBc);
        chest1.add(chestBcVar);

        JLabel chestDp = new JLabel("DP: ", JLabel.CENTER);
        JTextField chestDpVar = new JTextField();
        chestDpVar.setPreferredSize(new Dimension(38, 23));
        chest2.add(chestDp);
        chest2.add(chestDpVar);

        JLabel chestDr = new JLabel("DR: ", JLabel.CENTER);
        JTextField chestDrVar = new JTextField();
        chestDrVar.setPreferredSize(new Dimension(38, 23));
        chest3.add(chestDr);
        chest3.add(chestDrVar);

        JLabel chestBludge = new JLabel("Bludge: ", JLabel.CENTER);
        JTextField chestBludgeVar = new JTextField();
        chestBludgeVar.setPreferredSize(new Dimension(38, 23));
        chest4.add(chestBludge);
        chest4.add(chestBludgeVar);

        JLabel chestPierce = new JLabel("Pierce: ", JLabel.CENTER);
        JTextField chestPierceVar = new JTextField();
        chestPierceVar.setPreferredSize(new Dimension(38, 23));
        chest5.add(chestPierce);
        chest5.add(chestPierceVar);

        JLabel chestSlash = new JLabel("Slash: ", JLabel.CENTER);
        JTextField chestSlashVar = new JTextField();
        chestSlashVar.setPreferredSize(new Dimension(38, 23));
        chest6.add(chestSlash);
        chest6.add(chestSlashVar);

        chestPanel.add(chestLabel);
        JPanel chest[] = new JPanel[6];
        chest[0] = chest1;
        chest[1] = chest2;
        chest[2] = chest3;
        chest[3] = chest4;
        chest[4] = chest5;
        chest[5] = chest6;
        for (int i = 0; i < chest.length; i++)
        {
            chestPanel.add(chest[i]);
        }

        JLabel shirtLabel = new JLabel("Shirt", JLabel.CENTER);
        JPanel shirt1 = new JPanel(new FlowLayout());
        JPanel shirt2 = new JPanel(new FlowLayout());
        JPanel shirt3 = new JPanel(new FlowLayout());
        JPanel shirt4 = new JPanel(new FlowLayout());
        JPanel shirt5 = new JPanel(new FlowLayout());
        JPanel shirt6 = new JPanel(new FlowLayout());

        JLabel shirtBc = new JLabel("BC: ", JLabel.CENTER);
        JTextField shirtBcVar = new JTextField();
        shirtBcVar.setPreferredSize(new Dimension(38, 23));
        shirt1.add(shirtBc);
        shirt1.add(shirtBcVar);

        JLabel shirtDp = new JLabel("DP: ", JLabel.CENTER);
        JTextField shirtDpVar = new JTextField();
        shirtDpVar.setPreferredSize(new Dimension(38, 23));
        shirt2.add(shirtDp);
        shirt2.add(shirtDpVar);

        JLabel shirtDr = new JLabel("DR: ", JLabel.CENTER);
        JTextField shirtDrVar = new JTextField();
        shirtDrVar.setPreferredSize(new Dimension(38, 23));
        shirt3.add(shirtDr);
        shirt3.add(shirtDrVar);

        JLabel shirtBludge = new JLabel("Bludge: ", JLabel.CENTER);
        JTextField shirtBludgeVar = new JTextField();
        shirtBludgeVar.setPreferredSize(new Dimension(38, 23));
        shirt4.add(shirtBludge);
        shirt4.add(shirtBludgeVar);

        JLabel shirtPierce = new JLabel("Pierce: ", JLabel.CENTER);
        JTextField shirtPierceVar = new JTextField();
        shirtPierceVar.setPreferredSize(new Dimension(38, 23));
        shirt5.add(shirtPierce);
        shirt5.add(shirtPierceVar);

        JLabel shirtSlash = new JLabel("Slash: ", JLabel.CENTER);
        JTextField shirtSlashVar = new JTextField();
        shirtSlashVar.setPreferredSize(new Dimension(38, 23));
        shirt6.add(shirtSlash);
        shirt6.add(shirtSlashVar);

        shirtPanel.add(shirtLabel);
        JPanel shirt[] = new JPanel[6];
        shirt[0] = shirt1;
        shirt[1] = shirt2;
        shirt[2] = shirt3;
        shirt[3] = shirt4;
        shirt[4] = shirt5;
        shirt[5] = shirt6;
        for (int i = 0; i < shirt.length; i++)
        {
            shirtPanel.add(shirt[i]);
        }

        JLabel glovesLabel = new JLabel("Gloves", JLabel.CENTER);
        JPanel gloves1 = new JPanel(new FlowLayout());
        JPanel gloves2 = new JPanel(new FlowLayout());
        JPanel gloves3 = new JPanel(new FlowLayout());
        JPanel gloves4 = new JPanel(new FlowLayout());
        JPanel gloves5 = new JPanel(new FlowLayout());
        JPanel gloves6 = new JPanel(new FlowLayout());

        JLabel glovesBc = new JLabel("BC: ", JLabel.CENTER);
        JTextField glovesBcVar = new JTextField();
        glovesBcVar.setPreferredSize(new Dimension(38, 23));
        gloves1.add(glovesBc);
        gloves1.add(glovesBcVar);

        JLabel glovesDp = new JLabel("DP: ", JLabel.CENTER);
        JTextField glovesDpVar = new JTextField();
        glovesDpVar.setPreferredSize(new Dimension(38, 23));
        gloves2.add(glovesDp);
        gloves2.add(glovesDpVar);

        JLabel glovesDr = new JLabel("DR: ", JLabel.CENTER);
        JTextField glovesDrVar = new JTextField();
        glovesDrVar.setPreferredSize(new Dimension(38, 23));
        gloves3.add(glovesDr);
        gloves3.add(glovesDrVar);

        JLabel glovesBludge = new JLabel("Bludge: ", JLabel.CENTER);
        JTextField glovesBludgeVar = new JTextField();
        glovesBludgeVar.setPreferredSize(new Dimension(38, 23));
        gloves4.add(glovesBludge);
        gloves4.add(glovesBludgeVar);

        JLabel glovesPierce = new JLabel("Pierce: ", JLabel.CENTER);
        JTextField glovesPierceVar = new JTextField();
        glovesPierceVar.setPreferredSize(new Dimension(38, 23));
        gloves5.add(glovesPierce);
        gloves5.add(glovesPierceVar);

        JLabel glovesSlash = new JLabel("Slash: ", JLabel.CENTER);
        JTextField glovesSlashVar = new JTextField();
        glovesSlashVar.setPreferredSize(new Dimension(38, 23));
        gloves6.add(glovesSlash);
        gloves6.add(glovesSlashVar);

        glovesPanel.add(glovesLabel);
        JPanel gloves[] = new JPanel[6];
        gloves[0] = gloves1;
        gloves[1] = gloves2;
        gloves[2] = gloves3;
        gloves[3] = gloves4;
        gloves[4] = gloves5;
        gloves[5] = gloves6;
        for (int i = 0; i < gloves.length; i++)
        {
            glovesPanel.add(gloves[i]);
        }

        JLabel legsLabel = new JLabel("Legs", JLabel.CENTER);
        JPanel legs1 = new JPanel(new FlowLayout());
        JPanel legs2 = new JPanel(new FlowLayout());
        JPanel legs3 = new JPanel(new FlowLayout());
        JPanel legs4 = new JPanel(new FlowLayout());
        JPanel legs5 = new JPanel(new FlowLayout());
        JPanel legs6 = new JPanel(new FlowLayout());

        JLabel legsBc = new JLabel("BC: ", JLabel.CENTER);
        JTextField legsBcVar = new JTextField();
        legsBcVar.setPreferredSize(new Dimension(38, 23));
        legs1.add(legsBc);
        legs1.add(legsBcVar);

        JLabel legsDp = new JLabel("DP: ", JLabel.CENTER);
        JTextField legsDpVar = new JTextField();
        legsDpVar.setPreferredSize(new Dimension(38, 23));
        legs2.add(legsDp);
        legs2.add(legsDpVar);

        JLabel legsDr = new JLabel("DR: ", JLabel.CENTER);
        JTextField legsDrVar = new JTextField();
        legsDrVar.setPreferredSize(new Dimension(38, 23));
        legs3.add(legsDr);
        legs3.add(legsDrVar);

        JLabel legsBludge = new JLabel("Bludge: ", JLabel.CENTER);
        JTextField legsBludgeVar = new JTextField();
        legsBludgeVar.setPreferredSize(new Dimension(38, 23));
        legs4.add(legsBludge);
        legs4.add(legsBludgeVar);

        JLabel legsPierce = new JLabel("Pierce: ", JLabel.CENTER);
        JTextField legsPierceVar = new JTextField();
        legsPierceVar.setPreferredSize(new Dimension(38, 23));
        legs5.add(legsPierce);
        legs5.add(legsPierceVar);

        JLabel legsSlash = new JLabel("Slash: ", JLabel.CENTER);
        JTextField legsSlashVar = new JTextField();
        legsSlashVar.setPreferredSize(new Dimension(38, 23));
        legs6.add(legsSlash);
        legs6.add(legsSlashVar);

        legsPanel.add(legsLabel);
        JPanel legs[] = new JPanel[6];
        legs[0] = legs1;
        legs[1] = legs2;
        legs[2] = legs3;
        legs[3] = legs4;
        legs[4] = legs5;
        legs[5] = legs6;
        for (int i = 0; i < legs.length; i++) 
        {
            legsPanel.add(legs[i]);
        }

        JLabel bootsLabel = new JLabel("Boots", JLabel.CENTER);
        JPanel boots1 = new JPanel(new FlowLayout());
        JPanel boots2 = new JPanel(new FlowLayout());
        JPanel boots3 = new JPanel(new FlowLayout());
        JPanel boots4 = new JPanel(new FlowLayout());
        JPanel boots5 = new JPanel(new FlowLayout());
        JPanel boots6 = new JPanel(new FlowLayout());

        JLabel bootsBc = new JLabel("BC: ", JLabel.CENTER);
        JTextField bootsBcVar = new JTextField();
        bootsBcVar.setPreferredSize(new Dimension(38, 23));
        boots1.add(bootsBc);
        boots1.add(bootsBcVar);

        JLabel bootsDp = new JLabel("DP: ", JLabel.CENTER);
        JTextField bootsDpVar = new JTextField();
        bootsDpVar.setPreferredSize(new Dimension(38, 23));
        boots2.add(bootsDp);
        boots2.add(bootsDpVar);

        JLabel bootsDr = new JLabel("DR: ", JLabel.CENTER);
        JTextField bootsDrVar = new JTextField();
        bootsDrVar.setPreferredSize(new Dimension(38, 23));
        boots3.add(bootsDr);
        boots3.add(bootsDrVar);

        JLabel bootsBludge = new JLabel("Bludge: ", JLabel.CENTER);
        JTextField bootsBludgeVar = new JTextField();
        bootsBludgeVar.setPreferredSize(new Dimension(38, 23));
        boots4.add(bootsBludge);
        boots4.add(bootsBludgeVar);

        JLabel bootsPierce = new JLabel("Pierce: ", JLabel.CENTER);
        JTextField bootsPierceVar = new JTextField();
        bootsPierceVar.setPreferredSize(new Dimension(38, 23));
        boots5.add(bootsPierce);
        boots5.add(bootsPierceVar);

        JLabel bootsSlash = new JLabel("Slash: ", JLabel.CENTER);
        JTextField bootsSlashVar = new JTextField();
        bootsSlashVar.setPreferredSize(new Dimension(38, 23));
        boots6.add(bootsSlash);
        boots6.add(bootsSlashVar);

        bootsPanel.add(bootsLabel);
        JPanel boots[] = new JPanel[6];
        boots[0] = boots1;
        boots[1] = boots2;
        boots[2] = boots3;
        boots[3] = boots4;
        boots[4] = boots5;
        boots[5] = boots6;
        for (int i = 0; i < boots.length; i++) 
        {
            bootsPanel.add(boots[i]);
        }

        JLabel shieldLabel = new JLabel("Shield", JLabel.CENTER);
        JPanel shield1 = new JPanel(new FlowLayout());
        JPanel shield2 = new JPanel(new FlowLayout());
        JPanel shield3 = new JPanel(new FlowLayout());
        JPanel shield4 = new JPanel(new FlowLayout());
        JPanel shield5 = new JPanel(new FlowLayout());
        JPanel shield6 = new JPanel(new FlowLayout());

        JLabel shieldBc = new JLabel("BC: ", JLabel.CENTER);
        JTextField shieldBcVar = new JTextField();
        shieldBcVar.setPreferredSize(new Dimension(38, 23));
        shield1.add(shieldBc);
        shield1.add(shieldBcVar);

        JLabel shieldDp = new JLabel("DP: ", JLabel.CENTER);
        JTextField shieldDpVar = new JTextField();
        shieldDpVar.setPreferredSize(new Dimension(38, 23));
        shield2.add(shieldDp);
        shield2.add(shieldDpVar);

        JLabel shieldDr = new JLabel("DR: ", JLabel.CENTER);
        JTextField shieldDrVar = new JTextField();
        shieldDrVar.setPreferredSize(new Dimension(38, 23));
        shield3.add(shieldDr);
        shield3.add(shieldDrVar);

        JLabel shieldBludge = new JLabel("Bludge: ", JLabel.CENTER);
        JTextField shieldBludgeVar = new JTextField();
        shieldBludgeVar.setPreferredSize(new Dimension(38, 23));
        shield4.add(shieldBludge);
        shield4.add(shieldBludgeVar);

        JLabel shieldPierce = new JLabel("Pierce: ", JLabel.CENTER);
        JTextField shieldPierceVar = new JTextField();
        shieldPierceVar.setPreferredSize(new Dimension(38, 23));
        shield5.add(shieldPierce);
        shield5.add(shieldPierceVar);

        JLabel shieldSlash = new JLabel("Slash: ", JLabel.CENTER);
        JTextField shieldSlashVar = new JTextField();
        shieldSlashVar.setPreferredSize(new Dimension(38, 23));
        shield6.add(shieldSlash);
        shield6.add(shieldSlashVar);

        shieldPanel.add(shieldLabel);
        JPanel shield[] = new JPanel[6];
        shield[0] = shield1;
        shield[1] = shield2;
        shield[2] = shield3;
        shield[3] = shield4;
        shield[4] = shield5;
        shield[5] = shield6;
        for (int i = 0; i < shield.length; i++)
        {
            shieldPanel.add(shield[i]);
        }

        JLabel weaponLabel = new JLabel("Weapon", JLabel.CENTER);
        JPanel weapon1 = new JPanel(new FlowLayout());
        JPanel weapon2 = new JPanel(new FlowLayout());
        JPanel weapon3 = new JPanel(new FlowLayout());
        JPanel weapon4 = new JPanel(new FlowLayout());
        JPanel weapon5 = new JPanel(new FlowLayout());
        JPanel weapon6 = new JPanel(new FlowLayout());
        JPanel weapon7 = new JPanel(new FlowLayout());
        JPanel weapon8 = new JPanel(new FlowLayout());
        JPanel weapon9 = new JPanel(new FlowLayout());
        JPanel weapon10 = new JPanel(new FlowLayout());
        JPanel weapon11 = new JPanel(new FlowLayout());

        JLabel weaponDice = new JLabel("Dice: ", JLabel.CENTER);
        JTextField weaponDiceVar = new JTextField();
        weaponDiceVar.setPreferredSize(new Dimension(38, 23));
        weapon1.add(weaponDice);
        weapon1.add(weaponDiceVar);

        JLabel weaponMaxRoll = new JLabel("Max Roll: ", JLabel.CENTER);
        JTextField weaponMaxRollVar = new JTextField();
        weaponMaxRollVar.setPreferredSize(new Dimension(38, 23));
        weapon2.add(weaponMaxRoll);
        weapon2.add(weaponMaxRollVar);

        JLabel weaponCritMulti = new JLabel("Crit Multi: ", JLabel.CENTER);
        JTextField weaponCritMultiVar = new JTextField();
        weaponCritMultiVar.setPreferredSize(new Dimension(38, 23));
        weapon3.add(weaponCritMulti);
        weapon3.add(weaponCritMultiVar);

        JLabel weaponCritChance = new JLabel("Crit Chance: ", JLabel.CENTER);
        JTextField weaponCritChanceVar = new JTextField();
        weaponCritChanceVar.setPreferredSize(new Dimension(38, 23));
        weapon4.add(weaponCritChance);
        weapon4.add(weaponCritChanceVar);

        JLabel weaponDmgType = new JLabel("Dmg Type: ", JLabel.CENTER);
        JTextField weaponDmgTypeVar = new JTextField();
        weaponDmgTypeVar.setPreferredSize(new Dimension(38, 23));
        weapon5.add(weaponDmgType);
        weapon5.add(weaponDmgTypeVar);

        JLabel weaponBc = new JLabel("BC: ", JLabel.CENTER);
        JTextField weaponBcVar = new JTextField();
        weaponBcVar.setPreferredSize(new Dimension(38, 23));
        weapon6.add(weaponBc);
        weapon6.add(weaponBcVar);

        JLabel weaponDp = new JLabel("DP: ", JLabel.CENTER);
        JTextField weaponDpVar = new JTextField();
        weaponDpVar.setPreferredSize(new Dimension(38, 23));
        weapon7.add(weaponDp);
        weapon7.add(weaponDpVar);

        JLabel weaponDr = new JLabel("DR: ", JLabel.CENTER);
        JTextField weaponDrVar = new JTextField();
        weaponDrVar.setPreferredSize(new Dimension(38, 23));
        weapon8.add(weaponDr);
        weapon8.add(weaponDrVar);

        JLabel weaponBludge = new JLabel("Bludge: ", JLabel.CENTER);
        JTextField weaponBludgeVar = new JTextField();
        weaponBludgeVar.setPreferredSize(new Dimension(38, 23));
        weapon9.add(weaponBludge);
        weapon9.add(weaponBludgeVar);

        JLabel weaponPierce = new JLabel("Pierce: ", JLabel.CENTER);
        JTextField weaponPierceVar = new JTextField();
        weaponPierceVar.setPreferredSize(new Dimension(38, 23));
        weapon10.add(weaponPierce);
        weapon10.add(weaponPierceVar);

        JLabel weaponSlash = new JLabel("Slash: ", JLabel.CENTER);
        JTextField weaponSlashVar = new JTextField();
        weaponSlashVar.setPreferredSize(new Dimension(38, 23));
        weapon11.add(weaponSlash);
        weapon11.add(weaponSlashVar);

        weaponPanel.add(weaponLabel);
        JPanel weapon[] = new JPanel[11];
        weapon[0] = weapon1;
        weapon[1] = weapon2;
        weapon[2] = weapon3;
        weapon[3] = weapon4;
        weapon[4] = weapon5;
        weapon[5] = weapon6;
        weapon[6] = weapon7;
        weapon[7] = weapon8;
        weapon[8] = weapon9;
        weapon[9] = weapon10;
        weapon[10] = weapon11;
        for (int i = 0; i < weapon.length; i++)
        {
            weaponPanel.add(weapon[i]);
        }

        JButton button = new JButton("Fight");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                // Collecting all the values inputted into the GUI
                statsStrNum = Double.valueOf(statsStrVar.getText());
                statsDexNum = Double.valueOf(statsDexVar.getText());
                statsIntNum = Double.valueOf(statsIntVar.getText());
                statsMaxHPNum = Integer.valueOf(statsMaxHPVar.getText());

                helmBcNum = Integer.valueOf(helmBcVar.getText());
                helmDpNum = Integer.valueOf(helmDpVar.getText());
                helmDrNum = Integer.valueOf(helmDrVar.getText());
                helmBludgeNum = Double.valueOf(helmBludgeVar.getText());
                helmPierceNum = Double.valueOf(helmPierceVar.getText());
                helmSlashNum = Double.valueOf(helmSlashVar.getText());
                
                chestBcNum = Integer.valueOf(chestBcVar.getText());
                chestDpNum = Integer.valueOf(chestDpVar.getText());
                chestDrNum = Integer.valueOf(chestDrVar.getText());
                chestBludgeNum = Double.valueOf(chestBludgeVar.getText());
                chestPierceNum = Double.valueOf(chestPierceVar.getText());
                chestSlashNum = Double.valueOf(chestSlashVar.getText());
                        
                shirtBcNum = Integer.valueOf(shirtBcVar.getText());
                shirtDpNum = Integer.valueOf(shirtDpVar.getText());
                shirtDrNum = Integer.valueOf(shirtDrVar.getText());
                shirtBludgeNum = Double.valueOf(shirtBludgeVar.getText());
                shirtPierceNum = Double.valueOf(shirtPierceVar.getText());
                shirtSlashNum = Double.valueOf(shirtSlashVar.getText());
                        
                glovesBcNum = Integer.valueOf(glovesBcVar.getText());
                glovesDpNum = Integer.valueOf(glovesDpVar.getText());
                glovesDrNum = Integer.valueOf(glovesDrVar.getText());
                glovesBludgeNum = Double.valueOf(glovesBludgeVar.getText());
                glovesPierceNum = Double.valueOf(glovesPierceVar.getText());
                glovesSlashNum = Double.valueOf(glovesSlashVar.getText());
                        
                legsBcNum = Integer.valueOf(legsBcVar.getText());
                legsDpNum = Integer.valueOf(legsDpVar.getText());
                legsDrNum = Integer.valueOf(legsDrVar.getText());
                legsBludgeNum = Double.valueOf(legsBludgeVar.getText());
                legsPierceNum = Double.valueOf(legsPierceVar.getText());
                legsSlashNum = Double.valueOf(legsSlashVar.getText());
                        
                bootsBcNum = Integer.valueOf(bootsBcVar.getText());
                bootsDpNum = Integer.valueOf(bootsDpVar.getText());
                bootsDrNum = Integer.valueOf(bootsDrVar.getText());
                bootsBludgeNum = Double.valueOf(bootsBludgeVar.getText());
                bootsPierceNum = Double.valueOf(bootsPierceVar.getText());
                bootsSlashNum = Double.valueOf(bootsSlashVar.getText());
                        
                shieldBcNum = Integer.valueOf(shieldBcVar.getText());
                shieldDpNum = Integer.valueOf(shieldDpVar.getText());
                shieldDrNum = Integer.valueOf(shieldDrVar.getText());
                shieldBludgeNum = Double.valueOf(shieldBludgeVar.getText());
                shieldPierceNum = Double.valueOf(shieldPierceVar.getText());
                shieldSlashNum = Double.valueOf(shieldSlashVar.getText());
                        
                weaponDiceNum = Integer.valueOf(weaponDiceVar.getText());
                weaponMaxRollNum = Integer.valueOf(weaponMaxRollVar.getText());
                weaponCritMultiNum = Integer.valueOf(weaponCritMultiVar.getText());
                weaponCritChanceNum = Integer.valueOf(weaponCritChanceVar.getText());
                weaponDmgTypeChar = (weaponDmgTypeVar.getText());
                weaponBcNum = Integer.valueOf(weaponBcVar.getText());
                weaponDpNum = Integer.valueOf(weaponDpVar.getText());
                weaponDrNum = Integer.valueOf(weaponDrVar.getText());
                weaponBludgeNum = Double.valueOf(weaponBludgeVar.getText());
                weaponPierceNum = Double.valueOf(weaponPierceVar.getText());
                weaponSlashNum = Double.valueOf(weaponSlashVar.getText());
                
                // Creating bk
                Character bk = setStatsBk();
                
                // Creating player
                Character player = setStatsPlayer();
                int wins = 0;
                
                // Putting dexterity penalty onto bk and player
                dexPen(bk);
                dexPen(player);
                
                // Fight 10000 times and show how many times the player wins
                for (int i = 0; i < 10000; i++)
                {
                    if (fight(player, bk))
                    {
                        wins++;
                    }
                }
                    System.out.println("Player wins: " + wins + " times");
                }

        });

        // Adding Columns
        mainPanel.add(statsPanel);
        mainPanel.add(helmetPanel);
        mainPanel.add(chestPanel);
        mainPanel.add(shirtPanel);
        mainPanel.add(glovesPanel);
        mainPanel.add(legsPanel);
        mainPanel.add(bootsPanel);
        mainPanel.add(shieldPanel);
        mainPanel.add(weaponPanel);
        mainPanel.add(button);
        pane.add(mainPanel);
    }

    private static void createAndShowGUI() 
    {
        JFrame frame = new JFrame("Combat Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    public static Character setStatsBk()
    {
        //Creating bk stats, average of 10 bk's
        Character bk = new Character();
        bk.setStr(9);
        bk.setDex(9.95);
        bk.setInt(12);
        bk.setMaxHP(62);
        
        //Creating bk equipment, average of 10 bk's
        bk.helm = new Armor();
        bk.helm.setBC(98);
        bk.helm.setDP(0);
        bk.helm.setDR(27);
        bk.helm.setBludge(1.5);
        bk.helm.setPierce(1);
        bk.helm.setSlash(2);
        
        bk.chest = new Armor();
        bk.chest.setBC(97);
        bk.chest.setDP(3);
        bk.chest.setDR(28);   
        bk.chest.setBludge(1.5); 
        bk.chest.setPierce(1);
        bk.chest.setSlash(2);       
        
        bk.shirt = new Armor();
        bk.shirt.setBC(97);
        bk.shirt.setDP(0);
        bk.shirt.setDR(18);   
        bk.shirt.setBludge(0.75); 
        bk.shirt.setPierce(2);
        bk.shirt.setSlash(1.5);    
        
        bk.gloves = new Armor();
        bk.gloves.setBC(98);
        bk.gloves.setDP(1);
        bk.gloves.setDR(26);   
        bk.gloves.setBludge(2); 
        bk.gloves.setPierce(1);
        bk.gloves.setSlash(1);    
        
        bk.legs = new Armor();
        bk.legs.setBC(97);
        bk.legs.setDP(3);
        bk.legs.setDR(28);   
        bk.legs.setBludge(1.5); 
        bk.legs.setPierce(1);
        bk.legs.setSlash(2);   
        
        bk.boots = new Armor();
        bk.boots.setBC(97);
        bk.boots.setDP(-3);
        bk.boots.setDR(30); 
        bk.boots.setBludge(2); 
        bk.boots.setPierce(0.75);
        bk.boots.setSlash(2);      
        
        bk.shield = new Armor(); // All values are 0 b/c BK has no shield.
        
        bk.wep = new Weapon();  
        bk.wep.setDice(3);
        bk.wep.setMaxRoll(15);
        bk.wep.setCritMultiplier(2);
        bk.wep.setCritChance(8);
        bk.wep.setDmgType("s");
        bk.wep.setBC(53);
        bk.wep.setDP(0);
        bk.wep.setDR(29);
        bk.wep.setBludge(1);
        bk.wep.setPierce(1);
        bk.wep.setSlash(2);
        
        return bk;
    }
    
    public static Character setStatsPlayer()
    {
     
        // Creating player stats and assigning values
        Character player = new Character();
        player.setStr(statsStrNum);
        player.setDex(statsDexNum);
        player.setInt(statsIntNum);
        player.setMaxHP(statsMaxHPNum);
        
        // Creating player equipment and assigning values
        player.helm = new Armor();
        player.helm.setBC(helmBcNum);
        player.helm.setDP(helmDpNum);
        player.helm.setDR(helmDrNum);
        player.helm.setBludge(helmBludgeNum);
        player.helm.setPierce(helmPierceNum);
        player.helm.setSlash(helmSlashNum);
        
        player.chest = new Armor();
        player.chest.setBC(helmBcNum);
        player.chest.setDP(helmDpNum);
        player.chest.setDR(helmDrNum); 
        player.chest.setBludge(helmBludgeNum); 
        player.chest.setPierce(helmPierceNum);
        player.chest.setSlash(helmSlashNum);    

        
        player.shirt = new Armor();
        player.shirt.setBC(shirtBcNum);
        player.shirt.setDP(shirtDpNum);
        player.shirt.setDR(shirtDrNum);   
        player.shirt.setBludge(shirtBludgeNum); 
        player.shirt.setPierce(shirtPierceNum);
        player.shirt.setSlash(shirtSlashNum); 
        
        player.gloves = new Armor();
        player.gloves.setBC(glovesBcNum);
        player.gloves.setDP(glovesDpNum);
        player.gloves.setDR(glovesDrNum);   
        player.gloves.setBludge(glovesBludgeNum); 
        player.gloves.setPierce(glovesPierceNum);
        player.gloves.setSlash(glovesSlashNum);
        
        player.legs = new Armor();
        player.legs.setBC(legsBcNum);
        player.legs.setDP(legsDpNum);
        player.legs.setDR(legsDrNum);   
        player.legs.setBludge(legsBludgeNum); 
        player.legs.setPierce(legsPierceNum);
        player.legs.setSlash(legsSlashNum); 
        
        player.boots = new Armor();
        player.boots.setBC(bootsBcNum);
        player.boots.setDP(bootsDpNum);
        player.boots.setDR(bootsDrNum);   
        player.boots.setBludge(bootsBludgeNum); 
        player.boots.setPierce(bootsPierceNum);
        player.boots.setSlash(bootsSlashNum); 
        
        player.shield = new Armor();
        player.shield.setBC(shieldBcNum);
        player.shield.setDP(shieldDpNum);
        player.shield.setDR(shieldDrNum);   
        player.shield.setBludge(shieldBludgeNum); 
        player.shield.setPierce(shieldPierceNum);
        player.shield.setSlash(shieldSlashNum); 
        
        player.wep = new Weapon();  
        player.wep.setDice(weaponDiceNum);
        player.wep.setMaxRoll(weaponMaxRollNum);
        player.wep.setCritMultiplier(weaponCritMultiNum);
        player.wep.setCritChance(weaponCritChanceNum);
        player.wep.setDmgType(weaponDmgTypeChar);
        player.wep.setBC(weaponBcNum);
        player.wep.setDP(weaponDpNum);
        player.wep.setDR(weaponDrNum);
        player.wep.setBludge(weaponBludgeNum);
        player.wep.setPierce(weaponPierceNum);
        player.wep.setSlash(weaponSlashNum);
    
        return player;
    }
    
    public static int randomIntFromInterval(int min, int max) // Gives a random int between the min and max values
    {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
    
    public static double amountDR(Weapon wep, Armor armorPiece) // Changes the damage reduction based on the type of damage dealt
    {
        double damageReduction = armorPiece.getDR();
        if (Math.random() <= (armorPiece.getBC() / 100)) // If the random number is lower than the block chance, the hit will be blocked and the damage reduction will calculate
        {
            if ("s".equals(wep.getDmgType())) // Slash multiplier of the armor
            {
                damageReduction = damageReduction * armorPiece.getSlash();
                return damageReduction;
            }
            if ("p".equals(wep.getDmgType())) // Pierce multiplier of the armor
            {
                damageReduction = damageReduction * armorPiece.getPierce();
                return damageReduction;
            }
            if( "b".equals(wep.getDmgType())) // Bludge multiplier of the armor
            {
                damageReduction = damageReduction * armorPiece.getBludge();
                return damageReduction;
            }
            else
            {
                return 0;
            }
        }
        else 
        {
            return 0;
        }
    }
    
    public static int swingWep(Character attacker, Character target) // Determine which armor piece the weapon will strike, also calculate total damage
    {
        int dr = 0;
        
        dr += amountDR(attacker.wep, target.shield);
        dr += amountDR(attacker.wep, target.wep);
        
        double part = Math.random(); // Weapon will roll to see which armor piece it hits
        while (true)
        {
            if (part <= 0.05) // 5% chance to hit gloves
            {
                dr += amountDR(attacker.wep, target.gloves);
                break;
            }
            else if (part <= 0.10) // 10% chance to hit boots
            {
                dr += amountDR(attacker.wep, target.boots);
                break;
            }
            else if (part <= 0.20) // 20% chance to attack helmet
            {
                dr += amountDR(attacker.wep, target.helm);
                break;
            }
            else if (part <= 0.30) // 30% chance to attack legs
            {
                dr += amountDR(attacker.wep, target.legs);
                break;
            }
            else // 50% chance to attack chest (attacking chest also means attacking shirt)
            {
                dr += (amountDR(attacker.wep, target.chest) + amountDR(attacker.wep, target.shirt));
                break;
            }
        }
        
        int dmgRolled = 0;
        for (int dice = 0; dice < attacker.wep.getDice(); dice++) // Each dice will roll for damage
        {
            dmgRolled += randomIntFromInterval(1, attacker.wep.getMaxRoll()); // Adds up all the damage from the dice rolls
        }
        // Checking if the weapon swing is a critical hit
        if (Math.random() < ((attacker.wep.getCritChance() + ((attacker.getInt() - 4) * 2.5)) / 100)) // Higher intelligence means higher chance to crit
        {                                                                                    // This equation gives the new critical chance
            dmgRolled = dmgRolled * attacker.wep.getCritMultiplier();
        }
        // Stregth adds bonus attack damage, this equation gives the extra damage
        int strBonus = randomIntFromInterval(0, (int) Math.round(1.5 * attacker.getStr()));
        
        int dmg = strBonus; // Tallies up the damage from the strength bonus and the dice rolls
        dmg += dmgRolled;
        dmg = dmg - dr; // Subtracts the amount of damage reduced from the total damage, giving the final damage value
        
        if (dmg > 0)
        {
            return dmg;
        }
        else
        {
            return 0;
        }
    }
    
        public static int attack(Character p1, Character p2) // Have not implemented offhand/2H weapons (Something to implement in the future)
    {                                                        // Implement 2H weapons, and dual wielding weapons
        int dmg = swingWep(p1, p2); // p1 is swinging their weapon at p2
        return dmg;
    }
    
    public static void dexPen(Character fighter)
    {
        double charDex = fighter.getDex();
        int[] dpArray = {fighter.helm.getDP(), fighter.chest.getDP(), fighter.shirt.getDP(), fighter.gloves.getDP(),
            fighter.legs.getDP(), fighter.boots.getDP(), fighter.shield.getDP(), fighter.wep.getDP()}; // Array with all the DP values of each equipment
        for (int i = 0; i < 8; i++)
        {
            charDex = (1 - (dpArray[i] / 100.0)) * charDex; // Equation to get the new dexterity
        }
        fighter.setDex(charDex);    // Setting the characters new dexterity
    }
    
    public static boolean fight(Character p1, Character p2) // Method to fight
    {
        int p1HP = p1.getMaxHP();
        int p2HP = p2.getMaxHP();
        int i = 0;
        // p1 will get to attack first, then p2 will get to attack 2nd if they survive the attack, they will continue until one or the other dies.
        while(true)
        {
            if (p1.getDex() * Math.random() > p2.getDex() * Math.random()) // If p1's number is higher, they will hit
            {
                // p1 will attack p2, p2HP will be subtracted by the damage rolled by p1
                p2HP -= attack(p1, p2);
            }
            else // Otherwise, p1 will miss and nothing will happen
            {
                continue;
            }
            if (p2HP <= 0) // Checking if player 2 is dead
            {
                return true;
            }
            
            if (p2.getDex() * Math.random() > p1.getDex() * Math.random()) // If p2's number is higher, they will hit
            {
               p1HP -= attack(p2, p1);
            }
            else
            {
                continue;
            }
            if (p1HP <= 0)
            {
                return false;
            }   
        }
    }
        
    public static void main(String[] args) 
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                createAndShowGUI();
            }
        });     
    }
}
