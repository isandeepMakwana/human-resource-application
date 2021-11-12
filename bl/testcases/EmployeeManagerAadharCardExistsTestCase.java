import com.thinking.machines.hr.bl.exceptions.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.managers.*;
import com.thinking.machines.hr.bl.pojo.*;
import com.thinking.machines.hr.enums.*;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
import java.util.*;
public class EmployeeManagerAadharCardExistsTestCase
{
public static void main(String gg[])
{
String aadharCardNumber = gg[0];
EmployeeManagerInterface employeeManager;
try
{
employeeManager = EmployeeManager.getEmployeeManager();
System.out.println("Aadhar Card Exists : "+employeeManager.aadharCardNumberExists(aadharCardNumber));
}catch(BLException blException)
{
if(blException.hasGenricException())
{
System.out.println(blException.getMessage());
}
List<String> exceptions;
exceptions = blException.getProperties();
for(String exception : exceptions)
{
System.out.println(exception);
}
}
}
}