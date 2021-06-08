/**
 * Filename: System.java
 * Description: Default System class to be extended by particular game systems.
 * 
 * @author Vaesse
 * @version 0.0.2
 */

public class Module
{
	// Defines:
	// game system (provide a description)
	// rules
	// places
	// races
	// professions
	// stat list
	// skill list
	// item list
	// encounters/enemies
	//
	// Holds:
	// characters
	
	/**
	 * Internal class to establish Stat objects.
	 * Include calculated stats.  Should change infrequently.
	 */
	private class Stat
	{
		String id = "";
		//
	}
	
	/**
	 * Internal class to establish skill objects.
	 * Include spells and languages and other frequently changing abilities.
	 */
	private class Skill
	{
		String id = "";
		//
	}
	
	/**
	 * Internal class to establish inventory objects.
	 * All inv objects are separate.
	 */
	private class Item
	{
		int id = 0; // CAN NOT REMAIN 0!!!!
		//
	}
}