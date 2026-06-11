
package enums.enuminternalbehaviour;

// enum Responses 
// {
//     SUCCESS,
//     FAILURE,
//     PENDING
// }

// internally enums will be converted into class 
// roughly like

final class Responses 
{
    public static final Responses SUCCESS = new Responses();
    public static final Responses FAILURE = new Responses();
    public static final Responses PENDING = new Responses();

    private Responses(){

    }
}


public class InternalBehaviour {
    public static void main(String[] args) {
        
        // Responses resp = Responses.SUCCESS;

        // System.out.println( resp );
    }    
}
