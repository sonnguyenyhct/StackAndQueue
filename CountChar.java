import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        String document = "hom nay,,, ngay ^%&mai.,241 #%@$  Hom 1312qua,  tuan nay.   Tuan sau..sau sau,.,";
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        String documentLowerCase = document.toLowerCase();
        StringBuilder work = new StringBuilder();

        for (int i = 0; i < document.length()-1; i++) {
            if ((int) documentLowerCase.charAt(i) >= 97 && (int) documentLowerCase.charAt(i) <= 122) {
                work.append(document.charAt(i));
                if ((int) documentLowerCase.charAt(i + 1) < 97 || (int) documentLowerCase.charAt(i + 1) > 122) {
                    if (treeMap.containsKey(work.toString())){
                        treeMap.replace(work.toString(),treeMap.get(work.toString()) + 1);
                    }else {
                        treeMap.put(work.toString(), 1);
                    }
                    work = new StringBuilder();
                }
            }
        }
            System.out.println(treeMap);
    }

}
