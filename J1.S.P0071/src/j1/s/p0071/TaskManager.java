/*
 * Name: Vo Nhu Khang
 * Class: SE1403
 * MSSV: DE140179
 */
package j1.s.p0071;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author khangvn
 */
public class TaskManager {

    private static Map<Integer, Task> list = new HashMap<>();
    private static Map<Integer, String> taskTypes = new HashMap();

    public TaskManager() {
        taskTypes.put(1, "Code");
        taskTypes.put(2, "Test");
        taskTypes.put(3, "Design");
        taskTypes.put(4, "Review");
    }

    public void addTask(int taskType, String name, Date date, float planFrom,
            float planTo, String assignee, String expert) {
        list.put(list.size() + 1, new Task(name, taskTypes.get(taskType), date, planFrom, planTo, assignee, expert));
    }

    public Task delete(int i) {
        return list.remove(i);
    }

    public void showTask() {
        System.out.println("----------------Task-----------------");
        System.out.printf("%-4s%-20s%-12s%-15s%-10s%-10s%s\n", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        for (Map.Entry<Integer, Task> entry : list.entrySet()) {
            Task task = entry.getValue();
            SimpleDateFormat simpleDate = new SimpleDateFormat("dd-MM-yyyy");
            String date = simpleDate.format(task.getDate());
            System.out.printf("%-4s%-20s%-12s%-15s%-10.1f%-10s%s\n", entry.getKey(), task.getName(), task.getTaskType(), date, task.getPlanTo() - task.getPlanFrom(), task.getAssignee(), task.getReviewer());
        }
    }

}
