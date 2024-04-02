package com.ashu.LEET;

class FindWord {
    //word = javaworld
    //chars = java , world

    public int countCharacters(String[] words, String chars) {
        int count=0;

        for(int i=0; i<words.length; i++){
            int temp =0;

            String str= words[i];
            if(str.length() > chars.length()){
                break;
            }else{
                for(int j=0; j<str.length(); j++){
                 if(chars.indexOf(str.charAt(j)) != -1){
                     temp++;
                     if (temp == str.length()){
                        count += temp;
                     }
                    }
                }
            }
        }
    return count;
    }

    public int countCharactersFinal(String[] words, String chars) {
        int[] cnt = new int[26];
        for (int i = 0; i < chars.length(); ++i) {
            ++cnt[chars.charAt(i) - 'a'];
        }
        int ans = 0;
        for (String w : words) {
            int[] wc = new int[26];
            boolean ok = true;
            for (int i = 0; i < w.length(); ++i) {
                int j = w.charAt(i) - 'a';
                if (++wc[j] > cnt[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                ans += w.length();
            }
        }
        return ans;
    }
}