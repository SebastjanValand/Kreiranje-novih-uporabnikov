package kreiranje;
import org.sikuli.script.*;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
        add("Uporabnik1");
        add("Uporabnik2");
        add("Uporabnik3");
        add("Uporabnik4");
        add("Uporabnik5");
        add("Uporabnik6");
        add("Uporabnik7");
        add("Uporabnik8");
        add("Uporabnik9");
        add("Uporabnik10");
        add("Uporabnik11");
        add("Uporabnik12");
        add("Uporabnik13");
        add("Uporabnik14");
        add("Uporabnik15");
        add("Uporabnik16");
        add("Uporabnik17");
        add("Uporabnik18");
        add("Uporabnik19");
        add("Uporabnik20");
        add("Uporabnik21");
        add("Uporabnik22");
        add("Uporabnik23");
        add("Uporabnik24");
        add("Uporabnik25");
        add("Uporabnik26");
        add("Uporabnik27");
        add("Uporabnik28");
        add("Uporabnik29");
        add("Uporabnik30");
        add("Uporabnik31");
        add("Uporabnik32");
        add("Uporabnik33");
        add("Uporabnik34");
        add("Uporabnik35");
        add("Uporabnik36");
        add("Uporabnik37");
        add("Uporabnik38");
        add("Uporabnik39");
        add("Uporabnik40");
        

     }}; 
       ArrayList<String> priimki = new ArrayList<String>(){{
        add("Testni1");
        add("Testni2");
        add("Testni3");
        add("Testni4");
        add("Testni5");
        add("Testni6");
        add("Testni7");
        add("Testni8");
        add("Testni9");
        add("Testni10");
        add("Testni11");
        add("Testni12");
        add("Testni13");
        add("Testni14");
        add("Testni15");
        add("Testni16");
        add("Testni17");
        add("Testni18");
        add("Testni19");
        add("Testni20");
        add("Testni21");
        add("Testni22");
        add("Testni23");
        add("Testni24");
        add("Testni25");
        add("Testni26");
        add("Testni27");
        add("Testni28");
        add("Testni29");
        add("Testni30");
        add("Testni31");
        add("Testni32");
        add("Testni33");
        add("Testni34");
        add("Testni35");
        add("Testni36");
        add("Testni37");
        add("Testni38");
        add("Testni39");
        add("Testni40");

     }};
       ArrayList<String> emso = new ArrayList<String>(){{
        add("1803952500540");
        add("1803952501501");
        add("1803952502502");
        add("1803952503503");
        add("1803952504504");
        add("1803952505505");
        add("1803952506506");
        add("1803952507507");
        add("1803952508508");
        add("1803952509509");
        add("1803952510510");
        add("1803952511511");
        add("1803952512512");
        add("1803952513513");
        add("1803952514514");
        add("1803952515515");
        add("1803952516516");
        add("1803952517517");
        add("1803952518518");
        add("1803952519519");
        add("1803952520520");
        add("1803952521521");
        add("1803952522522");
        add("1803952523523");
        add("1803952524524");
        add("1803952525525");
        add("1803952526526");
        add("1803952527527");
        add("1803952528528");
        add("1803952529529");
        add("1803952530530");
        add("1803952531531");
        add("1803952532532");
        add("1803952533533");
        add("1803952534534");
        add("1803952530535");
        add("1803952531536");
        add("1803952532537");
        add("1803952533538");
        add("1803952534539");
     }};
        ArrayList<String> koda_zastopnika = new ArrayList<String>(){{
    add("12345");
    add("12346");
    add("12347");
    add("12348");
    add("12349");
    add("12350");
    add("12351");
    add("12352");
    add("12353");
    add("12354");
    add("12355");
    add("12356");
    add("12357");
    add("12358");
    add("12359");
    add("12360");
    add("12361");
    add("12362");
    add("12363");
    add("12364");
    add("12365");
    add("12366");
    add("12367");
    add("12368");
    add("12369");
    add("12370");
    add("12371");
    add("12372");
    add("12373");
    add("12374");
    add("12375");
    add("12376");
    add("12377");
    add("12378");
    add("12379");
    add("12380");
    add("12381");
    add("12382");
    add("12383");
    add("12384");
    add("12385");
    add("12386");

     }};
        
        for (int i = 0; i < 40; i++){
                try{
                        s.click("/img/vnesi_in_izberi_osebo.PNG");
                        s.click("/img/izbira_ime.PNG");
                        s.write(imena.get(i)+ Key.TAB);
                        s.write(priimki.get(i)+ Key.TAB);
                        s.write(emso.get(i)+ Key.TAB);
//                        s.wait(5.0);
                        s.write(Key.SPACE);
                        s.wait("/img/slika_za_cakanje.PNG",15);
                        s.click("/img/uporabnisko_ime.PNG");
//                        s.wait(5.0);
                        s.write(imena.get(i)+ Key.TAB);
                        s.write(koda_zastopnika.get(i)+ Key.TAB);
                        s.write(Key.TAB);
                        s.write("POSLOVALNICA VRHNIKA"+Key.TAB);
                        s.write(Key.TAB);
                        s.write(Key.TAB);
                        s.write(Key.TAB);
                        s.write(Key.SPACE);
                        s.click("/img/shrani.PNG");
                        s.wait("/img/geslo.PNG",30);
                        s.click("/img/geslo.PNG");
                        s.write("asdf1234"+Key.TAB);
                        s.write(Key.SPACE);
                        s.wait("/img/nov_uporabnik_shranjen.PNG",15);
//                        s.setW(1000);
//                        s.click(15);
//                        s.click(0);
//                        s.write(cities.get(i)+ Key.ENTER);
                }
                catch(FindFailed e){
                        e.printStackTrace();
                }
//        System.out.println(cities.get(i));
    }
    }
    
}
