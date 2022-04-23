package delivery;

/**
 * @author omarbekdinasil
 * on 21.04.2022
 * @project leetcode
 */
public class Second {

    private char[] chars = {'A', 'B', 'C', 'D'};

    public static void main(String[] args) {
//        System.out.println(new Second().solution("ABAD"));
        System.out.println(new Second().solution("ACCD"));
    }

    public int solution(String S) {
        if (S.isEmpty()) {
            return 0;
        }
        String str = "";
        char prev = S.charAt(0);
        boolean notAdd=false;
        for (int i = 1; i < S.length(); i++) {
            char next = S.charAt(i);
            char res = compare(prev, next);
            if(res==prev){
                if(!notAdd){
                    str += res;
                }
                notAdd=true;
            }else{
                str += res;
            }
        }
        return str.length();
    }

    private char compare(char current, char ch) {
        if (current == 'A') {
            if (ch == 'D') {
                return 'D';
            } else {
                return 'A';
            }
        } else if (current == 'B') {
            if (ch == 'A') {
                return 'A';
            } else {
                return 'B';
            }
        } else if (current == 'C') {
            if (ch == 'D' || ch == 'C') {
                return 'C';
            } else {
                return ch;
            }
        }
        return ch;
    }
}
