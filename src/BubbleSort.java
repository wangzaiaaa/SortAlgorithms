public class BubbleSort {
    public static void main(String [] args){
        Integer [] test = new Integer[10];
        for(int i=0;i<test.length;i++){
            test[i] = (int)(Math.random()*15);
        }
        show(test);
        bubbleSort(test);
        show(test);
    }
    public static void bubbleSort(Comparable [] array){
        if(array==null) throw new NullPointerException();
        if(array.length<1) return;
        Comparable temp = null;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j].compareTo(array[j+1])>0){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
    public static void show(Comparable [] array){
        for(Comparable a:array){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
