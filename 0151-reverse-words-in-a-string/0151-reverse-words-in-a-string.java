class Solution {
    public String reverseWords(String s) {
        ArrayList<String> a = new ArrayList<>();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                continue;
            }

            a.add(words[i]);
        }
        StringBuilder res = new StringBuilder();
        for (int j = a.size() - 1; j >= 0; j--) {
            res.append(a.get(j));
            if (j != 0) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}