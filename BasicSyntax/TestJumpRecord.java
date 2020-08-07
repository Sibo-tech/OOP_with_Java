package BasicSyntax;

import BasicSyntax.JumpRecord;

public class TestJumpRecord{
    private TestJumpRecord(){}

    public static void main(final String[] args) {
        System.out.println("Test 1");
        JumpRecord jump = new JumpRecord();
        jump.recordJump(4.8);
        if (jump.jumps() == 1){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Test 2");
        jump.recordJump(6.3);
        if (jump.jumps()== 2 && jump.getLongest() == 2){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        System.out.println("Test 3");
        jump.recordJump(8.7);
        if ( jump.jumps() == 3
                &&  jump.getLongest() == 3
                &&  jump.finished() ){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Test 4");
        JumpRecord record = new JumpRecord();
        record.recordFoulJump();
        if( record.foulJumps() == 1){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Test 5");
        int i = jump.getLongest();
        if (jump.jumps() == 3
                && i == 3
                && jump.finished()
                && jump.foulJumps()==0){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }


        System.out.println("Test 6");
        JumpRecord a = new JumpRecord();
        if(a.maxJumps() == 3){
            System.out.println("Pass");
        }

        else{
            System.out.println("Fail");
        }

        System.out.println("Test 7");
        a.recordFoulJump();
        a.recordFoulJump();
        a.recordFoulJump();
        if (a.foulJumps() == 3 && a.finished()){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        System.out.println("Test 8");
        JumpRecord F = new JumpRecord();
        F.recordJump(4.5);
        F.recordFoulJump();
        F.recordJump(4.2);
        int f = F.getLongest();
        if (F.jumps() == 3 && f == 1 && F.isFoulJump(2)&& F.finished()&& F.foulJumps() == 1  ){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 9");
        if (F.getJumpDistance(1) == 4.5){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 10");
        if(F.getJumpDistance(2) == 0){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 11");
        JumpRecord G = new JumpRecord();
        G.recordJump(4.8);
        G.recordJump(4.8);
        G.recordJump(4.7);
        int g = G.getLongest();
        if(g == 1 && G.jumps() == 3 && G.finished()){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 12");
        JumpRecord L = new JumpRecord();
        L.recordFoulJump();
        L.recordFoulJump();
        L.recordFoulJump();
        if(L.jumps() == 3 && L.finished()){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }

}
