// Q1.
// Create an interface Insurable with two methods:

// double calculatePremium()
// String getInsuranceType()

// Make Car implement it. calculatePremium() 
// should return year * 0.5 and getInsuranceType() should return "Comprehensive". Print both from main.

package Level1;

public interface Insurable {
    public double calculatePremium();
    public String getInsuranceType();

}
