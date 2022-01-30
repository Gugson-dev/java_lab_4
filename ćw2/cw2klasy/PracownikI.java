package cw2klasy;
import java.util.Map;

public interface PracownikI extends CzlowiekI
{
  public Map<String, Integer> oceny();
  public Map<String, String> grupy();
  public Map<String, String> terminy();    
}

