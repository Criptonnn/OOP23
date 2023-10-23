package week03;

public class TaskItem {
    private int id;
    private String desc;
    private Status status;

    public TaskItem(int id, String desc, Status status) {
        this.id = id;
        this.desc = desc;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }
    public String getDesc() {
        return this.desc;
    }
    public Status getStatus() {
        return this.status;
    }

    public void setId(int newId) {
        this.id = newId;
    }
    public void setDesc(String newDesc) {
        this.desc = newDesc;
    }
    public void setStatus(Status newStatus) {
        this.status = newStatus;
    }

}
