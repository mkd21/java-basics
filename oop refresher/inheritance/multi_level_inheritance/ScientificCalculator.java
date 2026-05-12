
package inheritance.multi_level_inheritance;


class ScientificCalculator extends AdvanceCalculator
{

    public double power(int num)
    {
        return Math.pow(num, 2);  // by deafult pow function returns double value
    }

}