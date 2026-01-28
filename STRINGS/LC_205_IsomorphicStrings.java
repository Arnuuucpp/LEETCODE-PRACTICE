import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2)
                    return false;
            } else {
                mapST.put(c1, c2);
            }

            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1)
                    return false;
            } else {
                mapTS.put(c2, c1);
            }

        }

        return true;

    }
}

/*
pattern
🧠 Core Pattern
Pattern: Bijective Mapping using HashMaps
🔑 Recognition Points
Two strings of equal length
Character-by-character position-wise comparison
Need one-to-one mapping (no two chars map to same char)
Order matters, values must be consistent


Common Methods
put(K key, V value) – Inserts a key-value pair.
get(Object key) – Retrieves the value associated with the key.
getOrDefault(Object key, V defaultValue) – Returns the value or a default if the key is not found.
containsKey(Object key) – Checks if a key exists.
containsValue(Object value) – Checks if a value exists.
keySet() – Returns a set of all keys.
values() – Returns a collection of all values.
entrySet() – Returns a set of key-value pairs for iteration


⏱️ Complexity Analysis

Time Complexity: O(n)

Single pass through strings

Space Complexity: O(1)

At most 256 ASCII characters



Common Pitfalls (YOU SHOULD REMEMBER)

❌ Using only one map

❌ Modifying the strings

❌ Checking index parity instead of character value

❌ Forgetting reverse mapping


Similar Questions (Practice These)

Word Pattern

Find and Replace Pattern

Isomorphic Arrays

Check Bijective Mapping problems
*/