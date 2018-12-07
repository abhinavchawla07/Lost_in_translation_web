//import java.io.BufferedReader;

import java.io.*;
import java.io.File;
public class driver {

    static File f;
    static String x = "";

    public driver() {
    }
    
    public static void main(String[] args) {
        translator t = new translator();
        try {
            String s="";
            File t1 = new File("t.txt");
            BufferedReader br = new BufferedReader(new FileReader(t1));
            x = "";
            while ((s = br.readLine()) != null) {
                x+=s+" ";
            }
            // x="ਗੰਗਾ ਨਦੀ ਦੇ ਨੇੜੇ ਕੱਪੜੇ ਧੋ ਰਹੀ ਹੈ";
            x = t.transliterate(x);
            x=t.punctuator(x);
            File t2 = new File("t1.txt");
            PrintWriter out = new PrintWriter("t1.txt");
            // System.out.println(x);
            out.println(x);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /*
    public static void main(String args[]) throws Exception {
        String s = "ਅਭਿਨਵ ਚਾਵਲਾ";
        //checkpoint

        //s = "ਕੰਮ ਬੰਬ ਲੰਬੇ";
        translator t = new translator();
        driver d=new driver(f);
//        s = d.executeCommand("cmd\ntesseract "+f.getAbsolutePath()+" t -l pan");
        Process p;
        try {
            String[] cmd ={"sh","/home/minor/main.sh"};
            ProcessBuilder pb=new ProcessBuilder(cmd);
            p=pb.start();
            p.waitFor();
        } catch (Exception e) {
        }
        File t1 = new File("t.txt");
        BufferedReader br = new BufferedReader(new FileReader(t1));
        x = "";
        while ((s = br.readLine()) != null) {
            x += t.transliterate(s);
        }/*
        x="ਫਰਵਰੀ 21 ਦਾ ਦਿਨ ਸਾਰੇ ਸੰਸਾਰ ਵਿਚ ਮਾਂ-ਬੋਲੀ ਦਿਨ ਵਜੋਂ ਮੰਨਾਇਆ ਜਾਂਦਾ ਹੈ। ਆਪੋ\n" +
                "'ਆਪਈ ਮਾਂ-ਬੋਲੀ ਵਲਾਂ ਆਪਾ ਪਿਆਰ, ਸਤਿਕਾਰ ਤੋ ਜੁੰਮੇਵਾਰੀ ਦਾ ਪ੍ਰਗਟਾਵਾ ਕਰਨ ਲਈ\n" +
                "ਹਰ ਬੋਲੀ ਦੇ ਲੋਕ ਇਸ ਦਿਨ 'ਤੇ ਢੁੱਕਵੀਆਂ ਸਰਗਰਮੀਆਂ ਕਰਦੇ ਹਨ। ਦੁਨੀਆ ਦੇ ਵੱਖ ਵੱਖ\n" +
                "ਹਿੱਸਿਆਂ ਵਿਚ ਵਸਦੇ ਪੰਜਾਬੀ ਲੋਕ ਵੀ ਇਸ ਦਿਨ 'ਤੇ ਆਪਈ ਮਾਂ-ਬੋਲੀ ਵਲਾਂ ਆਪਈ\n" +
                "ਮੁਹੱਬਤ ਦਾ ਵੱਖਰੇ ਵੱਖਰੇ ਤਰੀਕਿਆਂ ਨਾਲ ਪ੍ਰਗਟਾਵਾ ਕਰਦੇ ਹਨ। ਇਸਦਿਨ ਨੂੰ\n" +
                "ਅੰਤਰਰਾਸ਼ਟਰੀ ਮਾਂ-ਬੋਲੀ ਦਿਨ ਵਜੋਂ ਮਾਨਤਾ ਦਿਵਾਉਣ ਲਈਸ੍ਰਿਟਿਸ਼ ਕੋਲੰਬੀਆ ਦੇ ਸਰੀ\n" +
                "ਸ਼ਹਿਰ ਰਹਿੰਦੇ ਬੰਗਲਾਦੇਸ਼ੀ ਪਿਛੋਕੜ ਦੇ ਕੁਝ ਲੋਕਾਂ ਨੇ ਪਹਿਲ ਕੀਤੀ ਸੀ। ਉਨ੍ਹਾਂ ਨੇ ਬੰਗਾਲੀ\n" +
                "ਬੋਲੀ ਲਈਸੰਘਰਸ਼ ਦੌਰਾਨ 1952 ਵਿਚ ਸ਼ਹੀਦ ਹੋਏ ਨੋਜਵਾਨਾਂ ਦੀ ਯਾਦ ਵਿਚ ਯੂਨੈਸਕੋ ਕੋਲੋਂ\n" +
                "ਮੰਗ ਕੀਤੀ ਸੀ ਕਿ ਹਰ ਸਾਲ ਇਕਦਿਨ ਮਾਂ-ਬੋਲੀ ਦਿਨ ਵਜੋਂ ਦੁਨੀਆ ਭਰ ਵਿਚ ਮੰਨਾਇਆ\n" +
                "ਜਾਵੇ। ਉਨ੍ਹਾਂ ਦੀ ਮੰਗ ਦੇ ਹੁੰਗਾਰੇ ਵਜੋਂ ਯੂਨੈਸਕੋ ਨੇ ਨਵੰਬਰ 1999 ਵਿਚ 21 ਫਰਵਰੀ ਦਾ\n" +
                "ਦਿਨ ਅੰਤਰਰਾਸ਼ਟਰੀ ਮਾਂ-ਬੋਲੀ ਦਿਨ ਵਜੋਂ ਮੰਨਾਉ ਦਾ ਐਲਾਨ ਕੀਤਾ। ਏਥੇ ਇਹ ਜ਼ਿਕਰ\n" +
                "ਕਰਨਾ ਜ਼ਰੂਰੀ ਹੈ ਕਿ ਬੰਗਾਲੀ ਬੋਲੀ ਨੂੰ ਪਿਆਰ ਕਰਨ ਵਾਲੇ ਬੰਗਲਾਦੇਸ਼ੀਆਂ ਵਿਚ ਸਰੀ\n" +
                "ਵਸਦੇ ਰਫੀਕਉਲ ਇਸਲਾਮ ਨਾਂ ਦੇ ਵਿਅਕਤੀ ਨੇ ਮੂਹਰਲੀ ਭੂਮਿਕਾ ਨਿਭਾਈ ਸੀ। ਇਹ ਦੁੱਖ\n" +
                "ਵਾਲੀ ਗੱਲ ਹੈ ਕਿ ਕੁਝ ਦੇਰ ਪਹਿਲਾਂ, 20 ਨਵੰਬਰ, 2013 ਵਾਲੇ ਦਿਨ ਸ੍ਰੀ ਰਫੀਕਉਲ\n" +
                "ਇਸਲਾਮ ਹੋਰਾਂ ਦਾ ਸਰੀ ਵਿਚ ਦੇਹਾਂਤ ਹੋ ਗਿਆ। ਆਪੋ ਆਪਈ ਮਾਂ-ਬੋਲੀ ਨੂੰ ਪਿਆਰ ਕਰਨ\n" +
                "ਵਾਲੇ ਅਤੇ ਉਸ ਬਾਰੇ ਫਿਕਰ ਕਰਨ ਵਾਲੇ ਲੋਕ ਰਫੀਕਉਲ ਇਸਲਾਮ ਹੋਰਾਂ ਦੇ ਸਦਾ\n" +
                "ਸ਼ੁਕਰਗੁਜ਼ਾਰ ਰਹਿਣਗੇ।";
        x= t.transliterate(x);
     */
//        x = t.punctuator(x);

    /*
        int i;
//        for (i = 0; i < s.length()-3 ; i++) {
//            if(s.charAt(i)==' ')
//                x+=' ';
//            else if(!matra.containsKey('0'+Integer.toHexString(s.charAt(i + 1))) && !matra.containsKey('0'+Integer.toHexString(s.charAt(i + 3))) && !matra.containsKey('0'+Integer.toHexString(s.charAt(i + 2))))
//            {
//                x=x+map.get('0'+Integer.toHexString(s.charAt(i)).toUpperCase())+'a';
//            }
//            else
//                x=x+map.get('0'+Integer.toHexString(s.charAt(i )).toUpperCase());
//        }
//        x=x+map.get('0'+Integer.toHexString(s.charAt(i )).toUpperCase())+map.get('0'+Integer.toHexString(s.charAt(i+1 )).toUpperCase())+map.get('0'+Integer.toHexString(s.charAt(i+2 )).toUpperCase());
        try {

            BufferedReader br=new BufferedReader(new FileReader(f));
            while ((s=br.readLine())!=null) {
                String x = "";
                for (i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ' '||s.charAt(i) == ',')
                        x += s.charAt(i);
                    else if (('0' + Integer.toHexString(s.charAt(i)).toUpperCase()).equals("0A71")) {
                        x += map.get('0' + Integer.toHexString(s.charAt(i+1)).toUpperCase());
                    }
                    else {
                        x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase());
//                        if(i<s.length()-2&&!matra.containsKey('0' + Integer.toHexString(s.charAt(i+1)))&&s.charAt(i+1)!=' '&&!matra.containsKey('0' + Integer.toHexString(s.charAt(i+2))))
//                            x=x+ map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase())+'a';
//                        else
//                            x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase());
                    }
                }

                System.out.println(x);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }*/
//    }*/
}
