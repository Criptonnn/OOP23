package xPractice.MidtermPractice;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Status {
    TO_DO,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}

class TaskItem {
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



class Streams {
    public ArrayList<TaskItem> list = new ArrayList<>();

    public Streams(ArrayList<TaskItem> list) {
        this.list = list;
    }

    public ArrayList<TaskItem> returnAll() {
        return this.list;
    }

    public ArrayList<TaskItem> filterByStatus(Status status) {
        ArrayList<TaskItem> filtered = (ArrayList<TaskItem>) this.list.stream()
                .filter(task ->
                    task.getStatus().equals(status)).toList();

        return filtered;
    }

}


class Main {
    public static void main(String[] args) {
        ArrayList<TaskItem> myList = new ArrayList<>();
        myList.add(new TaskItem(1,"Push lab code to the github", Status.TO_DO));
        myList.add(new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS));
        myList.add(new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED));
        myList.add(new TaskItem(4,"Learn javajaja", Status.TO_DO));

        Streams streams = new Streams(myList);
        ArrayList<TaskItem> filtered = streams.filterByStatus(Status.TO_DO);
        for(TaskItem item : filtered) {
            System.out.println(item.getId());
        }
    }
}