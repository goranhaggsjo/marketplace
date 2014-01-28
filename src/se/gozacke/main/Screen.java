package se.gozacke.main;

public class Screen
{
	private static String esc = "\033[";

	public String clear()
	{
		return esc + "2J";
	}

	public String cup(int row, int col)
	{
		return esc + row + ";" + col + "H";
	}
	
}
