import java.util.ArrayList;
import java.lang.*;

public class Test {
     ArrayList<String> sentences;

    public void editor ()
    {
        int i = 0;

        for (String str:sentences)
        {
            str = str.substring(0,1).toUpperCase() + str.substring(1, str.length());
            sentences.set(i, str);

            if (str.charAt(str.length()-1) != '.')
            {
                str += '.';
                sentences.set(i, str);
            }
        i++;
        }
    }

    public ArrayList<String> getSentences() {
        return sentences;
    }

    public Test(ArrayList<String> sentences) {
        this.sentences = sentences;
    }

    public static void main(String args[]) {

        ArrayList<String> s = new ArrayList<>();
        s.add("Hello there");
        s.add("my name is lindo");

        Test t = new Test(s);

        System.out.println("Sentences before editing...");
        for (String str : t.getSentences()) {
            System.out.println(str);
        }
        System.out.println("Sentences after editing...");
        t.editor();
        for (String str : t.getSentences()) {
            System.out.println(str);
        }
    }
}
