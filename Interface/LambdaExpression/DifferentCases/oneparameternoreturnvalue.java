package Interface.LambdaExpression.DifferentCases;

@FunctionalInterface
interface Vehicle 
{
    void totalSeats(int seatNumber);
}

public class oneparameternoreturnvalue {
    public static void main(String[] args) {
        
        // Vehicle v1 = (seats) -> System.out.println("total seats are" + " " + seats);

        Vehicle v1 = seats -> System.out.println("total seats are" + " " + seats);

        v1.totalSeats(5);
    }
}