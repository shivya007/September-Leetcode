//874. Walking Robot Simulation


class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int[] dir = {0, 1};
        int maxdis = 0;
        HashSet<String> set = new HashSet<>();
        for(int i =0; i < obstacles.length; i++){
            String key = obstacles[i][0] + "_" + obstacles[i][1];
            set.add(key);
        }
        for(int i =0; i < commands.length; i++){
            if(commands[i] == -2){         // turn left
                // change x amd y accordingly
                dir = new int[]{-dir[1], dir[0]};
            }
            else if(commands[i] == -1){        // turn right
                // change x amd y accordingly
                dir = new int[]{dir[1], -dir[0]};
            }
            else{
                for(int steps = 0; steps < commands[i]; steps++){
                    int newX = x + dir[0];
                    int newY = y + dir[1];

                    String currKey = newX + "_" + newY;
                    if(set.contains(currKey)){
                        break;
                    }

                    x = newX;
                    y = newY; 
                }
            }
            maxdis = Math.max(maxdis, x*x + y*y);
        }
        return maxdis;
    }
}