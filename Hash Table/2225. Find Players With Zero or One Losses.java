class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> zeroloss = new ArrayList();
        List<Integer> oneloss = new ArrayList();
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int team[] : matches){
            map.put(team[0] , map.getOrDefault(team[0],0) + 0);
            map.put(team[1] , map.getOrDefault(team[1],0) + 1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == 0){
                zeroloss.add(i);
            }
            else if(map.get(i) == 1){
                oneloss.add(i);
            }
        }
        Collections.sort(zeroloss);  
        Collections.sort(oneloss);
        return Arrays.asList(zeroloss , oneloss);
    }
}
