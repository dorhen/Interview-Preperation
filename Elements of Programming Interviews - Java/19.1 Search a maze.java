public class Pair{
    public int first;
    public int second;
    
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

import java.util.*;

class Maze{
    
    static List<Pair> findPath(int[][] maze, Pair entrance, Pair exit){
        List<Pair> path = new LinkedList<Pair>();
        path.add(entrance);
        if(!buildPath(maze,entrance,exit,path))
            path.remove(entrance);
        return path;
    }
    
    private static boolean buildPath(int[][] maze, Pair curr, Pair exit, List<Pair> path){
        if(curr.first == exit.first && curr.second == exit.second)
            return true;
        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        for(int[] direction : directions){
            Pair newCor = new Pair(curr.first + direction[0], curr.second + direction[1]);
            if(isViableStep(maze, newCor)){
                maze[newCor.first][newCor.second] = 1;
                path.add(newCor);
                if(buildPath(maze,newCor,exit,path))
                    return true;
                path.remove(path.size()-1);
            }
        }
        
        return false;
    }
    
    satic boolean isViableStep(int[][] maze, Pair step){
        return step.first < maze.size && step.second < maze[step.first].size && maze[step.first][step.second] == 0;
    }
    
}
