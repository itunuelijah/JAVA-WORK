import arrays.Array;

public class Method{
 private int[] items;

 public Method(int length){
     items = new int[length];
 }

 public void print(){
     for(int i = 0; i <= items.length; i++ )
         System.out.println(items[i]);
 }

    public static void main(String[] args) {
//        Array numbers = new Array(3);
//        numbers.insert(12);
    }
}
