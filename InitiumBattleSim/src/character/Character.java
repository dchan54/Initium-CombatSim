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

public class Character
{
    Character() // Class Constructor for characters
    {
        String name = "";
        str = 0;
        dex = 0;
        intel = 0;
        maxHP = 0;
    }
    
    double str;    // Strength
    double dex;    // Dexterity
    double intel;  // Intelligence
    int maxHP;
    Armor helm;
    Armor chest;
    Armor shirt;
    Armor gloves;
    Armor legs;
    Armor boots;
    Armor shield;
    Weapon wep;
    
    public void setStr(double value)
    {
        str = value;
    }
    public double getStr()
    {
        return str;
    }
    
    public void setDex(double value)
    {
        dex = value;
    }
    public double getDex()
    {
        return dex;
    }
    
    public void setInt(double value)
    {
        intel = value;
    }
    
    public double getInt()
    {
        return intel;
    }
    
    public void setMaxHP(int value)
    {
        maxHP = value;
    }
    
    public int getMaxHP()
    {
        return maxHP;
    }  
}
