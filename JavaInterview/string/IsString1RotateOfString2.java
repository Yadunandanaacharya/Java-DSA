package string;

public class IsString1RotateOfString2 {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";
       
        // Check if s2 is a rotation of s1
 
        System.out.println(areRotations(s1, s2) ? "true" : "false");
    }

    static int[] computeLPSArray(String pat) {
        int n = pat.length();
        int[] lps = new int[n];
        // Length of the previous longest prefix suffix
        int len = 0;
        // lps[0] is always 0
        lps[0] = 0;
        // Calculate lps[i] for i = 1 to n-1
        int i = 1;
        while (i < n) {
            // If characters match, increment len and extend matching prefix
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                // Mismatch
                if (len != 0) {
                    // Update len to the last known prefix length
                    len = lps[len - 1];
                } else {
                    // No prefix matches, set lps[i] = 0
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    static boolean areRotations(String s1, String s2) {
        // Concatenate s1 with itself
        String txt = s1 + s1;
        String pat = s2;
       
        // Lengths of text and pattern
        int n = txt.length();
        int m = pat.length();
    
        // Create lps[] for the pattern
        int[] lps = computeLPSArray(pat);
       
        // Initialize indices for text and pattern
        int i = 0, j = 0;
        while (i < n) {
            // If characters match, move both indices
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
    
            // If a full match is found
            if (j == m) {
                return true;
            }
    
            // Mismatch after j matches
            else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                // Update j using lps array
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }
}



