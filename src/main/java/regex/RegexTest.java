package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {
        //testMatcherAndSubstringFinder();
        testGreedyAndReluctantOperator();
    }


    static void testMatcherAndSubstringFinder(){
        String inputString="Paytm Release/10.23.2/721100 (net.one97.paytm; source=com.android.vending; integrity=true; auth=true; en-IN;  integrity=True;   okhttp 4.9.1) Android/13 OnePlus/NE2211 (arm64-v8a; resolution=3.0; cores=8) ";
        String patternString="integrity=(?i)(true|false)";;
        matchTest(inputString,patternString);
    }

    static void testGreedyAndReluctantOperator(){
        String inputString="a extend  cup end you enemy need  xyz ed true ed true";
        matchTest(inputString,"e.*d");
        matchTest(inputString,"e.+d");
        matchTest(inputString,"e.+?d");
        matchTest(inputString,"e.*?d");
        matchTest(inputString,"e.*?d\\s+?(true|false)");
    }





    static void matchTest(String inputString, String patternString){
        //create a pattern object
        Pattern pattern = Pattern.compile(patternString );
        Matcher matcher = pattern.matcher(inputString);

        //matcher.matches()   : attempts to match the entire input sequence
        //matcher.find()      : scans the input sequence looking for the next subsequence that matches the pattern
        //matcher.group()     : returns the input subsequence matched by the previous match.
        //matcher.replaceAll(replacementStr)  : Find and replace all matches.
        System.out.println("\n---- Matching for pattern : " + patternString + "  -----");
        System.out.println("Matching whole string :  " + matcher.matches());
        matcher.reset();
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }

    //Matcher is just like group(0)
    public static void main1(String[] args) {
        final String regex = "e.*?d(true|false)";
        final String string = "extend cup end you enemy need xyz edtrue";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
