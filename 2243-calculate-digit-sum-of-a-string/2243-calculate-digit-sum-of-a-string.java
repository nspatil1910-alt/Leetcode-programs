class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {

            String pq = "";

            for (int i = 0; i < s.length(); i += k) {

                int sum = 0;

                for (int j = i; j < i + k && j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }

                pq += sum;
            }

            s = pq;
        }

        return s;
    }
    }
