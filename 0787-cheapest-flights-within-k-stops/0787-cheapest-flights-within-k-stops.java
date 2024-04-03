class Pair{
    int first, second;
    public Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Tuple{
    int first, second, third;
    public Tuple(int first, int second, int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        int m=flights.length;
        for(int i=0;i<m;i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
        }
        
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(0,src,0));
        int[] cost = new int[n];
        for(int i=0;i<n;i++){
            cost[i] = (int)(1e9);
        }
        cost[src]=0;
        
        while(!q.isEmpty()){
            Tuple it=q.peek();
            q.remove();
            int stops = it.first;
            int node = it.second;
            int costs = it.third;
            
            if(stops>k) continue;
            for(Pair iter:adj.get(node)){
                int adjNode = iter.first;
                int edw = iter.second;
                if(costs+edw<cost[adjNode] && stops<=k){
                    cost[adjNode]=costs+edw;
                    q.add(new Tuple(stops+1, adjNode, costs+edw));
                }
            }
        }
        
        if(cost[dst]==(int)(1e9)) return -1;
        return cost[dst];
    }
}