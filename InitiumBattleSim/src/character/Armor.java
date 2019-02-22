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
public class Armor 
{
    Armor() // Class Constructor
    {
        bc = 0;
        dp = 0;
        dr = 0;
        bludge = 0;
        pierce = 0;
        slash = 0;
    }
    
    private int bc; // Block Chance
    private int dp; // Dexterity Penalty
    private int dr; // Damage Reduction
    // Multipliers increase the DR by certain intervals: E = 2x, G = 1.5x, A = 1x, P = 0.75x, M = 0.5x, N = 0x
    private double bludge;  // Bludge Multiplier
    private double pierce;  // Pierce Multiplier
    private double slash;   // Slash Multiplier
    
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
