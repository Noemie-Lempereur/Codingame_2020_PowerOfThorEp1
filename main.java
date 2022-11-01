import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            boolean ouest=false;
            boolean est=false;
            boolean nord=false;
            boolean sud=false;         
            
            if(lightX-initialTx<0){
                ouest=true;
                initialTx--;
            }else if(lightX-initialTx>0){
                est=true;
                initialTx++;
            }
            if(lightY-initialTy<0){
                nord=true;
                initialTy--;
            }else if(lightY-initialTy>0){
                sud=true;
                initialTy++;
            }

            if(sud==true){
                if(est==true){
                    System.out.println("SE");
                }else{
                    if(ouest==true){
                        System.out.println("SW");
                    }
                    else{
                        System.out.println("S");
                    }
                }
            }
            else{
                if(nord==true){
                    if(est==true){
                        System.out.println("NE");
                    }else{ 
                        if(ouest==true){
                            System.out.println("NW");
                        }
                        else{
                            System.out.println("N");
                        }
                    }
                }
                else{
                    if(est==true){
                        System.out.println("E");
                    }else{ 
                        if(ouest==true){
                            System.out.println("W");
                        }
                    }
                }
            }
            
        }
    }
}
