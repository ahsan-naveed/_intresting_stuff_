import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().Begin();
    }

    public String ReadLn (int maxLg)
    {
        byte lin[] = new byte [maxLg];
        int lg = 0, car = -1;
        String line = "";

        try
        {
            while (lg < maxLg)
            {
                car = System.in.read();
                if ((car < 0) || (car == '\n')) break;
                lin [lg++] += car;
            }
        }
        catch (IOException e)
        {
            return (null);
        }

        if ((car < 0) && (lg == 0)) return (null);  // eof
        return (new String (lin, 0, lg));
    }

    public void printFrecuency(String textLine) {
        textLine = textLine.replaceAll("(\\r|\\n)", "");

        char[] charArray = textLine.toCharArray();
        int[] intAscii = new int[256];
        int[] intAsciiSorted = new int[256];

        for(int i = 0; i < charArray.length; i++) {
            intAscii[charArray[i]]++;
            intAsciiSorted[charArray[i]]++;
        }

        Arrays.sort(intAsciiSorted);

        for (int i = 160; i < 256; i++) {
            if(intAsciiSorted[i] != 0) {

                for (int j = 32; j < 128; j++) {
                    if(intAscii[j] == intAsciiSorted[i]) {
                        System.out.println(j + " " + intAsciiSorted[i]);
                        intAscii[j] = 0;
                        break;
                    }
                }

            }
        }
        System.out.println("");
    }

    public void Begin()
    {
        String input;

        while ((input = ReadLn (1000)) != null)
        {
            printFrecuency(input);
        }
    }
}
