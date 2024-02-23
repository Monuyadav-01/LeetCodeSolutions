class Solution {
    public List<String> commonChars(String[] words) {
    Map<Character, Integer> counts = new HashMap<>();

        for (char c : words[0].toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> w = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                w.put(c, w.getOrDefault(c, 0) + 1);
            }
            counts.keySet().retainAll(w.keySet());
            for (char c : counts.keySet()) {
                counts.put(c, Math.min(counts.get(c), w.get(c)));
            }
        }

        List<String> res = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int j = 0; j < count; j++) {
                res.add(Character.toString(c));
            }
        }

        return res;
     }
}