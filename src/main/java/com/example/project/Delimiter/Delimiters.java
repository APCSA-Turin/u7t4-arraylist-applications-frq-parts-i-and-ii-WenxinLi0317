package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        /* to be implemented in part (a) */
        ArrayList<String>list = new ArrayList<>();
        for (String str : tokens)
        {
            if(str.equals(openDel)||str.equals(closeDel))
            {
                list.add(str);
            }
        }
        return list;
    }
    

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        boolean bool = true;
        int num1 = 0;
        int num2 = 0;
        for(String str : delimiters)
        {
            if(str.equals(openDel))
            {
                num1++;
            }
            if(str.equals(closeDel))
            {
                num2++;
            }
            if(num2>num1)
            {
                return false;
            }
        }
        if(num1==num2)
        {
            return true;
        }
        return false;
    }
}