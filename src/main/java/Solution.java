class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int j = 0; j < s.length(); j++) {
            sum += (s.charAt(j) - 'a'  + 1) % 10;
            sum += (s.charAt(j) - 'a' + 1) / 10;
        }
        
        for(int i = 0; i < k - 1; i++) {
            int x = 0;
            while(sum !=0) {
                x += sum % 10;
                sum /= 10; 
            }
            sum = x;
        }
        
        return sum;
    }
}