package fr.trouillet.faya.ebad.master;

/**
 * Created by dtrouillet on 29/01/2018.
 */
import fr.trouillet.faya.ebad.parent.dto.AgentInfos;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "agent", selector = "app = 'er2'")
    public void receiveMessage(AgentInfos agentInfos) {
        System.out.println("Received <" + agentInfos + ">");
    }

    @JmsListener(destination = "agent", selector = "app = 'mv1'")
    public void receiveMessage2(AgentInfos agentInfos) {
        System.out.println("Received <" + agentInfos + ">");
    }

}