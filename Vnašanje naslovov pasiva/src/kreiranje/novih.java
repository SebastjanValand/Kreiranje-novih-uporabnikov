package kreiranje;
import org.sikuli.script.*;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.charset.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
/**
 *
 * @author Seba
 */
public class novih {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       Screen s = new Screen();
       
       ArrayList<String> imena = new ArrayList<String>(){{
       add("Poslovalnica za hitre storitve in svetovanje");
add("Poslovalnica za osebno bančništvo");
add("Poslovalnica za tuje osebe");
add("Poslovalnica MHL");
add("Poslovalnica Poljanska cesta");
add("Poslovalnica Klinične bolnice");
add("Poslovalnica Trnovo ");
add("Poslovalnica Tavčarjeva");
add("Poslovalnica Beethovnova");
add("Poslovalnica Dalmatinova");
add("Poslovalnica Krim");
add("Poslovalnica Tržaška 132");
add("Poslovalnica Vič");
add("Poslovalnica E.LeClerc");
add("Poslovalnica Grosuplje");
add("Poslovalnica Borovnica");
add("Poslovalnica Ig");
add("Poslovalnica Ivančna gorica");
add("Poslovalnica Videm- Dobrepolje");
add("Poslovalnica Vrhnika");
add("Poslovalnica Kočevje");
add("Poslovalnica Ribnica");
add("Poslovalnica Sodražica");
add("Poslovalnica Šiška");
add("Poslovalnica Bežigrad");
add("Poslovalnica Medvode");
add("Poslovalnica Brod");
add("Poslovalnica Šentvid");
add("Poslovalnica Bratovševa ploščad");
add("Poslovalnica Črnuče");
add("Poslovalnica Savsko naselje");
add("Poslovalnica Koseze");
add("Poslovalnica Moste ");
add("Poslovalnica Nove Fužine");
add("Poslovalnica Nove Jarše");
add("Poslovalnica Polje");
add("Poslovalnica Štepanjsko naselje");
add("Poslovalnica Bled");
add("Poslovalnica Škofja Loka");
add("Poslovalnica Kranj");
add("Poslovalnica Maribor");
add("Poslovalnica Vetrinjska");
add("Poslovalnica Prešernova");
add("Poslovalnica Super mesto");
add("Poslovalnica Ormož");
add("Poslovalnica Slov. Bistrica");
add("Poslovalnica Slov. Konjice");
add("Poslovalnica Beltinci");
add("Poslovalnica Črenšovci");
add("Poslovalnica Gornja Radgona");
add("Poslovalnica Križevci pri Ljutomeru");
add("Poslovalnica Lendava");
add("Poslovalnica Ljutomer");
add("Poslovalnica Murska Sobota");
add("Poslovalnica Gornji Petrovci");
add("Poslovalnica Radenci");
add("Poslovalnica Rogašovci");
add("Poslovalnica Rudarska");
add("Poslovalnica Gorenje");
add("Poslovalnica Nakupovalni center");
add("Poslovalnica Mozirje");
add("Poslovalnica Šoštanj");
add("Poslovalnica Ljubno ob Savinji");
add("Poslovalnica Slovenj Gradec");
add("Poslovalnica Dravograd");
add("Poslovalnica Mežica");
add("Poslovalnica Prevalje");
add("Poslovalnica Radlje ob Dravi");
add("Poslovalnica Ravne na Koroškem");
add("Poslovalnica Muta");
add("Poslovalnica Mislinja");
add("Poslovalnica Črna na Koroškem");
add("Poslovalnica Žalec");
add("Poslovalnica Celje");
add("Poslovalnica Seidlova");
add("Poslovalnica Hedera");
add("Poslovalnica Kandija");
add("Poslovalnica Ločna");
add("Poslovalnica Drska");
add("Poslovalnica Črnomelj");
add("Poslovalnica Kolodvorska");
add("Poslovalnica Semič");
add("Poslovalnica Trebnje");
add("Poslovalnica Mirna");
add("Poslovalnica Straža");
add("Poslovalnica Šentjernej");
add("Poslovalnica Žužemberk");
add("Poslovalnica Poslovni center Metlika");
add("Poslovalnica Krško");
add("Poslovalnica Grič - Krško ");
add("Poslovalnica Sevnica ");
add("Poslovalnica Senovo");
add("Poslovalnica Brežice ");
add("Poslovalnica Dobova");
add("Poslovalnica Koper");
add("Poslovalnica Postojna");
add("Poslovalnica Lucija");
add("Poslovalnica Sežana");
add("Poslovalnica Nova Gorica");
add("Poslovalnica Ajdovščina");
add("Poslovalnica Idrija");
add("Poslovalnica Pivka");
add("Poslovalnica Izola");
add("Poslovalnica Cerknica");
add("Poslovalnica Logatec");
add("Poslovalnica Rakek");
add("Poslovalnica Stari trg ");
add("Poslovalnica Domžale 1");
add("Poslovalnica Domžale 2");
add("Poslovalnica Vir");
add("Poslovalnica Litija");
add("Poslovalnica Mengeš");
add("Poslovalnica Jarše");
add("Poslovalnica Mlake");
add("Poslovalnica Moravče");
add("Poslovalnica Trzin");
add("Poslovalnica Kamnik");
add("Poslovalnica Duplica");
add("Poslovalnica Trbovlje");
add("Poslovalnica Hrastnik");
add("Poslovalnica Zagorje");
add("Poslovalnica NLB BANKARNA");
add("Sektor za privatno bančništvo");


     }}; 
       
