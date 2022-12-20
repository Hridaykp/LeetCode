class Solution {
    private void hasKey(List<List<Integer>> rooms, boolean[]seen, int room){
        seen[room] = true;
        for(int i: rooms.get(room))
            if(seen[i] == false)
                hasKey(rooms, seen, i);
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[]seen = new boolean[rooms.size()];
        hasKey(rooms, seen, 0);
        for(boolean flag: seen)
            if(!flag)
                return false;
        return true;
    }
}