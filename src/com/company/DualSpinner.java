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
            System.out.println(result);
            return result;
            }

        /** Simulates one round of the game as described in part (b).
         */
        public void playRound() {

        }
        public static void main(String[] args) {
            DualSpinner ds = new DualSpinner();
            for(int i = 0; i < 10; i++){
                ds.playRound();
            }
        }
    }
