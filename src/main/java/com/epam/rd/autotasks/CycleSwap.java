package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1) {
            return;
        }
        shift =shift % array.length;
        int[] ar=new int[shift];
        System.arraycopy(array,array.length-shift,ar,0,shift);
        for (int i=array.length-shift-1;i>=0;i--){
            array[i+shift]=array[i];
        }
        System.arraycopy(ar,0,array,0,shift);
    }
}
