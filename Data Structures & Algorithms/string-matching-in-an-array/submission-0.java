class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> li = new ArrayList<>();

        for (int j = 0; j < words.length; j++) {
            for (int i = 0; i < words.length; i++) {

                if (j != i && words[i].contains(words[j])) {
                    li.add(words[j]);
                    break;
                }

            }
        }

        return li;
    }
}