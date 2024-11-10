package CC;

public class Main {
    public void caesar(char[] c, char[] d, int max, int min, int key, int mode){
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                d[i] = c[i];
            }else{
                int asc = 0;
                if (mode == 1) {
                    asc = c[i] + key;
                    if (asc > max) {
                        asc -= max;
                        asc = asc + min - 1;
                    }

                }else if (mode == 2){
                    asc = c[i] - key;
                    if (asc < min) {
                        asc += max;
                        asc = asc - min + 1;
                    }

                    }
                d[i] = (char) asc;

            }

        }

        String caesared = java.lang.String.valueOf(d);
        if (mode == 1) {
            System.out.println("Cipher text(s): " + caesared);
        }else{
            System.out.println("Plain text(s): " + caesared);
        }

    }
}