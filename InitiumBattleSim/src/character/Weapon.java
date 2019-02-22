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
public class Weapon extends Armor 
{
    Weapon() // Class constructor
    {
        dice = 0;
        maxRoll = 0;
        critMultiplier = 0;
        critChance = 0;
        dmgType = "s";
        bc = 0;
        dp = 0;
        dr = 0;
        bludge = 0;
        pierce = 0;
        slash = 0;
    }
    private int dice;       // Number of dice
    private int maxRoll;    // Highest Value on dice
    private int critMultiplier;
    private int critChance;
    private String dmgType; // Damage types are b, p, s, only doing 1 damage type for now
    private int bc;
    private int dp;
    private int dr;
    private double bludge;
    private double pierce;
    private double slash;
    
    public void setDice(int value)
    {
        dice = value;
    }
    
    public int getDice()
    {
        return dice;
    }
    
    public void setMaxRoll(int value)
    {
        maxRoll = value;
    }
    
    public int getMaxRoll()
    {
        return maxRoll;
    }
    
    public void setCritMultiplier(int value)
    {
        critMultiplier = value;
    }
    
    public int getCritMultiplier()
    {
        return critMultiplier;
    }
    
    public void setCritChance(int value)
    {
        critChance = value;
    }
    
    public int getCritChance()
    {
        return critChance;
    }
    
    public void setDmgType(String letter)
    {
        dmgType = letter;
    }
    
    public String getDmgType()
    {
        return dmgType;
    }
    
    public void setBC(int value)
    {
        bc = value;
    }
    
    public int getBC()
    {
        return bc;
    }
    
    public void setDP(int value)
    {
        dp = value;
    }
    
    public int getDP()
    {
        return dp;
    }
    
    public void setDR(int value)
    {
        dr = value;
    }
    
    public int getDR()
    {
        return dr;
    }
    
    public void setBludge(double value)
    {
        bludge = value;
    }
    
    public double getBludge()
    {
        return bludge;
    }
    
    public void setPierce(double value)
    {
        pierce = value;
    }
    
    public double getPierce()
    {
        return pierce;
    }
    
    public void setSlash(double value)
    {
        slash = value;
    }
    
    public double getSlash()
    {
        return slash;
    }
}
