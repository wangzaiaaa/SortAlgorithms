public class ShellSort {
    public static void main(String [] args){
        Integer [] test = new Integer[10];
        for(int i=0;i<test.length;i++){
            test[i] = (int)(Math.random()*15);
        }
        show(test);
        shellSort(test);
        show(test);
    }
    public static void shellSort(Comparable [] array){
        if(array==null) throw new NullPointerException();
        if(array.length<1) return;
        Comparable temp = null;
        for(int path=array.length/2;path>=1;path/=2){
            for(int j = path;j<array.length;j++){
                for(int i=j;i-path>=0&&array[i-path].compareTo(array[path])>0;i-=path){
                    temp = array[i];
                    array[i] = array[i-path];
                    array[i-path] = temp;
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
