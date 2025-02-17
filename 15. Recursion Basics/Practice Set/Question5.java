// You have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order of the size from top to bottom(i.e., eash disk sits on top of an even larger one).
// You have the following constraints:
// 1) Only one disk can be moves at a time.
// 2) A disk is slid off the top of one tower onto another tower.
// 3) A disk cannot be places on the top of a smaller disk. Write a program to move the disks from the first tower to the last using Stacks.

// Let rod 1='A',rod 2='B',rod 3='C'
// An example with 2 disks i.e., N=2:
// Step 1:Shift the first disk from 'A' to 'B'
// step 2: Shift the second disk from 'A' to 'C'
// step 3:Shift the first disk from 'B' to 'C'.

public class Question5 {

    public static void main(String[] args) {
        char from_rod='A';
        char to_rod='C';
        char aux_rod='B';
        towerOfHanoi(2, from_rod, to_rod, aux_rod);
    }
    public static void towerOfHanoi(int n,char from_rod,char to_rod,char aux_rod){
        if(n==1){
            System.out.println(n+" "+from_rod+" to "+to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println(n+" "+from_rod+" to "+to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
}
