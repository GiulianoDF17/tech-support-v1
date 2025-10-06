import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    public void enterNumber(String name, String number){
        phoneBook.put(name, number);
    }
    
    public String lookupNumber(String name){
        return phoneBook.get(name);
    }
}