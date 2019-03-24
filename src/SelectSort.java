public class SelectSort {
    public static void main(String [] args){
        Integer [] test = new Integer[10];
        for(int i=0;i<test.length;i++){
            test[i] = (int)(Math.random()*15);
        }
        show(test);
        selectSort(test);
        show(test);
    }
    public static void selectSort(Comparable [] array){
        if(array==null) throw new NullPointerException();
        if(array.length<1) return;
        Comparable temp = null;
        int index = 0;
        for(int i=0;i<array.length;i++){
            index = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j].compareTo(array[index])<0) index = j;
            }
            if(index!=i){
                temp = array[i];
                array[i] = array[index];
                array[index]= temp;

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
