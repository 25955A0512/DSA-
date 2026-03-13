class Solution {
    ArrayList<String> result = new ArrayList<>();
    public ArrayList<String> generateIp(String s) {
       int n = s.length();
        if (n < 4 || n > 12) return result;
        solve(s, 0, 0, "");
        return result;
    }
    void solve(String str, int idx, int parts, String curr) {
        if (idx == str.length() && parts == 4) {
            result.add(curr.substring(0, curr.length() - 1));
            return;
        }
        if (parts == 4 || idx == str.length()) return;
        for (int len = 1; len <= 3 && idx + len <= str.length(); len++) {
            String segment = str.substring(idx, idx + len);
            if (isValid(segment)) {
                solve(str, idx + len, parts + 1, curr + segment + ".");
            }
        }
    }

    boolean isValid(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') return false;
        int val = Integer.parseInt(s);
        return val >= 0 && val <= 255;
    }  
    }