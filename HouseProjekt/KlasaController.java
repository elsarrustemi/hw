//Controller eshte klasa e cila e lidh KlasenView dhe KlasenModel
public class KlasaController
{
   public KlasaController()
    {
      int zari;
      int counter=0;
    KlasaModel model = new KlasaModel();
    KlasaView view = new KlasaView();

       while(!model.house){/* house eshte variabel e tipit boolean e 
       deklaruar ne klasen model te cilen e perdorim perderisa shtepia nuk eshte e vizatuar
       plotesisht.*/
   
    zari=model.throwDice();/** metoda e cila hudh zarin, e krijuar ne klasen model*/
    System.out.println("Zari:"+zari+" ");
    counter++;
    if(zari == 6  && !model.body)
    {
        view.drawBody();/** metoda per vizatimin e katit te shtepise e krijuar ne klasenView*/
        model.body = true;
    }
   if(zari == 5 && model.body && !model.roof )/**paracaktimi i kushteve te nevojshme
   ne menyre qe kulmi te mos vizatohet para katit te shtepise*/
   {
        view.drawRoof();
        view.drawBody();
        model.roof = true;
   }
   if(zari == 4 && model.body && model.roof && !model.door )
   {
        view.drawRoof();
        view.drawDoor();
        model.door = true;
   
   }
  if(zari==3 && model.body && model.roof && model.door && model.window1 && !model.window2)
  /** Pasi qe nje dritare vizatohet sa here bie numri 3, kushti if(zari==3) duhet thirrur dy here
  duke u vizatuar keshtu njehere dritarja e pare, e pastaj e dyta*/
     {
         view.drawRoof();
         view.drawWindow2();
         model.window2=true;
     }
  if(zari == 3 && model.body && model.roof && model.door && !model.window1)
  {
     view.drawRoof();
     view.drawWindow1();
     model.window1=true;
     }
   if(model.body && model.roof && model.door && model.window1 && model.window2)
   {
   System.out.println("Shtepia ka perfunduar");
   System.out.println("Zari eshte hudhur "+counter+++" here");
   System.out.println("____________________________");
   model.house = true;
   }
  }
 } 
 public static void main(String[] args)
 {
   new KlasaController();
   new KlasaController();}
}