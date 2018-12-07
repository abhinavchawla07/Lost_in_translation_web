import java.util.*;

public class translator {

    HashMap<String, String> map = new HashMap<>();
    HashSet<String> matra = new HashSet<>();

    public translator() {
        map.put("0A05", "a");
        map.put("0A06", "a");
        map.put("0A07", "e");
        map.put("0A08", "ii");
        map.put("0A09", "u");
        map.put("0A0A", "uu");
        map.put("0A0F", "ee");
        map.put("0A10", "ai");
        map.put("0A13", "o");
        map.put("0A14", "au");
        map.put("0A15", "k");
        map.put("0A16", "kh");
        map.put("0A17", "g");
        map.put("0A18", "gh");
        map.put("0A19", "ng");
        map.put("0A1A", "ch");
        map.put("0A1B", "chh");
        map.put("0A1C", "j");
        map.put("0A1D", "jh");
        map.put("0A1E", "ny");
        map.put("0A1F", "t");
        map.put("0A20", "th");
        map.put("0A21", "d");
        map.put("0A22", "dh");
        map.put("0A23", "n");
        map.put("0A24", "t");
        map.put("0A25", "th");
        map.put("0A26", "d");
        map.put("0A27", "dh");
        map.put("0A28", "n");
        map.put("0A2A", "p");
        map.put("0A2B", "f");
        map.put("0A2C", "b");
        map.put("0A2D", "bh");
        map.put("0A2E", "m");
        map.put("0A2F", "y");
        map.put("0A30", "r");
        map.put("0A32", "l");
        map.put("0A33", "l");
        map.put("0A35", "v");
        map.put("0A3C", "h");
        map.put("0A36", "sh");
        map.put("0A38", "s");
        map.put("0A39", "h");
        map.put("0A59", "kh");
        map.put("0A5A", "g");
        map.put("0A5B", "z");
        map.put("0A5C", "d");
        map.put("0A5E", "ph");
        map.put("0A72", "i");
        map.put("0A73", "u");
        map.put("0A74", "Ek Onkar");

        map.put("0A02", "n");
        map.put("0A3C", "");
        map.put("0A3E", "a");
        map.put("0A3F", "i");
        map.put("0A40", "i");
        map.put("0A41", "u");
        map.put("0A42", "oo");
        map.put("0A47", "e");
        map.put("0A48", "ai");
        map.put("0A4B", "o");
        map.put("0A4C", "au");
        map.put("0A70", "n");
        map.put("0A71", "");
        map.put("0A4D", "");
        map.put("0A51", "");

        matra.add("0A3C");
        matra.add("0A3E");
        matra.add("0A3F");
        matra.add("0A40");
        matra.add("0A41");
        matra.add("0A42");
        matra.add("0A47");
        matra.add("0A48");
        matra.add("0A4B");
        matra.add("0A4C");
        matra.add("0A70");
        //matra.add("0A71");
        matra.add("0A4D");
        matra.add("0A51");
        matra.add("0A66");
        matra.add("0A67");
        matra.add("0A68");
        matra.add("0A69");
        matra.add("0A6A");
        matra.add("0A6B");
        matra.add("0A6C");
        matra.add("0A6D");
        matra.add("0A6E");
        matra.add("0A6F");
        matra.add("030");
        matra.add("031");
        matra.add("032");
        matra.add("033");
        matra.add("034");
        matra.add("035");
        matra.add("036");
        matra.add("037");
        matra.add("038");
        matra.add("039");
        matra.add("02D");
        matra.add("027");
        matra.add("0964");


        map.put("0A66", "0");
        map.put("0A67", "1");
        map.put("0A68", "2");
        map.put("0A69", "3");
        map.put("0A6A", "4");
        map.put("0A6B", "5");
        map.put("0A6C", "6");
        map.put("0A6D", "7");
        map.put("0A6E", "8");
        map.put("0A6F", "9");
        map.put("030", "0");
        map.put("031", "1");
        map.put("032", "2");
        map.put("033", "3");
        map.put("034", "4");
        map.put("035", "5");
        map.put("036", "6");
        map.put("037", "7");
        map.put("038", "8");
        map.put("039", "9");
        map.put("02D", "-");
        map.put("027", "u");
        map.put("0964", ".");
    }

    public String transliterate(String s) {
        String x = "";
        int i,l=s.length();

        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == ',' || s.charAt(i) == '\n')
                x += s.charAt(i);
            else if(!map.containsKey('0' + Integer.toHexString(s.charAt(i)).toUpperCase())) x+= s.charAt(i);
            else if (('0' + Integer.toHexString(s.charAt(i)).toUpperCase()).equals("0A71")) {
                x += map.get('0' + Integer.toHexString(s.charAt(i + 1)).toUpperCase());
            }else if (('0' + Integer.toHexString(s.charAt(i)).toUpperCase()).equals("0A02")){
                if(i>2 && ('0' + Integer.toHexString(s.charAt(i - 2)).toUpperCase()).equals("0A2E")){
                    continue;
                }
                else  x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase());
            } else if (('0' + Integer.toHexString(s.charAt(i)).toUpperCase()).equals("0A70")) {
                if(s.charAt(i+1)=='\u0964' || s.charAt(i+1)==' '){

                }
                else if (('0' + Integer.toHexString(s.charAt(i + 1)).toUpperCase()).equals("0A2E")) {
                    x += 'a';
                } else if (('0' + Integer.toHexString(s.charAt(i + 1)).toUpperCase()).equals("0A2A") || ('0' + Integer.toHexString(s.charAt(i + 1)).toUpperCase()).equals("0A2C")) {
                    x += "am";
                } else {
                    if (matra.contains('0' + Integer.toHexString(s.charAt(i - 1)).toUpperCase())) {
                        x += 'n';
                    } else x += "an";
                }

            }
            else if(i<=l-3 && !matra.contains('0'+Integer.toHexString(s.charAt(i)).toUpperCase())&&!matra.contains('0'+Integer.toHexString(s.charAt(i+1)).toUpperCase())&&!matra.contains('0'+Integer.toHexString(s.charAt(i+2)).toUpperCase()))
            {
                if(s.charAt(i+1) == ' ' || s.charAt(i+1) == ',' || s.charAt(i+1) == '\n') x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase());
                else if(!map.containsKey('0' + Integer.toHexString(s.charAt(i+1)).toUpperCase())) x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase());


                else x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase())+'a';
            }
            else if(i<=l-2&&!matra.contains('0'+Integer.toHexString(s.charAt(i)).toUpperCase())&&!matra.contains('0'+Integer.toHexString(s.charAt(i+1)).toUpperCase()))
            {
              if(s.charAt(i+1) == ' ' || s.charAt(i+1) == ',' || s.charAt(i+1) == '\n') x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase());
                else if(!map.containsKey('0' + Integer.toHexString(s.charAt(i+1)).toUpperCase())) x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase());


                else x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase())+'a';
            }
            else {
                x += map.get('0' + Integer.toHexString(s.charAt(i)).toUpperCase());
            }
        }



        return x;
    }

    public String punctuator(String s) {
        char str[] = s.toCharArray();
        int l = s.length();
        boolean capitalize = true;
        for (int i = 0; i < l; i++) {
            if (capitalize && str[i] >= 'a' && str[i] <= 'z') {
                str[i] = Character.toUpperCase(str[i]);
                capitalize = false;
            } else if (str[i] == '.') {
                capitalize = true;
            }
        }
        s = new String(str);
        return s;
    }

}