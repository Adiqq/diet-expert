package sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import java.util.Stack;

public final class Drools {
    private Drools(){}
    public static KieServices kieServices;
    public static KieContainer kContainer;
    public static StatelessKieSession kSession;
    public static Stack<Dieta> dieta = new Stack<>();
    public static void init(){
        kieServices = KieServices.Factory.get();
        kContainer = kieServices.getKieClasspathContainer();
        kSession = kContainer.newStatelessKieSession();
    }

}
