import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    HashMap<String, String> phoneBook;
    
    public MapTester(){
        phoneBook = new HashMap<String, String>();
    }
    
    public void enterNumber(String name, String number){
        phoneBook.put(name, number);
    }
    
    public String lookupNumber(String name){
        return phoneBook.get(name);
    }
}