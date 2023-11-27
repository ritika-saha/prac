import java.util.*;


public class taskManagment{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter project name");
        String pn=sc.nextLine();

        task t1=new task();
        t1.setDesc("aaaaaaaaa");
        t1.setStatus(false);
        task t2=new task();
        t2.setStatus(false);
        t2.setDesc("bbbbbbbbbbbb");
        
       
        System.out.println("Enter name of the user");
        String s=sc.nextLine();
        
        User u1=new User();
        u1.setName(s);

        project p=new project();
        ArrayList<task> u1task=new ArrayList<>();



        p.setTask(t1);
        p.setTask(t2);
        p.setName(pn);
       

        System.out.println("choose task 1 or 2  for user "+s+" to mark done ");
        String choice=sc.nextLine();
        switch (choice) {
            case "1":t1.setStatus(true);
                    u1task.add(t1);
               break;
            case "2": t2.setStatus(true);
            u1task.add(t2);  
        
            default:
                break;
        }

p.setassign(u1);


        p.display(u1); 
    
User u2=new User();

 System.out.println("Enter name of the user");
         s=sc.nextLine();
        
      
        u2.setName(s);

        
        ArrayList<task> u2task=new ArrayList<>();



        //p.setTask(t1);
       // p.setTask(t2);
        p.setName(pn);
       

        System.out.println("choose task 1 or 2  for user "+s+" to mark done ");
         choice=sc.nextLine();
        switch (choice) {
            case "1":t1.setStatus(true);
            t2.setStatus(false);
                    u1task.add(t1);
               break;
            case "2": t2.setStatus(true);
            t1.setStatus(false);
            u1task.add(t2);  
        
            default:
                break;
        }

p.setassign(u2);



       

        p.display(u2);

        
        

        


    }
}