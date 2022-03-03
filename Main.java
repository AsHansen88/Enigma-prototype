package com.company;

public class Main {

    public void Bogstaver_til_tal() {

        String s = "abcdefghijklmnopqrstuvwxyz";
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!t.isEmpty()) {
                t += "";
            }
            int n = (int)ch - (int)'a' + 1;
            t += String.valueOf(n);
        }

        }

    public void Tal_til_bogstaver() {

        char[] alfabet = new char[26];
        alfabet[1] = 'A';
        alfabet[2] = 'B';
        alfabet[3] = 'C';
        alfabet[4] = 'D';
        alfabet[5] = 'E';
        alfabet[6] = 'F';
        alfabet[7] = 'G';
        alfabet[8] = 'H';
        alfabet[9] = 'I';
        alfabet[10] = 'J';
        alfabet[11] = 'K';
        alfabet[12] = 'L';
        alfabet[13] = 'M';
        alfabet[14] = 'N';
        alfabet[15] = 'O';
        alfabet[16] = 'P';
        alfabet[17] = 'Q';
        alfabet[18] = 'R';
        alfabet[19] = 'S';
        alfabet[20] = 'T';
        alfabet[21] = 'U';
        alfabet[22] = 'V';
        alfabet[23] = 'W';
        alfabet[24] = 'X';
        alfabet[25] = 'Y';
        alfabet[25] = 'Z';

        for(int i = 0; i < alfabet.length; i++)


    }

    public static void main(String[] args) {

        new Main().Tal_til_bogstaver();
        {

        }
        new Main().Bogstaver_til_tal();
        {

        }

    }


    }





