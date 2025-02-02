//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import FileProcessor.*;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");
        FileProcessor fp = new XMLFileProcessor();
        try {
            Map<String, Object> map = fp.read("C:\\Users\\name\\IdeaProjects\\ErinnereMich\\test.xml");
            //System.out.println(map.toString());
            for(Entry<String, Object> entry : map.entrySet()){
              //  System.out.println(entry.getKey() + "/" + entry.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}