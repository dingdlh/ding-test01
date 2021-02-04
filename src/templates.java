import java.util.Arrays;

/**
 * @author ding
 * @create ---
 */
@SuppressWarnings("ALL")
public class templates {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("templates.main");
        System.out.println("args = " + args);
    
        String[] arr = new String[]{"tom","jerry","hanmeimei","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
            for (String s : arr) {
                System.out.println(s);
            
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
            
        }





    }




        
    }


    /**
     *
     */


