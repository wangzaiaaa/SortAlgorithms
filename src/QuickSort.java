public class QuickSort {
    public static void main(String [] args){
        Integer [] test = new Integer[10];
        Comparable [] temp = new Integer[10];
        for(int i=0;i<test.length;i++){
            test[i] = (int)(Math.random()*15);
        }
        show(test);
        quickSort(test);
        show(test);
    }
    public static void swap(Comparable [] array, int i,int j){
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int patication(Comparable [] array,int lo,int hi){
        int i = lo,j=hi+1;
        Comparable val = array[lo];
        while(true){
            while (array[++i].compareTo(val)<0){
                if(i>=hi) break;
            }
            while(array[--j].compareTo(val)>0){
                if(j<=lo) break;
            }
            if(i>=j) break;
            swap(array,i,j);
        }
        swap(array,lo,j);
        return j;
    }
    public static void quickSort(Comparable [] array,int lo,int hi){
        if(lo>=hi) return;
        int j = patication(array,lo,hi);
        quickSort(array,lo,j-1);
        quickSort(array,j+1,hi);
    }
    public static void quickSort(Comparable [] array){
        quickSort(array,0,array.length-1);

    }
    public static void show(Comparable [] array){
        for(Comparable a:array){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
