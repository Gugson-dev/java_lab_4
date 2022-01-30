package cw2klasy;
import java.util.Map;

public interface StudentI extends CzlowiekI
{
  public int[] oceny();
  public void przedmioty();
  public Map<String, Integer> zaliczenia();    
}
