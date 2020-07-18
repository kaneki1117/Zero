package leetcode.nums61_90;

import java.util.ArrayList;
import java.util.List;

public class Ques68 {

    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < words.length) {
            int j  = i, len = 0;
            while (j < words.length && len + words[j].length() + j - i <= maxWidth) {
                len += words[j++].length();
            }
            String out = "";
            int space = maxWidth - len;
            for(int k = i ; k < j ; k++ ) {
                out += words[k];
                if( space > 0) {
                    int temp;
                    if (j == words.length) {
                        //最后一行
                        if(j - k == 1) temp = space;
                        else temp = 1;
                    } else {
                        if(j - k - 1 > 0) {
                            //space大小会变 这里也会随之而改变
                            if(space % (j - k - 1) == 0) temp = space / (j - k - 1);
                            else temp = space / (j - k - 1) + 1;
                        } else  temp = space;

                    }
                    out += getNumsOfSpace(temp);
                    space -= temp;


                }
            }
            result.add(out);
            i = j;

        }

        return result;

    }


    public String getNumsOfSpace(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