        int i = 4;
//        for (int i = 0; i < 40; i++){
                try{
                        s.wait(5.0);
                        s.write(Key.F7);
//                       
                        s.click("/img/polni_naziv.PNG");
                        String myString = imena.get(i);
                        StringSelection stringSelection = new StringSelection(myString);
                        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
                        clpbrd.setContents(stringSelection, null);
                        s.keyDown(Key.CTRL);
                        s.type("v");
                        s.keyUp(Key.CTRL);
                        s.write(Key.F8);
                        s.wait(2.0);
                        s.click("/img/naslov.PNG");
                        s.wait(1.0);
                        s.click("/img/oznacevanje_ulice.PNG");
                        s.mouseMove(50, 0);
                        s.click(0);
                        s.wait(0.2);
                        for (int j = 0; j<20;j++){
                            s.keyUp(Key.DELETE);
                            s.keyUp(Key.BACKSPACE);
                        }
                        
//                        s.write(imena.get(i)+ Key.TAB);
//                        s.write(priimki.get(i)+ Key.TAB);
//                        s.write(emso.get(i)+ Key.TAB);
////                        s.wait(5.0);
//                        s.write(Key.SPACE);
//                        s.wait("/img/slika_za_cakanje.PNG",15);
//                        s.click("/img/uporabnisko_ime.PNG");
////                        s.wait(5.0);
//                        s.write(imena.get(i)+ Key.TAB);
//                        s.write(koda_zastopnika.get(i)+ Key.TAB);
//                        s.write(Key.TAB);
//                        s.write("POSLOVALNICA VRHNIKA"+Key.TAB);
//                        s.write(Key.TAB);
//                        s.write(Key.TAB);
//                        s.write(Key.TAB);
//                        s.write(Key.SPACE);
//                        s.click("/img/shrani.PNG");
//                        s.wait("/img/geslo.PNG",30);
//                        s.click("/img/geslo.PNG");
//                        s.write("asdf1234"+Key.TAB);
//                        s.write(Key.SPACE);
//                        s.wait("/img/nov_uporabnik_shranjen.PNG",15);
////                        s.setW(1000);
////                        s.click(15);
////                        s.click(0);
////                        s.write(cities.get(i)+ Key.ENTER);
                }
                catch(FindFailed e){
                        e.printStackTrace();
                }
//        System.out.println(cities.get(i));
    }
    }
    

