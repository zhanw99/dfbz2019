package cn.day10.Test3;

public class Receptionist  {
    private Filter filter;
    public  void Recept(User user){
        if (user.getTy() != null) {
            return;
        }if (filter != null) {
            filter.filterUser(user);
            return;
        }else {
            user.setTy("A");
         }


    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Receptionist() {

    }


}
