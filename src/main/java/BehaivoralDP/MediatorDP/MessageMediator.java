package BehaivoralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

public class MessageMediator implements Mediator {
    Map<String,Actor> registeredActor = new HashMap<>();

    public void register(String topic, Actor actor){
        registeredActor.put(topic, actor);
    }

    @Override
    public void dispatch(String topic, String message) {

    }
}
