

package Interface.MoreOnInterface;

interface ElectricalDetails 
{
    public abstract void FuelIndicator();  // default accessiblity is public and abstract for all methods 
    void TypePressureMonitor();
}

interface HardwareDetails 
{
    void EnginePowerLever();
    void FuelPump();
}

class Airbus implements ElectricalDetails , HardwareDetails 
{
    public void FuelIndicator()
    {
        System.out.println("fuel indicator method ");
    }

    public void TypePressureMonitor()
    {
        System.out.println("tyre pressure monitor method ");
    }

    public void EnginePowerLever()
    {
        System.out.println("engine power lever method ");
    }

    public void FuelPump()
    {
        System.out.println("fuel pump method ");
    }
}

public class someMoreDetails {
    public static void main(String[] args) {
       
        // ElectricalDetails ed = new Airbus(); this object will only have access to ElectricalDetails methods
        // HardwareDetails hd = new Airbus();  this object will only have access to HardwareDetails methods

        Airbus A380 = new Airbus();

        A380.EnginePowerLever();
        A380.FuelIndicator();
        A380.TypePressureMonitor();
        A380.FuelPump();
    }
}

/*

    * interface can inherit another interface using extends keyword

    * we can perform multiple inheritance with interface (not the case with the classes)

*/