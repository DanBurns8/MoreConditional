package com.company;

public class DualSpinner {
        /** Precondition: min < max
         */
        /*The spin method simulates a spin of a fair spinner.
         * The method returns a random integer between min and max,
         * inclusive. Complete the spin method below by assigning
         * this random integer to result.
         */
        public static int spin(int min, int max){
            int result=0;
            result =(int)(min+Math.random() * max);
            return result;
            }

        /** Simulates one round of the game as described in part (b).
         */
        public void playRound() {
            int spinPlayer=spin(1,10);
            int spinCPU=spin(2,8);
            int roundPoints=spinPlayer-spinCPU;
            int newSpinPlayer=spin(1,10);
            int newSpinCPU=spin(2,8);
            int newRoundPoints=newSpinPlayer-newSpinCPU;

            if (spinPlayer != spinCPU){
                roundPoints=spinPlayer-spinCPU;
                if (roundPoints>0) {
                    System.out.println("You Win! " + roundPoints + " points");
                   // System.out.println(spinPlayer + " " + spinCPU);
                }else if(roundPoints<0) {
                    System.out.println("You Lose. " + roundPoints + " Points.");
                   // System.out.println(spinPlayer + " " + spinCPU);
                }
            }else {
                newRoundPoints=newSpinPlayer-newSpinCPU;
                if(newRoundPoints==0){
                    System.out.println("Tie " + newRoundPoints + " points.");
                   // System.out.println(spinPlayer + " " + spinCPU + " " + newSpinPlayer + " " + newSpinCPU);
                }else if (newRoundPoints>0){
                    System.out.println("You Win! " + newRoundPoints + " points");
                   // System.out.println(spinPlayer + " " + spinCPU + " " + newSpinPlayer + " " + newSpinCPU);
                }else if(newRoundPoints<0){
                    System.out.println("You Lose. " + newRoundPoints + " Points.");
                   // System.out.println(spinPlayer + " " + spinCPU + " " + newSpinPlayer + " " + newSpinCPU);
                }
            }


        }
        public static void main(String[] args) {
            DualSpinner ds = new DualSpinner();
            for(int i = 0; i < 10; i++){
                ds.playRound();
            }
        }
    }
//        You Win! 3 points
//        You Lose. -2 Points.
//        You Win! 3 points
//        You Lose. -2 Points.
//        You Lose. -7 Points.
//        You Win! 2 points
//        You Win! 6 points
//        You Lose. -3 Points.
//        You Lose. -1 Points.
//        You Lose. -4 Points.
