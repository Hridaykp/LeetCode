class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> stk = new Stack();
        boolean visited[] = new boolean[rooms.size()];
        visited[0] = true;
        for(int i: rooms.get(0)){
            stk.push(i);
            visited[i] = true;
        }
        while(!stk.isEmpty()){
            int temp = stk.pop();
            for(int i: rooms.get(temp)){
                if(visited[i] != true){
                    stk.push(i);
                    visited[i] = true;
                }
            }
        }
        for(boolean flag: visited)
            if(flag == false)
                return false;
        return true;
    }
}