


public class about_string_buffer {
    public static void main(String[] args) {
        

        StringBuffer str = new StringBuffer("mayank");
        System.out.println(str.capacity());   // default capacity of string buffer is 16

        str.append(" deep");

        System.out.println(str);

    }    
}
