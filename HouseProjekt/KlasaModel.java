/** KlasaModel permban fushat e tipit boolean te cilat do i perdorim tek klasaController*/
public class KlasaModel{

   public int dice;
   public boolean house = false; 
   public boolean body = false;
   public boolean roof = false;
   public boolean door = false;
   public boolean window1 = false;
   public boolean window2 =false;
public int throwDice(){/** metoda e cila perdoret per gjenerimin e nje numri te rastesishem nga 1-6*/
dice=(int)(Math.random()*6)+1;
return dice;}
}