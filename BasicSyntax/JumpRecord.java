package BasicSyntax;

public class JumpRecord{

    private int maximum;
    private int longest;
    private int jumps;
    private int fouljumps;
    private double distance;
    private int maxjumps;
    private double j1;
    private double j2;
    private double j3;


    public JumpRecord(){
        maxjumps = 3;
        maximum = 0;
        longest = 0;
        jumps = 0;
        fouljumps = 0;
        distance = 0;

    }
    public void recordJump(double distance){





        if ( jumps == 0){

            j1 = distance;
            jumps++;
            maximum = 1;
        }
        else if (jumps == 1){

            j2 = distance;
            jumps++;
            if (j2 > j1){
                maximum = 2;
            }
            else{
                maximum = 1;
            }

        }
        else if(jumps == 2){

            j3 = distance;
            jumps++;
            if ( j3 > j2 && j3> j1){
                maximum = 3;
            }
            else if (j2>= j3 && j2 > j1){
                maximum = 2;
            }
            else if (j1 >= j2 && j1>=3){
                maximum = 1;
            }
        }

    }

    public void recordFoulJump(){
        if ( finished()== false){
            fouljumps++;
            jumps++;
        }
    }
    public int jumps(){
        if (finished() == true){
            return maxjumps;
        }
        else{
            return jumps;
        }
    }
    public boolean finished(){
        if (jumps == maxjumps){
            return true;

        }
        else{
            return false;
        }
    }
    public int maxJumps(){
        return maxjumps;
    }
    public int foulJumps(){
        return fouljumps;
    }
    public boolean isFoulJump(int n){
        if (n>0 && n<=3){
            String f = "j"+n;
            if ( f.equals("j1")&& j1 ==0){
                return true;
            }
            if (f.equals("j2")&& j2 ==0){
                return true;
            }
            if (f.equals("j3")&& j3==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }

    }
    public double getJumpDistance(int a){
        double x = 0;
        if(a>0 && a<=3){
            String j = "j"+a;

            if ( j.equals("j1")){
                x = j1;
            }
            else if (j.equals("j2")){
                x = j2;
            }
            else if (j.equals("j3")){
                x = j3;
            }
            return x;
        }
        else{
            return x;
        }

    }

    public int getLongest(){
        int z = 0;
        if( jumps>0 && fouljumps < jumps){
            return maximum;
        }
        else{
            return z;
        }
    }

}