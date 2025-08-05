class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        int max = 0;
        for (int i = 0;i<candies.length;i++){
           if(max<candies[i]) max = candies[i];
        }
        for (int i =0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max) list.add(true);
            else list.add(false);
        }
        return list;
         
    }
}