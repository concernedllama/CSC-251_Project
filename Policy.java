public class Policy
   {
   // initialization of var
   private double policyNumber, holderHeight, holderWeight;
   private String providerName, firstName, lastName, smokerStatus;
   private int holderAge;
   
   /* No arg constructor
   */
   
   public Policy()
      {
      policyNumber = 0.0;
      holderHeight = 0.0;
      holderWeight = 0.0;
      providerName = "Liberty";
      firstName = "John";
      lastName = "Doe";
      smokerStatus = "non-smoker";
      holderAge = 40;
      }
   
   /* Constructor that accepts arguements 
   @param pol_number = policy number
   @param height = height
   @ param weight = weight
   
   
   */
   
   
   public Policy(double pol_number, double height, double weight, String provName, String fName, String lName, String smokerStat, int age)
      {
      policyNumber = pol_number;
      holderHeight = height;
      holderWeight = weight;
      providerName = provName;
      firstName = fName;
      lastName = lName;
      smokerStatus = smokerStat;
      holderAge = age;
      
      }
      // Setter Methods 
   public void setPolicyNumber(double pol_number)
      {
      policyNumber = pol_number;
      }
      
    public void setHeight(double height)
      {
      holderHeight = height;
      }
      
      public void setWeight(double weight)
      {
      holderWeight = weight;
      }
      
      public void setProviderName(String prov_Name)
      {
      providerName = prov_Name;
      }
      
      public void setFirstName(String fName)
      {
      firstName = fName;
      }
      
      public void setLastName(String lName)
      {
      lastName = lName;
      }
      
      public void setAge(int age)
      {
      holderAge = age;
      }
      
      public void setSmokerStatus(String hSmokerStat)
      {
      smokerStatus = hSmokerStat;
      }
      
      // Getter methods begin
   public double getPolicyNumber()
      {
      return policyNumber;
      }
      
    public double getHeight()
      {
      return holderHeight;
      }
      
      public double getWeight()
      {
      return holderWeight;
      }
      
      public String getProviderName()
      {
      return providerName;
      }
      
      public String getFirstName()
      {
      return firstName;
      }
      
      public String getLastName()
      {
      return lastName;
      }
      
      public int setAge()
      {
      return holderAge;
      }
      
      public String getSmokerStatus()
      {
      return smokerStatus;
      }
   
   public double calcBMI(double weight, double height)
      {
      return (weight * 703) / height;
      }
      
   public double calcPremium(int age, String smokerStat, double BMI) // methods that calcs premium
      {
      double fee = 600;
      if (age > 50)
         {
         fee += 75;
         }
         
      if (smokerStat.equals("non-smoker"))
         fee += 0;
         else
         fee += 100;
         
      
      if (BMI > 35)
      fee += ((BMI - 35) * 20);
      
      
      return fee;
      
      }
   
   
   }// end of class