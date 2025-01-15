public class shuffleLeetCode {
    public static void main(String[] args) {

    }

    public string RestoreString(string s, int[] indices)
    {
        Dictionary<int, char> map = new Dictionary<int, char>();
        StringBuilder ans = new StringBuilder();

        // Populate the dictionary with indices and characters
        for (int i = 0; i < s.Length; i++)
        {
            map[indices[i]] = s[i];
        }

        // Construct the resulting string
        for (int i = 0; i < s.Length; i++)
        {
            ans.Append(map[i]);
        }

        return ans.ToString();
    }
}


