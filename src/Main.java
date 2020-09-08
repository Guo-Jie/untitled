import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String args[]) throws Exception {
        // 异常抛出，不处理

        File file = new File("F:\\untitled\\src\\Key.txt");
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
        BufferedReader br = new BufferedReader(isr);

        Set set = new HashSet();
        String s = null;
        while ((s = br.readLine()) != null) {
            set.add(s);
        }


        System.out.println(set.toString());
        System.out.println(qu(set.toString()));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\untitled\\src\\min.txt", true)));

        bw.write(qu(set.toString()));

        bw.close();


    }

    public static String qu(String str){
        for (int i = 0 ; i < str.length() ; i++){
            if('['==str.charAt(i)){
                String replace = str.replace(str.charAt(i) + "", "");
                str = replace;
            }else if(']'==str.charAt(i)){
                String replace = str.replace(str.charAt(i) + "", "\n");
                str = replace;
            }else if(','==str.charAt(i)){
                String replace = str.replace(str.charAt(i) + "", "\n");
                str = replace;
            }
        }
        return str;
    }
}
