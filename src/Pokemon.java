
public abstract  class Pokemon {

	
	private  final String  name;
	private final PokemonType type;
	private  int cp;
	
	
	public Pokemon(String name,PokemonType type,int cp)
	{
		
		this.name = name;
		this.type = type;
		this.cp = cp;
		
	}
	
	
	public String getName()
	{
		
		return name;
		
		
	}
	
	
	public int getCp()
	{
		
		return cp;
	}
	public PokemonType getType()
	{
		return type;
	}
	
	
	
	
	public abstract void attack();
	
	
	
}
