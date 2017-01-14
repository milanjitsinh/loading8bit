package hitesh;
import java.io.File;
import java.io.IOException; 
public class Temp1 {
    public static void main(String[] args) throws IOException {
        //System.out.println("Enter the directory :");
        //File d=new File("%LocalAppData%\\Google\\Chrome\\User Data\\Crashpad\\reports");
        //System.out.println("the path = "+d.getAbsolutePath());
        //System.out.println("path "+d.getParent());
        //System.out.println("the path = "+d.getPath());
        //System.out.println("the path = "+d.getCanonicalPath());
        //System.getProperties(appdata);
String s= System.getenv("localAppData");       //System.getenv("appdata");
        System.out.println(s+"\\Temp");
        int Del=0,Ndel=0;
        s=s+"\\Temp";
        File f=new File(s);
        File[] listOfFiles=f.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) 
    {
      if (listOfFiles[i].isFile()) 
       {
        System.out.println("File " + listOfFiles[i].getName());
        
        if(listOfFiles[i].delete())
        {
            System.out.println(listOfFiles[i]+"is deleted");
            Del++;
        }
        else
        {
            System.out.println(listOfFiles[i]+"is not deleted");
            Ndel++;
        }
      } 
      else if(listOfFiles[i].isDirectory())
      {
          if(listOfFiles[i].delete())
        {
            System.out.println(listOfFiles[i]+"is deleted");
            Del++;
        }
          
      }
        
    }  
        System.out.println("No of Deleted files : "+Del);
        System.out.println("No of non-Deleted files : "+Ndel);

    }
    
}
