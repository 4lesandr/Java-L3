public class Task02 {
    public static void main(String[] args) {

   List<? extends Number> nums1 = new ArrayList<Integer>();

   List<? super Integer> nums2 = new ArrayList<Number>();

//`extends`: для чтения (`covariant`).  
//`super`: для добавления (`contravariant`).
    }
}
