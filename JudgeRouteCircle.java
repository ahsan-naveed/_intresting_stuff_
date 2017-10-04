class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int total_steps = 0;
        for (char c : moves.toCharArray()) {
            if (c=='U' || c=='R') total_steps ++;
            else if (c=='D' || c=='L') total_steps --;
            else {
                // do nothing
            }
        }
        
        if (total_steps != 0) return false;
        System.out.println(total_steps);
        return true;
    }
}
