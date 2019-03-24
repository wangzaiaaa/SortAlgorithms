public class InsertSort {
    public static void main(String [] args){
        Integer [] test = new Integer[10];
        for(int i=0;i<test.length;i++){
            test[i] = (int)(Math.random()*15);
        }
        show(test);
        insertSort(test);
        show(test);
    }
    public static void insertSort(Comparable [] array){
        if(array==null) throw new NullPointerException();
        if(array.length<1) return;
        Comparable temp = null;
        for(int i=1;i<array.length;i++){
            for(int j=i;j>0&&array[j-1].compareTo(array[j])>0;j--){
                temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
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
