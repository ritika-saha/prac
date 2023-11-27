import java.util.*;

class project{
    private String name;
    private ArrayList<task> taskList=new ArrayList<>();
    private Map<User, ArrayList<task>> taskAssignments=new HashMap<>();
    void setName(String s){
        this.name=s;
    }
    
    void setTask(task t){
        taskList.add(t);
    }
    void setassign(User u){
        taskAssignments.put(u,taskList);
    }

    void display(User u){
        System.out.println("PROJECT : "+name);
        System.out.println("Tasks for user "+u.getName()+" ------------------------->");
        ArrayList<task> curr=taskAssignments.get(u);

        for(int i=0;i<curr.size();i++){
            System.out.println("Task :"+curr.get(i).getDesc()+"   Status: "+curr.get(i).getStatus());
        }
    }

}