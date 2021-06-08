/**
 * Filename: Character.java
 * Description: Default Character class to be extended by particular game characters.
 * 
 * @author Vaesse
 * @version 0.0.2
 */

import java.util.ArrayList;

public class Character
{
	Desc desc = new Desc(); 
	ArrayList<Module.Stat> stats = new ArrayList<Module.Stat>(); 
	ArrayList<Module.Skill> skills = new ArrayList<Module.Skill>(); 
	ArrayList<Module.Item> inventory = new ArrayList<Module.Item>(); 
	
	/**
	 * Gets the name of the character.
	 * 
	 * @return		A string representing the name of the character.
	 */
	public String getName()
	{
		//
		return getDesc("name");
	}
	
	/**
	 * Gets the name of the character.
	 * 
	 * @param name		A string representing the name of the character.
	 */
	public void setName(String name)
	{
		//
	}
	
	/**
	 * Gets some or all of the description of the character.
	 * 
	 * @param part		A string representing the requested portion of the descrption.
	 * @return		A string representing the portion of the description requested.
	 */
	public String getDesc(String part)
	{
		//
		return ""; // Placeholder!
	}
	
	/**
	 * Sets the description of the character to the description object passed.
	 * 
	 * @param desc		An object containing the entire description.
	 */
	public void setDesc(Desc desc)
	{
		this.desc = desc;
	}
	
	/**
	 * Changes part of the description of the character with the description in the object passed.
	 *
	 * @param part		A String describing the part of the description to be changed.
	 * @param desc		A Object contianing the change to be made.
	 */
	public void setDesc(String part, Object desc)
	{
		//
	}
	
	/**
	 * Adds a new stat to the list of stats and sets it's initial value.  Should not work on existing stats.
	 *
	 * @param stat		An Object containing the stat.
	 */
	public void addStat(Stat stat)
	{
		stats.add(stat);
	}
	
	/**
	 * Get a previously set stat.
	 *
	 * @param id		A String representing the ID of the stat to be returned.
	 * @return		An object containing the stat.
	 */
	public Stat getStat(String id)
	{
		for(Stat stat:stats)
		{
			if(id.equals(stat.id)) return stat;
		}
		
		return new Stat(); // Placeholder!
	}
	
	/**
	 * Modify a previously set stat.
	 *
	 * @param id		A String representing the ID of the stat to be changed.
	 * @param stat		An object represeting the new stat specifics.
	 */
	public void modStat(String id, Stat stat)
	{
		//
	}
	
	/**
	 * Delete a previously set stat.
	 *
	 * @param id		A String representing the ID of the stat to be removed.
	 * @return		A boolean indicating whether the stat was removed.
	 */
	public boolean delStat(String id)
	{
		for(int i=0;i<stats.size();i++)
		{
			if(stats.get(i).id.equals(id))
			{
				stats.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Adds a new skill to the list of skills and sets it's initial value.  Should not work on existing skills.
	 *
	 * @param skill		An Object containing the skill and it's initial value.
	 */
	public void addSkill(Skill skill)
	{
		skills.add(skill);
	}
	
	/**
	 * Get a previously set skill.
	 *
	 * @param id		A String representing the ID of the skill to be returned.
	 * @return		An object containing the skill.
	 */
	public Skill getSkill(String id)
	{
		for(Skill skill:skills)
		{
			if(id.equals(skill.id)) return skill;
		}
		
		return new Skill(); // Placeholder!
	}
	
	/**
	 * Modify a previously set skill.
	 *
	 * @param id		A String representing the ID of the skill to be changed.
	 * @param skill	An object represeting the new skill specifics.
	 */
	public void modSkill(String id, Skill skill)
	{
		//
	}
	
	/**
	 * Delete a previously set skill.
	 *
	 * @param id		A String representing the ID of the skill to be removed.
	 * @return		A boolean indicating whether the skill was removed.
	 */
	public boolean delSkill(String id)
	{
		for(int i=0;i<skills.size();i++)
		{
			if(skills.get(i).id.equals(id))
			{
				skills.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Adds a new item to the inventory list.
	 *
	 * @param item		An Object containing the new item.
	 */
	public void addInv(Inv item)
	{
		inventory.add(item);
	}
	
	/**
	 * Get an existing inventory item.
	 *
	 * @param id		An integer representing the ID of the item to be returned.
	 * @return		An object containing the stat.
	 */
	public Inv getInv(int id)
	{
		for(Inv item:inventory)
		{
			if(id == item.id) return item;
		}
		
		return new Inv(); // Placeholder!
	}
	
	/**
	 * Modify an existing inventory item.
	 *
	 * @param id		An integer representing the ID of the item to be changed.
	 * @param item		An object represeting the new item.
	 */
	public void modInv(int id, Inv item)
	{
		//
	}
	
	/**
	 * Delete an existing inventory item.
	 *
	 * @param id		An integer representing the ID of the item to be removed.
	 * @return		A boolean indicating whether the item was removed.
	 */
	public boolean delInv(int id)
	{
		for(int i=0;i<inventory.size();i++)
		{
			if(inventory.get(i).id == id)
			{
				inventory.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Internal class to establish description objects.
	 * Includes name and race and job and pic and any desc type properties.
	 */
	private class Desc
	{
		//
	}
}
