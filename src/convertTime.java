import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
         if(time.contains("AM")){
            time = time.replace("AM", "");
            String[] timeArr = time.split(":");
            if(timeArr[0].equals("12")){
                timeArr[0] = "00";
            }
            time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
        }
        else if(time.contains("PM")){
            time = time.replace("PM", "");
            String[] timeArr = time.split(":");
            if(!timeArr[0].equals("12")){
                timeArr[0] = Integer.toString(Integer.parseInt(timeArr[0])+12);
            }
            time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
        }
        System.out.println(time);
    }
}

    