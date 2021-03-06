public class Robot
{
    private String name;
    private int age;
    private boolean working = false;

    public Robot (String name,int age)
    {
        setName(name);
        setAge(age);
    }

    private void setName(String name)
    {
        if(name.isEmpty())
        {
            throw new IllegalArgumentException();
        }
        else
        {
            this.name = name;
        }
    }

    private void setAge(int age)
    {
        this.age=age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isWorking()
    {
        return working;
    }

    public void talkToRobot()
    {
        working = true;
    }

    public String getWorkingMessage()
    {
        if(!working)
        {
            throw new IllegalStateException();
        }
        else
         {
            return "i am working";
         }
    }

    public String checkAge()
    {
        if(age<=20)
        {
            return "Age OK";
        }
        else
        {
            return "Not Old Enough";
        }
    }

    public void waitTillWorking()
    {
        while(!working)
        {
            //do nothing
        }
    }

    public String checkage()
    {
        if(age<=20)
        {
            return "Age ok";
        }
        else
        {
            return "Not old enough";
        }
    }

    public double checkCost() {
        if (age <= 5) {
            return 10000.00;
        } else if (age <= 10) {
            return 7500.00;
        } else return 5000.00;
    }

}
