package Project1;

import java.util.*;

import java.io.*;

public class Project1 {
    public static String[] intake = new String[50];
    public static String[] sorted = new String[50];
    public static String line, unsorted = "";
    public static StringTokenizer myTokens;
    public static Date212[] dates = new Date212[50];
    public static int counter = 0;
    public static void main(String[] args) throws IOException{
        dates = fillArray(args[0]); // make args[0]

        Date212.sort(dates, counter); // Sort dates
        for (int j = 0; j < counter; j++){ 
            sorted[j] = dates[j].toString(); 
        }
        
        DateGUI gui = new DateGUI(); 
        gui.createAndShowGUI(unsorted, sorted, counter); // Put both sets of dates into the GUI
    }
    public static Date212[] fillArray (String myFile) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));
        int i = 0;
        line = br.readLine();
        while (line != null){
            StringTokenizer myTokens = new StringTokenizer(line, ",");
            while (myTokens.hasMoreTokens()){
                intake[i] = myTokens.nextToken();
                dates[i] = new Date212(intake[i]);
                unsorted += intake[i] + "\n";
                counter++;
                i++;
            }
            line = br.readLine();
        }
        br.close();
        return dates;
    }
}
