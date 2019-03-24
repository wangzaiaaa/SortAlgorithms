public class MergeSort {
    public static void main(String [] args){
        Integer [] test = new Integer[10];
        Comparable [] temp = new Integer[10];
        for(int i=0;i<test.length;i++){
            test[i] = (int)(Math.random()*15);
        }
        show(test);
        mergeSort(test,0,test.length-1,temp);
        show(test);
    }
    public static void merge(Comparable [] array,int lo,int mid,int hi,Comparable [] temp){
        int i = lo;
        int j = mid + 1;
        for(int k=lo;k<=hi;k++){
            temp[k] = array[k];
        }
        for(int k=lo;k<=hi;k++){
            if(i>mid) array[k] = temp[j++];
            else if(j>hi) array[k] = temp[i++];
            else if(temp[i].compareTo(temp[j])<0) array[k] = temp[i++];
            else array[k] = temp[j++];
        }
    }

    public static void mergeSort(Comparable [] array,int lo,int hi,Comparable [] temp){
        if(lo>=hi) return;
        int mid = lo + ((hi-lo)>>1);
        mergeSort(array,lo,mid,temp);
        mergeSort(array,mid+1,hi,temp);
        merge(array,lo,mid,hi,temp);
    }
    public static void show(Comparable [] array){
        for(Comparable a:array){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
