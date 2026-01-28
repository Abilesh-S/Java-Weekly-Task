//In the below we saw that how does after it overflow after 127 it wraps around its minimum value so it avoid exception

package com.kovanlabs.intern.week1.task;
public class OverflowWrappingBehaviour {
    void byteOverflow() {
        byte a = 118;
        for (int i = 0; i < 10; i++) {
            System.out.print((a+=1)+"\t");
        }
    }
    public static void main(String[] args) {
        new OverflowWrappingBehaviour().byteOverflow();
    }
}
