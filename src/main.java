

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.util.StringTokenizer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Comparator;
import java.util.Collections;


class CompInt implements Comparator<String> {
    public int compare(String b1,String b2)
    {
        return b1.compareTo(b2);


    }

}

public class main {
    public static void main(String[] args) throws Exception {

        File input = new File("input.txt");
        FileReader ft = new FileReader(input);
        BufferedReader bfr=new BufferedReader(ft);

        ArrayList<String> juices = new ArrayList<String>();
        ArrayList<String> comp = new ArrayList<String>();

        String line = null;
        StringTokenizer st;

        while ((line = bfr.readLine()) != null ) {
            juices.add(line);
        }

        bfr.close();

        ListIterator it = juices.listIterator();
        while(it.hasNext()) {
            String str = (String) it.next();
            String name = str.split(" ")[1];
            comp.add(name);
    }

        Collections.sort(comp, new CompInt());

        File juice1=new File("juice1.out");
        FileWriter fw = new FileWriter(juice1);
        BufferedWriter bfw= new BufferedWriter(fw);
        it = comp.listIterator();
        while(it.hasNext()) {
            String name = (String) it.next();
            bfw.write(name);
            bfw.newLine();

        }
        bfw.close();
}
}
