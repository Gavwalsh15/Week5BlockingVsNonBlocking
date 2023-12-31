package ie.atu.week5blockingvsnon;

import org.springframework.stereotype.Service;

@Service
public class FeignService {

    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient){
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData(){
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return td;
    }

    public TodoResponse fetchData196(){
        TodoResponse td = todoClient.fetchData196();
        System.out.println(td);
        return td;
    }
}
